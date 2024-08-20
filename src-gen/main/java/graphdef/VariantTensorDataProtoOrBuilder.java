// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/tensor.proto

// Protobuf Java Version: 3.25.3
package graphdef;

public interface VariantTensorDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uni_model_proto.VariantTensorDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the type of objects being serialized.
   * </pre>
   *
   * <code>string type_name = 1;</code>
   * @return The typeName.
   */
  java.lang.String getTypeName();
  /**
   * <pre>
   * Name of the type of objects being serialized.
   * </pre>
   *
   * <code>string type_name = 1;</code>
   * @return The bytes for typeName.
   */
  com.google.protobuf.ByteString
      getTypeNameBytes();

  /**
   * <pre>
   * Portions of the object that are not Tensors.
   * </pre>
   *
   * <code>bytes metadata = 2;</code>
   * @return The metadata.
   */
  com.google.protobuf.ByteString getMetadata();

  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  java.util.List<graphdef.TensorProto> 
      getTensorsList();
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  graphdef.TensorProto getTensors(int index);
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  int getTensorsCount();
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  java.util.List<? extends graphdef.TensorProtoOrBuilder> 
      getTensorsOrBuilderList();
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .uni_model_proto.TensorProto tensors = 3;</code>
   */
  graphdef.TensorProtoOrBuilder getTensorsOrBuilder(
      int index);
}
