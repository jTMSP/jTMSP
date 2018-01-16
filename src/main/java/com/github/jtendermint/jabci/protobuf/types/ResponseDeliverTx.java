// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.protobuf.types;

/**
 * Protobuf type {@code types.ResponseDeliverTx}
 */
public  final class ResponseDeliverTx extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:types.ResponseDeliverTx)
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
    tags_ = java.util.Collections.emptyList();
  }

  @Override
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
      throw new NullPointerException();
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
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            code_ = input.readUInt32();
            break;
          }
          case 18: {

            data_ = input.readBytes();
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            log_ = s;
            break;
          }
          case 34: {
            if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
              tags_ = new java.util.ArrayList<KVPair>();
              mutable_bitField0_ |= 0x00000008;
            }
            tags_.add(
                input.readMessage(KVPair.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
        tags_ = java.util.Collections.unmodifiableList(tags_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return Types.internal_static_types_ResponseDeliverTx_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return Types.internal_static_types_ResponseDeliverTx_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            ResponseDeliverTx.class, ResponseDeliverTx.Builder.class);
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
   * <code>bytes data = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/tendermint/go-wire/data.Bytes"];</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int LOG_FIELD_NUMBER = 3;
  private volatile Object log_;
  /**
   * <code>string log = 3;</code>
   */
  public String getLog() {
    Object ref = log_;
    if (ref instanceof String) {
      return (String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      String s = bs.toStringUtf8();
      log_ = s;
      return s;
    }
  }
  /**
   * <code>string log = 3;</code>
   */
  public com.google.protobuf.ByteString
      getLogBytes() {
    Object ref = log_;
    if (ref instanceof String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (String) ref);
      log_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TAGS_FIELD_NUMBER = 4;
  private java.util.List<KVPair> tags_;
  /**
   * <code>repeated .types.KVPair tags = 4;</code>
   */
  public java.util.List<KVPair> getTagsList() {
    return tags_;
  }
  /**
   * <code>repeated .types.KVPair tags = 4;</code>
   */
  public java.util.List<? extends KVPairOrBuilder>
      getTagsOrBuilderList() {
    return tags_;
  }
  /**
   * <code>repeated .types.KVPair tags = 4;</code>
   */
  public int getTagsCount() {
    return tags_.size();
  }
  /**
   * <code>repeated .types.KVPair tags = 4;</code>
   */
  public KVPair getTags(int index) {
    return tags_.get(index);
  }
  /**
   * <code>repeated .types.KVPair tags = 4;</code>
   */
  public KVPairOrBuilder getTagsOrBuilder(
      int index) {
    return tags_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

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
    for (int i = 0; i < tags_.size(); i++) {
      output.writeMessage(4, tags_.get(i));
    }
    unknownFields.writeTo(output);
  }

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
    for (int i = 0; i < tags_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, tags_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof ResponseDeliverTx)) {
      return super.equals(obj);
    }
    ResponseDeliverTx other = (ResponseDeliverTx) obj;

    boolean result = true;
    result = result && (getCode()
        == other.getCode());
    result = result && getData()
        .equals(other.getData());
    result = result && getLog()
        .equals(other.getLog());
    result = result && getTagsList()
        .equals(other.getTagsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @Override
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
    if (getTagsCount() > 0) {
      hash = (37 * hash) + TAGS_FIELD_NUMBER;
      hash = (53 * hash) + getTagsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static ResponseDeliverTx parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResponseDeliverTx parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResponseDeliverTx parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResponseDeliverTx parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResponseDeliverTx parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static ResponseDeliverTx parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static ResponseDeliverTx parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ResponseDeliverTx parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static ResponseDeliverTx parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static ResponseDeliverTx parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static ResponseDeliverTx parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static ResponseDeliverTx parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(ResponseDeliverTx prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code types.ResponseDeliverTx}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:types.ResponseDeliverTx)
      ResponseDeliverTxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Types.internal_static_types_ResponseDeliverTx_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Types.internal_static_types_ResponseDeliverTx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ResponseDeliverTx.class, ResponseDeliverTx.Builder.class);
    }

    // Construct using com.github.jtendermint.jabci.protobuf.types.ResponseDeliverTx.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getTagsFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      code_ = 0;

      data_ = com.google.protobuf.ByteString.EMPTY;

      log_ = "";

      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return Types.internal_static_types_ResponseDeliverTx_descriptor;
    }

    public ResponseDeliverTx getDefaultInstanceForType() {
      return ResponseDeliverTx.getDefaultInstance();
    }

    public ResponseDeliverTx build() {
      ResponseDeliverTx result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public ResponseDeliverTx buildPartial() {
      ResponseDeliverTx result = new ResponseDeliverTx(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.code_ = code_;
      result.data_ = data_;
      result.log_ = log_;
      if (tagsBuilder_ == null) {
        if (((bitField0_ & 0x00000008) == 0x00000008)) {
          tags_ = java.util.Collections.unmodifiableList(tags_);
          bitField0_ = (bitField0_ & ~0x00000008);
        }
        result.tags_ = tags_;
      } else {
        result.tags_ = tagsBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof ResponseDeliverTx) {
        return mergeFrom((ResponseDeliverTx)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(ResponseDeliverTx other) {
      if (other == ResponseDeliverTx.getDefaultInstance()) return this;
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
      if (tagsBuilder_ == null) {
        if (!other.tags_.isEmpty()) {
          if (tags_.isEmpty()) {
            tags_ = other.tags_;
            bitField0_ = (bitField0_ & ~0x00000008);
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
            bitField0_ = (bitField0_ & ~0x00000008);
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

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      ResponseDeliverTx parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (ResponseDeliverTx) e.getUnfinishedMessage();
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
     * <code>bytes data = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/tendermint/go-wire/data.Bytes"];</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <code>bytes data = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/tendermint/go-wire/data.Bytes"];</code>
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
     * <code>bytes data = 2 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/tendermint/go-wire/data.Bytes"];</code>
     */
    public Builder clearData() {

      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private Object log_ = "";
    /**
     * <code>string log = 3;</code>
     */
    public String getLog() {
      Object ref = log_;
      if (!(ref instanceof String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        log_ = s;
        return s;
      } else {
        return (String) ref;
      }
    }
    /**
     * <code>string log = 3;</code>
     */
    public com.google.protobuf.ByteString
        getLogBytes() {
      Object ref = log_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        log_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string log = 3;</code>
     */
    public Builder setLog(
        String value) {
      if (value == null) {
    throw new NullPointerException();
  }

      log_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string log = 3;</code>
     */
    public Builder clearLog() {

      log_ = getDefaultInstance().getLog();
      onChanged();
      return this;
    }
    /**
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

    private java.util.List<KVPair> tags_ =
      java.util.Collections.emptyList();
    private void ensureTagsIsMutable() {
      if (!((bitField0_ & 0x00000008) == 0x00000008)) {
        tags_ = new java.util.ArrayList<KVPair>(tags_);
        bitField0_ |= 0x00000008;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        KVPair, KVPair.Builder, KVPairOrBuilder> tagsBuilder_;

    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public java.util.List<KVPair> getTagsList() {
      if (tagsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tags_);
      } else {
        return tagsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public int getTagsCount() {
      if (tagsBuilder_ == null) {
        return tags_.size();
      } else {
        return tagsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public KVPair getTags(int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);
      } else {
        return tagsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public Builder setTags(
        int index, KVPair value) {
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
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public Builder setTags(
        int index, KVPair.Builder builderForValue) {
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
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public Builder addTags(KVPair value) {
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
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public Builder addTags(
        int index, KVPair value) {
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
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public Builder addTags(
        KVPair.Builder builderForValue) {
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
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public Builder addTags(
        int index, KVPair.Builder builderForValue) {
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
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public Builder addAllTags(
        Iterable<? extends KVPair> values) {
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
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public Builder clearTags() {
      if (tagsBuilder_ == null) {
        tags_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000008);
        onChanged();
      } else {
        tagsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
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
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public KVPair.Builder getTagsBuilder(
        int index) {
      return getTagsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public KVPairOrBuilder getTagsOrBuilder(
        int index) {
      if (tagsBuilder_ == null) {
        return tags_.get(index);  } else {
        return tagsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public java.util.List<? extends KVPairOrBuilder>
         getTagsOrBuilderList() {
      if (tagsBuilder_ != null) {
        return tagsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tags_);
      }
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public KVPair.Builder addTagsBuilder() {
      return getTagsFieldBuilder().addBuilder(
          KVPair.getDefaultInstance());
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public KVPair.Builder addTagsBuilder(
        int index) {
      return getTagsFieldBuilder().addBuilder(
          index, KVPair.getDefaultInstance());
    }
    /**
     * <code>repeated .types.KVPair tags = 4;</code>
     */
    public java.util.List<KVPair.Builder>
         getTagsBuilderList() {
      return getTagsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        KVPair, KVPair.Builder, KVPairOrBuilder>
        getTagsFieldBuilder() {
      if (tagsBuilder_ == null) {
        tagsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            KVPair, KVPair.Builder, KVPairOrBuilder>(
                tags_,
                ((bitField0_ & 0x00000008) == 0x00000008),
                getParentForChildren(),
                isClean());
        tags_ = null;
      }
      return tagsBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:types.ResponseDeliverTx)
  }

  // @@protoc_insertion_point(class_scope:types.ResponseDeliverTx)
  private static final ResponseDeliverTx DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new ResponseDeliverTx();
  }

  public static ResponseDeliverTx getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseDeliverTx>
      PARSER = new com.google.protobuf.AbstractParser<ResponseDeliverTx>() {
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

  @Override
  public com.google.protobuf.Parser<ResponseDeliverTx> getParserForType() {
    return PARSER;
  }

  public ResponseDeliverTx getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
