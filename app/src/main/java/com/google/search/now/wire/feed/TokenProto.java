// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/proto/search/now/wire/feed/token.proto

package com.google.search.now.wire.feed;

public final class TokenProto {
  private TokenProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.search.now.wire.feed.TokenProto.Token.tokenExtension);
  }
  public interface TokenOrBuilder extends
      // @@protoc_insertion_point(interface_extends:search.now.wire.feed.Token)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     */
    boolean hasNextPageToken();
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     */
    com.google.protobuf.ByteString getNextPageToken();
  }
  /**
   * <pre>
   * A continuation token (paging token).
   * </pre>
   *
   * Protobuf type {@code search.now.wire.feed.Token}
   */
  public  static final class Token extends
      com.google.protobuf.GeneratedMessageLite<
          Token, Token.Builder> implements
      // @@protoc_insertion_point(message_implements:search.now.wire.feed.Token)
      TokenOrBuilder {
    private Token() {
      nextPageToken_ = com.google.protobuf.ByteString.EMPTY;
    }
    private int bitField0_;
    public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString nextPageToken_;
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     */
    @java.lang.Override
    public boolean hasNextPageToken() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getNextPageToken() {
      return nextPageToken_;
    }
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     */
    private void setNextPageToken(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      nextPageToken_ = value;
    }
    /**
     * <pre>
     * Indicates the last position of the current content for a parent.  A request
     * can be made using the next_page_token to get additional features which will
     * be appended to the parent's list of children.
     * </pre>
     *
     * <code>optional bytes next_page_token = 2;</code>
     */
    private void clearNextPageToken() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = getDefaultInstance().getNextPageToken();
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(2, nextPageToken_);
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
          .computeBytesSize(2, nextPageToken_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.google.search.now.wire.feed.TokenProto.Token parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.google.search.now.wire.feed.TokenProto.Token prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * <pre>
     * A continuation token (paging token).
     * </pre>
     *
     * Protobuf type {@code search.now.wire.feed.Token}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.google.search.now.wire.feed.TokenProto.Token, Builder> implements
        // @@protoc_insertion_point(builder_implements:search.now.wire.feed.Token)
        com.google.search.now.wire.feed.TokenProto.TokenOrBuilder {
      // Construct using com.google.search.now.wire.feed.TokenProto.Token.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * Indicates the last position of the current content for a parent.  A request
       * can be made using the next_page_token to get additional features which will
       * be appended to the parent's list of children.
       * </pre>
       *
       * <code>optional bytes next_page_token = 2;</code>
       */
      @java.lang.Override
      public boolean hasNextPageToken() {
        return instance.hasNextPageToken();
      }
      /**
       * <pre>
       * Indicates the last position of the current content for a parent.  A request
       * can be made using the next_page_token to get additional features which will
       * be appended to the parent's list of children.
       * </pre>
       *
       * <code>optional bytes next_page_token = 2;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString getNextPageToken() {
        return instance.getNextPageToken();
      }
      /**
       * <pre>
       * Indicates the last position of the current content for a parent.  A request
       * can be made using the next_page_token to get additional features which will
       * be appended to the parent's list of children.
       * </pre>
       *
       * <code>optional bytes next_page_token = 2;</code>
       */
      public Builder setNextPageToken(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setNextPageToken(value);
        return this;
      }
      /**
       * <pre>
       * Indicates the last position of the current content for a parent.  A request
       * can be made using the next_page_token to get additional features which will
       * be appended to the parent's list of children.
       * </pre>
       *
       * <code>optional bytes next_page_token = 2;</code>
       */
      public Builder clearNextPageToken() {
        copyOnWrite();
        instance.clearNextPageToken();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:search.now.wire.feed.Token)
    }
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.google.search.now.wire.feed.TokenProto.Token();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.google.search.now.wire.feed.TokenProto.Token other = (com.google.search.now.wire.feed.TokenProto.Token) arg1;
          nextPageToken_ = visitor.visitByteString(
              hasNextPageToken(), nextPageToken_,
              other.hasNextPageToken(), other.nextPageToken_);
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
                case 18: {
                  bitField0_ |= 0x00000001;
                  nextPageToken_ = input.readBytes();
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
          com.google.protobuf.Parser<com.google.search.now.wire.feed.TokenProto.Token> parser = PARSER;
          if (parser == null) {
            synchronized (com.google.search.now.wire.feed.TokenProto.Token.class) {
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
        return (byte) 1;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:search.now.wire.feed.Token)
    private static final com.google.search.now.wire.feed.TokenProto.Token DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new Token();
    }

    public static com.google.search.now.wire.feed.TokenProto.Token getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Token> PARSER;

    public static com.google.protobuf.Parser<Token> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
    public static final int TOKEN_EXTENSION_FIELD_NUMBER = 194964015;
    /**
     * <code>extend .search.now.wire.feed.Feature { ... }</code>
     */
    public static final
      com.google.protobuf.GeneratedMessageLite.GeneratedExtension<
        com.google.search.now.wire.feed.FeatureProto.Feature,
        com.google.search.now.wire.feed.TokenProto.Token> tokenExtension = com.google.protobuf.GeneratedMessageLite
            .newSingularGeneratedExtension(
          com.google.search.now.wire.feed.FeatureProto.Feature.getDefaultInstance(),
          com.google.search.now.wire.feed.TokenProto.Token.getDefaultInstance(),
          com.google.search.now.wire.feed.TokenProto.Token.getDefaultInstance(),
          null,
          194964015,
          com.google.protobuf.WireFormat.FieldType.MESSAGE,
          com.google.search.now.wire.feed.TokenProto.Token.class);
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
