// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/tensor.proto

// Protobuf Java Version: 3.25.3
package graphdef;

/**
 * <pre>
 * Protocol buffer representing the serialization format of DT_VARIANT tensors.
 * </pre>
 *
 * Protobuf type {@code uni_model_proto.VariantTensorDataProto}
 */
public final class VariantTensorDataProto extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:uni_model_proto.VariantTensorDataProto)
    VariantTensorDataProtoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VariantTensorDataProto.newBuilder() to construct.
  private VariantTensorDataProto(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VariantTensorDataProto() {
    typeName_ = "";
    metadata_ = com.google.protobuf.ByteString.EMPTY;
    tensors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VariantTensorDataProto();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return graphdef.TensorProtos.internal_static_uni_model_proto_VariantTensorDataProto_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return graphdef.TensorProtos.internal_static_uni_model_proto_VariantTensorDataProto_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            graphdef.VariantTensorDataProto.class, graphdef.VariantTensorDataProto.Builder.class);
  }

  public static final int TYPE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object typeName_ = "";
  /**
   * <pre>
   * Name of the type of objects being serialized.
   * </pre>
   *
   * <code>string type_name = 1;</code>
   * @return The typeName.
   */
  @java.lang.Override
  public java.lang.String getTypeName() {
    java.lang.Object ref = typeName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      typeName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the type of objects being serialized.
   * </pre>
   *
   * <code>string type_name = 1;</code>
   * @return The bytes for typeName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeNameBytes() {
    java.lang.Object ref = typeName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      typeName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString metadata_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * Portions of the object that are not Tensors.
   * </pre>
   *
   * <code>bytes metadata = 2;</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMetadata() {
    return metadata_;
  }

  public static final int TENSORS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<graphdef.TensorProto> tensors_;
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  @java.lang.Override
  public java.util.List<graphdef.TensorProto> getTensorsList() {
    return tensors_;
  }
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends graphdef.TensorProtoOrBuilder> 
      getTensorsOrBuilderList() {
    return tensors_;
  }
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  @java.lang.Override
  public int getTensorsCount() {
    return tensors_.size();
  }
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  @java.lang.Override
  public graphdef.TensorProto getTensors(int index) {
    return tensors_.get(index);
  }
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  @java.lang.Override
  public graphdef.TensorProtoOrBuilder getTensorsOrBuilder(
      int index) {
    return tensors_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(typeName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, typeName_);
    }
    if (!metadata_.isEmpty()) {
      output.writeBytes(2, metadata_);
    }
    for (int i = 0; i < tensors_.size(); i++) {
      output.writeMessage(3, tensors_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(typeName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, typeName_);
    }
    if (!metadata_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, metadata_);
    }
    for (int i = 0; i < tensors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, tensors_.get(i));
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
    if (!(obj instanceof graphdef.VariantTensorDataProto)) {
      return super.equals(obj);
    }
    graphdef.VariantTensorDataProto other = (graphdef.VariantTensorDataProto) obj;

    if (!getTypeName()
        .equals(other.getTypeName())) return false;
    if (!getMetadata()
        .equals(other.getMetadata())) return false;
    if (!getTensorsList()
        .equals(other.getTensorsList())) return false;
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
    hash = (37 * hash) + TYPE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTypeName().hashCode();
    hash = (37 * hash) + METADATA_FIELD_NUMBER;
    hash = (53 * hash) + getMetadata().hashCode();
    if (getTensorsCount() > 0) {
      hash = (37 * hash) + TENSORS_FIELD_NUMBER;
      hash = (53 * hash) + getTensorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static graphdef.VariantTensorDataProto parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static graphdef.VariantTensorDataProto parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static graphdef.VariantTensorDataProto parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static graphdef.VariantTensorDataProto parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static graphdef.VariantTensorDataProto parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static graphdef.VariantTensorDataProto parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static graphdef.VariantTensorDataProto parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static graphdef.VariantTensorDataProto parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static graphdef.VariantTensorDataProto parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static graphdef.VariantTensorDataProto parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static graphdef.VariantTensorDataProto parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static graphdef.VariantTensorDataProto parseFrom(
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
  public static Builder newBuilder(graphdef.VariantTensorDataProto prototype) {
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
   * Protocol buffer representing the serialization format of DT_VARIANT tensors.
   * </pre>
   *
   * Protobuf type {@code uni_model_proto.VariantTensorDataProto}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:uni_model_proto.VariantTensorDataProto)
      graphdef.VariantTensorDataProtoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return graphdef.TensorProtos.internal_static_uni_model_proto_VariantTensorDataProto_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return graphdef.TensorProtos.internal_static_uni_model_proto_VariantTensorDataProto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              graphdef.VariantTensorDataProto.class, graphdef.VariantTensorDataProto.Builder.class);
    }

    // Construct using graphdef.VariantTensorDataProto.newBuilder()
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
      typeName_ = "";
      metadata_ = com.google.protobuf.ByteString.EMPTY;
      if (tensorsBuilder_ == null) {
        tensors_ = java.util.Collections.emptyList();
      } else {
        tensors_ = null;
        tensorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return graphdef.TensorProtos.internal_static_uni_model_proto_VariantTensorDataProto_descriptor;
    }

    @java.lang.Override
    public graphdef.VariantTensorDataProto getDefaultInstanceForType() {
      return graphdef.VariantTensorDataProto.getDefaultInstance();
    }

    @java.lang.Override
    public graphdef.VariantTensorDataProto build() {
      graphdef.VariantTensorDataProto result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public graphdef.VariantTensorDataProto buildPartial() {
      graphdef.VariantTensorDataProto result = new graphdef.VariantTensorDataProto(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(graphdef.VariantTensorDataProto result) {
      if (tensorsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          tensors_ = java.util.Collections.unmodifiableList(tensors_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.tensors_ = tensors_;
      } else {
        result.tensors_ = tensorsBuilder_.build();
      }
    }

    private void buildPartial0(graphdef.VariantTensorDataProto result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.typeName_ = typeName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadata_;
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
      if (other instanceof graphdef.VariantTensorDataProto) {
        return mergeFrom((graphdef.VariantTensorDataProto)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(graphdef.VariantTensorDataProto other) {
      if (other == graphdef.VariantTensorDataProto.getDefaultInstance()) return this;
      if (!other.getTypeName().isEmpty()) {
        typeName_ = other.typeName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getMetadata() != com.google.protobuf.ByteString.EMPTY) {
        setMetadata(other.getMetadata());
      }
      if (tensorsBuilder_ == null) {
        if (!other.tensors_.isEmpty()) {
          if (tensors_.isEmpty()) {
            tensors_ = other.tensors_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureTensorsIsMutable();
            tensors_.addAll(other.tensors_);
          }
          onChanged();
        }
      } else {
        if (!other.tensors_.isEmpty()) {
          if (tensorsBuilder_.isEmpty()) {
            tensorsBuilder_.dispose();
            tensorsBuilder_ = null;
            tensors_ = other.tensors_;
            bitField0_ = (bitField0_ & ~0x00000004);
            tensorsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTensorsFieldBuilder() : null;
          } else {
            tensorsBuilder_.addAllMessages(other.tensors_);
          }
        }
      }
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
              typeName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              metadata_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              graphdef.TensorProto m =
                  input.readMessage(
                      graphdef.TensorProto.parser(),
                      extensionRegistry);
              if (tensorsBuilder_ == null) {
                ensureTensorsIsMutable();
                tensors_.add(m);
              } else {
                tensorsBuilder_.addMessage(m);
              }
              break;
            } // case 26
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

    private java.lang.Object typeName_ = "";
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @return The typeName.
     */
    public java.lang.String getTypeName() {
      java.lang.Object ref = typeName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        typeName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @return The bytes for typeName.
     */
    public com.google.protobuf.ByteString
        getTypeNameBytes() {
      java.lang.Object ref = typeName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        typeName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @param value The typeName to set.
     * @return This builder for chaining.
     */
    public Builder setTypeName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      typeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTypeName() {
      typeName_ = getDefaultInstance().getTypeName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the type of objects being serialized.
     * </pre>
     *
     * <code>string type_name = 1;</code>
     * @param value The bytes for typeName to set.
     * @return This builder for chaining.
     */
    public Builder setTypeNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      typeName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString metadata_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * Portions of the object that are not Tensors.
     * </pre>
     *
     * <code>bytes metadata = 2;</code>
     * @return The metadata.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getMetadata() {
      return metadata_;
    }
    /**
     * <pre>
     * Portions of the object that are not Tensors.
     * </pre>
     *
     * <code>bytes metadata = 2;</code>
     * @param value The metadata to set.
     * @return This builder for chaining.
     */
    public Builder setMetadata(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      metadata_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Portions of the object that are not Tensors.
     * </pre>
     *
     * <code>bytes metadata = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = getDefaultInstance().getMetadata();
      onChanged();
      return this;
    }

    private java.util.List<graphdef.TensorProto> tensors_ =
      java.util.Collections.emptyList();
    private void ensureTensorsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        tensors_ = new java.util.ArrayList<graphdef.TensorProto>(tensors_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        graphdef.TensorProto, graphdef.TensorProto.Builder, graphdef.TensorProtoOrBuilder> tensorsBuilder_;

    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public java.util.List<graphdef.TensorProto> getTensorsList() {
      if (tensorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(tensors_);
      } else {
        return tensorsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public int getTensorsCount() {
      if (tensorsBuilder_ == null) {
        return tensors_.size();
      } else {
        return tensorsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public graphdef.TensorProto getTensors(int index) {
      if (tensorsBuilder_ == null) {
        return tensors_.get(index);
      } else {
        return tensorsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder setTensors(
        int index, graphdef.TensorProto value) {
      if (tensorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorsIsMutable();
        tensors_.set(index, value);
        onChanged();
      } else {
        tensorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder setTensors(
        int index, graphdef.TensorProto.Builder builderForValue) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        tensors_.set(index, builderForValue.build());
        onChanged();
      } else {
        tensorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder addTensors(graphdef.TensorProto value) {
      if (tensorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorsIsMutable();
        tensors_.add(value);
        onChanged();
      } else {
        tensorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder addTensors(
        int index, graphdef.TensorProto value) {
      if (tensorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTensorsIsMutable();
        tensors_.add(index, value);
        onChanged();
      } else {
        tensorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder addTensors(
        graphdef.TensorProto.Builder builderForValue) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        tensors_.add(builderForValue.build());
        onChanged();
      } else {
        tensorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder addTensors(
        int index, graphdef.TensorProto.Builder builderForValue) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        tensors_.add(index, builderForValue.build());
        onChanged();
      } else {
        tensorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder addAllTensors(
        java.lang.Iterable<? extends graphdef.TensorProto> values) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, tensors_);
        onChanged();
      } else {
        tensorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder clearTensors() {
      if (tensorsBuilder_ == null) {
        tensors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        tensorsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public Builder removeTensors(int index) {
      if (tensorsBuilder_ == null) {
        ensureTensorsIsMutable();
        tensors_.remove(index);
        onChanged();
      } else {
        tensorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public graphdef.TensorProto.Builder getTensorsBuilder(
        int index) {
      return getTensorsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public graphdef.TensorProtoOrBuilder getTensorsOrBuilder(
        int index) {
      if (tensorsBuilder_ == null) {
        return tensors_.get(index);  } else {
        return tensorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public java.util.List<? extends graphdef.TensorProtoOrBuilder> 
         getTensorsOrBuilderList() {
      if (tensorsBuilder_ != null) {
        return tensorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(tensors_);
      }
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public graphdef.TensorProto.Builder addTensorsBuilder() {
      return getTensorsFieldBuilder().addBuilder(
          graphdef.TensorProto.getDefaultInstance());
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public graphdef.TensorProto.Builder addTensorsBuilder(
        int index) {
      return getTensorsFieldBuilder().addBuilder(
          index, graphdef.TensorProto.getDefaultInstance());
    }
    /**
     * <pre>
     * Tensors contained within objects being serialized.
     * </pre>
     *
     * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
     */
    public java.util.List<graphdef.TensorProto.Builder> 
         getTensorsBuilderList() {
      return getTensorsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        graphdef.TensorProto, graphdef.TensorProto.Builder, graphdef.TensorProtoOrBuilder> 
        getTensorsFieldBuilder() {
      if (tensorsBuilder_ == null) {
        tensorsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            graphdef.TensorProto, graphdef.TensorProto.Builder, graphdef.TensorProtoOrBuilder>(
                tensors_,
                ((bitField0_ & 0x00000004) != 0),
                getParentForChildren(),
                isClean());
        tensors_ = null;
      }
      return tensorsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:uni_model_proto.VariantTensorDataProto)
  }

  // @@protoc_insertion_point(class_scope:uni_model_proto.VariantTensorDataProto)
  private static final graphdef.VariantTensorDataProto DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new graphdef.VariantTensorDataProto();
  }

  public static graphdef.VariantTensorDataProto getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VariantTensorDataProto>
      PARSER = new com.google.protobuf.AbstractParser<VariantTensorDataProto>() {
    @java.lang.Override
    public VariantTensorDataProto parsePartialFrom(
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

  public static com.google.protobuf.Parser<VariantTensorDataProto> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VariantTensorDataProto> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public graphdef.VariantTensorDataProto getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

