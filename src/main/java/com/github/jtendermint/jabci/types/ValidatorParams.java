// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * <pre>
 * ValidatorParams contains limits on validators.
 * </pre>
 *
 * Protobuf type {@code com.github.jtendermint.jabci.types.ValidatorParams}
 */
public  final class ValidatorParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.ValidatorParams)
    ValidatorParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ValidatorParams.newBuilder() to construct.
  private ValidatorParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ValidatorParams() {
    pubKeyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ValidatorParams(
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
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              pubKeyTypes_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            pubKeyTypes_.add(s);
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        pubKeyTypes_ = pubKeyTypes_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ValidatorParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ValidatorParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.ValidatorParams.class, com.github.jtendermint.jabci.types.ValidatorParams.Builder.class);
  }

  public static final int PUB_KEY_TYPES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList pubKeyTypes_;
  /**
   * <code>repeated string pub_key_types = 1;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getPubKeyTypesList() {
    return pubKeyTypes_;
  }
  /**
   * <code>repeated string pub_key_types = 1;</code>
   */
  public int getPubKeyTypesCount() {
    return pubKeyTypes_.size();
  }
  /**
   * <code>repeated string pub_key_types = 1;</code>
   */
  public java.lang.String getPubKeyTypes(int index) {
    return pubKeyTypes_.get(index);
  }
  /**
   * <code>repeated string pub_key_types = 1;</code>
   */
  public com.google.protobuf.ByteString
      getPubKeyTypesBytes(int index) {
    return pubKeyTypes_.getByteString(index);
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
    for (int i = 0; i < pubKeyTypes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubKeyTypes_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < pubKeyTypes_.size(); i++) {
        dataSize += computeStringSizeNoTag(pubKeyTypes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPubKeyTypesList().size();
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
    if (!(obj instanceof com.github.jtendermint.jabci.types.ValidatorParams)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.ValidatorParams other = (com.github.jtendermint.jabci.types.ValidatorParams) obj;

    boolean result = true;
    result = result && getPubKeyTypesList()
        .equals(other.getPubKeyTypesList());
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
    if (getPubKeyTypesCount() > 0) {
      hash = (37 * hash) + PUB_KEY_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getPubKeyTypesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ValidatorParams parseFrom(
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
  public static Builder newBuilder(com.github.jtendermint.jabci.types.ValidatorParams prototype) {
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
   * ValidatorParams contains limits on validators.
   * </pre>
   *
   * Protobuf type {@code com.github.jtendermint.jabci.types.ValidatorParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.ValidatorParams)
      com.github.jtendermint.jabci.types.ValidatorParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ValidatorParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ValidatorParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.ValidatorParams.class, com.github.jtendermint.jabci.types.ValidatorParams.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.ValidatorParams.newBuilder()
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
      pubKeyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ValidatorParams_descriptor;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ValidatorParams getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.ValidatorParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ValidatorParams build() {
      com.github.jtendermint.jabci.types.ValidatorParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ValidatorParams buildPartial() {
      com.github.jtendermint.jabci.types.ValidatorParams result = new com.github.jtendermint.jabci.types.ValidatorParams(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        pubKeyTypes_ = pubKeyTypes_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.pubKeyTypes_ = pubKeyTypes_;
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
      if (other instanceof com.github.jtendermint.jabci.types.ValidatorParams) {
        return mergeFrom((com.github.jtendermint.jabci.types.ValidatorParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.ValidatorParams other) {
      if (other == com.github.jtendermint.jabci.types.ValidatorParams.getDefaultInstance()) return this;
      if (!other.pubKeyTypes_.isEmpty()) {
        if (pubKeyTypes_.isEmpty()) {
          pubKeyTypes_ = other.pubKeyTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensurePubKeyTypesIsMutable();
          pubKeyTypes_.addAll(other.pubKeyTypes_);
        }
        onChanged();
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
      com.github.jtendermint.jabci.types.ValidatorParams parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.ValidatorParams) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList pubKeyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensurePubKeyTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        pubKeyTypes_ = new com.google.protobuf.LazyStringArrayList(pubKeyTypes_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getPubKeyTypesList() {
      return pubKeyTypes_.getUnmodifiableView();
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public int getPubKeyTypesCount() {
      return pubKeyTypes_.size();
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public java.lang.String getPubKeyTypes(int index) {
      return pubKeyTypes_.get(index);
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public com.google.protobuf.ByteString
        getPubKeyTypesBytes(int index) {
      return pubKeyTypes_.getByteString(index);
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public Builder setPubKeyTypes(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePubKeyTypesIsMutable();
      pubKeyTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public Builder addPubKeyTypes(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensurePubKeyTypesIsMutable();
      pubKeyTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public Builder addAllPubKeyTypes(
        java.lang.Iterable<java.lang.String> values) {
      ensurePubKeyTypesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, pubKeyTypes_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public Builder clearPubKeyTypes() {
      pubKeyTypes_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string pub_key_types = 1;</code>
     */
    public Builder addPubKeyTypesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensurePubKeyTypesIsMutable();
      pubKeyTypes_.add(value);
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.ValidatorParams)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.ValidatorParams)
  private static final com.github.jtendermint.jabci.types.ValidatorParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.ValidatorParams();
  }

  public static com.github.jtendermint.jabci.types.ValidatorParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidatorParams>
      PARSER = new com.google.protobuf.AbstractParser<ValidatorParams>() {
    @java.lang.Override
    public ValidatorParams parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ValidatorParams(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ValidatorParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidatorParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jtendermint.jabci.types.ValidatorParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

