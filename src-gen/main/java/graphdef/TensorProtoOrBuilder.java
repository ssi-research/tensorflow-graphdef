// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/tensor.proto

package graphdef;

public interface TensorProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uni_model_proto.TensorProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.uni_model_proto.DataType dtype = 1;</code>
   * @return The enum numeric value on the wire for dtype.
   */
  int getDtypeValue();
  /**
   * <code>.uni_model_proto.DataType dtype = 1;</code>
   * @return The dtype.
   */
  graphdef.DataType getDtype();

  /**
   * <pre>
   * Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
   * </pre>
   *
   * <code>.uni_model_proto.TensorShapeProto tensor_shape = 2;</code>
   * @return Whether the tensorShape field is set.
   */
  boolean hasTensorShape();
  /**
   * <pre>
   * Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
   * </pre>
   *
   * <code>.uni_model_proto.TensorShapeProto tensor_shape = 2;</code>
   * @return The tensorShape.
   */
  graphdef.TensorShapeProto getTensorShape();
  /**
   * <pre>
   * Shape of the tensor.  TODO(touts): sort out the 0-rank issues.
   * </pre>
   *
   * <code>.uni_model_proto.TensorShapeProto tensor_shape = 2;</code>
   */
  graphdef.TensorShapeProtoOrBuilder getTensorShapeOrBuilder();

  /**
   * <pre>
   * Version number.
   * In version 0, if the "repeated xxx" representations contain only one
   * element, that element is repeated to fill the shape.  This makes it easy
   * to represent a constant Tensor with a single value.
   * </pre>
   *
   * <code>int32 version_number = 3;</code>
   * @return The versionNumber.
   */
  int getVersionNumber();

  /**
   * <pre>
   * Serialized raw tensor content from either Tensor::AsProtoTensorContent or
   * memcpy in tensorflow::grpc::EncodeTensorToByteBuffer. This representation
   * can be used for all tensor types. The purpose of this representation is to
   * reduce serialization overhead during RPC call by avoiding serialization of
   * many repeated small items.
   * </pre>
   *
   * <code>bytes tensor_content = 4;</code>
   * @return The tensorContent.
   */
  com.google.protobuf.ByteString getTensorContent();

  /**
   * <pre>
   * DT_HALF, DT_BFLOAT16. Note that since protobuf has no int16 type, we'll
   * have some pointless zero padding for each value here.
   * </pre>
   *
   * <code>repeated int32 half_val = 13 [packed = true];</code>
   * @return A list containing the halfVal.
   */
  java.util.List<java.lang.Integer> getHalfValList();
  /**
   * <pre>
   * DT_HALF, DT_BFLOAT16. Note that since protobuf has no int16 type, we'll
   * have some pointless zero padding for each value here.
   * </pre>
   *
   * <code>repeated int32 half_val = 13 [packed = true];</code>
   * @return The count of halfVal.
   */
  int getHalfValCount();
  /**
   * <pre>
   * DT_HALF, DT_BFLOAT16. Note that since protobuf has no int16 type, we'll
   * have some pointless zero padding for each value here.
   * </pre>
   *
   * <code>repeated int32 half_val = 13 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The halfVal at the given index.
   */
  int getHalfVal(int index);

  /**
   * <pre>
   * DT_FLOAT.
   * </pre>
   *
   * <code>repeated float float_val = 5 [packed = true];</code>
   * @return A list containing the floatVal.
   */
  java.util.List<java.lang.Float> getFloatValList();
  /**
   * <pre>
   * DT_FLOAT.
   * </pre>
   *
   * <code>repeated float float_val = 5 [packed = true];</code>
   * @return The count of floatVal.
   */
  int getFloatValCount();
  /**
   * <pre>
   * DT_FLOAT.
   * </pre>
   *
   * <code>repeated float float_val = 5 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The floatVal at the given index.
   */
  float getFloatVal(int index);

  /**
   * <pre>
   * DT_DOUBLE.
   * </pre>
   *
   * <code>repeated double double_val = 6 [packed = true];</code>
   * @return A list containing the doubleVal.
   */
  java.util.List<java.lang.Double> getDoubleValList();
  /**
   * <pre>
   * DT_DOUBLE.
   * </pre>
   *
   * <code>repeated double double_val = 6 [packed = true];</code>
   * @return The count of doubleVal.
   */
  int getDoubleValCount();
  /**
   * <pre>
   * DT_DOUBLE.
   * </pre>
   *
   * <code>repeated double double_val = 6 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The doubleVal at the given index.
   */
  double getDoubleVal(int index);

  /**
   * <pre>
   * DT_INT32, DT_INT16, DT_UINT16, DT_INT8, DT_UINT8.
   * </pre>
   *
   * <code>repeated int32 int_val = 7 [packed = true];</code>
   * @return A list containing the intVal.
   */
  java.util.List<java.lang.Integer> getIntValList();
  /**
   * <pre>
   * DT_INT32, DT_INT16, DT_UINT16, DT_INT8, DT_UINT8.
   * </pre>
   *
   * <code>repeated int32 int_val = 7 [packed = true];</code>
   * @return The count of intVal.
   */
  int getIntValCount();
  /**
   * <pre>
   * DT_INT32, DT_INT16, DT_UINT16, DT_INT8, DT_UINT8.
   * </pre>
   *
   * <code>repeated int32 int_val = 7 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The intVal at the given index.
   */
  int getIntVal(int index);

  /**
   * <pre>
   * DT_STRING
   * </pre>
   *
   * <code>repeated bytes string_val = 8;</code>
   * @return A list containing the stringVal.
   */
  java.util.List<com.google.protobuf.ByteString> getStringValList();
  /**
   * <pre>
   * DT_STRING
   * </pre>
   *
   * <code>repeated bytes string_val = 8;</code>
   * @return The count of stringVal.
   */
  int getStringValCount();
  /**
   * <pre>
   * DT_STRING
   * </pre>
   *
   * <code>repeated bytes string_val = 8;</code>
   * @param index The index of the element to return.
   * @return The stringVal at the given index.
   */
  com.google.protobuf.ByteString getStringVal(int index);

  /**
   * <pre>
   * DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   * and imaginary parts of i-th single precision complex.
   * </pre>
   *
   * <code>repeated float scomplex_val = 9 [packed = true];</code>
   * @return A list containing the scomplexVal.
   */
  java.util.List<java.lang.Float> getScomplexValList();
  /**
   * <pre>
   * DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   * and imaginary parts of i-th single precision complex.
   * </pre>
   *
   * <code>repeated float scomplex_val = 9 [packed = true];</code>
   * @return The count of scomplexVal.
   */
  int getScomplexValCount();
  /**
   * <pre>
   * DT_COMPLEX64. scomplex_val(2*i) and scomplex_val(2*i+1) are real
   * and imaginary parts of i-th single precision complex.
   * </pre>
   *
   * <code>repeated float scomplex_val = 9 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The scomplexVal at the given index.
   */
  float getScomplexVal(int index);

  /**
   * <pre>
   * DT_INT64
   * </pre>
   *
   * <code>repeated int64 int64_val = 10 [packed = true];</code>
   * @return A list containing the int64Val.
   */
  java.util.List<java.lang.Long> getInt64ValList();
  /**
   * <pre>
   * DT_INT64
   * </pre>
   *
   * <code>repeated int64 int64_val = 10 [packed = true];</code>
   * @return The count of int64Val.
   */
  int getInt64ValCount();
  /**
   * <pre>
   * DT_INT64
   * </pre>
   *
   * <code>repeated int64 int64_val = 10 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The int64Val at the given index.
   */
  long getInt64Val(int index);

  /**
   * <pre>
   * DT_BOOL
   * </pre>
   *
   * <code>repeated bool bool_val = 11 [packed = true];</code>
   * @return A list containing the boolVal.
   */
  java.util.List<java.lang.Boolean> getBoolValList();
  /**
   * <pre>
   * DT_BOOL
   * </pre>
   *
   * <code>repeated bool bool_val = 11 [packed = true];</code>
   * @return The count of boolVal.
   */
  int getBoolValCount();
  /**
   * <pre>
   * DT_BOOL
   * </pre>
   *
   * <code>repeated bool bool_val = 11 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The boolVal at the given index.
   */
  boolean getBoolVal(int index);

  /**
   * <pre>
   * DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   * and imaginary parts of i-th double precision complex.
   * </pre>
   *
   * <code>repeated double dcomplex_val = 12 [packed = true];</code>
   * @return A list containing the dcomplexVal.
   */
  java.util.List<java.lang.Double> getDcomplexValList();
  /**
   * <pre>
   * DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   * and imaginary parts of i-th double precision complex.
   * </pre>
   *
   * <code>repeated double dcomplex_val = 12 [packed = true];</code>
   * @return The count of dcomplexVal.
   */
  int getDcomplexValCount();
  /**
   * <pre>
   * DT_COMPLEX128. dcomplex_val(2*i) and dcomplex_val(2*i+1) are real
   * and imaginary parts of i-th double precision complex.
   * </pre>
   *
   * <code>repeated double dcomplex_val = 12 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The dcomplexVal at the given index.
   */
  double getDcomplexVal(int index);

  /**
   * <pre>
   * DT_RESOURCE
   * </pre>
   *
   * <code>repeated .uni_model_proto.ResourceHandleProto resource_handle_val = 14;</code>
   */
  java.util.List<graphdef.ResourceHandleProto> 
      getResourceHandleValList();
  /**
   * <pre>
   * DT_RESOURCE
   * </pre>
   *
   * <code>repeated .uni_model_proto.ResourceHandleProto resource_handle_val = 14;</code>
   */
  graphdef.ResourceHandleProto getResourceHandleVal(int index);
  /**
   * <pre>
   * DT_RESOURCE
   * </pre>
   *
   * <code>repeated .uni_model_proto.ResourceHandleProto resource_handle_val = 14;</code>
   */
  int getResourceHandleValCount();
  /**
   * <pre>
   * DT_RESOURCE
   * </pre>
   *
   * <code>repeated .uni_model_proto.ResourceHandleProto resource_handle_val = 14;</code>
   */
  java.util.List<? extends graphdef.ResourceHandleProtoOrBuilder> 
      getResourceHandleValOrBuilderList();
  /**
   * <pre>
   * DT_RESOURCE
   * </pre>
   *
   * <code>repeated .uni_model_proto.ResourceHandleProto resource_handle_val = 14;</code>
   */
  graphdef.ResourceHandleProtoOrBuilder getResourceHandleValOrBuilder(
      int index);

  /**
   * <pre>
   * DT_VARIANT
   * </pre>
   *
   * <code>repeated .uni_model_proto.VariantTensorDataProto variant_val = 15;</code>
   */
  java.util.List<graphdef.VariantTensorDataProto> 
      getVariantValList();
  /**
   * <pre>
   * DT_VARIANT
   * </pre>
   *
   * <code>repeated .uni_model_proto.VariantTensorDataProto variant_val = 15;</code>
   */
  graphdef.VariantTensorDataProto getVariantVal(int index);
  /**
   * <pre>
   * DT_VARIANT
   * </pre>
   *
   * <code>repeated .uni_model_proto.VariantTensorDataProto variant_val = 15;</code>
   */
  int getVariantValCount();
  /**
   * <pre>
   * DT_VARIANT
   * </pre>
   *
   * <code>repeated .uni_model_proto.VariantTensorDataProto variant_val = 15;</code>
   */
  java.util.List<? extends graphdef.VariantTensorDataProtoOrBuilder> 
      getVariantValOrBuilderList();
  /**
   * <pre>
   * DT_VARIANT
   * </pre>
   *
   * <code>repeated .uni_model_proto.VariantTensorDataProto variant_val = 15;</code>
   */
  graphdef.VariantTensorDataProtoOrBuilder getVariantValOrBuilder(
      int index);

  /**
   * <pre>
   * DT_UINT32
   * </pre>
   *
   * <code>repeated uint32 uint32_val = 16 [packed = true];</code>
   * @return A list containing the uint32Val.
   */
  java.util.List<java.lang.Integer> getUint32ValList();
  /**
   * <pre>
   * DT_UINT32
   * </pre>
   *
   * <code>repeated uint32 uint32_val = 16 [packed = true];</code>
   * @return The count of uint32Val.
   */
  int getUint32ValCount();
  /**
   * <pre>
   * DT_UINT32
   * </pre>
   *
   * <code>repeated uint32 uint32_val = 16 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The uint32Val at the given index.
   */
  int getUint32Val(int index);

  /**
   * <pre>
   * DT_UINT64
   * </pre>
   *
   * <code>repeated uint64 uint64_val = 17 [packed = true];</code>
   * @return A list containing the uint64Val.
   */
  java.util.List<java.lang.Long> getUint64ValList();
  /**
   * <pre>
   * DT_UINT64
   * </pre>
   *
   * <code>repeated uint64 uint64_val = 17 [packed = true];</code>
   * @return The count of uint64Val.
   */
  int getUint64ValCount();
  /**
   * <pre>
   * DT_UINT64
   * </pre>
   *
   * <code>repeated uint64 uint64_val = 17 [packed = true];</code>
   * @param index The index of the element to return.
   * @return The uint64Val at the given index.
   */
  long getUint64Val(int index);
}
