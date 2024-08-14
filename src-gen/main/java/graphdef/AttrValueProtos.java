// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/attr_value.proto

package graphdef;

public final class AttrValueProtos {
  private AttrValueProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uni_model_proto_AttrValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uni_model_proto_AttrValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uni_model_proto_AttrValue_ListValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uni_model_proto_AttrValue_ListValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uni_model_proto_NameAttrList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uni_model_proto_NameAttrList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uni_model_proto_NameAttrList_AttrEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uni_model_proto_NameAttrList_AttrEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031graphdef/attr_value.proto\022\017uni_model_p" +
      "roto\032\025graphdef/tensor.proto\032\033graphdef/te" +
      "nsor_shape.proto\032\024graphdef/types.proto\"\323" +
      "\004\n\tAttrValue\022\013\n\001s\030\002 \001(\014H\000\022\013\n\001i\030\003 \001(\003H\000\022\013" +
      "\n\001f\030\004 \001(\002H\000\022\013\n\001b\030\005 \001(\010H\000\022)\n\004type\030\006 \001(\0162\031" +
      ".uni_model_proto.DataTypeH\000\0222\n\005shape\030\007 \001" +
      "(\0132!.uni_model_proto.TensorShapeProtoH\000\022" +
      ".\n\006tensor\030\010 \001(\0132\034.uni_model_proto.Tensor" +
      "ProtoH\000\0224\n\004list\030\001 \001(\0132$.uni_model_proto." +
      "AttrValue.ListValueH\000\022-\n\004func\030\n \001(\0132\035.un" +
      "i_model_proto.NameAttrListH\000\022\025\n\013placehol" +
      "der\030\t \001(\tH\000\032\375\001\n\tListValue\022\t\n\001s\030\002 \003(\014\022\r\n\001" +
      "i\030\003 \003(\003B\002\020\001\022\r\n\001f\030\004 \003(\002B\002\020\001\022\r\n\001b\030\005 \003(\010B\002\020" +
      "\001\022+\n\004type\030\006 \003(\0162\031.uni_model_proto.DataTy" +
      "peB\002\020\001\0220\n\005shape\030\007 \003(\0132!.uni_model_proto." +
      "TensorShapeProto\022,\n\006tensor\030\010 \003(\0132\034.uni_m" +
      "odel_proto.TensorProto\022+\n\004func\030\t \003(\0132\035.u" +
      "ni_model_proto.NameAttrListB\007\n\005value\"\234\001\n" +
      "\014NameAttrList\022\014\n\004name\030\001 \001(\t\0225\n\004attr\030\002 \003(" +
      "\0132\'.uni_model_proto.NameAttrList.AttrEnt" +
      "ry\032G\n\tAttrEntry\022\013\n\003key\030\001 \001(\t\022)\n\005value\030\002 " +
      "\001(\0132\032.uni_model_proto.AttrValue:\0028\001Bs\n\010g" +
      "raphdefB\017AttrValueProtosP\001ZQgithub.com/t" +
      "ensorflow/tensorflow/tensorflow/go/core/" +
      "framework/attr_value_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          graphdef.TensorProtos.getDescriptor(),
          graphdef.TensorShapeProtos.getDescriptor(),
          graphdef.TypesProtos.getDescriptor(),
        });
    internal_static_uni_model_proto_AttrValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_uni_model_proto_AttrValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uni_model_proto_AttrValue_descriptor,
        new java.lang.String[] { "S", "I", "F", "B", "Type", "Shape", "Tensor", "List", "Func", "Placeholder", "Value", });
    internal_static_uni_model_proto_AttrValue_ListValue_descriptor =
      internal_static_uni_model_proto_AttrValue_descriptor.getNestedTypes().get(0);
    internal_static_uni_model_proto_AttrValue_ListValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uni_model_proto_AttrValue_ListValue_descriptor,
        new java.lang.String[] { "S", "I", "F", "B", "Type", "Shape", "Tensor", "Func", });
    internal_static_uni_model_proto_NameAttrList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_uni_model_proto_NameAttrList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uni_model_proto_NameAttrList_descriptor,
        new java.lang.String[] { "Name", "Attr", });
    internal_static_uni_model_proto_NameAttrList_AttrEntry_descriptor =
      internal_static_uni_model_proto_NameAttrList_descriptor.getNestedTypes().get(0);
    internal_static_uni_model_proto_NameAttrList_AttrEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uni_model_proto_NameAttrList_AttrEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    graphdef.TensorProtos.getDescriptor();
    graphdef.TensorShapeProtos.getDescriptor();
    graphdef.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
