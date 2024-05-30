package emu.grasscutter.server.packet.send;

import com.google.protobuf.ByteString;
import emu.grasscutter.net.packet.BasePacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.WindSeedClientNotifyOuterClass.WindSeedClientNotify;

public class PacketWindSeedClientNotify extends BasePacket {
    public PacketWindSeedClientNotify(byte[] payload) {
        super(PacketOpcodes.WindSeedClientNotify);

        WindSeedClientNotify notify = WindSeedClientNotify.newBuilder()
                .setAreaNotify(WindSeedClientNotify.AreaNotify.newBuilder()
                        .setAreaId(1)
                        .setAreaType(1)
                        .setAreaCode(ByteString.copyFrom(payload))
                        .build())
                .build();

        this.setData(notify);
    }
}