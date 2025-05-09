// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/expr/v1beta1/expr.proto
// Protobuf Java Version: 4.28.3

package com.google.api.expr.v1beta1;

public interface ParsedExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1beta1.ParsedExpr)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * The parsed expression.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.Expr expr = 2 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <pre>
   * The parsed expression.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.Expr expr = 2 [json_name = "expr"];</code>
   * @return The expr.
   */
  com.google.api.expr.v1beta1.Expr getExpr();

  /**
   * <pre>
   * The source info derived from input that generated the parsed `expr`.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.SourceInfo source_info = 3 [json_name = "sourceInfo"];</code>
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   * <pre>
   * The source info derived from input that generated the parsed `expr`.
   * </pre>
   *
   * <code>.google.api.expr.v1beta1.SourceInfo source_info = 3 [json_name = "sourceInfo"];</code>
   * @return The sourceInfo.
   */
  com.google.api.expr.v1beta1.SourceInfo getSourceInfo();

  /**
   * <pre>
   * The syntax version of the source, e.g. `cel1`.
   * </pre>
   *
   * <code>string syntax_version = 4 [json_name = "syntaxVersion"];</code>
   * @return The syntaxVersion.
   */
  java.lang.String getSyntaxVersion();
  /**
   * <pre>
   * The syntax version of the source, e.g. `cel1`.
   * </pre>
   *
   * <code>string syntax_version = 4 [json_name = "syntaxVersion"];</code>
   * @return The bytes for syntaxVersion.
   */
  com.google.protobuf.ByteString
      getSyntaxVersionBytes();
}
