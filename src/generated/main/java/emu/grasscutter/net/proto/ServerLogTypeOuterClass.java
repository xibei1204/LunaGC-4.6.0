// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ServerLogType.proto

package emu.grasscutter.net.proto;

public final class ServerLogTypeOuterClass {
  private ServerLogTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * 4.6.0
   * </pre>
   *
   * Protobuf enum {@code ServerLogType}
   */
  public enum ServerLogType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>SERVER_LOG_NONE = 0;</code>
     */
    SERVER_LOG_NONE(0),
    /**
     * <code>SERVER_LOG_ABILITY = 1;</code>
     */
    SERVER_LOG_ABILITY(1),
    /**
     * <code>SERVER_LOG_LEVEL = 2;</code>
     */
    SERVER_LOG_LEVEL(2),
    /**
     * <code>SERVER_LOG_ENTITY = 3;</code>
     */
    SERVER_LOG_ENTITY(3),
    /**
     * <code>SERVER_LOG_LUA = 4;</code>
     */
    SERVER_LOG_LUA(4),
    /**
     * <code>SERVER_LOG_DAILYTASK = 5;</code>
     */
    SERVER_LOG_DAILYTASK(5),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>SERVER_LOG_NONE = 0;</code>
     */
    public static final int SERVER_LOG_NONE_VALUE = 0;
    /**
     * <code>SERVER_LOG_ABILITY = 1;</code>
     */
    public static final int SERVER_LOG_ABILITY_VALUE = 1;
    /**
     * <code>SERVER_LOG_LEVEL = 2;</code>
     */
    public static final int SERVER_LOG_LEVEL_VALUE = 2;
    /**
     * <code>SERVER_LOG_ENTITY = 3;</code>
     */
    public static final int SERVER_LOG_ENTITY_VALUE = 3;
    /**
     * <code>SERVER_LOG_LUA = 4;</code>
     */
    public static final int SERVER_LOG_LUA_VALUE = 4;
    /**
     * <code>SERVER_LOG_DAILYTASK = 5;</code>
     */
    public static final int SERVER_LOG_DAILYTASK_VALUE = 5;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ServerLogType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ServerLogType forNumber(int value) {
      switch (value) {
        case 0: return SERVER_LOG_NONE;
        case 1: return SERVER_LOG_ABILITY;
        case 2: return SERVER_LOG_LEVEL;
        case 3: return SERVER_LOG_ENTITY;
        case 4: return SERVER_LOG_LUA;
        case 5: return SERVER_LOG_DAILYTASK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ServerLogType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ServerLogType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ServerLogType>() {
            public ServerLogType findValueByNumber(int number) {
              return ServerLogType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ServerLogTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ServerLogType[] VALUES = values();

    public static ServerLogType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ServerLogType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ServerLogType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ServerLogType.proto*\227\001\n\rServerLogType\022" +
      "\023\n\017SERVER_LOG_NONE\020\000\022\026\n\022SERVER_LOG_ABILI" +
      "TY\020\001\022\024\n\020SERVER_LOG_LEVEL\020\002\022\025\n\021SERVER_LOG" +
      "_ENTITY\020\003\022\022\n\016SERVER_LOG_LUA\020\004\022\030\n\024SERVER_" +
      "LOG_DAILYTASK\020\005B\033\n\031emu.grasscutter.net.p" +
      "rotob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}