// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: graphdef/node_def.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package graphdef;

@kotlin.jvm.JvmName("-initializenodeDef")
public inline fun nodeDef(block: graphdef.NodeDefKt.Dsl.() -> kotlin.Unit): graphdef.NodeDef =
  graphdef.NodeDefKt.Dsl._create(graphdef.NodeDef.newBuilder()).apply { block() }._build()
/**
 * Protobuf type `uni_model_proto.NodeDef`
 */
public object NodeDefKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: graphdef.NodeDef.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: graphdef.NodeDef.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): graphdef.NodeDef = _builder.build()

    /**
     * ```
     * The name given to this operator. Used for naming inputs,
     * logging, visualization, etc.  Unique within a single GraphDef.
     * Must match the regexp "[A-Za-z0-9.][A-Za-z0-9_>./]*".
     * ```
     *
     * `string name = 1;`
     */
    public var name: kotlin.String
      @JvmName("getName")
      get() = _builder.getName()
      @JvmName("setName")
      set(value) {
        _builder.setName(value)
      }
    /**
     * ```
     * The name given to this operator. Used for naming inputs,
     * logging, visualization, etc.  Unique within a single GraphDef.
     * Must match the regexp "[A-Za-z0-9.][A-Za-z0-9_>./]*".
     * ```
     *
     * `string name = 1;`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * ```
     * The operation name.  There may be custom parameters in attrs.
     * Op names starting with an underscore are reserved for internal use.
     * ```
     *
     * `string op = 2;`
     */
    public var op: kotlin.String
      @JvmName("getOp")
      get() = _builder.getOp()
      @JvmName("setOp")
      set(value) {
        _builder.setOp(value)
      }
    /**
     * ```
     * The operation name.  There may be custom parameters in attrs.
     * Op names starting with an underscore are reserved for internal use.
     * ```
     *
     * `string op = 2;`
     */
    public fun clearOp() {
      _builder.clearOp()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InputProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * Each input is "node:src_output" with "node" being a string name and
     * "src_output" indicating which output tensor to use from "node". If
     * "src_output" is 0 the ":0" suffix can be omitted.  Regular inputs
     * may optionally be followed by control inputs that have the format
     * "^node".
     * ```
     *
     * `repeated string input = 3;`
     * @return A list containing the input.
     */
    public val input: com.google.protobuf.kotlin.DslList<kotlin.String, InputProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInputList()
      )
    /**
     * ```
     * Each input is "node:src_output" with "node" being a string name and
     * "src_output" indicating which output tensor to use from "node". If
     * "src_output" is 0 the ":0" suffix can be omitted.  Regular inputs
     * may optionally be followed by control inputs that have the format
     * "^node".
     * ```
     *
     * `repeated string input = 3;`
     * @param value The input to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInput")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InputProxy>.add(value: kotlin.String) {
      _builder.addInput(value)
    }
    /**
     * ```
     * Each input is "node:src_output" with "node" being a string name and
     * "src_output" indicating which output tensor to use from "node". If
     * "src_output" is 0 the ":0" suffix can be omitted.  Regular inputs
     * may optionally be followed by control inputs that have the format
     * "^node".
     * ```
     *
     * `repeated string input = 3;`
     * @param value The input to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInput")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InputProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * ```
     * Each input is "node:src_output" with "node" being a string name and
     * "src_output" indicating which output tensor to use from "node". If
     * "src_output" is 0 the ":0" suffix can be omitted.  Regular inputs
     * may optionally be followed by control inputs that have the format
     * "^node".
     * ```
     *
     * `repeated string input = 3;`
     * @param values The input to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInput")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InputProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllInput(values)
    }
    /**
     * ```
     * Each input is "node:src_output" with "node" being a string name and
     * "src_output" indicating which output tensor to use from "node". If
     * "src_output" is 0 the ":0" suffix can be omitted.  Regular inputs
     * may optionally be followed by control inputs that have the format
     * "^node".
     * ```
     *
     * `repeated string input = 3;`
     * @param values The input to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInput")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InputProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * ```
     * Each input is "node:src_output" with "node" being a string name and
     * "src_output" indicating which output tensor to use from "node". If
     * "src_output" is 0 the ":0" suffix can be omitted.  Regular inputs
     * may optionally be followed by control inputs that have the format
     * "^node".
     * ```
     *
     * `repeated string input = 3;`
     * @param index The index to set the value at.
     * @param value The input to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInput")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InputProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setInput(index, value)
    }/**
     * ```
     * Each input is "node:src_output" with "node" being a string name and
     * "src_output" indicating which output tensor to use from "node". If
     * "src_output" is 0 the ":0" suffix can be omitted.  Regular inputs
     * may optionally be followed by control inputs that have the format
     * "^node".
     * ```
     *
     * `repeated string input = 3;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInput")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InputProxy>.clear() {
      _builder.clearInput()
    }
    /**
     * ```
     * A (possibly partial) specification for the device on which this
     * node should be placed.
     * The expected syntax for this string is as follows:
     *
     * DEVICE_SPEC ::= PARTIAL_SPEC
     *
     * PARTIAL_SPEC ::= ("/" CONSTRAINT) *
     * CONSTRAINT ::= ("job:" JOB_NAME)
     *              | ("replica:" [1-9][0-9]*)
     *              | ("task:" [1-9][0-9]*)
     *              | ("device:" [A-Za-z]* ":" ([1-9][0-9]* | "*") )
     *
     * Valid values for this string include:
     * * "/job:worker/replica:0/task:1/device:GPU:3"  (full specification)
     * * "/job:worker/device:GPU:3"                   (partial specification)
     * * ""                                    (no specification)
     *
     * If the constraints do not resolve to a single device (or if this
     * field is empty or not present), the runtime will attempt to
     * choose a device automatically.
     * ```
     *
     * `string device = 4;`
     */
    public var device: kotlin.String
      @JvmName("getDevice")
      get() = _builder.getDevice()
      @JvmName("setDevice")
      set(value) {
        _builder.setDevice(value)
      }
    /**
     * ```
     * A (possibly partial) specification for the device on which this
     * node should be placed.
     * The expected syntax for this string is as follows:
     *
     * DEVICE_SPEC ::= PARTIAL_SPEC
     *
     * PARTIAL_SPEC ::= ("/" CONSTRAINT) *
     * CONSTRAINT ::= ("job:" JOB_NAME)
     *              | ("replica:" [1-9][0-9]*)
     *              | ("task:" [1-9][0-9]*)
     *              | ("device:" [A-Za-z]* ":" ([1-9][0-9]* | "*") )
     *
     * Valid values for this string include:
     * * "/job:worker/replica:0/task:1/device:GPU:3"  (full specification)
     * * "/job:worker/device:GPU:3"                   (partial specification)
     * * ""                                    (no specification)
     *
     * If the constraints do not resolve to a single device (or if this
     * field is empty or not present), the runtime will attempt to
     * choose a device automatically.
     * ```
     *
     * `string device = 4;`
     */
    public fun clearDevice() {
      _builder.clearDevice()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AttrProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * Operation-specific graph-construction-time configuration.
     * Note that this should include all attrs defined in the
     * corresponding OpDef, including those with a value matching
     * the default -- this allows the default to change and makes
     * NodeDefs easier to interpret on their own.  However, if
     * an attr with a default is not specified in this list, the
     * default will be used.
     * The "names" (keys) must match the regexp "[a-z][a-z0-9_]+" (and
     * one of the names from the corresponding OpDef's attr field).
     * The values must have a type matching the corresponding OpDef
     * attr's type field.
     * TODO(josh11b): Add some examples here showing best practices.
     * ```
     *
     * `map<string, .uni_model_proto.AttrValue> attr = 5;`
     */
     public val attr: com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getAttrMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getAttrMap()
      )
    /**
     * ```
     * Operation-specific graph-construction-time configuration.
     * Note that this should include all attrs defined in the
     * corresponding OpDef, including those with a value matching
     * the default -- this allows the default to change and makes
     * NodeDefs easier to interpret on their own.  However, if
     * an attr with a default is not specified in this list, the
     * default will be used.
     * The "names" (keys) must match the regexp "[a-z][a-z0-9_]+" (and
     * one of the names from the corresponding OpDef's attr field).
     * The values must have a type matching the corresponding OpDef
     * attr's type field.
     * TODO(josh11b): Add some examples here showing best practices.
     * ```
     *
     * `map<string, .uni_model_proto.AttrValue> attr = 5;`
     */
    @JvmName("putAttr")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .put(key: kotlin.String, value: graphdef.AttrValue) {
         _builder.putAttr(key, value)
       }
    /**
     * ```
     * Operation-specific graph-construction-time configuration.
     * Note that this should include all attrs defined in the
     * corresponding OpDef, including those with a value matching
     * the default -- this allows the default to change and makes
     * NodeDefs easier to interpret on their own.  However, if
     * an attr with a default is not specified in this list, the
     * default will be used.
     * The "names" (keys) must match the regexp "[a-z][a-z0-9_]+" (and
     * one of the names from the corresponding OpDef's attr field).
     * The values must have a type matching the corresponding OpDef
     * attr's type field.
     * TODO(josh11b): Add some examples here showing best practices.
     * ```
     *
     * `map<string, .uni_model_proto.AttrValue> attr = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setAttr")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .set(key: kotlin.String, value: graphdef.AttrValue) {
         put(key, value)
       }
    /**
     * ```
     * Operation-specific graph-construction-time configuration.
     * Note that this should include all attrs defined in the
     * corresponding OpDef, including those with a value matching
     * the default -- this allows the default to change and makes
     * NodeDefs easier to interpret on their own.  However, if
     * an attr with a default is not specified in this list, the
     * default will be used.
     * The "names" (keys) must match the regexp "[a-z][a-z0-9_]+" (and
     * one of the names from the corresponding OpDef's attr field).
     * The values must have a type matching the corresponding OpDef
     * attr's type field.
     * TODO(josh11b): Add some examples here showing best practices.
     * ```
     *
     * `map<string, .uni_model_proto.AttrValue> attr = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeAttr")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .remove(key: kotlin.String) {
         _builder.removeAttr(key)
       }
    /**
     * ```
     * Operation-specific graph-construction-time configuration.
     * Note that this should include all attrs defined in the
     * corresponding OpDef, including those with a value matching
     * the default -- this allows the default to change and makes
     * NodeDefs easier to interpret on their own.  However, if
     * an attr with a default is not specified in this list, the
     * default will be used.
     * The "names" (keys) must match the regexp "[a-z][a-z0-9_]+" (and
     * one of the names from the corresponding OpDef's attr field).
     * The values must have a type matching the corresponding OpDef
     * attr's type field.
     * TODO(josh11b): Add some examples here showing best practices.
     * ```
     *
     * `map<string, .uni_model_proto.AttrValue> attr = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllAttr")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, graphdef.AttrValue>) {
         _builder.putAllAttr(map)
       }
    /**
     * ```
     * Operation-specific graph-construction-time configuration.
     * Note that this should include all attrs defined in the
     * corresponding OpDef, including those with a value matching
     * the default -- this allows the default to change and makes
     * NodeDefs easier to interpret on their own.  However, if
     * an attr with a default is not specified in this list, the
     * default will be used.
     * The "names" (keys) must match the regexp "[a-z][a-z0-9_]+" (and
     * one of the names from the corresponding OpDef's attr field).
     * The values must have a type matching the corresponding OpDef
     * attr's type field.
     * TODO(josh11b): Add some examples here showing best practices.
     * ```
     *
     * `map<string, .uni_model_proto.AttrValue> attr = 5;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearAttr")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .clear() {
         _builder.clearAttr()
       }

    /**
     * ```
     * This stores debug information associated with the node.
     * ```
     *
     * `.uni_model_proto.NodeDef.ExperimentalDebugInfo experimental_debug_info = 6;`
     */
    public var experimentalDebugInfo: graphdef.NodeDef.ExperimentalDebugInfo
      @JvmName("getExperimentalDebugInfo")
      get() = _builder.getExperimentalDebugInfo()
      @JvmName("setExperimentalDebugInfo")
      set(value) {
        _builder.setExperimentalDebugInfo(value)
      }
    /**
     * ```
     * This stores debug information associated with the node.
     * ```
     *
     * `.uni_model_proto.NodeDef.ExperimentalDebugInfo experimental_debug_info = 6;`
     */
    public fun clearExperimentalDebugInfo() {
      _builder.clearExperimentalDebugInfo()
    }
    /**
     * ```
     * This stores debug information associated with the node.
     * ```
     *
     * `.uni_model_proto.NodeDef.ExperimentalDebugInfo experimental_debug_info = 6;`
     * @return Whether the experimentalDebugInfo field is set.
     */
    public fun hasExperimentalDebugInfo(): kotlin.Boolean {
      return _builder.hasExperimentalDebugInfo()
    }
  }
  @kotlin.jvm.JvmName("-initializeexperimentalDebugInfo")
  public inline fun experimentalDebugInfo(block: graphdef.NodeDefKt.ExperimentalDebugInfoKt.Dsl.() -> kotlin.Unit): graphdef.NodeDef.ExperimentalDebugInfo =
    graphdef.NodeDefKt.ExperimentalDebugInfoKt.Dsl._create(graphdef.NodeDef.ExperimentalDebugInfo.newBuilder()).apply { block() }._build()
  /**
   * Protobuf type `uni_model_proto.NodeDef.ExperimentalDebugInfo`
   */
  public object ExperimentalDebugInfoKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: graphdef.NodeDef.ExperimentalDebugInfo.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: graphdef.NodeDef.ExperimentalDebugInfo.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): graphdef.NodeDef.ExperimentalDebugInfo = _builder.build()

      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class OriginalNodeNamesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * ```
       * Opaque string inserted into error messages created by the runtime.
       *
       * This is intended to store the list of names of the nodes from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of 2 nodes A and B, then 'original_node' would
       * be {A, B}. This information can be used to map errors originating at the
       * current node to some top level source code.
       * ```
       *
       * `repeated string original_node_names = 1;`
       * @return A list containing the originalNodeNames.
       */
      public val originalNodeNames: com.google.protobuf.kotlin.DslList<kotlin.String, OriginalNodeNamesProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getOriginalNodeNamesList()
        )
      /**
       * ```
       * Opaque string inserted into error messages created by the runtime.
       *
       * This is intended to store the list of names of the nodes from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of 2 nodes A and B, then 'original_node' would
       * be {A, B}. This information can be used to map errors originating at the
       * current node to some top level source code.
       * ```
       *
       * `repeated string original_node_names = 1;`
       * @param value The originalNodeNames to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addOriginalNodeNames")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalNodeNamesProxy>.add(value: kotlin.String) {
        _builder.addOriginalNodeNames(value)
      }
      /**
       * ```
       * Opaque string inserted into error messages created by the runtime.
       *
       * This is intended to store the list of names of the nodes from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of 2 nodes A and B, then 'original_node' would
       * be {A, B}. This information can be used to map errors originating at the
       * current node to some top level source code.
       * ```
       *
       * `repeated string original_node_names = 1;`
       * @param value The originalNodeNames to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignOriginalNodeNames")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalNodeNamesProxy>.plusAssign(value: kotlin.String) {
        add(value)
      }
      /**
       * ```
       * Opaque string inserted into error messages created by the runtime.
       *
       * This is intended to store the list of names of the nodes from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of 2 nodes A and B, then 'original_node' would
       * be {A, B}. This information can be used to map errors originating at the
       * current node to some top level source code.
       * ```
       *
       * `repeated string original_node_names = 1;`
       * @param values The originalNodeNames to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllOriginalNodeNames")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalNodeNamesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
        _builder.addAllOriginalNodeNames(values)
      }
      /**
       * ```
       * Opaque string inserted into error messages created by the runtime.
       *
       * This is intended to store the list of names of the nodes from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of 2 nodes A and B, then 'original_node' would
       * be {A, B}. This information can be used to map errors originating at the
       * current node to some top level source code.
       * ```
       *
       * `repeated string original_node_names = 1;`
       * @param values The originalNodeNames to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllOriginalNodeNames")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalNodeNamesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
        addAll(values)
      }
      /**
       * ```
       * Opaque string inserted into error messages created by the runtime.
       *
       * This is intended to store the list of names of the nodes from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of 2 nodes A and B, then 'original_node' would
       * be {A, B}. This information can be used to map errors originating at the
       * current node to some top level source code.
       * ```
       *
       * `repeated string original_node_names = 1;`
       * @param index The index to set the value at.
       * @param value The originalNodeNames to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setOriginalNodeNames")
      public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalNodeNamesProxy>.set(index: kotlin.Int, value: kotlin.String) {
        _builder.setOriginalNodeNames(index, value)
      }/**
       * ```
       * Opaque string inserted into error messages created by the runtime.
       *
       * This is intended to store the list of names of the nodes from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of 2 nodes A and B, then 'original_node' would
       * be {A, B}. This information can be used to map errors originating at the
       * current node to some top level source code.
       * ```
       *
       * `repeated string original_node_names = 1;`
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearOriginalNodeNames")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalNodeNamesProxy>.clear() {
        _builder.clearOriginalNodeNames()
      }
      /**
       * An uninstantiable, behaviorless type to represent the field in
       * generics.
       */
      @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
      public class OriginalFuncNamesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
      /**
       * ```
       * This is intended to store the list of names of the functions from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of node A in function FA and node B in function
       * FB, then `original_funcs` would be {FA, FB}. If the node is in the top
       * level graph, the `original_func` is empty. This information, with the
       * `original_node_names` can be used to map errors originating at the
       * current ndoe to some top level source code.
       * ```
       *
       * `repeated string original_func_names = 2;`
       * @return A list containing the originalFuncNames.
       */
      public val originalFuncNames: com.google.protobuf.kotlin.DslList<kotlin.String, OriginalFuncNamesProxy>
        @kotlin.jvm.JvmSynthetic
        get() = com.google.protobuf.kotlin.DslList(
          _builder.getOriginalFuncNamesList()
        )
      /**
       * ```
       * This is intended to store the list of names of the functions from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of node A in function FA and node B in function
       * FB, then `original_funcs` would be {FA, FB}. If the node is in the top
       * level graph, the `original_func` is empty. This information, with the
       * `original_node_names` can be used to map errors originating at the
       * current ndoe to some top level source code.
       * ```
       *
       * `repeated string original_func_names = 2;`
       * @param value The originalFuncNames to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addOriginalFuncNames")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalFuncNamesProxy>.add(value: kotlin.String) {
        _builder.addOriginalFuncNames(value)
      }
      /**
       * ```
       * This is intended to store the list of names of the functions from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of node A in function FA and node B in function
       * FB, then `original_funcs` would be {FA, FB}. If the node is in the top
       * level graph, the `original_func` is empty. This information, with the
       * `original_node_names` can be used to map errors originating at the
       * current ndoe to some top level source code.
       * ```
       *
       * `repeated string original_func_names = 2;`
       * @param value The originalFuncNames to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignOriginalFuncNames")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalFuncNamesProxy>.plusAssign(value: kotlin.String) {
        add(value)
      }
      /**
       * ```
       * This is intended to store the list of names of the functions from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of node A in function FA and node B in function
       * FB, then `original_funcs` would be {FA, FB}. If the node is in the top
       * level graph, the `original_func` is empty. This information, with the
       * `original_node_names` can be used to map errors originating at the
       * current ndoe to some top level source code.
       * ```
       *
       * `repeated string original_func_names = 2;`
       * @param values The originalFuncNames to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("addAllOriginalFuncNames")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalFuncNamesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
        _builder.addAllOriginalFuncNames(values)
      }
      /**
       * ```
       * This is intended to store the list of names of the functions from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of node A in function FA and node B in function
       * FB, then `original_funcs` would be {FA, FB}. If the node is in the top
       * level graph, the `original_func` is empty. This information, with the
       * `original_node_names` can be used to map errors originating at the
       * current ndoe to some top level source code.
       * ```
       *
       * `repeated string original_func_names = 2;`
       * @param values The originalFuncNames to add.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("plusAssignAllOriginalFuncNames")
      @Suppress("NOTHING_TO_INLINE")
      public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalFuncNamesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
        addAll(values)
      }
      /**
       * ```
       * This is intended to store the list of names of the functions from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of node A in function FA and node B in function
       * FB, then `original_funcs` would be {FA, FB}. If the node is in the top
       * level graph, the `original_func` is empty. This information, with the
       * `original_node_names` can be used to map errors originating at the
       * current ndoe to some top level source code.
       * ```
       *
       * `repeated string original_func_names = 2;`
       * @param index The index to set the value at.
       * @param value The originalFuncNames to set.
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("setOriginalFuncNames")
      public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalFuncNamesProxy>.set(index: kotlin.Int, value: kotlin.String) {
        _builder.setOriginalFuncNames(index, value)
      }/**
       * ```
       * This is intended to store the list of names of the functions from the
       * original graph that this node was derived. For example if this node, say
       * C, was result of a fusion of node A in function FA and node B in function
       * FB, then `original_funcs` would be {FA, FB}. If the node is in the top
       * level graph, the `original_func` is empty. This information, with the
       * `original_node_names` can be used to map errors originating at the
       * current ndoe to some top level source code.
       * ```
       *
       * `repeated string original_func_names = 2;`
       */
      @kotlin.jvm.JvmSynthetic
      @kotlin.jvm.JvmName("clearOriginalFuncNames")
      public fun com.google.protobuf.kotlin.DslList<kotlin.String, OriginalFuncNamesProxy>.clear() {
        _builder.clearOriginalFuncNames()
      }}
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun graphdef.NodeDef.copy(block: `graphdef`.NodeDefKt.Dsl.() -> kotlin.Unit): graphdef.NodeDef =
  `graphdef`.NodeDefKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun graphdef.NodeDef.ExperimentalDebugInfo.copy(block: `graphdef`.NodeDefKt.ExperimentalDebugInfoKt.Dsl.() -> kotlin.Unit): graphdef.NodeDef.ExperimentalDebugInfo =
  `graphdef`.NodeDefKt.ExperimentalDebugInfoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val graphdef.NodeDefOrBuilder.experimentalDebugInfoOrNull: graphdef.NodeDef.ExperimentalDebugInfo?
  get() = if (hasExperimentalDebugInfo()) getExperimentalDebugInfo() else null

