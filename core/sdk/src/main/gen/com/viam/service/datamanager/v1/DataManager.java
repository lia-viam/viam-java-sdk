// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: service/datamanager/v1/data_manager.proto
// Protobuf Java Version: 4.28.3

package com.viam.service.datamanager.v1;

public final class DataManager {
  private DataManager() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface SyncRequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:viam.service.datamanager.v1.SyncRequest)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    java.lang.String getName();
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    com.google.protobuf.ByteString
        getNameBytes();

    /**
     * <pre>
     * Additional arguments to the method
     * </pre>
     *
     * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
     * @return Whether the extra field is set.
     */
    boolean hasExtra();
    /**
     * <pre>
     * Additional arguments to the method
     * </pre>
     *
     * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
     * @return The extra.
     */
    com.google.protobuf.Struct getExtra();
  }
  /**
   * Protobuf type {@code viam.service.datamanager.v1.SyncRequest}
   */
  public  static final class SyncRequest extends
      com.google.protobuf.GeneratedMessageLite<
          SyncRequest, SyncRequest.Builder> implements
      // @@protoc_insertion_point(message_implements:viam.service.datamanager.v1.SyncRequest)
      SyncRequestOrBuilder {
    private SyncRequest() {
      name_ = "";
    }
    private int bitField0_;
    public static final int NAME_FIELD_NUMBER = 1;
    private java.lang.String name_;
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The name.
     */
    @java.lang.Override
    public java.lang.String getName() {
      return name_;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @return The bytes for name.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(name_);
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The name to set.
     */
    private void setName(
        java.lang.String value) {
      java.lang.Class<?> valueClass = value.getClass();
  
      name_ = value;
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     */
    private void clearName() {

      name_ = getDefaultInstance().getName();
    }
    /**
     * <code>string name = 1 [json_name = "name"];</code>
     * @param value The bytes for name to set.
     */
    private void setNameBytes(
        com.google.protobuf.ByteString value) {
      checkByteStringIsUtf8(value);
      name_ = value.toStringUtf8();

    }

    public static final int EXTRA_FIELD_NUMBER = 99;
    private com.google.protobuf.Struct extra_;
    /**
     * <pre>
     * Additional arguments to the method
     * </pre>
     *
     * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
     */
    @java.lang.Override
    public boolean hasExtra() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Additional arguments to the method
     * </pre>
     *
     * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
     */
    @java.lang.Override
    public com.google.protobuf.Struct getExtra() {
      return extra_ == null ? com.google.protobuf.Struct.getDefaultInstance() : extra_;
    }
    /**
     * <pre>
     * Additional arguments to the method
     * </pre>
     *
     * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
     */
    private void setExtra(com.google.protobuf.Struct value) {
      value.getClass();
  extra_ = value;
      bitField0_ |= 0x00000001;
      }
    /**
     * <pre>
     * Additional arguments to the method
     * </pre>
     *
     * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeExtra(com.google.protobuf.Struct value) {
      value.getClass();
  if (extra_ != null &&
          extra_ != com.google.protobuf.Struct.getDefaultInstance()) {
        extra_ =
          com.google.protobuf.Struct.newBuilder(extra_).mergeFrom(value).buildPartial();
      } else {
        extra_ = value;
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * Additional arguments to the method
     * </pre>
     *
     * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
     */
    private void clearExtra() {  extra_ = null;
      bitField0_ = (bitField0_ & ~0x00000001);
    }

    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncRequest parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.viam.service.datamanager.v1.DataManager.SyncRequest prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code viam.service.datamanager.v1.SyncRequest}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.viam.service.datamanager.v1.DataManager.SyncRequest, Builder> implements
        // @@protoc_insertion_point(builder_implements:viam.service.datamanager.v1.SyncRequest)
        com.viam.service.datamanager.v1.DataManager.SyncRequestOrBuilder {
      // Construct using com.viam.service.datamanager.v1.DataManager.SyncRequest.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return The name.
       */
      @java.lang.Override
      public java.lang.String getName() {
        return instance.getName();
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return The bytes for name.
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getNameBytes() {
        return instance.getNameBytes();
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @param value The name to set.
       * @return This builder for chaining.
       */
      public Builder setName(
          java.lang.String value) {
        copyOnWrite();
        instance.setName(value);
        return this;
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @return This builder for chaining.
       */
      public Builder clearName() {
        copyOnWrite();
        instance.clearName();
        return this;
      }
      /**
       * <code>string name = 1 [json_name = "name"];</code>
       * @param value The bytes for name to set.
       * @return This builder for chaining.
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNameBytes(value);
        return this;
      }

      /**
       * <pre>
       * Additional arguments to the method
       * </pre>
       *
       * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
       */
      @java.lang.Override
      public boolean hasExtra() {
        return instance.hasExtra();
      }
      /**
       * <pre>
       * Additional arguments to the method
       * </pre>
       *
       * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
       */
      @java.lang.Override
      public com.google.protobuf.Struct getExtra() {
        return instance.getExtra();
      }
      /**
       * <pre>
       * Additional arguments to the method
       * </pre>
       *
       * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
       */
      public Builder setExtra(com.google.protobuf.Struct value) {
        copyOnWrite();
        instance.setExtra(value);
        return this;
        }
      /**
       * <pre>
       * Additional arguments to the method
       * </pre>
       *
       * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
       */
      public Builder setExtra(
          com.google.protobuf.Struct.Builder builderForValue) {
        copyOnWrite();
        instance.setExtra(builderForValue.build());
        return this;
      }
      /**
       * <pre>
       * Additional arguments to the method
       * </pre>
       *
       * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
       */
      public Builder mergeExtra(com.google.protobuf.Struct value) {
        copyOnWrite();
        instance.mergeExtra(value);
        return this;
      }
      /**
       * <pre>
       * Additional arguments to the method
       * </pre>
       *
       * <code>.google.protobuf.Struct extra = 99 [json_name = "extra"];</code>
       */
      public Builder clearExtra() {  copyOnWrite();
        instance.clearExtra();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:viam.service.datamanager.v1.SyncRequest)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.viam.service.datamanager.v1.DataManager.SyncRequest();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = new java.lang.Object[] {
              "bitField0_",
              "name_",
              "extra_",
            };
            java.lang.String info =
                "\u0000\u0002\u0000\u0001\u0001c\u0002\u0000\u0000\u0000\u0001\u0208c\u1009\u0000" +
                "";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.viam.service.datamanager.v1.DataManager.SyncRequest> parser = PARSER;
          if (parser == null) {
            synchronized (com.viam.service.datamanager.v1.DataManager.SyncRequest.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.viam.service.datamanager.v1.DataManager.SyncRequest>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:viam.service.datamanager.v1.SyncRequest)
    private static final com.viam.service.datamanager.v1.DataManager.SyncRequest DEFAULT_INSTANCE;
    static {
      SyncRequest defaultInstance = new SyncRequest();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        SyncRequest.class, defaultInstance);
    }

    public static com.viam.service.datamanager.v1.DataManager.SyncRequest getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<SyncRequest> PARSER;

    public static com.google.protobuf.Parser<SyncRequest> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface SyncResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:viam.service.datamanager.v1.SyncResponse)
      com.google.protobuf.MessageLiteOrBuilder {
  }
  /**
   * Protobuf type {@code viam.service.datamanager.v1.SyncResponse}
   */
  public  static final class SyncResponse extends
      com.google.protobuf.GeneratedMessageLite<
          SyncResponse, SyncResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:viam.service.datamanager.v1.SyncResponse)
      SyncResponseOrBuilder {
    private SyncResponse() {
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }

    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.viam.service.datamanager.v1.DataManager.SyncResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.viam.service.datamanager.v1.DataManager.SyncResponse prototype) {
      return DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code viam.service.datamanager.v1.SyncResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.viam.service.datamanager.v1.DataManager.SyncResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:viam.service.datamanager.v1.SyncResponse)
        com.viam.service.datamanager.v1.DataManager.SyncResponseOrBuilder {
      // Construct using com.viam.service.datamanager.v1.DataManager.SyncResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      // @@protoc_insertion_point(builder_scope:viam.service.datamanager.v1.SyncResponse)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.viam.service.datamanager.v1.DataManager.SyncResponse();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case BUILD_MESSAGE_INFO: {
            java.lang.Object[] objects = null;java.lang.String info =
                "\u0000\u0000";
            return newMessageInfo(DEFAULT_INSTANCE, info, objects);
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.viam.service.datamanager.v1.DataManager.SyncResponse> parser = PARSER;
          if (parser == null) {
            synchronized (com.viam.service.datamanager.v1.DataManager.SyncResponse.class) {
              parser = PARSER;
              if (parser == null) {
                parser =
                    new DefaultInstanceBasedParser<com.viam.service.datamanager.v1.DataManager.SyncResponse>(
                        DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:viam.service.datamanager.v1.SyncResponse)
    private static final com.viam.service.datamanager.v1.DataManager.SyncResponse DEFAULT_INSTANCE;
    static {
      SyncResponse defaultInstance = new SyncResponse();
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = defaultInstance;
      com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
        SyncResponse.class, defaultInstance);
    }

    public static com.viam.service.datamanager.v1.DataManager.SyncResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<SyncResponse> PARSER;

    public static com.google.protobuf.Parser<SyncResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
