// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: google/api/expr/v1alpha1/checked.proto
// Protobuf Java Version: 4.28.3

package com.google.api.expr.v1alpha1;

public interface CheckedExprOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.api.expr.v1alpha1.CheckedExpr)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <pre>
   * A map from expression ids to resolved references.
   *
   * The following entries are in this table:
   *
   * - An Ident or Select expression is represented here if it resolves to a
   * declaration. For instance, if `a.b.c` is represented by
   * `select(select(id(a), b), c)`, and `a.b` resolves to a declaration,
   * while `c` is a field selection, then the reference is attached to the
   * nested select expression (but not to the id or or the outer select).
   * In turn, if `a` resolves to a declaration and `b.c` are field selections,
   * the reference is attached to the ident expression.
   * - Every Call expression has an entry here, identifying the function being
   * called.
   * - Every CreateStruct expression for a message has an entry, identifying
   * the message.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Reference&gt; reference_map = 2 [json_name = "referenceMap"];</code>
   */
  int getReferenceMapCount();
  /**
   * <pre>
   * A map from expression ids to resolved references.
   *
   * The following entries are in this table:
   *
   * - An Ident or Select expression is represented here if it resolves to a
   * declaration. For instance, if `a.b.c` is represented by
   * `select(select(id(a), b), c)`, and `a.b` resolves to a declaration,
   * while `c` is a field selection, then the reference is attached to the
   * nested select expression (but not to the id or or the outer select).
   * In turn, if `a` resolves to a declaration and `b.c` are field selections,
   * the reference is attached to the ident expression.
   * - Every Call expression has an entry here, identifying the function being
   * called.
   * - Every CreateStruct expression for a message has an entry, identifying
   * the message.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Reference&gt; reference_map = 2 [json_name = "referenceMap"];</code>
   */
  boolean containsReferenceMap(
      long key);
  /**
   * Use {@link #getReferenceMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, com.google.api.expr.v1alpha1.Reference>
  getReferenceMap();
  /**
   * <pre>
   * A map from expression ids to resolved references.
   *
   * The following entries are in this table:
   *
   * - An Ident or Select expression is represented here if it resolves to a
   * declaration. For instance, if `a.b.c` is represented by
   * `select(select(id(a), b), c)`, and `a.b` resolves to a declaration,
   * while `c` is a field selection, then the reference is attached to the
   * nested select expression (but not to the id or or the outer select).
   * In turn, if `a` resolves to a declaration and `b.c` are field selections,
   * the reference is attached to the ident expression.
   * - Every Call expression has an entry here, identifying the function being
   * called.
   * - Every CreateStruct expression for a message has an entry, identifying
   * the message.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Reference&gt; reference_map = 2 [json_name = "referenceMap"];</code>
   */
  java.util.Map<java.lang.Long, com.google.api.expr.v1alpha1.Reference>
  getReferenceMapMap();
  /**
   * <pre>
   * A map from expression ids to resolved references.
   *
   * The following entries are in this table:
   *
   * - An Ident or Select expression is represented here if it resolves to a
   * declaration. For instance, if `a.b.c` is represented by
   * `select(select(id(a), b), c)`, and `a.b` resolves to a declaration,
   * while `c` is a field selection, then the reference is attached to the
   * nested select expression (but not to the id or or the outer select).
   * In turn, if `a` resolves to a declaration and `b.c` are field selections,
   * the reference is attached to the ident expression.
   * - Every Call expression has an entry here, identifying the function being
   * called.
   * - Every CreateStruct expression for a message has an entry, identifying
   * the message.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Reference&gt; reference_map = 2 [json_name = "referenceMap"];</code>
   */

  /* nullable */
com.google.api.expr.v1alpha1.Reference getReferenceMapOrDefault(
      long key,
      /* nullable */
com.google.api.expr.v1alpha1.Reference defaultValue);
  /**
   * <pre>
   * A map from expression ids to resolved references.
   *
   * The following entries are in this table:
   *
   * - An Ident or Select expression is represented here if it resolves to a
   * declaration. For instance, if `a.b.c` is represented by
   * `select(select(id(a), b), c)`, and `a.b` resolves to a declaration,
   * while `c` is a field selection, then the reference is attached to the
   * nested select expression (but not to the id or or the outer select).
   * In turn, if `a` resolves to a declaration and `b.c` are field selections,
   * the reference is attached to the ident expression.
   * - Every Call expression has an entry here, identifying the function being
   * called.
   * - Every CreateStruct expression for a message has an entry, identifying
   * the message.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Reference&gt; reference_map = 2 [json_name = "referenceMap"];</code>
   */

  com.google.api.expr.v1alpha1.Reference getReferenceMapOrThrow(
      long key);

  /**
   * <pre>
   * A map from expression ids to types.
   *
   * Every expression node which has a type different than DYN has a mapping
   * here. If an expression has type DYN, it is omitted from this map to save
   * space.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Type&gt; type_map = 3 [json_name = "typeMap"];</code>
   */
  int getTypeMapCount();
  /**
   * <pre>
   * A map from expression ids to types.
   *
   * Every expression node which has a type different than DYN has a mapping
   * here. If an expression has type DYN, it is omitted from this map to save
   * space.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Type&gt; type_map = 3 [json_name = "typeMap"];</code>
   */
  boolean containsTypeMap(
      long key);
  /**
   * Use {@link #getTypeMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, com.google.api.expr.v1alpha1.Type>
  getTypeMap();
  /**
   * <pre>
   * A map from expression ids to types.
   *
   * Every expression node which has a type different than DYN has a mapping
   * here. If an expression has type DYN, it is omitted from this map to save
   * space.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Type&gt; type_map = 3 [json_name = "typeMap"];</code>
   */
  java.util.Map<java.lang.Long, com.google.api.expr.v1alpha1.Type>
  getTypeMapMap();
  /**
   * <pre>
   * A map from expression ids to types.
   *
   * Every expression node which has a type different than DYN has a mapping
   * here. If an expression has type DYN, it is omitted from this map to save
   * space.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Type&gt; type_map = 3 [json_name = "typeMap"];</code>
   */

  /* nullable */
com.google.api.expr.v1alpha1.Type getTypeMapOrDefault(
      long key,
      /* nullable */
com.google.api.expr.v1alpha1.Type defaultValue);
  /**
   * <pre>
   * A map from expression ids to types.
   *
   * Every expression node which has a type different than DYN has a mapping
   * here. If an expression has type DYN, it is omitted from this map to save
   * space.
   * </pre>
   *
   * <code>map&lt;int64, .google.api.expr.v1alpha1.Type&gt; type_map = 3 [json_name = "typeMap"];</code>
   */

  com.google.api.expr.v1alpha1.Type getTypeMapOrThrow(
      long key);

  /**
   * <pre>
   * The source info derived from input that generated the parsed `expr` and
   * any optimizations made during the type-checking pass.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.SourceInfo source_info = 5 [json_name = "sourceInfo"];</code>
   * @return Whether the sourceInfo field is set.
   */
  boolean hasSourceInfo();
  /**
   * <pre>
   * The source info derived from input that generated the parsed `expr` and
   * any optimizations made during the type-checking pass.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.SourceInfo source_info = 5 [json_name = "sourceInfo"];</code>
   * @return The sourceInfo.
   */
  com.google.api.expr.v1alpha1.SourceInfo getSourceInfo();

  /**
   * <pre>
   * The expr version indicates the major / minor version number of the `expr`
   * representation.
   *
   * The most common reason for a version change will be to indicate to the CEL
   * runtimes that transformations have been performed on the expr during static
   * analysis. In some cases, this will save the runtime the work of applying
   * the same or similar transformations prior to evaluation.
   * </pre>
   *
   * <code>string expr_version = 6 [json_name = "exprVersion"];</code>
   * @return The exprVersion.
   */
  java.lang.String getExprVersion();
  /**
   * <pre>
   * The expr version indicates the major / minor version number of the `expr`
   * representation.
   *
   * The most common reason for a version change will be to indicate to the CEL
   * runtimes that transformations have been performed on the expr during static
   * analysis. In some cases, this will save the runtime the work of applying
   * the same or similar transformations prior to evaluation.
   * </pre>
   *
   * <code>string expr_version = 6 [json_name = "exprVersion"];</code>
   * @return The bytes for exprVersion.
   */
  com.google.protobuf.ByteString
      getExprVersionBytes();

  /**
   * <pre>
   * The checked expression. Semantically equivalent to the parsed `expr`, but
   * may have structural differences.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Expr expr = 4 [json_name = "expr"];</code>
   * @return Whether the expr field is set.
   */
  boolean hasExpr();
  /**
   * <pre>
   * The checked expression. Semantically equivalent to the parsed `expr`, but
   * may have structural differences.
   * </pre>
   *
   * <code>.google.api.expr.v1alpha1.Expr expr = 4 [json_name = "expr"];</code>
   * @return The expr.
   */
  com.google.api.expr.v1alpha1.Expr getExpr();
}
