// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: types.proto

package com.github.jtendermint.jabci.types;

public interface RequestBeginBlockOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.github.jtendermint.jabci.types.RequestBeginBlock)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bytes hash = 1;</code>
   */
  com.google.protobuf.ByteString getHash();

  /**
   * <code>.com.github.jtendermint.jabci.types.Header header = 2;</code>
   */
  boolean hasHeader();
  /**
   * <code>.com.github.jtendermint.jabci.types.Header header = 2;</code>
   */
  com.github.jtendermint.jabci.types.Header getHeader();
  /**
   * <code>.com.github.jtendermint.jabci.types.Header header = 2;</code>
   */
  com.github.jtendermint.jabci.types.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>.com.github.jtendermint.jabci.types.LastCommitInfo last_commit_info = 3;</code>
   */
  boolean hasLastCommitInfo();
  /**
   * <code>.com.github.jtendermint.jabci.types.LastCommitInfo last_commit_info = 3;</code>
   */
  com.github.jtendermint.jabci.types.LastCommitInfo getLastCommitInfo();
  /**
   * <code>.com.github.jtendermint.jabci.types.LastCommitInfo last_commit_info = 3;</code>
   */
  com.github.jtendermint.jabci.types.LastCommitInfoOrBuilder getLastCommitInfoOrBuilder();

  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  java.util.List<com.github.jtendermint.jabci.types.Evidence> 
      getByzantineValidatorsList();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  com.github.jtendermint.jabci.types.Evidence getByzantineValidators(int index);
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  int getByzantineValidatorsCount();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  java.util.List<? extends com.github.jtendermint.jabci.types.EvidenceOrBuilder> 
      getByzantineValidatorsOrBuilderList();
  /**
   * <code>repeated .com.github.jtendermint.jabci.types.Evidence byzantine_validators = 4;</code>
   */
  com.github.jtendermint.jabci.types.EvidenceOrBuilder getByzantineValidatorsOrBuilder(
      int index);
}
