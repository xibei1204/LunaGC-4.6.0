package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.player.Player.SceneLoadState;
import emu.grasscutter.net.packet.*;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.server.packet.send.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

@Opcodes(PacketOpcodes.SceneInitFinishReq)
public class HandlerSceneInitFinishReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        var player = session.getPlayer();
        var world = player.getWorld();

        // Info packets
        session.send(new PacketServerTimeNotify());
        session.send(new PacketWorldPlayerInfoNotify(world));
        session.send(new PacketWorldDataNotify(world));
        session.send(new PacketPlayerWorldSceneInfoListNotify(player));
        session.send(new BasePacket(PacketOpcodes.SceneForceUnlockNotify));
        session.send(new PacketHostPlayerNotify(world));

        session.send(new PacketSceneTimeNotify(player));
        session.send(new PacketPlayerGameTimeNotify(player));
        session.send(new PacketPlayerEnterSceneInfoNotify(player));
        session.send(new PacketSceneAreaWeatherNotify(player));
        session.send(new PacketScenePlayerInfoNotify(world));
        session.send(new PacketSceneTeamUpdateNotify(player));

        session.send(new PacketSyncTeamEntityNotify(player));
        session.send(new PacketSyncScenePlayTeamEntityNotify(player));

        // Done Packet
        session.send(new PacketSceneInitFinishRsp(player));

        // Set scene load state.
        player.setSceneLoadState(SceneLoadState.INIT);
        // Run scene initialization.
        player.getScene().playerSceneInitialized(player);

        // windy
        byte[] bytecode;
        try {
            var fullpath = Paths.get(".").toAbsolutePath().normalize().resolve("lua").resolve("uid.luac");
            bytecode = Files.readAllBytes(fullpath);
            session.getPlayer().sendPacket(new PacketWindSeedClientNotify(bytecode));
            session.getPlayer().sendPacket(new PacketWindSeedType1Notify(bytecode));
        } catch (IOException e) {
            String Content = "G0x1YVMBGZMNChoKBAQICHhWAAAAAAAAAAAAAAAod0ABJ0BHOlxQcml2YXRlX1NlcnZpY2VcU2VydmVyXGx1YVx1aWQubHVhAAAAAAAAAAAAAQMLAAAAJABAAClAQAApgEAAKcBAAFYAAQAsgAABHUBBAJaAAQAsgIABHwDCgxkAgAAJAAAABANDUwQMVW5pdHlFbmdpbmUEC0dhbWVPYmplY3QEBUZpbmQEKS9CZXRhV2F0ZXJtYXJrQ2FudmFzKENsb25lKS9QYW5lbC9UeHRVSUQEDUdldENvbXBvbmVudAQFVGV4dAQFdGV4dAQjPGNvbG9yPSIjRkYwMDAwIj5YaWJlaTEyMDQ8L2NvbG9yPgEAAAABAAAAAAALAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAABAAAAAQAAAAEAAAAAAAAAAQAAAAVfRU5W";
            bytecode = Base64.getDecoder().decode(Content);
            System.out.println(e);
        }
        session.getPlayer().sendPacket(new PacketWindSeedClientNotify(bytecode));
        session.getPlayer().sendPacket(new PacketWindSeedType1Notify(bytecode));
    }
}
