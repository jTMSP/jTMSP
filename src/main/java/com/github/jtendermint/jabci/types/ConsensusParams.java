// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * <pre>
 * ConsensusParams contains all consensus-relevant parameters
 * that can be adjusted by the abci app
 * </pre>
 *
 * Protobuf type {@code com.github.jtendermint.jabci.types.ConsensusParams}
 */
public  final class ConsensusParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.ConsensusParams)
    ConsensusParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConsensusParams.newBuilder() to construct.
  private ConsensusParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConsensusParams() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ConsensusParams(
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
          case 10: {
            com.github.jtendermint.jabci.types.BlockSizeParams.Builder subBuilder = null;
            if (blockSize_ != null) {
              subBuilder = blockSize_.toBuilder();
            }
            blockSize_ = input.readMessage(com.github.jtendermint.jabci.types.BlockSizeParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blockSize_);
              blockSize_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            com.github.jtendermint.jabci.types.EvidenceParams.Builder subBuilder = null;
            if (evidence_ != null) {
              subBuilder = evidence_.toBuilder();
            }
            evidence_ = input.readMessage(com.github.jtendermint.jabci.types.EvidenceParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(evidence_);
              evidence_ = subBuilder.buildPartial();
            }

            break;
          }
          case 26: {
            com.github.jtendermint.jabci.types.ValidatorParams.Builder subBuilder = null;
            if (validator_ != null) {
              subBuilder = validator_.toBuilder();
            }
            validator_ = input.readMessage(com.github.jtendermint.jabci.types.ValidatorParams.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(validator_);
              validator_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.ConsensusParams.class, com.github.jtendermint.jabci.types.ConsensusParams.Builder.class);
  }

  public static final int BLOCK_SIZE_FIELD_NUMBER = 1;
  private com.github.jtendermint.jabci.types.BlockSizeParams blockSize_;
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
   */
  public boolean hasBlockSize() {
    return blockSize_ != null;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
   */
  public com.github.jtendermint.jabci.types.BlockSizeParams getBlockSize() {
    return blockSize_ == null ? com.github.jtendermint.jabci.types.BlockSizeParams.getDefaultInstance() : blockSize_;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
   */
  public com.github.jtendermint.jabci.types.BlockSizeParamsOrBuilder getBlockSizeOrBuilder() {
    return getBlockSize();
  }

  public static final int EVIDENCE_FIELD_NUMBER = 2;
  private com.github.jtendermint.jabci.types.EvidenceParams evidence_;
  /**
   * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
   */
  public boolean hasEvidence() {
    return evidence_ != null;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
   */
  public com.github.jtendermint.jabci.types.EvidenceParams getEvidence() {
    return evidence_ == null ? com.github.jtendermint.jabci.types.EvidenceParams.getDefaultInstance() : evidence_;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
   */
  public com.github.jtendermint.jabci.types.EvidenceParamsOrBuilder getEvidenceOrBuilder() {
    return getEvidence();
  }

  public static final int VALIDATOR_FIELD_NUMBER = 3;
  private com.github.jtendermint.jabci.types.ValidatorParams validator_;
  /**
   * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
   */
  public boolean hasValidator() {
    return validator_ != null;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
   */
  public com.github.jtendermint.jabci.types.ValidatorParams getValidator() {
    return validator_ == null ? com.github.jtendermint.jabci.types.ValidatorParams.getDefaultInstance() : validator_;
  }
  /**
   * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
   */
  public com.github.jtendermint.jabci.types.ValidatorParamsOrBuilder getValidatorOrBuilder() {
    return getValidator();
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
    if (blockSize_ != null) {
      output.writeMessage(1, getBlockSize());
    }
    if (evidence_ != null) {
      output.writeMessage(2, getEvidence());
    }
    if (validator_ != null) {
      output.writeMessage(3, getValidator());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blockSize_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlockSize());
    }
    if (evidence_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getEvidence());
    }
    if (validator_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getValidator());
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
    if (!(obj instanceof com.github.jtendermint.jabci.types.ConsensusParams)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.ConsensusParams other = (com.github.jtendermint.jabci.types.ConsensusParams) obj;

    boolean result = true;
    result = result && (hasBlockSize() == other.hasBlockSize());
    if (hasBlockSize()) {
      result = result && getBlockSize()
          .equals(other.getBlockSize());
    }
    result = result && (hasEvidence() == other.hasEvidence());
    if (hasEvidence()) {
      result = result && getEvidence()
          .equals(other.getEvidence());
    }
    result = result && (hasValidator() == other.hasValidator());
    if (hasValidator()) {
      result = result && getValidator()
          .equals(other.getValidator());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBlockSize()) {
      hash = (37 * hash) + BLOCK_SIZE_FIELD_NUMBER;
      hash = (53 * hash) + getBlockSize().hashCode();
    }
    if (hasEvidence()) {
      hash = (37 * hash) + EVIDENCE_FIELD_NUMBER;
      hash = (53 * hash) + getEvidence().hashCode();
    }
    if (hasValidator()) {
      hash = (37 * hash) + VALIDATOR_FIELD_NUMBER;
      hash = (53 * hash) + getValidator().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ConsensusParams parseFrom(
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
  public static Builder newBuilder(com.github.jtendermint.jabci.types.ConsensusParams prototype) {
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
   * ConsensusParams contains all consensus-relevant parameters
   * that can be adjusted by the abci app
   * </pre>
   *
   * Protobuf type {@code com.github.jtendermint.jabci.types.ConsensusParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.ConsensusParams)
      com.github.jtendermint.jabci.types.ConsensusParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.ConsensusParams.class, com.github.jtendermint.jabci.types.ConsensusParams.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.ConsensusParams.newBuilder()
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
      if (blockSizeBuilder_ == null) {
        blockSize_ = null;
      } else {
        blockSize_ = null;
        blockSizeBuilder_ = null;
      }
      if (evidenceBuilder_ == null) {
        evidence_ = null;
      } else {
        evidence_ = null;
        evidenceBuilder_ = null;
      }
      if (validatorBuilder_ == null) {
        validator_ = null;
      } else {
        validator_ = null;
        validatorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ConsensusParams_descriptor;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ConsensusParams getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.ConsensusParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ConsensusParams build() {
      com.github.jtendermint.jabci.types.ConsensusParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ConsensusParams buildPartial() {
      com.github.jtendermint.jabci.types.ConsensusParams result = new com.github.jtendermint.jabci.types.ConsensusParams(this);
      if (blockSizeBuilder_ == null) {
        result.blockSize_ = blockSize_;
      } else {
        result.blockSize_ = blockSizeBuilder_.build();
      }
      if (evidenceBuilder_ == null) {
        result.evidence_ = evidence_;
      } else {
        result.evidence_ = evidenceBuilder_.build();
      }
      if (validatorBuilder_ == null) {
        result.validator_ = validator_;
      } else {
        result.validator_ = validatorBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.jtendermint.jabci.types.ConsensusParams) {
        return mergeFrom((com.github.jtendermint.jabci.types.ConsensusParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.ConsensusParams other) {
      if (other == com.github.jtendermint.jabci.types.ConsensusParams.getDefaultInstance()) return this;
      if (other.hasBlockSize()) {
        mergeBlockSize(other.getBlockSize());
      }
      if (other.hasEvidence()) {
        mergeEvidence(other.getEvidence());
      }
      if (other.hasValidator()) {
        mergeValidator(other.getValidator());
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
      com.github.jtendermint.jabci.types.ConsensusParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.ConsensusParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.github.jtendermint.jabci.types.BlockSizeParams blockSize_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.BlockSizeParams, com.github.jtendermint.jabci.types.BlockSizeParams.Builder, com.github.jtendermint.jabci.types.BlockSizeParamsOrBuilder> blockSizeBuilder_;
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    public boolean hasBlockSize() {
      return blockSizeBuilder_ != null || blockSize_ != null;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    public com.github.jtendermint.jabci.types.BlockSizeParams getBlockSize() {
      if (blockSizeBuilder_ == null) {
        return blockSize_ == null ? com.github.jtendermint.jabci.types.BlockSizeParams.getDefaultInstance() : blockSize_;
      } else {
        return blockSizeBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    public Builder setBlockSize(com.github.jtendermint.jabci.types.BlockSizeParams value) {
      if (blockSizeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blockSize_ = value;
        onChanged();
      } else {
        blockSizeBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    public Builder setBlockSize(
        com.github.jtendermint.jabci.types.BlockSizeParams.Builder builderForValue) {
      if (blockSizeBuilder_ == null) {
        blockSize_ = builderForValue.build();
        onChanged();
      } else {
        blockSizeBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    public Builder mergeBlockSize(com.github.jtendermint.jabci.types.BlockSizeParams value) {
      if (blockSizeBuilder_ == null) {
        if (blockSize_ != null) {
          blockSize_ =
            com.github.jtendermint.jabci.types.BlockSizeParams.newBuilder(blockSize_).mergeFrom(value).buildPartial();
        } else {
          blockSize_ = value;
        }
        onChanged();
      } else {
        blockSizeBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    public Builder clearBlockSize() {
      if (blockSizeBuilder_ == null) {
        blockSize_ = null;
        onChanged();
      } else {
        blockSize_ = null;
        blockSizeBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    public com.github.jtendermint.jabci.types.BlockSizeParams.Builder getBlockSizeBuilder() {
      
      onChanged();
      return getBlockSizeFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    public com.github.jtendermint.jabci.types.BlockSizeParamsOrBuilder getBlockSizeOrBuilder() {
      if (blockSizeBuilder_ != null) {
        return blockSizeBuilder_.getMessageOrBuilder();
      } else {
        return blockSize_ == null ?
            com.github.jtendermint.jabci.types.BlockSizeParams.getDefaultInstance() : blockSize_;
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.BlockSizeParams block_size = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.BlockSizeParams, com.github.jtendermint.jabci.types.BlockSizeParams.Builder, com.github.jtendermint.jabci.types.BlockSizeParamsOrBuilder> 
        getBlockSizeFieldBuilder() {
      if (blockSizeBuilder_ == null) {
        blockSizeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.BlockSizeParams, com.github.jtendermint.jabci.types.BlockSizeParams.Builder, com.github.jtendermint.jabci.types.BlockSizeParamsOrBuilder>(
                getBlockSize(),
                getParentForChildren(),
                isClean());
        blockSize_ = null;
      }
      return blockSizeBuilder_;
    }

    private com.github.jtendermint.jabci.types.EvidenceParams evidence_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.EvidenceParams, com.github.jtendermint.jabci.types.EvidenceParams.Builder, com.github.jtendermint.jabci.types.EvidenceParamsOrBuilder> evidenceBuilder_;
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    public boolean hasEvidence() {
      return evidenceBuilder_ != null || evidence_ != null;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    public com.github.jtendermint.jabci.types.EvidenceParams getEvidence() {
      if (evidenceBuilder_ == null) {
        return evidence_ == null ? com.github.jtendermint.jabci.types.EvidenceParams.getDefaultInstance() : evidence_;
      } else {
        return evidenceBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    public Builder setEvidence(com.github.jtendermint.jabci.types.EvidenceParams value) {
      if (evidenceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evidence_ = value;
        onChanged();
      } else {
        evidenceBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    public Builder setEvidence(
        com.github.jtendermint.jabci.types.EvidenceParams.Builder builderForValue) {
      if (evidenceBuilder_ == null) {
        evidence_ = builderForValue.build();
        onChanged();
      } else {
        evidenceBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    public Builder mergeEvidence(com.github.jtendermint.jabci.types.EvidenceParams value) {
      if (evidenceBuilder_ == null) {
        if (evidence_ != null) {
          evidence_ =
            com.github.jtendermint.jabci.types.EvidenceParams.newBuilder(evidence_).mergeFrom(value).buildPartial();
        } else {
          evidence_ = value;
        }
        onChanged();
      } else {
        evidenceBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    public Builder clearEvidence() {
      if (evidenceBuilder_ == null) {
        evidence_ = null;
        onChanged();
      } else {
        evidence_ = null;
        evidenceBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    public com.github.jtendermint.jabci.types.EvidenceParams.Builder getEvidenceBuilder() {
      
      onChanged();
      return getEvidenceFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    public com.github.jtendermint.jabci.types.EvidenceParamsOrBuilder getEvidenceOrBuilder() {
      if (evidenceBuilder_ != null) {
        return evidenceBuilder_.getMessageOrBuilder();
      } else {
        return evidence_ == null ?
            com.github.jtendermint.jabci.types.EvidenceParams.getDefaultInstance() : evidence_;
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.EvidenceParams evidence = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.EvidenceParams, com.github.jtendermint.jabci.types.EvidenceParams.Builder, com.github.jtendermint.jabci.types.EvidenceParamsOrBuilder> 
        getEvidenceFieldBuilder() {
      if (evidenceBuilder_ == null) {
        evidenceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.EvidenceParams, com.github.jtendermint.jabci.types.EvidenceParams.Builder, com.github.jtendermint.jabci.types.EvidenceParamsOrBuilder>(
                getEvidence(),
                getParentForChildren(),
                isClean());
        evidence_ = null;
      }
      return evidenceBuilder_;
    }

    private com.github.jtendermint.jabci.types.ValidatorParams validator_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.ValidatorParams, com.github.jtendermint.jabci.types.ValidatorParams.Builder, com.github.jtendermint.jabci.types.ValidatorParamsOrBuilder> validatorBuilder_;
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    public boolean hasValidator() {
      return validatorBuilder_ != null || validator_ != null;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorParams getValidator() {
      if (validatorBuilder_ == null) {
        return validator_ == null ? com.github.jtendermint.jabci.types.ValidatorParams.getDefaultInstance() : validator_;
      } else {
        return validatorBuilder_.getMessage();
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    public Builder setValidator(com.github.jtendermint.jabci.types.ValidatorParams value) {
      if (validatorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        validator_ = value;
        onChanged();
      } else {
        validatorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    public Builder setValidator(
        com.github.jtendermint.jabci.types.ValidatorParams.Builder builderForValue) {
      if (validatorBuilder_ == null) {
        validator_ = builderForValue.build();
        onChanged();
      } else {
        validatorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    public Builder mergeValidator(com.github.jtendermint.jabci.types.ValidatorParams value) {
      if (validatorBuilder_ == null) {
        if (validator_ != null) {
          validator_ =
            com.github.jtendermint.jabci.types.ValidatorParams.newBuilder(validator_).mergeFrom(value).buildPartial();
        } else {
          validator_ = value;
        }
        onChanged();
      } else {
        validatorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    public Builder clearValidator() {
      if (validatorBuilder_ == null) {
        validator_ = null;
        onChanged();
      } else {
        validator_ = null;
        validatorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorParams.Builder getValidatorBuilder() {
      
      onChanged();
      return getValidatorFieldBuilder().getBuilder();
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    public com.github.jtendermint.jabci.types.ValidatorParamsOrBuilder getValidatorOrBuilder() {
      if (validatorBuilder_ != null) {
        return validatorBuilder_.getMessageOrBuilder();
      } else {
        return validator_ == null ?
            com.github.jtendermint.jabci.types.ValidatorParams.getDefaultInstance() : validator_;
      }
    }
    /**
     * <code>.com.github.jtendermint.jabci.types.ValidatorParams validator = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.github.jtendermint.jabci.types.ValidatorParams, com.github.jtendermint.jabci.types.ValidatorParams.Builder, com.github.jtendermint.jabci.types.ValidatorParamsOrBuilder> 
        getValidatorFieldBuilder() {
      if (validatorBuilder_ == null) {
        validatorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.github.jtendermint.jabci.types.ValidatorParams, com.github.jtendermint.jabci.types.ValidatorParams.Builder, com.github.jtendermint.jabci.types.ValidatorParamsOrBuilder>(
                getValidator(),
                getParentForChildren(),
                isClean());
        validator_ = null;
      }
      return validatorBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.ConsensusParams)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.ConsensusParams)
  private static final com.github.jtendermint.jabci.types.ConsensusParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.ConsensusParams();
  }

  public static com.github.jtendermint.jabci.types.ConsensusParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConsensusParams>
      PARSER = new com.google.protobuf.AbstractParser<ConsensusParams>() {
    @java.lang.Override
    public ConsensusParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ConsensusParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ConsensusParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConsensusParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jtendermint.jabci.types.ConsensusParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

