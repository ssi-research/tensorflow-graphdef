// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/attr_value.proto

// Protobuf Java Version: 3.25.3
package graphdef;

/**
 * <pre>
 * A list of attr names and their values. The whole list is attached
 * with a string name.  E.g., MatMul[T=float].
 * </pre>
 *
 * Protobuf type {@code uni_model_proto.NameAttrList}
 */
public final class NameAttrList extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uni_model_proto.NameAttrList)
    NameAttrListOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NameAttrList.newBuilder() to construct.
  private NameAttrList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NameAttrList() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NameAttrList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return graphdef.AttrValueProtos.internal_static_uni_model_proto_NameAttrList_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 2:
        return internalGetAttr();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return graphdef.AttrValueProtos.internal_static_uni_model_proto_NameAttrList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            graphdef.NameAttrList.class, graphdef.NameAttrList.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTR_FIELD_NUMBER = 2;
  private static final class AttrDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, graphdef.AttrValue> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, graphdef.AttrValue>newDefaultInstance(
                graphdef.AttrValueProtos.internal_static_uni_model_proto_NameAttrList_AttrEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                graphdef.AttrValue.getDefaultInstance());
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.String, graphdef.AttrValue> attr_;
  private com.google.protobuf.MapField<java.lang.String, graphdef.AttrValue>
  internalGetAttr() {
    if (attr_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          AttrDefaultEntryHolder.defaultEntry);
    }
    return attr_;
  }
  public int getAttrCount() {
    return internalGetAttr().getMap().size();
  }
  /**
   * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
   */
  @java.lang.Override
  public boolean containsAttr(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetAttr().getMap().containsKey(key);
  }
  /**
   * Use {@link #getAttrMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, graphdef.AttrValue> getAttr() {
    return getAttrMap();
  }
  /**
   * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, graphdef.AttrValue> getAttrMap() {
    return internalGetAttr().getMap();
  }
  /**
   * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
   */
  @java.lang.Override
  public /* nullable */
graphdef.AttrValue getAttrOrDefault(
      java.lang.String key,
      /* nullable */
graphdef.AttrValue defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, graphdef.AttrValue> map =
        internalGetAttr().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
   */
  @java.lang.Override
  public graphdef.AttrValue getAttrOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, graphdef.AttrValue> map =
        internalGetAttr().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetAttr(),
        AttrDefaultEntryHolder.defaultEntry,
        2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    for (java.util.Map.Entry<java.lang.String, graphdef.AttrValue> entry
         : internalGetAttr().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, graphdef.AttrValue>
      attr__ = AttrDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, attr__);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof graphdef.NameAttrList)) {
      return super.equals(obj);
    }
    graphdef.NameAttrList other = (graphdef.NameAttrList) obj;

    if (!getName()
        .equals(other.getName())) return false;
    if (!internalGetAttr().equals(
        other.internalGetAttr())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (!internalGetAttr().getMap().isEmpty()) {
      hash = (37 * hash) + ATTR_FIELD_NUMBER;
      hash = (53 * hash) + internalGetAttr().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static graphdef.NameAttrList parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static graphdef.NameAttrList parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static graphdef.NameAttrList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static graphdef.NameAttrList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static graphdef.NameAttrList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static graphdef.NameAttrList parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static graphdef.NameAttrList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static graphdef.NameAttrList parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static graphdef.NameAttrList parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static graphdef.NameAttrList parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static graphdef.NameAttrList parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static graphdef.NameAttrList parseFrom(
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
  public static Builder newBuilder(graphdef.NameAttrList prototype) {
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
   * A list of attr names and their values. The whole list is attached
   * with a string name.  E.g., MatMul[T=float].
   * </pre>
   *
   * Protobuf type {@code uni_model_proto.NameAttrList}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uni_model_proto.NameAttrList)
      graphdef.NameAttrListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return graphdef.AttrValueProtos.internal_static_uni_model_proto_NameAttrList_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetAttr();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableAttr();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return graphdef.AttrValueProtos.internal_static_uni_model_proto_NameAttrList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              graphdef.NameAttrList.class, graphdef.NameAttrList.Builder.class);
    }

    // Construct using graphdef.NameAttrList.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      internalGetMutableAttr().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return graphdef.AttrValueProtos.internal_static_uni_model_proto_NameAttrList_descriptor;
    }

    @java.lang.Override
    public graphdef.NameAttrList getDefaultInstanceForType() {
      return graphdef.NameAttrList.getDefaultInstance();
    }

    @java.lang.Override
    public graphdef.NameAttrList build() {
      graphdef.NameAttrList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public graphdef.NameAttrList buildPartial() {
      graphdef.NameAttrList result = new graphdef.NameAttrList(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(graphdef.NameAttrList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.attr_ = internalGetAttr().build(AttrDefaultEntryHolder.defaultEntry);
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof graphdef.NameAttrList) {
        return mergeFrom((graphdef.NameAttrList)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(graphdef.NameAttrList other) {
      if (other == graphdef.NameAttrList.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      internalGetMutableAttr().mergeFrom(
          other.internalGetAttr());
      bitField0_ |= 0x00000002;
      this.mergeUnknownFields(other.getUnknownFields());
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
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.String, graphdef.AttrValue>
              attr__ = input.readMessage(
                  AttrDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableAttr().ensureBuilderMap().put(
                  attr__.getKey(), attr__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 1;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 1;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 1;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private static final class AttrConverter implements com.google.protobuf.MapFieldBuilder.Converter<java.lang.String, graphdef.AttrValueOrBuilder, graphdef.AttrValue> {
      @java.lang.Override
      public graphdef.AttrValue build(graphdef.AttrValueOrBuilder val) {
        if (val instanceof graphdef.AttrValue) { return (graphdef.AttrValue) val; }
        return ((graphdef.AttrValue.Builder) val).build();
      }

      @java.lang.Override
      public com.google.protobuf.MapEntry<java.lang.String, graphdef.AttrValue> defaultEntry() {
        return AttrDefaultEntryHolder.defaultEntry;
      }
    };
    private static final AttrConverter attrConverter = new AttrConverter();

    private com.google.protobuf.MapFieldBuilder<
        java.lang.String, graphdef.AttrValueOrBuilder, graphdef.AttrValue, graphdef.AttrValue.Builder> attr_;
    private com.google.protobuf.MapFieldBuilder<java.lang.String, graphdef.AttrValueOrBuilder, graphdef.AttrValue, graphdef.AttrValue.Builder>
        internalGetAttr() {
      if (attr_ == null) {
        return new com.google.protobuf.MapFieldBuilder<>(attrConverter);
      }
      return attr_;
    }
    private com.google.protobuf.MapFieldBuilder<java.lang.String, graphdef.AttrValueOrBuilder, graphdef.AttrValue, graphdef.AttrValue.Builder>
        internalGetMutableAttr() {
      if (attr_ == null) {
        attr_ = new com.google.protobuf.MapFieldBuilder<>(attrConverter);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return attr_;
    }
    public int getAttrCount() {
      return internalGetAttr().ensureBuilderMap().size();
    }
    /**
     * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
     */
    @java.lang.Override
    public boolean containsAttr(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetAttr().ensureBuilderMap().containsKey(key);
    }
    /**
     * Use {@link #getAttrMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, graphdef.AttrValue> getAttr() {
      return getAttrMap();
    }
    /**
     * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, graphdef.AttrValue> getAttrMap() {
      return internalGetAttr().getImmutableMap();
    }
    /**
     * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
     */
    @java.lang.Override
    public /* nullable */
graphdef.AttrValue getAttrOrDefault(
        java.lang.String key,
        /* nullable */
graphdef.AttrValue defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, graphdef.AttrValueOrBuilder> map = internalGetMutableAttr().ensureBuilderMap();
      return map.containsKey(key) ? attrConverter.build(map.get(key)) : defaultValue;
    }
    /**
     * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
     */
    @java.lang.Override
    public graphdef.AttrValue getAttrOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, graphdef.AttrValueOrBuilder> map = internalGetMutableAttr().ensureBuilderMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return attrConverter.build(map.get(key));
    }
    public Builder clearAttr() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableAttr().clear();
      return this;
    }
    /**
     * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
     */
    public Builder removeAttr(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableAttr().ensureBuilderMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, graphdef.AttrValue>
        getMutableAttr() {
      bitField0_ |= 0x00000002;
      return internalGetMutableAttr().ensureMessageMap();
    }
    /**
     * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
     */
    public Builder putAttr(
        java.lang.String key,
        graphdef.AttrValue value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableAttr().ensureBuilderMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
     */
    public Builder putAllAttr(
        java.util.Map<java.lang.String, graphdef.AttrValue> values) {
      for (java.util.Map.Entry<java.lang.String, graphdef.AttrValue> e : values.entrySet()) {
        if (e.getKey() == null || e.getValue() == null) {
          throw new NullPointerException();
        }
      }
      internalGetMutableAttr().ensureBuilderMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;string, .uni_model_proto.AttrValue&gt; attr = 2;</code>
     */
    public graphdef.AttrValue.Builder putAttrBuilderIfAbsent(
        java.lang.String key) {
      java.util.Map<java.lang.String, graphdef.AttrValueOrBuilder> builderMap = internalGetMutableAttr().ensureBuilderMap();
      graphdef.AttrValueOrBuilder entry = builderMap.get(key);
      if (entry == null) {
        entry = graphdef.AttrValue.newBuilder();
        builderMap.put(key, entry);
      }
      if (entry instanceof graphdef.AttrValue) {
        entry = ((graphdef.AttrValue) entry).toBuilder();
        builderMap.put(key, entry);
      }
      return (graphdef.AttrValue.Builder) entry;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:uni_model_proto.NameAttrList)
  }

  // @@protoc_insertion_point(class_scope:uni_model_proto.NameAttrList)
  private static final graphdef.NameAttrList DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new graphdef.NameAttrList();
  }

  public static graphdef.NameAttrList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NameAttrList>
      PARSER = new com.google.protobuf.AbstractParser<NameAttrList>() {
    @java.lang.Override
    public NameAttrList parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<NameAttrList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NameAttrList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public graphdef.NameAttrList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

