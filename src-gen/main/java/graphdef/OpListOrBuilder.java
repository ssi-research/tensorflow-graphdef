// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/op_def.proto

// Protobuf Java Version: 3.25.3
package graphdef;

public interface OpListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uni_model_proto.OpList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .uni_model_proto.OpDef op = 1;</code>
   */
  java.util.List<graphdef.OpDef> 
      getOpList();
  /**
   * <code>repeated .uni_model_proto.OpDef op = 1;</code>
   */
  graphdef.OpDef getOp(int index);
  /**
   * <code>repeated .uni_model_proto.OpDef op = 1;</code>
   */
  int getOpCount();
  /**
   * <code>repeated .uni_model_proto.OpDef op = 1;</code>
   */
  java.util.List<? extends graphdef.OpDefOrBuilder> 
      getOpOrBuilderList();
  /**
   * <code>repeated .uni_model_proto.OpDef op = 1;</code>
   */
  graphdef.OpDefOrBuilder getOpOrBuilder(
      int index);
}
