// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/graph.proto

// Protobuf Java Version: 3.25.3
package graphdef;

public interface GraphDefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:uni_model_proto.GraphDef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
   */
  java.util.List<graphdef.NodeDef> 
      getNodeList();
  /**
   * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
   */
  graphdef.NodeDef getNode(int index);
  /**
   * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
   */
  int getNodeCount();
  /**
   * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
   */
  java.util.List<? extends graphdef.NodeDefOrBuilder> 
      getNodeOrBuilderList();
  /**
   * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
   */
  graphdef.NodeDefOrBuilder getNodeOrBuilder(
      int index);

  /**
   * <pre>
   * Compatibility versions of the graph.  See core/public/version.h for version
   * history.  The GraphDef version is distinct from the TensorFlow version, and
   * each release of TensorFlow will support a range of GraphDef versions.
   * </pre>
   *
   * <code>.uni_model_proto.VersionDef versions = 4;</code>
   * @return Whether the versions field is set.
   */
  boolean hasVersions();
  /**
   * <pre>
   * Compatibility versions of the graph.  See core/public/version.h for version
   * history.  The GraphDef version is distinct from the TensorFlow version, and
   * each release of TensorFlow will support a range of GraphDef versions.
   * </pre>
   *
   * <code>.uni_model_proto.VersionDef versions = 4;</code>
   * @return The versions.
   */
  graphdef.VersionDef getVersions();
  /**
   * <pre>
   * Compatibility versions of the graph.  See core/public/version.h for version
   * history.  The GraphDef version is distinct from the TensorFlow version, and
   * each release of TensorFlow will support a range of GraphDef versions.
   * </pre>
   *
   * <code>.uni_model_proto.VersionDef versions = 4;</code>
   */
  graphdef.VersionDefOrBuilder getVersionsOrBuilder();

  /**
   * <pre>
   * Deprecated single version field; use versions above instead.  Since all
   * GraphDef changes before "versions" was introduced were forward
   * compatible, this field is entirely ignored.
   * </pre>
   *
   * <code>int32 version = 3 [deprecated = true];</code>
   * @deprecated uni_model_proto.GraphDef.version is deprecated.
   *     See graphdef/graph.proto;l=47
   * @return The version.
   */
  @java.lang.Deprecated int getVersion();

  /**
   * <pre>
   * "library" provides user-defined functions.
   *
   * Naming:
   *   * library.function.name are in a flat namespace.
   *     NOTE: We may need to change it to be hierarchical to support
   *     different orgs. E.g.,
   *     { "/google/nn", { ... }},
   *     { "/google/vision", { ... }}
   *     { "/org_foo/module_bar", { ... }}
   *     map&lt;string, FunctionDefLib&gt; named_lib;
   *   * If node[i].op is the name of one function in "library",
   *     node[i] is deemed as a function call. Otherwise, node[i].op
   *     must be a primitive operation supported by the runtime.
   *
   *
   * Function call semantics:
   *
   *   * The callee may start execution as soon as some of its inputs
   *     are ready. The caller may want to use Tuple() mechanism to
   *     ensure all inputs are ready in the same time.
   *
   *   * The consumer of return values may start executing as soon as
   *     the return values the consumer depends on are ready.  The
   *     consumer may want to use Tuple() mechanism to ensure the
   *     consumer does not start until all return values of the callee
   *     function are ready.
   * </pre>
   *
   * <code>.uni_model_proto.FunctionDefLibrary library = 2;</code>
   * @return Whether the library field is set.
   */
  boolean hasLibrary();
  /**
   * <pre>
   * "library" provides user-defined functions.
   *
   * Naming:
   *   * library.function.name are in a flat namespace.
   *     NOTE: We may need to change it to be hierarchical to support
   *     different orgs. E.g.,
   *     { "/google/nn", { ... }},
   *     { "/google/vision", { ... }}
   *     { "/org_foo/module_bar", { ... }}
   *     map&lt;string, FunctionDefLib&gt; named_lib;
   *   * If node[i].op is the name of one function in "library",
   *     node[i] is deemed as a function call. Otherwise, node[i].op
   *     must be a primitive operation supported by the runtime.
   *
   *
   * Function call semantics:
   *
   *   * The callee may start execution as soon as some of its inputs
   *     are ready. The caller may want to use Tuple() mechanism to
   *     ensure all inputs are ready in the same time.
   *
   *   * The consumer of return values may start executing as soon as
   *     the return values the consumer depends on are ready.  The
   *     consumer may want to use Tuple() mechanism to ensure the
   *     consumer does not start until all return values of the callee
   *     function are ready.
   * </pre>
   *
   * <code>.uni_model_proto.FunctionDefLibrary library = 2;</code>
   * @return The library.
   */
  graphdef.FunctionDefLibrary getLibrary();
  /**
   * <pre>
   * "library" provides user-defined functions.
   *
   * Naming:
   *   * library.function.name are in a flat namespace.
   *     NOTE: We may need to change it to be hierarchical to support
   *     different orgs. E.g.,
   *     { "/google/nn", { ... }},
   *     { "/google/vision", { ... }}
   *     { "/org_foo/module_bar", { ... }}
   *     map&lt;string, FunctionDefLib&gt; named_lib;
   *   * If node[i].op is the name of one function in "library",
   *     node[i] is deemed as a function call. Otherwise, node[i].op
   *     must be a primitive operation supported by the runtime.
   *
   *
   * Function call semantics:
   *
   *   * The callee may start execution as soon as some of its inputs
   *     are ready. The caller may want to use Tuple() mechanism to
   *     ensure all inputs are ready in the same time.
   *
   *   * The consumer of return values may start executing as soon as
   *     the return values the consumer depends on are ready.  The
   *     consumer may want to use Tuple() mechanism to ensure the
   *     consumer does not start until all return values of the callee
   *     function are ready.
   * </pre>
   *
   * <code>.uni_model_proto.FunctionDefLibrary library = 2;</code>
   */
  graphdef.FunctionDefLibraryOrBuilder getLibraryOrBuilder();
}
