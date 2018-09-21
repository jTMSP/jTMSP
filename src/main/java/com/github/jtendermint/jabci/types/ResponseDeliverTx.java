// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

/**
 * Protobuf type {@code com.github.jtendermint.jabci.types.ResponseDeliverTx}
 */
public  final class ResponseDeliverTx extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.github.jtendermint.jabci.types.ResponseDeliverTx)
    ResponseDeliverTxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseDeliverTx.newBuilder() to construct.
  private ResponseDeliverTx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseDeliverTx() {
    code_ = 0;
    data_ = com.google.protobuf.ByteString.EMPTY;
    log_ = "";
    info_ = "";
    gasWanted_ = 0L;
    gasUsed_ = 0L;
    tags_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseDeliverTx(
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
          case 8: {

            code_ = input.readUInt32();
            break;
          }
          case 18: {

            data_ = input.readBytes();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            log_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            info_ = s;
            break;
          }
          case 40: {

            gasWanted_ = input.readInt64();
            break;
          }
          case 48: {

            gasUsed_ = input.readInt64();
            break;
          }
          case 58: {
            if (!((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
              tags_ = new java.util.ArrayList<com.github.jtendermint.jabci.types.KVPair>();
              mutable_bitField0_ |= 0x00000040;
            }
            tags_.add(
                input.readMessage(com.github.jtendermint.jabci.types.KVPair.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000040) == 0x00000040)) {
        tags_ = java.util.Collections.unmodifiableList(tags_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseDeliverTx_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseDeliverTx_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.jtendermint.jabci.types.ResponseDeliverTx.class, com.github.jtendermint.jabci.types.ResponseDeliverTx.Builder.class);
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_;
  /**
   * <code>uint32 code = 1;</code>
   */
  public int getCode() {
    return code_;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString data_;
  /**
   * <code>bytes data = 2;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int LOG_FIELD_NUMBER = 3;
  private volatile java.lang.Object log_;
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string log = 3;</code>
   */
  public java.lang.String getLog() {
    java.lang.Object ref = log_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      log_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string log = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLogBytes() {
    java.lang.Object ref = log_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      log_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFO_FIELD_NUMBER = 4;
  private volatile java.lang.Object info_;
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string info = 4;</code>
   */
  public java.lang.String getInfo() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      info_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * nondeterministic
   * </pre>
   *
   * <code>string info = 4;</code>
   */
  public com.google.protobuf.ByteString
      getInfoBytes() {
    java.lang.Object ref = info_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      info_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAS_WANTED_FIELD_NUMBER = 5;
  private long gasWanted_;
  /**
   * <code>int64 gas_wanted = 5;</code>
   */
  public long getGasWanted() {
    return gasWanted_;
  }

  public static final int GAS_USED_FIELD_NUMBER = 6;
  private long gasUsed_;
  /**
   * <code>int64 gas_used = 6;</code>
   */
  public long getGasUsed() {
    return gasUsed_;
  }

  public static final int TAGS_FIELD_NUMBER = 7;
  private java.util.List<com.github.jtendermint.jabci.types.KVPair> tags_;
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  public java.util.List<com.github.jtendermint.jabci.types.KVPair> getTagsList() {
    return tags_;
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  public java.util.List<? extends com.github.jtendermint.jabci.types.KVPairOrBuilder> 
      getTagsOrBuilderList() {
    return tags_;
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  public com.github.jtendermint.jabci.types.KVPair getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
   */
  public com.github.jtendermint.jabci.types.KVPairOrBuilder getTagsOrBuilder(
      int index) {
    return tags_.get(index);
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
    if (code_ != 0) {
      output.writeUInt32(1, code_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(2, data_);
    }
    if (!getLogBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, log_);
    }
    if (!getInfoBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, info_);
    }
    if (gasWanted_ != 0L) {
      output.writeInt64(5, gasWanted_);
    }
    if (gasUsed_ != 0L) {
      output.writeInt64(6, gasUsed_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      output.writeMessage(7, tags_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, code_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, data_);
    }
    if (!getLogBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, log_);
    }
    if (!getInfoBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, info_);
    }
    if (gasWanted_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, gasWanted_);
    }
    if (gasUsed_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, gasUsed_);
    }
    for (int i = 0; i < tags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, tags_.get(i));
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
    if (!(obj instanceof com.github.jtendermint.jabci.types.ResponseDeliverTx)) {
      return super.equals(obj);
    }
    com.github.jtendermint.jabci.types.ResponseDeliverTx other = (com.github.jtendermint.jabci.types.ResponseDeliverTx) obj;

    boolean result = true;
    result = result && (getCode()
        == other.getCode());
    result = result && getData()
        .equals(other.getData());
    result = result && getLog()
        .equals(other.getLog());
    result = result && getInfo()
        .equals(other.getInfo());
    result = result && (getGasWanted()
        == other.getGasWanted());
    result = result && (getGasUsed()
        == other.getGasUsed());
    result = result && getTagsList()
        .equals(other.getTagsList());
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + getCode();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (37 * hash) + LOG_FIELD_NUMBER;
    hash = (53 * hash) + getLog().hashCode();
    hash = (37 * hash) + INFO_FIELD_NUMBER;
    hash = (53 * hash) + getInfo().hashCode();
    hash = (37 * hash) + GAS_WANTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGasWanted());
    hash = (37 * hash) + GAS_USED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getGasUsed());
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.jtendermint.jabci.types.ResponseDeliverTx parseFrom(
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
  public static Builder newBuilder(com.github.jtendermint.jabci.types.ResponseDeliverTx prototype) {
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
   * Protobuf type {@code com.github.jtendermint.jabci.types.ResponseDeliverTx}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.github.jtendermint.jabci.types.ResponseDeliverTx)
      com.github.jtendermint.jabci.types.ResponseDeliverTxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseDeliverTx_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseDeliverTx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.jtendermint.jabci.types.ResponseDeliverTx.class, com.github.jtendermint.jabci.types.ResponseDeliverTx.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.types.ResponseDeliverTx.newBuilder()
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
        getTagsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      code_ = 0;

      data_ = com.google.protobuf.ByteString.EMPTY;

      log_ = "";

      info_ = "";

      gasWanted_ = 0L;

      gasUsed_ = 0L;

      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000040);
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.jtendermint.jabci.types.Types.internal_static_com_github_jtendermint_jabci_types_ResponseDeliverTx_descriptor;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseDeliverTx getDefaultInstanceForType() {
      return com.github.jtendermint.jabci.types.ResponseDeliverTx.getDefaultInstance();
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseDeliverTx build() {
      com.github.jtendermint.jabci.types.ResponseDeliverTx result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.github.jtendermint.jabci.types.ResponseDeliverTx buildPartial() {
      com.github.jtendermint.jabci.types.ResponseDeliverTx result = new com.github.jtendermint.jabci.types.ResponseDeliverTx(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.code_ = code_;
      result.data_ = data_;
      result.log_ = log_;
      result.info_ = info_;
      result.gasWanted_ = gasWanted_;
      result.gasUsed_ = gasUsed_;
      if (tagsBuilder_ == null) {
        if (((bitField0_ & 0x00000040) == 0x00000040)) {
          tags_ = java.util.Collections.unmodifiableList(tags_);
          bitField0_ = (bitField0_ & ~0x00000040);
        }
        result.tags_ = tags_;
      } else {
        result.tags_ = tagsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof com.github.jtendermint.jabci.types.ResponseDeliverTx) {
        return mergeFrom((com.github.jtendermint.jabci.types.ResponseDeliverTx)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.jtendermint.jabci.types.ResponseDeliverTx other) {
      if (other == com.github.jtendermint.jabci.types.ResponseDeliverTx.getDefaultInstance()) return this;
      if (other.getCode() != 0) {
        setCode(other.getCode());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (!other.getLog().isEmpty()) {
        log_ = other.log_;
        onChanged();
      }
      if (!other.getInfo().isEmpty()) {
        info_ = other.info_;
        onChanged();
      }
      if (other.getGasWanted() != 0L) {
        setGasWanted(other.getGasWanted());
      }
      if (other.getGasUsed() != 0L) {
        setGasUsed(other.getGasUsed());
      }
      if (tagsBuilder_ == null) {
        if (!other.tags_.isEmpty()) {
          if (tags_.isEmpty()) {
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000040);
          } else {
            ensureTagsIsMutable();
            tags_.addAll(other.tags_);
          }
          onChanged();
        }
      } else {
        if (!other.tags_.isEmpty()) {
          if (tagsBuilder_.isEmpty()) {
            tagsBuilder_.dispose();
            tagsBuilder_ = null;
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000040);
            tagsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTagsFieldBuilder() : null;
          } else {
            tagsBuilder_.addAllMessages(other.tags_);
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
      com.github.jtendermint.jabci.types.ResponseDeliverTx parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.jtendermint.jabci.types.ResponseDeliverTx) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private int code_ ;
    /**
     * <code>uint32 code = 1;</code>
     */
    public int getCode() {
      return code_;
    }
    /**
     * <code>uint32 code = 1;</code>
     */
    public Builder setCode(int value) {
      
      code_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 code = 1;</code>
     */
    public Builder clearCode() {
      
      code_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes data = 2;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 2;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      data_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes data = 2;</code>
     */
    public Builder clearData() {
      
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private java.lang.Object log_ = "";
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public java.lang.String getLog() {
      java.lang.Object ref = log_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        log_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLogBytes() {
      java.lang.Object ref = log_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        log_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public Builder setLog(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      log_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public Builder clearLog() {
      
      log_ = getDefaultInstance().getLog();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string log = 3;</code>
     */
    public Builder setLogBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      log_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object info_ = "";
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public java.lang.String getInfo() {
      java.lang.Object ref = info_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        info_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public com.google.protobuf.ByteString
        getInfoBytes() {
      java.lang.Object ref = info_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        info_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public Builder setInfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      info_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public Builder clearInfo() {
      
      info_ = getDefaultInstance().getInfo();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * nondeterministic
     * </pre>
     *
     * <code>string info = 4;</code>
     */
    public Builder setInfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      info_ = value;
      onChanged();
      return this;
    }

    private long gasWanted_ ;
    /**
     * <code>int64 gas_wanted = 5;</code>
     */
    public long getGasWanted() {
      return gasWanted_;
    }
    /**
     * <code>int64 gas_wanted = 5;</code>
     */
    public Builder setGasWanted(long value) {
      
      gasWanted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gas_wanted = 5;</code>
     */
    public Builder clearGasWanted() {
      
      gasWanted_ = 0L;
      onChanged();
      return this;
    }

    private long gasUsed_ ;
    /**
     * <code>int64 gas_used = 6;</code>
     */
    public long getGasUsed() {
      return gasUsed_;
    }
    /**
     * <code>int64 gas_used = 6;</code>
     */
    public Builder setGasUsed(long value) {
      
      gasUsed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 gas_used = 6;</code>
     */
    public Builder clearGasUsed() {
      
      gasUsed_ = 0L;
      onChanged();
      return this;
    }

    private java.util.List<com.github.jtendermint.jabci.types.KVPair> tags_ =
      java.util.Collections.emptyList();
    private void ensureTagsIsMutable() {
      if (!((bitField0_ & 0x00000040) == 0x00000040)) {
        tags_ = new java.util.ArrayList<com.github.jtendermint.jabci.types.KVPair>(tags_);
        bitField0_ |= 0x00000040;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.jtendermint.jabci.types.KVPair, com.github.jtendermint.jabci.types.KVPair.Builder, com.github.jtendermint.jabci.types.KVPairOrBuilder> tagsBuilder_;

    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public java.util.List<com.github.jtendermint.jabci.types.KVPair> getTagsList() {
      if (tagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tags_);
      } else {
        return tagsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public int getTagsCount() {
      if (tagsBuilder_ == null) {
        return tags_.size();
      } else {
        return tagsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public com.github.jtendermint.jabci.types.KVPair getTags(int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);
      } else {
        return tagsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder setTags(
        int index, com.github.jtendermint.jabci.types.KVPair value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.set(index, value);
        onChanged();
      } else {
        tagsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder setTags(
        int index, com.github.jtendermint.jabci.types.KVPair.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.set(index, builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder addTags(com.github.jtendermint.jabci.types.KVPair value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.add(value);
        onChanged();
      } else {
        tagsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder addTags(
        int index, com.github.jtendermint.jabci.types.KVPair value) {
      if (tagsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTagsIsMutable();
        tags_.add(index, value);
        onChanged();
      } else {
        tagsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder addTags(
        com.github.jtendermint.jabci.types.KVPair.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.add(builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder addTags(
        int index, com.github.jtendermint.jabci.types.KVPair.Builder builderForValue) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.add(index, builderForValue.build());
        onChanged();
      } else {
        tagsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder addAllTags(
        java.lang.Iterable<? extends com.github.jtendermint.jabci.types.KVPair> values) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tags_);
        onChanged();
      } else {
        tagsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder clearTags() {
      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000040);
        onChanged();
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public Builder removeTags(int index) {
      if (tagsBuilder_ == null) {
        ensureTagsIsMutable();
        tags_.remove(index);
        onChanged();
      } else {
        tagsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public com.github.jtendermint.jabci.types.KVPair.Builder getTagsBuilder(
        int index) {
      return getTagsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public com.github.jtendermint.jabci.types.KVPairOrBuilder getTagsOrBuilder(
        int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);  } else {
        return tagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public java.util.List<? extends com.github.jtendermint.jabci.types.KVPairOrBuilder> 
         getTagsOrBuilderList() {
      if (tagsBuilder_ != null) {
        return tagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tags_);
      }
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public com.github.jtendermint.jabci.types.KVPair.Builder addTagsBuilder() {
      return getTagsFieldBuilder().addBuilder(
          com.github.jtendermint.jabci.types.KVPair.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public com.github.jtendermint.jabci.types.KVPair.Builder addTagsBuilder(
        int index) {
      return getTagsFieldBuilder().addBuilder(
          index, com.github.jtendermint.jabci.types.KVPair.getDefaultInstance());
    }
    /**
     * <code>repeated .com.github.jtendermint.jabci.types.KVPair tags = 7;</code>
     */
    public java.util.List<com.github.jtendermint.jabci.types.KVPair.Builder> 
         getTagsBuilderList() {
      return getTagsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.github.jtendermint.jabci.types.KVPair, com.github.jtendermint.jabci.types.KVPair.Builder, com.github.jtendermint.jabci.types.KVPairOrBuilder> 
        getTagsFieldBuilder() {
      if (tagsBuilder_ == null) {
        tagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.github.jtendermint.jabci.types.KVPair, com.github.jtendermint.jabci.types.KVPair.Builder, com.github.jtendermint.jabci.types.KVPairOrBuilder>(
                tags_,
                ((bitField0_ & 0x00000040) == 0x00000040),
                getParentForChildren(),
                isClean());
        tags_ = null;
      }
      return tagsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:com.github.jtendermint.jabci.types.ResponseDeliverTx)
  }

  // @@protoc_insertion_point(class_scope:com.github.jtendermint.jabci.types.ResponseDeliverTx)
  private static final com.github.jtendermint.jabci.types.ResponseDeliverTx DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.jtendermint.jabci.types.ResponseDeliverTx();
  }

  public static com.github.jtendermint.jabci.types.ResponseDeliverTx getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseDeliverTx>
      PARSER = new com.google.protobuf.AbstractParser<ResponseDeliverTx>() {
    @java.lang.Override
    public ResponseDeliverTx parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseDeliverTx(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseDeliverTx> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseDeliverTx> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.github.jtendermint.jabci.types.ResponseDeliverTx getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

