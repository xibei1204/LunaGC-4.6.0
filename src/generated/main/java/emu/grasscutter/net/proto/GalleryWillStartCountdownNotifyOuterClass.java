// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GalleryWillStartCountdownNotify.proto

package emu.grasscutter.net.proto;

public final class GalleryWillStartCountdownNotifyOuterClass {
  private GalleryWillStartCountdownNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GalleryWillStartCountdownNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GalleryWillStartCountdownNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.GalleryStartSource start_source = 11;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    int getStartSourceValue();
    /**
     * <code>.GalleryStartSource start_source = 11;</code>
     * @return The startSource.
     */
    emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource();

    /**
     * <code>bool is_end = 9;</code>
     * @return The isEnd.
     */
    boolean getIsEnd();

    /**
     * <code>uint32 end_time = 4;</code>
     * @return The endTime.
     */
    int getEndTime();

    /**
     * <code>uint32 gallery_id = 6;</code>
     * @return The galleryId.
     */
    int getGalleryId();
  }
  /**
   * <pre>
   * CmdId: 26134
   * Obf: KCENJJNMBDM
   * </pre>
   *
   * Protobuf type {@code GalleryWillStartCountdownNotify}
   */
  public static final class GalleryWillStartCountdownNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GalleryWillStartCountdownNotify)
      GalleryWillStartCountdownNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GalleryWillStartCountdownNotify.newBuilder() to construct.
    private GalleryWillStartCountdownNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GalleryWillStartCountdownNotify() {
      startSource_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GalleryWillStartCountdownNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GalleryWillStartCountdownNotify(
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
            case 32: {

              endTime_ = input.readUInt32();
              break;
            }
            case 48: {

              galleryId_ = input.readUInt32();
              break;
            }
            case 72: {

              isEnd_ = input.readBool();
              break;
            }
            case 88: {
              int rawValue = input.readEnum();

              startSource_ = rawValue;
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
      return emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.class, emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.Builder.class);
    }

    public static final int START_SOURCE_FIELD_NUMBER = 11;
    private int startSource_;
    /**
     * <code>.GalleryStartSource start_source = 11;</code>
     * @return The enum numeric value on the wire for startSource.
     */
    @java.lang.Override public int getStartSourceValue() {
      return startSource_;
    }
    /**
     * <code>.GalleryStartSource start_source = 11;</code>
     * @return The startSource.
     */
    @java.lang.Override public emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
      return result == null ? emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
    }

    public static final int IS_END_FIELD_NUMBER = 9;
    private boolean isEnd_;
    /**
     * <code>bool is_end = 9;</code>
     * @return The isEnd.
     */
    @java.lang.Override
    public boolean getIsEnd() {
      return isEnd_;
    }

    public static final int END_TIME_FIELD_NUMBER = 4;
    private int endTime_;
    /**
     * <code>uint32 end_time = 4;</code>
     * @return The endTime.
     */
    @java.lang.Override
    public int getEndTime() {
      return endTime_;
    }

    public static final int GALLERY_ID_FIELD_NUMBER = 6;
    private int galleryId_;
    /**
     * <code>uint32 gallery_id = 6;</code>
     * @return The galleryId.
     */
    @java.lang.Override
    public int getGalleryId() {
      return galleryId_;
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
      if (endTime_ != 0) {
        output.writeUInt32(4, endTime_);
      }
      if (galleryId_ != 0) {
        output.writeUInt32(6, galleryId_);
      }
      if (isEnd_ != false) {
        output.writeBool(9, isEnd_);
      }
      if (startSource_ != emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_BY_NONE.getNumber()) {
        output.writeEnum(11, startSource_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (endTime_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, endTime_);
      }
      if (galleryId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, galleryId_);
      }
      if (isEnd_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, isEnd_);
      }
      if (startSource_ != emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.GALLERY_START_BY_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(11, startSource_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify other = (emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify) obj;

      if (startSource_ != other.startSource_) return false;
      if (getIsEnd()
          != other.getIsEnd()) return false;
      if (getEndTime()
          != other.getEndTime()) return false;
      if (getGalleryId()
          != other.getGalleryId()) return false;
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
      hash = (37 * hash) + START_SOURCE_FIELD_NUMBER;
      hash = (53 * hash) + startSource_;
      hash = (37 * hash) + IS_END_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsEnd());
      hash = (37 * hash) + END_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getEndTime();
      hash = (37 * hash) + GALLERY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getGalleryId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify prototype) {
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
     * CmdId: 26134
     * Obf: KCENJJNMBDM
     * </pre>
     *
     * Protobuf type {@code GalleryWillStartCountdownNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GalleryWillStartCountdownNotify)
        emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.class, emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.newBuilder()
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
        startSource_ = 0;

        isEnd_ = false;

        endTime_ = 0;

        galleryId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.internal_static_GalleryWillStartCountdownNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify build() {
        emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify buildPartial() {
        emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify result = new emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify(this);
        result.startSource_ = startSource_;
        result.isEnd_ = isEnd_;
        result.endTime_ = endTime_;
        result.galleryId_ = galleryId_;
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
        if (other instanceof emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify) {
          return mergeFrom((emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify other) {
        if (other == emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify.getDefaultInstance()) return this;
        if (other.startSource_ != 0) {
          setStartSourceValue(other.getStartSourceValue());
        }
        if (other.getIsEnd() != false) {
          setIsEnd(other.getIsEnd());
        }
        if (other.getEndTime() != 0) {
          setEndTime(other.getEndTime());
        }
        if (other.getGalleryId() != 0) {
          setGalleryId(other.getGalleryId());
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
        emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int startSource_ = 0;
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @return The enum numeric value on the wire for startSource.
       */
      @java.lang.Override public int getStartSourceValue() {
        return startSource_;
      }
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @param value The enum numeric value on the wire for startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSourceValue(int value) {
        
        startSource_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @return The startSource.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource getStartSource() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource result = emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.valueOf(startSource_);
        return result == null ? emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource.UNRECOGNIZED : result;
      }
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @param value The startSource to set.
       * @return This builder for chaining.
       */
      public Builder setStartSource(emu.grasscutter.net.proto.GalleryStartSourceOuterClass.GalleryStartSource value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        startSource_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.GalleryStartSource start_source = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearStartSource() {
        
        startSource_ = 0;
        onChanged();
        return this;
      }

      private boolean isEnd_ ;
      /**
       * <code>bool is_end = 9;</code>
       * @return The isEnd.
       */
      @java.lang.Override
      public boolean getIsEnd() {
        return isEnd_;
      }
      /**
       * <code>bool is_end = 9;</code>
       * @param value The isEnd to set.
       * @return This builder for chaining.
       */
      public Builder setIsEnd(boolean value) {
        
        isEnd_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_end = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsEnd() {
        
        isEnd_ = false;
        onChanged();
        return this;
      }

      private int endTime_ ;
      /**
       * <code>uint32 end_time = 4;</code>
       * @return The endTime.
       */
      @java.lang.Override
      public int getEndTime() {
        return endTime_;
      }
      /**
       * <code>uint32 end_time = 4;</code>
       * @param value The endTime to set.
       * @return This builder for chaining.
       */
      public Builder setEndTime(int value) {
        
        endTime_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 end_time = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEndTime() {
        
        endTime_ = 0;
        onChanged();
        return this;
      }

      private int galleryId_ ;
      /**
       * <code>uint32 gallery_id = 6;</code>
       * @return The galleryId.
       */
      @java.lang.Override
      public int getGalleryId() {
        return galleryId_;
      }
      /**
       * <code>uint32 gallery_id = 6;</code>
       * @param value The galleryId to set.
       * @return This builder for chaining.
       */
      public Builder setGalleryId(int value) {
        
        galleryId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 gallery_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearGalleryId() {
        
        galleryId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GalleryWillStartCountdownNotify)
    }

    // @@protoc_insertion_point(class_scope:GalleryWillStartCountdownNotify)
    private static final emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify();
    }

    public static emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GalleryWillStartCountdownNotify>
        PARSER = new com.google.protobuf.AbstractParser<GalleryWillStartCountdownNotify>() {
      @java.lang.Override
      public GalleryWillStartCountdownNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GalleryWillStartCountdownNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GalleryWillStartCountdownNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GalleryWillStartCountdownNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GalleryWillStartCountdownNotifyOuterClass.GalleryWillStartCountdownNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GalleryWillStartCountdownNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%GalleryWillStartCountdownNotify.proto\032" +
      "\030GalleryStartSource.proto\"\202\001\n\037GalleryWil" +
      "lStartCountdownNotify\022)\n\014start_source\030\013 " +
      "\001(\0162\023.GalleryStartSource\022\016\n\006is_end\030\t \001(\010" +
      "\022\020\n\010end_time\030\004 \001(\r\022\022\n\ngallery_id\030\006 \001(\rB\033" +
      "\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GalleryStartSourceOuterClass.getDescriptor(),
        });
    internal_static_GalleryWillStartCountdownNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GalleryWillStartCountdownNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GalleryWillStartCountdownNotify_descriptor,
        new java.lang.String[] { "StartSource", "IsEnd", "EndTime", "GalleryId", });
    emu.grasscutter.net.proto.GalleryStartSourceOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
