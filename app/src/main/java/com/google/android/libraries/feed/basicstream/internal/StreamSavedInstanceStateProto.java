// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/com/google/android/libraries/feed/basicstream/internal/proto/stream_saved_instance_state.proto

package com.google.android.libraries.feed.basicstream.internal;

public final class StreamSavedInstanceStateProto {
  private StreamSavedInstanceStateProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface StreamSavedInstanceStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceState)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string session_token = 1;</code>
     */
    boolean hasSessionToken();
    /**
     * <code>optional string session_token = 1;</code>
     */
    java.lang.String getSessionToken();
    /**
     * <code>optional string session_token = 1;</code>
     */
    com.google.protobuf.ByteString
        getSessionTokenBytes();

    /**
     * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
     */
    boolean hasScrollState();
    /**
     * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
     */
    com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState getScrollState();
  }
  /**
   * <pre>
   * Object representing the state of the Stream.
   * </pre>
   *
   * Protobuf type {@code com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceState}
   */
  public  static final class StreamSavedInstanceState extends
      com.google.protobuf.GeneratedMessageLite<
          StreamSavedInstanceState, StreamSavedInstanceState.Builder> implements
      // @@protoc_insertion_point(message_implements:com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceState)
      StreamSavedInstanceStateOrBuilder {
    private StreamSavedInstanceState() {
      sessionToken_ = "";
    }
    private int bitField0_;
    public static final int SESSION_TOKEN_FIELD_NUMBER = 1;
    private java.lang.String sessionToken_;
    /**
     * <code>optional string session_token = 1;</code>
     */
    @java.lang.Override
    public boolean hasSessionToken() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional string session_token = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getSessionToken() {
      return sessionToken_;
    }
    /**
     * <code>optional string session_token = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getSessionTokenBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(sessionToken_);
    }
    /**
     * <code>optional string session_token = 1;</code>
     */
    private void setSessionToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      sessionToken_ = value;
    }
    /**
     * <code>optional string session_token = 1;</code>
     */
    private void clearSessionToken() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sessionToken_ = getDefaultInstance().getSessionToken();
    }
    /**
     * <code>optional string session_token = 1;</code>
     */
    private void setSessionTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      sessionToken_ = value.toStringUtf8();
    }

    public static final int SCROLL_STATE_FIELD_NUMBER = 2;
    private com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState scrollState_;
    /**
     * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
     */
    @java.lang.Override
    public boolean hasScrollState() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
     */
    @java.lang.Override
    public com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState getScrollState() {
      return scrollState_ == null ? com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.getDefaultInstance() : scrollState_;
    }
    /**
     * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
     */
    private void setScrollState(com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      scrollState_ = value;
      bitField0_ |= 0x00000002;
      }
    /**
     * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
     */
    private void setScrollState(
        com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.Builder builderForValue) {
      scrollState_ = builderForValue.build();
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeScrollState(com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      if (scrollState_ != null &&
          scrollState_ != com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.getDefaultInstance()) {
        scrollState_ =
          com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.newBuilder(scrollState_).mergeFrom(value).buildPartial();
      } else {
        scrollState_ = value;
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
     */
    private void clearScrollState() {  scrollState_ = null;
      bitField0_ = (bitField0_ & ~0x00000002);
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeString(1, getSessionToken());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, getScrollState());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getSessionToken());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getScrollState());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Object representing the state of the Stream.
     * </pre>
     *
     * Protobuf type {@code com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceState)
        com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceStateOrBuilder {
      // Construct using com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string session_token = 1;</code>
       */
      @java.lang.Override
      public boolean hasSessionToken() {
        return instance.hasSessionToken();
      }
      /**
       * <code>optional string session_token = 1;</code>
       */
      @java.lang.Override
      public java.lang.String getSessionToken() {
        return instance.getSessionToken();
      }
      /**
       * <code>optional string session_token = 1;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getSessionTokenBytes() {
        return instance.getSessionTokenBytes();
      }
      /**
       * <code>optional string session_token = 1;</code>
       */
      public Builder setSessionToken(
          java.lang.String value) {
        copyOnWrite();
        instance.setSessionToken(value);
        return this;
      }
      /**
       * <code>optional string session_token = 1;</code>
       */
      public Builder clearSessionToken() {
        copyOnWrite();
        instance.clearSessionToken();
        return this;
      }
      /**
       * <code>optional string session_token = 1;</code>
       */
      public Builder setSessionTokenBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSessionTokenBytes(value);
        return this;
      }

      /**
       * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
       */
      @java.lang.Override
      public boolean hasScrollState() {
        return instance.hasScrollState();
      }
      /**
       * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
       */
      @java.lang.Override
      public com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState getScrollState() {
        return instance.getScrollState();
      }
      /**
       * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
       */
      public Builder setScrollState(com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState value) {
        copyOnWrite();
        instance.setScrollState(value);
        return this;
        }
      /**
       * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
       */
      public Builder setScrollState(
          com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.Builder builderForValue) {
        copyOnWrite();
        instance.setScrollState(builderForValue);
        return this;
      }
      /**
       * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
       */
      public Builder mergeScrollState(com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState value) {
        copyOnWrite();
        instance.mergeScrollState(value);
        return this;
      }
      /**
       * <code>optional .com.google.android.libraries.feed.basicstream.internal.ScrollState scroll_state = 2;</code>
       */
      public Builder clearScrollState() {  copyOnWrite();
        instance.clearScrollState();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceState)
    }
    private byte memoizedIsInitialized = 2;
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) arg0).booleanValue();
          if (hasScrollState()) {
            if (!getScrollState().isInitialized()) {
              return null;
            }
          }
          return DEFAULT_INSTANCE;

        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState other = (com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState) arg1;
          sessionToken_ = visitor.visitString(
              hasSessionToken(), sessionToken_,
              other.hasSessionToken(), other.sessionToken_);
          scrollState_ = visitor.visitMessage(scrollState_, other.scrollState_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  java.lang.String s = input.readString();
                  bitField0_ |= 0x00000001;
                  sessionToken_ = s;
                  break;
                }
                case 18: {
                  com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    subBuilder = scrollState_.toBuilder();
                  }
                  scrollState_ = input.readMessage(com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(scrollState_);
                    scrollState_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000002;
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState> parser = PARSER;
          if (parser == null) {
            synchronized (com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return memoizedIsInitialized;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceState)
    private static final com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new StreamSavedInstanceState();
    }

    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.StreamSavedInstanceState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<StreamSavedInstanceState> PARSER;

    public static com.google.protobuf.Parser<StreamSavedInstanceState> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ScrollStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.google.android.libraries.feed.basicstream.internal.ScrollState)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>required int32 position = 1;</code>
     */
    boolean hasPosition();
    /**
     * <code>required int32 position = 1;</code>
     */
    int getPosition();

    /**
     * <code>required int32 offset = 2;</code>
     */
    boolean hasOffset();
    /**
     * <code>required int32 offset = 2;</code>
     */
    int getOffset();
  }
  /**
   * <pre>
   * Object representing scroll state in the Stream.
   * </pre>
   *
   * Protobuf type {@code com.google.android.libraries.feed.basicstream.internal.ScrollState}
   */
  public  static final class ScrollState extends
      com.google.protobuf.GeneratedMessageLite<
          ScrollState, ScrollState.Builder> implements
      // @@protoc_insertion_point(message_implements:com.google.android.libraries.feed.basicstream.internal.ScrollState)
      ScrollStateOrBuilder {
    private ScrollState() {
    }
    private int bitField0_;
    public static final int POSITION_FIELD_NUMBER = 1;
    private int position_;
    /**
     * <code>required int32 position = 1;</code>
     */
    @java.lang.Override
    public boolean hasPosition() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 position = 1;</code>
     */
    @java.lang.Override
    public int getPosition() {
      return position_;
    }
    /**
     * <code>required int32 position = 1;</code>
     */
    private void setPosition(int value) {
      bitField0_ |= 0x00000001;
      position_ = value;
    }
    /**
     * <code>required int32 position = 1;</code>
     */
    private void clearPosition() {
      bitField0_ = (bitField0_ & ~0x00000001);
      position_ = 0;
    }

    public static final int OFFSET_FIELD_NUMBER = 2;
    private int offset_;
    /**
     * <code>required int32 offset = 2;</code>
     */
    @java.lang.Override
    public boolean hasOffset() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 offset = 2;</code>
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
    }
    /**
     * <code>required int32 offset = 2;</code>
     */
    private void setOffset(int value) {
      bitField0_ |= 0x00000002;
      offset_ = value;
    }
    /**
     * <code>required int32 offset = 2;</code>
     */
    private void clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      offset_ = 0;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, position_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, offset_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, position_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, offset_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * Object representing scroll state in the Stream.
     * </pre>
     *
     * Protobuf type {@code com.google.android.libraries.feed.basicstream.internal.ScrollState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState, Builder> implements
        // @@protoc_insertion_point(builder_implements:com.google.android.libraries.feed.basicstream.internal.ScrollState)
        com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollStateOrBuilder {
      // Construct using com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>required int32 position = 1;</code>
       */
      @java.lang.Override
      public boolean hasPosition() {
        return instance.hasPosition();
      }
      /**
       * <code>required int32 position = 1;</code>
       */
      @java.lang.Override
      public int getPosition() {
        return instance.getPosition();
      }
      /**
       * <code>required int32 position = 1;</code>
       */
      public Builder setPosition(int value) {
        copyOnWrite();
        instance.setPosition(value);
        return this;
      }
      /**
       * <code>required int32 position = 1;</code>
       */
      public Builder clearPosition() {
        copyOnWrite();
        instance.clearPosition();
        return this;
      }

      /**
       * <code>required int32 offset = 2;</code>
       */
      @java.lang.Override
      public boolean hasOffset() {
        return instance.hasOffset();
      }
      /**
       * <code>required int32 offset = 2;</code>
       */
      @java.lang.Override
      public int getOffset() {
        return instance.getOffset();
      }
      /**
       * <code>required int32 offset = 2;</code>
       */
      public Builder setOffset(int value) {
        copyOnWrite();
        instance.setOffset(value);
        return this;
      }
      /**
       * <code>required int32 offset = 2;</code>
       */
      public Builder clearOffset() {
        copyOnWrite();
        instance.clearOffset();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.google.android.libraries.feed.basicstream.internal.ScrollState)
    }
    private byte memoizedIsInitialized = 2;
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) arg0).booleanValue();
          if (!hasPosition()) {
            return null;
          }
          if (!hasOffset()) {
            return null;
          }
          return DEFAULT_INSTANCE;

        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState other = (com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState) arg1;
          position_ = visitor.visitInt(
              hasPosition(), position_,
              other.hasPosition(), other.position_);
          offset_ = visitor.visitInt(
              hasOffset(), offset_,
              other.hasOffset(), other.offset_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 8: {
                  bitField0_ |= 0x00000001;
                  position_ = input.readInt32();
                  break;
                }
                case 16: {
                  bitField0_ |= 0x00000002;
                  offset_ = input.readInt32();
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState> parser = PARSER;
          if (parser == null) {
            synchronized (com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return memoizedIsInitialized;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:com.google.android.libraries.feed.basicstream.internal.ScrollState)
    private static final com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new ScrollState();
    }

    public static com.google.android.libraries.feed.basicstream.internal.StreamSavedInstanceStateProto.ScrollState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ScrollState> PARSER;

    public static com.google.protobuf.Parser<ScrollState> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
