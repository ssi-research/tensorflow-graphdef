// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/function.proto

// Protobuf Java Version: 3.25.3
package graphdef;

public interface RegisteredGradientOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uni_model_proto.RegisteredGradient)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The gradient function's name.
   * </pre>
   *
   * <code>string gradient_func = 1;</code>
   * @return The gradientFunc.
   */
  java.lang.String getGradientFunc();
  /**
   * <pre>
   * The gradient function's name.
   * </pre>
   *
   * <code>string gradient_func = 1;</code>
   * @return The bytes for gradientFunc.
   */
  com.google.protobuf.ByteString
      getGradientFuncBytes();

  /**
   * <pre>
   * The gradient function's registered op type.
   * </pre>
   *
   * <code>string registered_op_type = 2;</code>
   * @return The registeredOpType.
   */
  java.lang.String getRegisteredOpType();
  /**
   * <pre>
   * The gradient function's registered op type.
   * </pre>
   *
   * <code>string registered_op_type = 2;</code>
   * @return The bytes for registeredOpType.
   */
  com.google.protobuf.ByteString
      getRegisteredOpTypeBytes();
}
