// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/versions.proto

// Protobuf Java Version: 3.25.3
package graphdef;

public final class VersionsProtos {
  private VersionsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_uni_model_proto_VersionDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_uni_model_proto_VersionDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027graphdef/versions.proto\022\017uni_model_pro" +
      "to\"K\n\nVersionDef\022\020\n\010producer\030\001 \001(\005\022\024\n\014mi" +
      "n_consumer\030\002 \001(\005\022\025\n\rbad_consumers\030\003 \003(\005B" +
      "p\n\010graphdefB\016VersionsProtosP\001ZOgithub.co" +
      "m/tensorflow/tensorflow/tensorflow/go/co" +
      "re/framework/versions_go_proto\370\001\001b\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_uni_model_proto_VersionDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_uni_model_proto_VersionDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_uni_model_proto_VersionDef_descriptor,
        new java.lang.String[] { "Producer", "MinConsumer", "BadConsumers", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
