//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: graphdef/graph.proto

package graphdef;

@kotlin.jvm.JvmName("-initializegraphDef")
public inline fun graphDef(block: graphdef.GraphDefKt.Dsl.() -> kotlin.Unit): graphdef.GraphDef =
  graphdef.GraphDefKt.Dsl._create(graphdef.GraphDef.newBuilder()).apply { block() }._build()
public object GraphDefKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: graphdef.GraphDef.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: graphdef.GraphDef.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): graphdef.GraphDef = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class NodeProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
     */
     public val node: com.google.protobuf.kotlin.DslList<graphdef.NodeDef, NodeProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getNodeList()
      )
    /**
     * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
     * @param value The node to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addNode")
    public fun com.google.protobuf.kotlin.DslList<graphdef.NodeDef, NodeProxy>.add(value: graphdef.NodeDef) {
      _builder.addNode(value)
    }
    /**
     * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
     * @param value The node to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignNode")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<graphdef.NodeDef, NodeProxy>.plusAssign(value: graphdef.NodeDef) {
      add(value)
    }
    /**
     * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
     * @param values The node to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllNode")
    public fun com.google.protobuf.kotlin.DslList<graphdef.NodeDef, NodeProxy>.addAll(values: kotlin.collections.Iterable<graphdef.NodeDef>) {
      _builder.addAllNode(values)
    }
    /**
     * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
     * @param values The node to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllNode")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<graphdef.NodeDef, NodeProxy>.plusAssign(values: kotlin.collections.Iterable<graphdef.NodeDef>) {
      addAll(values)
    }
    /**
     * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
     * @param index The index to set the value at.
     * @param value The node to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setNode")
    public operator fun com.google.protobuf.kotlin.DslList<graphdef.NodeDef, NodeProxy>.set(index: kotlin.Int, value: graphdef.NodeDef) {
      _builder.setNode(index, value)
    }
    /**
     * <code>repeated .uni_model_proto.NodeDef node = 1;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearNode")
    public fun com.google.protobuf.kotlin.DslList<graphdef.NodeDef, NodeProxy>.clear() {
      _builder.clearNode()
    }


    /**
     * <pre>
     * Compatibility versions of the graph.  See core/public/version.h for version
     * history.  The GraphDef version is distinct from the TensorFlow version, and
     * each release of TensorFlow will support a range of GraphDef versions.
     * </pre>
     *
     * <code>.uni_model_proto.VersionDef versions = 4;</code>
     */
    public var versions: graphdef.VersionDef
      @JvmName("getVersions")
      get() = _builder.getVersions()
      @JvmName("setVersions")
      set(value) {
        _builder.setVersions(value)
      }
    /**
     * <pre>
     * Compatibility versions of the graph.  See core/public/version.h for version
     * history.  The GraphDef version is distinct from the TensorFlow version, and
     * each release of TensorFlow will support a range of GraphDef versions.
     * </pre>
     *
     * <code>.uni_model_proto.VersionDef versions = 4;</code>
     */
    public fun clearVersions() {
      _builder.clearVersions()
    }
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
    public fun hasVersions(): kotlin.Boolean {
      return _builder.hasVersions()
    }

    /**
     * <pre>
     * Deprecated single version field; use versions above instead.  Since all
     * GraphDef changes before "versions" was introduced were forward
     * compatible, this field is entirely ignored.
     * </pre>
     *
     * <code>int32 version = 3 [deprecated = true];</code>
     */
    @kotlin.Deprecated(message = "Field version is deprecated") public var version: kotlin.Int
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
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
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * <pre>
     * "library" provides user-defined functions.
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
     * Function call semantics:
     *   * The callee may start execution as soon as some of its inputs
     *     are ready. The caller may want to use Tuple() mechanism to
     *     ensure all inputs are ready in the same time.
     *   * The consumer of return values may start executing as soon as
     *     the return values the consumer depends on are ready.  The
     *     consumer may want to use Tuple() mechanism to ensure the
     *     consumer does not start until all return values of the callee
     *     function are ready.
     * </pre>
     *
     * <code>.uni_model_proto.FunctionDefLibrary library = 2;</code>
     */
    public var library: graphdef.FunctionDefLibrary
      @JvmName("getLibrary")
      get() = _builder.getLibrary()
      @JvmName("setLibrary")
      set(value) {
        _builder.setLibrary(value)
      }
    /**
     * <pre>
     * "library" provides user-defined functions.
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
     * Function call semantics:
     *   * The callee may start execution as soon as some of its inputs
     *     are ready. The caller may want to use Tuple() mechanism to
     *     ensure all inputs are ready in the same time.
     *   * The consumer of return values may start executing as soon as
     *     the return values the consumer depends on are ready.  The
     *     consumer may want to use Tuple() mechanism to ensure the
     *     consumer does not start until all return values of the callee
     *     function are ready.
     * </pre>
     *
     * <code>.uni_model_proto.FunctionDefLibrary library = 2;</code>
     */
    public fun clearLibrary() {
      _builder.clearLibrary()
    }
    /**
     * <pre>
     * "library" provides user-defined functions.
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
     * Function call semantics:
     *   * The callee may start execution as soon as some of its inputs
     *     are ready. The caller may want to use Tuple() mechanism to
     *     ensure all inputs are ready in the same time.
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
    public fun hasLibrary(): kotlin.Boolean {
      return _builder.hasLibrary()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun graphdef.GraphDef.copy(block: graphdef.GraphDefKt.Dsl.() -> kotlin.Unit): graphdef.GraphDef =
  graphdef.GraphDefKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val graphdef.GraphDefOrBuilder.versionsOrNull: graphdef.VersionDef?
  get() = if (hasVersions()) getVersions() else null

public val graphdef.GraphDefOrBuilder.libraryOrNull: graphdef.FunctionDefLibrary?
  get() = if (hasLibrary()) getLibrary() else null

