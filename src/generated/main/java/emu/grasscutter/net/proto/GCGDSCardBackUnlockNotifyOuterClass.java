// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGDSCardBackUnlockNotify.proto

package emu.grasscutter.net.proto;

public final class GCGDSCardBackUnlockNotifyOuterClass {
  private GCGDSCardBackUnlockNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGDSCardBackUnlockNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGDSCardBackUnlockNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 card_back_id = 7;</code>
     * @return The cardBackId.
     */
    int getCardBackId();
  }
  /**
   * <pre>
   * CmdId: 27702
   * Obf: NECNIDOCACF
   * </pre>
   *
   * Protobuf type {@code GCGDSCardBackUnlockNotify}
   */
  public static final class GCGDSCardBackUnlockNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGDSCardBackUnlockNotify)
      GCGDSCardBackUnlockNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGDSCardBackUnlockNotify.newBuilder() to construct.
    private GCGDSCardBackUnlockNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGDSCardBackUnlockNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGDSCardBackUnlockNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGDSCardBackUnlockNotify(
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
            case 56: {

              cardBackId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.class, emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.Builder.class);
    }

    public static final int CARD_BACK_ID_FIELD_NUMBER = 7;
    private int cardBackId_;
    /**
     * <code>uint32 card_back_id = 7;</code>
     * @return The cardBackId.
     */
    @java.lang.Override
    public int getCardBackId() {
      return cardBackId_;
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
      if (cardBackId_ != 0) {
        output.writeUInt32(7, cardBackId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (cardBackId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, cardBackId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify other = (emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify) obj;

      if (getCardBackId()
          != other.getCardBackId()) return false;
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
      hash = (37 * hash) + CARD_BACK_ID_FIELD_NUMBER;
      hash = (53 * hash) + getCardBackId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify prototype) {
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
     * CmdId: 27702
     * Obf: NECNIDOCACF
     * </pre>
     *
     * Protobuf type {@code GCGDSCardBackUnlockNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGDSCardBackUnlockNotify)
        emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.class, emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.newBuilder()
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
        cardBackId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.internal_static_GCGDSCardBackUnlockNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify build() {
        emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify buildPartial() {
        emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify result = new emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify(this);
        result.cardBackId_ = cardBackId_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify other) {
        if (other == emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify.getDefaultInstance()) return this;
        if (other.getCardBackId() != 0) {
          setCardBackId(other.getCardBackId());
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
        emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int cardBackId_ ;
      /**
       * <code>uint32 card_back_id = 7;</code>
       * @return The cardBackId.
       */
      @java.lang.Override
      public int getCardBackId() {
        return cardBackId_;
      }
      /**
       * <code>uint32 card_back_id = 7;</code>
       * @param value The cardBackId to set.
       * @return This builder for chaining.
       */
      public Builder setCardBackId(int value) {
        
        cardBackId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 card_back_id = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearCardBackId() {
        
        cardBackId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GCGDSCardBackUnlockNotify)
    }

    // @@protoc_insertion_point(class_scope:GCGDSCardBackUnlockNotify)
    private static final emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify();
    }

    public static emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGDSCardBackUnlockNotify>
        PARSER = new com.google.protobuf.AbstractParser<GCGDSCardBackUnlockNotify>() {
      @java.lang.Override
      public GCGDSCardBackUnlockNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGDSCardBackUnlockNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGDSCardBackUnlockNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGDSCardBackUnlockNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGDSCardBackUnlockNotifyOuterClass.GCGDSCardBackUnlockNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGDSCardBackUnlockNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGDSCardBackUnlockNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037GCGDSCardBackUnlockNotify.proto\"1\n\031GCG" +
      "DSCardBackUnlockNotify\022\024\n\014card_back_id\030\007" +
      " \001(\rB\033\n\031emu.grasscutter.net.protob\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGDSCardBackUnlockNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGDSCardBackUnlockNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGDSCardBackUnlockNotify_descriptor,
        new java.lang.String[] { "CardBackId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
