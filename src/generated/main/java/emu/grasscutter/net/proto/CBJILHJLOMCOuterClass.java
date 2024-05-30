// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CBJILHJLOMC.proto

package emu.grasscutter.net.proto;

public final class CBJILHJLOMCOuterClass {
  private CBJILHJLOMCOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CBJILHJLOMCOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CBJILHJLOMC)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 2;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 DEJJPIOCJDD = 1;</code>
     * @return The dEJJPIOCJDD.
     */
    int getDEJJPIOCJDD();

    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    int getScore();

    /**
     * <code>uint32 AHOADFMAPLB = 6;</code>
     * @return The aHOADFMAPLB.
     */
    int getAHOADFMAPLB();

    /**
     * <code>bool is_new_record = 13;</code>
     * @return The isNewRecord.
     */
    boolean getIsNewRecord();

    /**
     * <code>uint32 difficulty = 4;</code>
     * @return The difficulty.
     */
    int getDifficulty();
  }
  /**
   * <pre>
   * CmdId: 24154
   * </pre>
   *
   * Protobuf type {@code CBJILHJLOMC}
   */
  public static final class CBJILHJLOMC extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CBJILHJLOMC)
      CBJILHJLOMCOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CBJILHJLOMC.newBuilder() to construct.
    private CBJILHJLOMC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CBJILHJLOMC() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CBJILHJLOMC();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CBJILHJLOMC(
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

              dEJJPIOCJDD_ = input.readUInt32();
              break;
            }
            case 16: {

              isSuccess_ = input.readBool();
              break;
            }
            case 32: {

              difficulty_ = input.readUInt32();
              break;
            }
            case 40: {

              score_ = input.readUInt32();
              break;
            }
            case 48: {

              aHOADFMAPLB_ = input.readUInt32();
              break;
            }
            case 104: {

              isNewRecord_ = input.readBool();
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
      return emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.internal_static_CBJILHJLOMC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.internal_static_CBJILHJLOMC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC.class, emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 2;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 2;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int DEJJPIOCJDD_FIELD_NUMBER = 1;
    private int dEJJPIOCJDD_;
    /**
     * <code>uint32 DEJJPIOCJDD = 1;</code>
     * @return The dEJJPIOCJDD.
     */
    @java.lang.Override
    public int getDEJJPIOCJDD() {
      return dEJJPIOCJDD_;
    }

    public static final int SCORE_FIELD_NUMBER = 5;
    private int score_;
    /**
     * <code>uint32 score = 5;</code>
     * @return The score.
     */
    @java.lang.Override
    public int getScore() {
      return score_;
    }

    public static final int AHOADFMAPLB_FIELD_NUMBER = 6;
    private int aHOADFMAPLB_;
    /**
     * <code>uint32 AHOADFMAPLB = 6;</code>
     * @return The aHOADFMAPLB.
     */
    @java.lang.Override
    public int getAHOADFMAPLB() {
      return aHOADFMAPLB_;
    }

    public static final int IS_NEW_RECORD_FIELD_NUMBER = 13;
    private boolean isNewRecord_;
    /**
     * <code>bool is_new_record = 13;</code>
     * @return The isNewRecord.
     */
    @java.lang.Override
    public boolean getIsNewRecord() {
      return isNewRecord_;
    }

    public static final int DIFFICULTY_FIELD_NUMBER = 4;
    private int difficulty_;
    /**
     * <code>uint32 difficulty = 4;</code>
     * @return The difficulty.
     */
    @java.lang.Override
    public int getDifficulty() {
      return difficulty_;
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
      if (dEJJPIOCJDD_ != 0) {
        output.writeUInt32(1, dEJJPIOCJDD_);
      }
      if (isSuccess_ != false) {
        output.writeBool(2, isSuccess_);
      }
      if (difficulty_ != 0) {
        output.writeUInt32(4, difficulty_);
      }
      if (score_ != 0) {
        output.writeUInt32(5, score_);
      }
      if (aHOADFMAPLB_ != 0) {
        output.writeUInt32(6, aHOADFMAPLB_);
      }
      if (isNewRecord_ != false) {
        output.writeBool(13, isNewRecord_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (dEJJPIOCJDD_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, dEJJPIOCJDD_);
      }
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, isSuccess_);
      }
      if (difficulty_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, difficulty_);
      }
      if (score_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, score_);
      }
      if (aHOADFMAPLB_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, aHOADFMAPLB_);
      }
      if (isNewRecord_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, isNewRecord_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC other = (emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getDEJJPIOCJDD()
          != other.getDEJJPIOCJDD()) return false;
      if (getScore()
          != other.getScore()) return false;
      if (getAHOADFMAPLB()
          != other.getAHOADFMAPLB()) return false;
      if (getIsNewRecord()
          != other.getIsNewRecord()) return false;
      if (getDifficulty()
          != other.getDifficulty()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + DEJJPIOCJDD_FIELD_NUMBER;
      hash = (53 * hash) + getDEJJPIOCJDD();
      hash = (37 * hash) + SCORE_FIELD_NUMBER;
      hash = (53 * hash) + getScore();
      hash = (37 * hash) + AHOADFMAPLB_FIELD_NUMBER;
      hash = (53 * hash) + getAHOADFMAPLB();
      hash = (37 * hash) + IS_NEW_RECORD_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsNewRecord());
      hash = (37 * hash) + DIFFICULTY_FIELD_NUMBER;
      hash = (53 * hash) + getDifficulty();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC prototype) {
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
     * CmdId: 24154
     * </pre>
     *
     * Protobuf type {@code CBJILHJLOMC}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CBJILHJLOMC)
        emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMCOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.internal_static_CBJILHJLOMC_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.internal_static_CBJILHJLOMC_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC.class, emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC.newBuilder()
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
        isSuccess_ = false;

        dEJJPIOCJDD_ = 0;

        score_ = 0;

        aHOADFMAPLB_ = 0;

        isNewRecord_ = false;

        difficulty_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.internal_static_CBJILHJLOMC_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC build() {
        emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC buildPartial() {
        emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC result = new emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC(this);
        result.isSuccess_ = isSuccess_;
        result.dEJJPIOCJDD_ = dEJJPIOCJDD_;
        result.score_ = score_;
        result.aHOADFMAPLB_ = aHOADFMAPLB_;
        result.isNewRecord_ = isNewRecord_;
        result.difficulty_ = difficulty_;
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
        if (other instanceof emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC) {
          return mergeFrom((emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC other) {
        if (other == emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getDEJJPIOCJDD() != 0) {
          setDEJJPIOCJDD(other.getDEJJPIOCJDD());
        }
        if (other.getScore() != 0) {
          setScore(other.getScore());
        }
        if (other.getAHOADFMAPLB() != 0) {
          setAHOADFMAPLB(other.getAHOADFMAPLB());
        }
        if (other.getIsNewRecord() != false) {
          setIsNewRecord(other.getIsNewRecord());
        }
        if (other.getDifficulty() != 0) {
          setDifficulty(other.getDifficulty());
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
        emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 2;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 2;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int dEJJPIOCJDD_ ;
      /**
       * <code>uint32 DEJJPIOCJDD = 1;</code>
       * @return The dEJJPIOCJDD.
       */
      @java.lang.Override
      public int getDEJJPIOCJDD() {
        return dEJJPIOCJDD_;
      }
      /**
       * <code>uint32 DEJJPIOCJDD = 1;</code>
       * @param value The dEJJPIOCJDD to set.
       * @return This builder for chaining.
       */
      public Builder setDEJJPIOCJDD(int value) {
        
        dEJJPIOCJDD_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DEJJPIOCJDD = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearDEJJPIOCJDD() {
        
        dEJJPIOCJDD_ = 0;
        onChanged();
        return this;
      }

      private int score_ ;
      /**
       * <code>uint32 score = 5;</code>
       * @return The score.
       */
      @java.lang.Override
      public int getScore() {
        return score_;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @param value The score to set.
       * @return This builder for chaining.
       */
      public Builder setScore(int value) {
        
        score_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 score = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearScore() {
        
        score_ = 0;
        onChanged();
        return this;
      }

      private int aHOADFMAPLB_ ;
      /**
       * <code>uint32 AHOADFMAPLB = 6;</code>
       * @return The aHOADFMAPLB.
       */
      @java.lang.Override
      public int getAHOADFMAPLB() {
        return aHOADFMAPLB_;
      }
      /**
       * <code>uint32 AHOADFMAPLB = 6;</code>
       * @param value The aHOADFMAPLB to set.
       * @return This builder for chaining.
       */
      public Builder setAHOADFMAPLB(int value) {
        
        aHOADFMAPLB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 AHOADFMAPLB = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearAHOADFMAPLB() {
        
        aHOADFMAPLB_ = 0;
        onChanged();
        return this;
      }

      private boolean isNewRecord_ ;
      /**
       * <code>bool is_new_record = 13;</code>
       * @return The isNewRecord.
       */
      @java.lang.Override
      public boolean getIsNewRecord() {
        return isNewRecord_;
      }
      /**
       * <code>bool is_new_record = 13;</code>
       * @param value The isNewRecord to set.
       * @return This builder for chaining.
       */
      public Builder setIsNewRecord(boolean value) {
        
        isNewRecord_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_new_record = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsNewRecord() {
        
        isNewRecord_ = false;
        onChanged();
        return this;
      }

      private int difficulty_ ;
      /**
       * <code>uint32 difficulty = 4;</code>
       * @return The difficulty.
       */
      @java.lang.Override
      public int getDifficulty() {
        return difficulty_;
      }
      /**
       * <code>uint32 difficulty = 4;</code>
       * @param value The difficulty to set.
       * @return This builder for chaining.
       */
      public Builder setDifficulty(int value) {
        
        difficulty_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 difficulty = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearDifficulty() {
        
        difficulty_ = 0;
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


      // @@protoc_insertion_point(builder_scope:CBJILHJLOMC)
    }

    // @@protoc_insertion_point(class_scope:CBJILHJLOMC)
    private static final emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC();
    }

    public static emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CBJILHJLOMC>
        PARSER = new com.google.protobuf.AbstractParser<CBJILHJLOMC>() {
      @java.lang.Override
      public CBJILHJLOMC parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CBJILHJLOMC(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CBJILHJLOMC> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CBJILHJLOMC> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.CBJILHJLOMCOuterClass.CBJILHJLOMC getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CBJILHJLOMC_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CBJILHJLOMC_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021CBJILHJLOMC.proto\"\205\001\n\013CBJILHJLOMC\022\022\n\ni" +
      "s_success\030\002 \001(\010\022\023\n\013DEJJPIOCJDD\030\001 \001(\r\022\r\n\005" +
      "score\030\005 \001(\r\022\023\n\013AHOADFMAPLB\030\006 \001(\r\022\025\n\ris_n" +
      "ew_record\030\r \001(\010\022\022\n\ndifficulty\030\004 \001(\rB\033\n\031e" +
      "mu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_CBJILHJLOMC_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_CBJILHJLOMC_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CBJILHJLOMC_descriptor,
        new java.lang.String[] { "IsSuccess", "DEJJPIOCJDD", "Score", "AHOADFMAPLB", "IsNewRecord", "Difficulty", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
