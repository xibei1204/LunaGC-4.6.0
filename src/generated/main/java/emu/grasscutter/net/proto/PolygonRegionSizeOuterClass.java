// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PolygonRegionSize.proto

package emu.grasscutter.net.proto;

public final class PolygonRegionSizeOuterClass {
  private PolygonRegionSizeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PolygonRegionSizeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PolygonRegionSize)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>float height = 14;</code>
     * @return The height.
     */
    float getHeight();

    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    java.util.List<emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane> 
        getPointListList();
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane getPointList(int index);
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    int getPointListCount();
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder> 
        getPointListOrBuilderList();
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder getPointListOrBuilder(
        int index);
  }
  /**
   * <pre>
   * Obf: GHHFCCDJEIE
   * </pre>
   *
   * Protobuf type {@code PolygonRegionSize}
   */
  public static final class PolygonRegionSize extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PolygonRegionSize)
      PolygonRegionSizeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PolygonRegionSize.newBuilder() to construct.
    private PolygonRegionSize(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PolygonRegionSize() {
      pointList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PolygonRegionSize();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PolygonRegionSize(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 106: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                pointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane>();
                mutable_bitField0_ |= 0x00000001;
              }
              pointList_.add(
                  input.readMessage(emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.parser(), extensionRegistry));
              break;
            }
            case 117: {

              height_ = input.readFloat();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          pointList_ = java.util.Collections.unmodifiableList(pointList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.internal_static_PolygonRegionSize_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.internal_static_PolygonRegionSize_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize.class, emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize.Builder.class);
    }

    public static final int HEIGHT_FIELD_NUMBER = 14;
    private float height_;
    /**
     * <code>float height = 14;</code>
     * @return The height.
     */
    @java.lang.Override
    public float getHeight() {
      return height_;
    }

    public static final int POINT_LIST_FIELD_NUMBER = 13;
    private java.util.List<emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane> pointList_;
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane> getPointListList() {
      return pointList_;
    }
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder> 
        getPointListOrBuilderList() {
      return pointList_;
    }
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    @java.lang.Override
    public int getPointListCount() {
      return pointList_.size();
    }
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane getPointList(int index) {
      return pointList_.get(index);
    }
    /**
     * <code>repeated .VectorPlane point_list = 13;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder getPointListOrBuilder(
        int index) {
      return pointList_.get(index);
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
      for (int i = 0; i < pointList_.size(); i++) {
        output.writeMessage(13, pointList_.get(i));
      }
      if (height_ != 0F) {
        output.writeFloat(14, height_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < pointList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, pointList_.get(i));
      }
      if (height_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(14, height_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize other = (emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize) obj;

      if (java.lang.Float.floatToIntBits(getHeight())
          != java.lang.Float.floatToIntBits(
              other.getHeight())) return false;
      if (!getPointListList()
          .equals(other.getPointListList())) return false;
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
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHeight());
      if (getPointListCount() > 0) {
        hash = (37 * hash) + POINT_LIST_FIELD_NUMBER;
        hash = (53 * hash) + getPointListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize prototype) {
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
     * Obf: GHHFCCDJEIE
     * </pre>
     *
     * Protobuf type {@code PolygonRegionSize}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PolygonRegionSize)
        emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSizeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.internal_static_PolygonRegionSize_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.internal_static_PolygonRegionSize_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize.class, emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize.newBuilder()
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
          getPointListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        height_ = 0F;

        if (pointListBuilder_ == null) {
          pointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          pointListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.internal_static_PolygonRegionSize_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize build() {
        emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize buildPartial() {
        emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize result = new emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize(this);
        int from_bitField0_ = bitField0_;
        result.height_ = height_;
        if (pointListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            pointList_ = java.util.Collections.unmodifiableList(pointList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.pointList_ = pointList_;
        } else {
          result.pointList_ = pointListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize) {
          return mergeFrom((emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize other) {
        if (other == emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize.getDefaultInstance()) return this;
        if (other.getHeight() != 0F) {
          setHeight(other.getHeight());
        }
        if (pointListBuilder_ == null) {
          if (!other.pointList_.isEmpty()) {
            if (pointList_.isEmpty()) {
              pointList_ = other.pointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePointListIsMutable();
              pointList_.addAll(other.pointList_);
            }
            onChanged();
          }
        } else {
          if (!other.pointList_.isEmpty()) {
            if (pointListBuilder_.isEmpty()) {
              pointListBuilder_.dispose();
              pointListBuilder_ = null;
              pointList_ = other.pointList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              pointListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPointListFieldBuilder() : null;
            } else {
              pointListBuilder_.addAllMessages(other.pointList_);
            }
          }
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
        emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private float height_ ;
      /**
       * <code>float height = 14;</code>
       * @return The height.
       */
      @java.lang.Override
      public float getHeight() {
        return height_;
      }
      /**
       * <code>float height = 14;</code>
       * @param value The height to set.
       * @return This builder for chaining.
       */
      public Builder setHeight(float value) {
        
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float height = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearHeight() {
        
        height_ = 0F;
        onChanged();
        return this;
      }

      private java.util.List<emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane> pointList_ =
        java.util.Collections.emptyList();
      private void ensurePointListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          pointList_ = new java.util.ArrayList<emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane>(pointList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder> pointListBuilder_;

      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane> getPointListList() {
        if (pointListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(pointList_);
        } else {
          return pointListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public int getPointListCount() {
        if (pointListBuilder_ == null) {
          return pointList_.size();
        } else {
          return pointListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane getPointList(int index) {
        if (pointListBuilder_ == null) {
          return pointList_.get(index);
        } else {
          return pointListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder setPointList(
          int index, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.set(index, value);
          onChanged();
        } else {
          pointListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder setPointList(
          int index, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.set(index, builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder addPointList(emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.add(value);
          onChanged();
        } else {
          pointListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder addPointList(
          int index, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane value) {
        if (pointListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePointListIsMutable();
          pointList_.add(index, value);
          onChanged();
        } else {
          pointListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder addPointList(
          emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.add(builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder addPointList(
          int index, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder builderForValue) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.add(index, builderForValue.build());
          onChanged();
        } else {
          pointListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder addAllPointList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane> values) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, pointList_);
          onChanged();
        } else {
          pointListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder clearPointList() {
        if (pointListBuilder_ == null) {
          pointList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          pointListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public Builder removePointList(int index) {
        if (pointListBuilder_ == null) {
          ensurePointListIsMutable();
          pointList_.remove(index);
          onChanged();
        } else {
          pointListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder getPointListBuilder(
          int index) {
        return getPointListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder getPointListOrBuilder(
          int index) {
        if (pointListBuilder_ == null) {
          return pointList_.get(index);  } else {
          return pointListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder> 
           getPointListOrBuilderList() {
        if (pointListBuilder_ != null) {
          return pointListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(pointList_);
        }
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder addPointListBuilder() {
        return getPointListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.getDefaultInstance());
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder addPointListBuilder(
          int index) {
        return getPointListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.getDefaultInstance());
      }
      /**
       * <code>repeated .VectorPlane point_list = 13;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder> 
           getPointListBuilderList() {
        return getPointListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder> 
          getPointListFieldBuilder() {
        if (pointListBuilder_ == null) {
          pointListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlane.Builder, emu.grasscutter.net.proto.VectorPlaneOuterClass.VectorPlaneOrBuilder>(
                  pointList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          pointList_ = null;
        }
        return pointListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:PolygonRegionSize)
    }

    // @@protoc_insertion_point(class_scope:PolygonRegionSize)
    private static final emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize();
    }

    public static emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PolygonRegionSize>
        PARSER = new com.google.protobuf.AbstractParser<PolygonRegionSize>() {
      @java.lang.Override
      public PolygonRegionSize parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PolygonRegionSize(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PolygonRegionSize> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PolygonRegionSize> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.PolygonRegionSizeOuterClass.PolygonRegionSize getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PolygonRegionSize_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PolygonRegionSize_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PolygonRegionSize.proto\032\021VectorPlane.p" +
      "roto\"E\n\021PolygonRegionSize\022\016\n\006height\030\016 \001(" +
      "\002\022 \n\npoint_list\030\r \003(\0132\014.VectorPlaneB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VectorPlaneOuterClass.getDescriptor(),
        });
    internal_static_PolygonRegionSize_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PolygonRegionSize_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PolygonRegionSize_descriptor,
        new java.lang.String[] { "Height", "PointList", });
    emu.grasscutter.net.proto.VectorPlaneOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
