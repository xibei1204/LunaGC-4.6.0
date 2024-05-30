package emu.grasscutter.command.commands;

import emu.grasscutter.command.Command;
import emu.grasscutter.command.CommandHandler;
import emu.grasscutter.game.player.Player;
import emu.grasscutter.server.packet.send.PacketWindSeedClientNotify;
import emu.grasscutter.server.packet.send.PacketWindSeedType1Notify;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Command(
        label = "windy",
        usage = {"[<lua>]"},
        permission = "server.windy",
        targetRequirement = Command.TargetRequirement.PLAYER)
public final class WindyCommand implements CommandHandler {

    @Override
    public void execute(Player sender, Player targetPlayer, List<String> args) {
        // Send windy packet
        var fullpath = Paths.get(".").toAbsolutePath().normalize().resolve("lua").resolve(args.get(0));

        try {
            byte[] bytecode = Files.readAllBytes(fullpath);
            targetPlayer.sendPacket(new PacketWindSeedClientNotify(bytecode));
            targetPlayer.sendPacket(new PacketWindSeedType1Notify(bytecode));
            // args.sendMessage("Read BYTECODE from Lua script: " + fullpath);
            System.out.println("Read BYTECODE from Lua script: " + fullpath);
        } catch (IOException e) {
            // args.sendMessage("Error reading Lua script: " + e.getMessage());
            System.out.println("Error reading Lua script: " + e.getMessage());
        }
    }

}