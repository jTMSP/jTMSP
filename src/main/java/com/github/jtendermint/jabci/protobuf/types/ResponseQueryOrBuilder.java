// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.protobuf.types;

public interface ResponseQueryOrBuilder extends
    // @@protoc_insertion_point(interface_extends:types.ResponseQuery)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 code = 1;</code>
   */
  int getCode();

  /**
   * <code>int64 index = 2;</code>
   */
  long getIndex();

  /**
   * <code>bytes key = 3 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/tendermint/go-wire/data.Bytes"];</code>
   */
  com.google.protobuf.ByteString getKey();

  /**
   * <code>bytes value = 4 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/tendermint/go-wire/data.Bytes"];</code>
   */
  com.google.protobuf.ByteString getValue();

  /**
   * <code>bytes proof = 5 [(.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/tendermint/go-wire/data.Bytes"];</code>
   */
  com.google.protobuf.ByteString getProof();

  /**
   * <code>int64 height = 6;</code>
   */
  long getHeight();

  /**
   * <code>string log = 7;</code>
   */
  String getLog();
  /**
   * <code>string log = 7;</code>
   */
  com.google.protobuf.ByteString
      getLogBytes();
}