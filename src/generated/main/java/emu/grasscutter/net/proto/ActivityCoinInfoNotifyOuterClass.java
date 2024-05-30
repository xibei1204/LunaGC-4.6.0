// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ActivityCoinInfoNotify.proto

package emu.grasscutter.net.proto;

public final class ActivityCoinInfoNotifyOuterClass {
  private ActivityCoinInfoNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ActivityCoinInfoNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ActivityCoinInfoNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */
    int getActivityCoinMapCount();
    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */
    boolean containsActivityCoinMap(
        int key);
    /**
     * Use {@link #getActivityCoinMapMap()} instead.
     */
    @java.lang.Deprecated
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getActivityCoinMap();
    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */
    java.util.Map<java.lang.Integer, java.lang.Integer>
    getActivityCoinMapMap();
    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */

    int getActivityCoinMapOrDefault(
        int key,
        int defaultValue);
    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */

    int getActivityCoinMapOrThrow(
        int key);

    /**
     * <code>uint32 activity_id = 6;</code>
     * @return The activityId.
     */
    int getActivityId();

    /**
     * <code>uint32 schedule_id = 9;</code>
     * @return The scheduleId.
     */
    int getScheduleId();
  }
  /**
   * <pre>
   * CmdId: 27507
   * Obf: NLNPKCJECGK
   * </pre>
   *
   * Protobuf type {@code ActivityCoinInfoNotify}
   */
  public static final class ActivityCoinInfoNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ActivityCoinInfoNotify)
      ActivityCoinInfoNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ActivityCoinInfoNotify.newBuilder() to construct.
    private ActivityCoinInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ActivityCoinInfoNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ActivityCoinInfoNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ActivityCoinInfoNotify(
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
            case 34: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                activityCoinMap_ = com.google.protobuf.MapField.newMapField(
                    ActivityCoinMapDefaultEntryHolder.defaultEntry);
                mutable_bitField0_ |= 0x00000001;
              }
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
              activityCoinMap__ = input.readMessage(
                  ActivityCoinMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              activityCoinMap_.getMutableMap().put(
                  activityCoinMap__.getKey(), activityCoinMap__.getValue());
              break;
            }
            case 48: {

              activityId_ = input.readUInt32();
              break;
            }
            case 72: {

              scheduleId_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.internal_static_ActivityCoinInfoNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    @java.lang.Override
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 4:
          return internalGetActivityCoinMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.internal_static_ActivityCoinInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify.class, emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify.Builder.class);
    }

    public static final int ACTIVITY_COIN_MAP_FIELD_NUMBER = 4;
    private static final class ActivityCoinMapDefaultEntryHolder {
      static final com.google.protobuf.MapEntry<
          java.lang.Integer, java.lang.Integer> defaultEntry =
              com.google.protobuf.MapEntry
              .<java.lang.Integer, java.lang.Integer>newDefaultInstance(
                  emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.internal_static_ActivityCoinInfoNotify_ActivityCoinMapEntry_descriptor, 
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0,
                  com.google.protobuf.WireFormat.FieldType.UINT32,
                  0);
    }
    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Integer> activityCoinMap_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
    internalGetActivityCoinMap() {
      if (activityCoinMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ActivityCoinMapDefaultEntryHolder.defaultEntry);
      }
      return activityCoinMap_;
    }

    public int getActivityCoinMapCount() {
      return internalGetActivityCoinMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */

    @java.lang.Override
    public boolean containsActivityCoinMap(
        int key) {
      
      return internalGetActivityCoinMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getActivityCoinMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Integer> getActivityCoinMap() {
      return getActivityCoinMapMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, java.lang.Integer> getActivityCoinMapMap() {
      return internalGetActivityCoinMap().getMap();
    }
    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */
    @java.lang.Override

    public int getActivityCoinMapOrDefault(
        int key,
        int defaultValue) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetActivityCoinMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
     */
    @java.lang.Override

    public int getActivityCoinMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, java.lang.Integer> map =
          internalGetActivityCoinMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public static final int ACTIVITY_ID_FIELD_NUMBER = 6;
    private int activityId_;
    /**
     * <code>uint32 activity_id = 6;</code>
     * @return The activityId.
     */
    @java.lang.Override
    public int getActivityId() {
      return activityId_;
    }

    public static final int SCHEDULE_ID_FIELD_NUMBER = 9;
    private int scheduleId_;
    /**
     * <code>uint32 schedule_id = 9;</code>
     * @return The scheduleId.
     */
    @java.lang.Override
    public int getScheduleId() {
      return scheduleId_;
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
      com.google.protobuf.GeneratedMessageV3
        .serializeIntegerMapTo(
          output,
          internalGetActivityCoinMap(),
          ActivityCoinMapDefaultEntryHolder.defaultEntry,
          4);
      if (activityId_ != 0) {
        output.writeUInt32(6, activityId_);
      }
      if (scheduleId_ != 0) {
        output.writeUInt32(9, scheduleId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (java.util.Map.Entry<java.lang.Integer, java.lang.Integer> entry
           : internalGetActivityCoinMap().getMap().entrySet()) {
        com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Integer>
        activityCoinMap__ = ActivityCoinMapDefaultEntryHolder.defaultEntry.newBuilderForType()
            .setKey(entry.getKey())
            .setValue(entry.getValue())
            .build();
        size += com.google.protobuf.CodedOutputStream
            .computeMessageSize(4, activityCoinMap__);
      }
      if (activityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, activityId_);
      }
      if (scheduleId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(9, scheduleId_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify other = (emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify) obj;

      if (!internalGetActivityCoinMap().equals(
          other.internalGetActivityCoinMap())) return false;
      if (getActivityId()
          != other.getActivityId()) return false;
      if (getScheduleId()
          != other.getScheduleId()) return false;
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
      if (!internalGetActivityCoinMap().getMap().isEmpty()) {
        hash = (37 * hash) + ACTIVITY_COIN_MAP_FIELD_NUMBER;
        hash = (53 * hash) + internalGetActivityCoinMap().hashCode();
      }
      hash = (37 * hash) + ACTIVITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getActivityId();
      hash = (37 * hash) + SCHEDULE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getScheduleId();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify prototype) {
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
     * CmdId: 27507
     * Obf: NLNPKCJECGK
     * </pre>
     *
     * Protobuf type {@code ActivityCoinInfoNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ActivityCoinInfoNotify)
        emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.internal_static_ActivityCoinInfoNotify_descriptor;
      }

      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetActivityCoinMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @SuppressWarnings({"rawtypes"})
      protected com.google.protobuf.MapField internalGetMutableMapField(
          int number) {
        switch (number) {
          case 4:
            return internalGetMutableActivityCoinMap();
          default:
            throw new RuntimeException(
                "Invalid map field number: " + number);
        }
      }
      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.internal_static_ActivityCoinInfoNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify.class, emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify.newBuilder()
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
        internalGetMutableActivityCoinMap().clear();
        activityId_ = 0;

        scheduleId_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.internal_static_ActivityCoinInfoNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify build() {
        emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify buildPartial() {
        emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify result = new emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify(this);
        int from_bitField0_ = bitField0_;
        result.activityCoinMap_ = internalGetActivityCoinMap();
        result.activityCoinMap_.makeImmutable();
        result.activityId_ = activityId_;
        result.scheduleId_ = scheduleId_;
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
        if (other instanceof emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify) {
          return mergeFrom((emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify other) {
        if (other == emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify.getDefaultInstance()) return this;
        internalGetMutableActivityCoinMap().mergeFrom(
            other.internalGetActivityCoinMap());
        if (other.getActivityId() != 0) {
          setActivityId(other.getActivityId());
        }
        if (other.getScheduleId() != 0) {
          setScheduleId(other.getScheduleId());
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
        emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.MapField<
          java.lang.Integer, java.lang.Integer> activityCoinMap_;
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetActivityCoinMap() {
        if (activityCoinMap_ == null) {
          return com.google.protobuf.MapField.emptyMapField(
              ActivityCoinMapDefaultEntryHolder.defaultEntry);
        }
        return activityCoinMap_;
      }
      private com.google.protobuf.MapField<java.lang.Integer, java.lang.Integer>
      internalGetMutableActivityCoinMap() {
        onChanged();;
        if (activityCoinMap_ == null) {
          activityCoinMap_ = com.google.protobuf.MapField.newMapField(
              ActivityCoinMapDefaultEntryHolder.defaultEntry);
        }
        if (!activityCoinMap_.isMutable()) {
          activityCoinMap_ = activityCoinMap_.copy();
        }
        return activityCoinMap_;
      }

      public int getActivityCoinMapCount() {
        return internalGetActivityCoinMap().getMap().size();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
       */

      @java.lang.Override
      public boolean containsActivityCoinMap(
          int key) {
        
        return internalGetActivityCoinMap().getMap().containsKey(key);
      }
      /**
       * Use {@link #getActivityCoinMapMap()} instead.
       */
      @java.lang.Override
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer> getActivityCoinMap() {
        return getActivityCoinMapMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
       */
      @java.lang.Override

      public java.util.Map<java.lang.Integer, java.lang.Integer> getActivityCoinMapMap() {
        return internalGetActivityCoinMap().getMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
       */
      @java.lang.Override

      public int getActivityCoinMapOrDefault(
          int key,
          int defaultValue) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetActivityCoinMap().getMap();
        return map.containsKey(key) ? map.get(key) : defaultValue;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
       */
      @java.lang.Override

      public int getActivityCoinMapOrThrow(
          int key) {
        
        java.util.Map<java.lang.Integer, java.lang.Integer> map =
            internalGetActivityCoinMap().getMap();
        if (!map.containsKey(key)) {
          throw new java.lang.IllegalArgumentException();
        }
        return map.get(key);
      }

      public Builder clearActivityCoinMap() {
        internalGetMutableActivityCoinMap().getMutableMap()
            .clear();
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
       */

      public Builder removeActivityCoinMap(
          int key) {
        
        internalGetMutableActivityCoinMap().getMutableMap()
            .remove(key);
        return this;
      }
      /**
       * Use alternate mutation accessors instead.
       */
      @java.lang.Deprecated
      public java.util.Map<java.lang.Integer, java.lang.Integer>
      getMutableActivityCoinMap() {
        return internalGetMutableActivityCoinMap().getMutableMap();
      }
      /**
       * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
       */
      public Builder putActivityCoinMap(
          int key,
          int value) {
        
        
        internalGetMutableActivityCoinMap().getMutableMap()
            .put(key, value);
        return this;
      }
      /**
       * <code>map&lt;uint32, uint32&gt; activity_coin_map = 4;</code>
       */

      public Builder putAllActivityCoinMap(
          java.util.Map<java.lang.Integer, java.lang.Integer> values) {
        internalGetMutableActivityCoinMap().getMutableMap()
            .putAll(values);
        return this;
      }

      private int activityId_ ;
      /**
       * <code>uint32 activity_id = 6;</code>
       * @return The activityId.
       */
      @java.lang.Override
      public int getActivityId() {
        return activityId_;
      }
      /**
       * <code>uint32 activity_id = 6;</code>
       * @param value The activityId to set.
       * @return This builder for chaining.
       */
      public Builder setActivityId(int value) {
        
        activityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 activity_id = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearActivityId() {
        
        activityId_ = 0;
        onChanged();
        return this;
      }

      private int scheduleId_ ;
      /**
       * <code>uint32 schedule_id = 9;</code>
       * @return The scheduleId.
       */
      @java.lang.Override
      public int getScheduleId() {
        return scheduleId_;
      }
      /**
       * <code>uint32 schedule_id = 9;</code>
       * @param value The scheduleId to set.
       * @return This builder for chaining.
       */
      public Builder setScheduleId(int value) {
        
        scheduleId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 schedule_id = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearScheduleId() {
        
        scheduleId_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ActivityCoinInfoNotify)
    }

    // @@protoc_insertion_point(class_scope:ActivityCoinInfoNotify)
    private static final emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify();
    }

    public static emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ActivityCoinInfoNotify>
        PARSER = new com.google.protobuf.AbstractParser<ActivityCoinInfoNotify>() {
      @java.lang.Override
      public ActivityCoinInfoNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ActivityCoinInfoNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ActivityCoinInfoNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ActivityCoinInfoNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ActivityCoinInfoNotifyOuterClass.ActivityCoinInfoNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityCoinInfoNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityCoinInfoNotify_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ActivityCoinInfoNotify_ActivityCoinMapEntry_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ActivityCoinInfoNotify_ActivityCoinMapEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\034ActivityCoinInfoNotify.proto\"\303\001\n\026Activ" +
      "ityCoinInfoNotify\022G\n\021activity_coin_map\030\004" +
      " \003(\0132,.ActivityCoinInfoNotify.ActivityCo" +
      "inMapEntry\022\023\n\013activity_id\030\006 \001(\r\022\023\n\013sched" +
      "ule_id\030\t \001(\r\0326\n\024ActivityCoinMapEntry\022\013\n\003" +
      "key\030\001 \001(\r\022\r\n\005value\030\002 \001(\r:\0028\001B\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_ActivityCoinInfoNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ActivityCoinInfoNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityCoinInfoNotify_descriptor,
        new java.lang.String[] { "ActivityCoinMap", "ActivityId", "ScheduleId", });
    internal_static_ActivityCoinInfoNotify_ActivityCoinMapEntry_descriptor =
      internal_static_ActivityCoinInfoNotify_descriptor.getNestedTypes().get(0);
    internal_static_ActivityCoinInfoNotify_ActivityCoinMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ActivityCoinInfoNotify_ActivityCoinMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
