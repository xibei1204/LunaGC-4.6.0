// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityGadgetInfo.proto

package emu.grasscutter.net.proto;

public final class AbilityGadgetInfoOuterClass {
  private AbilityGadgetInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityGadgetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityGadgetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 camp_id = 1;</code>
     * @return The campId.
     */
    int getCampId();

    /**
     * <code>uint32 camp_target_type = 2;</code>
     * @return The campTargetType.
     */
    int getCampTargetType();

    /**
     * <code>uint32 target_entity_id = 3;</code>
     * @return The targetEntityId.
     */
    int getTargetEntityId();
  }
  /**
   * <pre>
   * Obf: AHHOEHNNEIN
   * </pre>
   *
   * Protobuf type {@code AbilityGadgetInfo}
   */
  public static final class AbilityGadgetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityGadgetInfo)
      AbilityGadgetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityGadgetInfo.newBuilder() to construct.
    private AbilityGadgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityGadgetInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityGadgetInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityGadgetInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              campId_ = input.readUInt32();
              break;
            }
            case 16: {

              campTargetType_ = input.readUInt32();
              break;
            }
            case 24: {

              targetEntityId_ = input.readUInt32();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo.class, emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo.Builder.class);
    }

    public static final int CAMP_ID_FIELD_NUMBER = 1;
    private int campId_;
    /**
     * <code>uint32 camp_id = 1;</code>
     * @return The campId.
     */
    @java.lang.Override
    public int getCampId() {
      return campId_;
    }

    public static final int CAMP_TARGET_TYPE_FIELD_NUMBER = 2;
    private int campTargetType_;
    /**
     * <code>uint32 camp_target_type = 2;</code>
     * @return The campTargetType.
     */
    @java.lang.Override
    public int getCampTargetType() {
      return campTargetType_;
    }

    public static final int TARGET_ENTITY_ID_FIELD_NUMBER = 3;
    private int targetEntityId_;
    /**
     * <code>uint32 target_entity_id = 3;</code>
     * @return The targetEntityId.
     */
    @java.lang.Override
    public int getTargetEntityId() {
      return targetEntityId_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (campId_ != 0) {
        output.writeUInt32(1, campId_);
      }
      if (campTargetType_ != 0) {
        output.writeUInt32(2, campTargetType_);
      }
      if (targetEntityId_ != 0) {
        output.writeUInt32(3, targetEntityId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (campId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, campId_);
      }
      if (campTargetType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, campTargetType_);
      }
      if (targetEntityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, targetEntityId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo other = (emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo) obj;

      if (getCampId()
          != other.getCampId()) return false;
      if (getCampTargetType()
          != other.getCampTargetType()) return false;
      if (getTargetEntityId()
          != other.getTargetEntityId()) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CAMP_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCampId();
      hash = (37 * hash) + CAMP_TARGET_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getCampTargetType();
      hash = (37 * hash) + TARGET_ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getTargetEntityId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: AHHOEHNNEIN
     * </pre>
     *
     * Protobuf type {@code AbilityGadgetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityGadgetInfo)
        emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo.class, emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        campId_ = 0;

        campTargetType_ = 0;

        targetEntityId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.internal_static_AbilityGadgetInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo build() {
        emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo buildPartial() {
        emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo result = new emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo(this);
        result.campId_ = campId_;
        result.campTargetType_ = campTargetType_;
        result.targetEntityId_ = targetEntityId_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo other) {
        if (other == emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo.getDefaultInstance()) return this;
        if (other.getCampId() != 0) {
          setCampId(other.getCampId());
        }
        if (other.getCampTargetType() != 0) {
          setCampTargetType(other.getCampTargetType());
        }
        if (other.getTargetEntityId() != 0) {
          setTargetEntityId(other.getTargetEntityId());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int campId_ ;
      /**
       * <code>uint32 camp_id = 1;</code>
       * @return The campId.
       */
      @java.lang.Override
      public int getCampId() {
        return campId_;
      }
      /**
       * <code>uint32 camp_id = 1;</code>
       * @param value The campId to set.
       * @return This builder for chaining.
       */
      public Builder setCampId(int value) {
        
        campId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampId() {
        
        campId_ = 0;
        onChanged();
        return this;
      }

      private int campTargetType_ ;
      /**
       * <code>uint32 camp_target_type = 2;</code>
       * @return The campTargetType.
       */
      @java.lang.Override
      public int getCampTargetType() {
        return campTargetType_;
      }
      /**
       * <code>uint32 camp_target_type = 2;</code>
       * @param value The campTargetType to set.
       * @return This builder for chaining.
       */
      public Builder setCampTargetType(int value) {
        
        campTargetType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 camp_target_type = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCampTargetType() {
        
        campTargetType_ = 0;
        onChanged();
        return this;
      }

      private int targetEntityId_ ;
      /**
       * <code>uint32 target_entity_id = 3;</code>
       * @return The targetEntityId.
       */
      @java.lang.Override
      public int getTargetEntityId() {
        return targetEntityId_;
      }
      /**
       * <code>uint32 target_entity_id = 3;</code>
       * @param value The targetEntityId to set.
       * @return This builder for chaining.
       */
      public Builder setTargetEntityId(int value) {
        
        targetEntityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 target_entity_id = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetEntityId() {
        
        targetEntityId_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:AbilityGadgetInfo)
    }

    // @@protoc_insertion_point(class_scope:AbilityGadgetInfo)
    private static final emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo();
    }

    public static emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityGadgetInfo>
        PARSER = new com.google.protobuf.AbstractParser<AbilityGadgetInfo>() {
      @java.lang.Override
      public AbilityGadgetInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityGadgetInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityGadgetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityGadgetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityGadgetInfoOuterClass.AbilityGadgetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityGadgetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityGadgetInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027AbilityGadgetInfo.proto\"X\n\021AbilityGadg" +
      "etInfo\022\017\n\007camp_id\030\001 \001(\r\022\030\n\020camp_target_t" +
      "ype\030\002 \001(\r\022\030\n\020target_entity_id\030\003 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityGadgetInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityGadgetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityGadgetInfo_descriptor,
        new java.lang.String[] { "CampId", "CampTargetType", "TargetEntityId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
