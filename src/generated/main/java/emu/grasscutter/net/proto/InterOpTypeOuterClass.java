// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InterOpType.proto

package emu.grasscutter.net.proto;

public final class InterOpTypeOuterClass {
  private InterOpTypeOuterClass() {}
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
   * Protobuf enum {@code InterOpType}
   */
  public enum InterOpType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>INTER_OP_TYPE_FINISH = 0;</code>
     */
    INTER_OP_TYPE_FINISH(0),
    /**
     * <code>INTER_OP_TYPE_START = 1;</code>
     */
    INTER_OP_TYPE_START(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>INTER_OP_TYPE_FINISH = 0;</code>
     */
    public static final int INTER_OP_TYPE_FINISH_VALUE = 0;
    /**
     * <code>INTER_OP_TYPE_START = 1;</code>
     */
    public static final int INTER_OP_TYPE_START_VALUE = 1;


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
    public static InterOpType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static InterOpType forNumber(int value) {
      switch (value) {
        case 0: return INTER_OP_TYPE_FINISH;
        case 1: return INTER_OP_TYPE_START;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<InterOpType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        InterOpType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<InterOpType>() {
            public InterOpType findValueByNumber(int number) {
              return InterOpType.forNumber(number);
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
      return emu.grasscutter.net.proto.InterOpTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final InterOpType[] VALUES = values();

    public static InterOpType valueOf(
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

    private InterOpType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:InterOpType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021InterOpType.proto*@\n\013InterOpType\022\030\n\024IN" +
      "TER_OP_TYPE_FINISH\020\000\022\027\n\023INTER_OP_TYPE_ST" +
      "ART\020\001B\033\n\031emu.grasscutter.net.protob\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}