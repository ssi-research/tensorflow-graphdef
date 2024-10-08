// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: graphdef/resource_handle.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package graphdef;

@kotlin.jvm.JvmName("-initializeresourceHandleProto")
public inline fun resourceHandleProto(block: graphdef.ResourceHandleProtoKt.Dsl.() -> kotlin.Unit): graphdef.ResourceHandleProto =
  graphdef.ResourceHandleProtoKt.Dsl._create(graphdef.ResourceHandleProto.newBuilder()).apply { block() }._build()
/**
 * ```
 * Protocol buffer representing a handle to a tensorflow resource. Handles are
 * not valid across executions, but can be serialized back and forth from within
 * a single run.
 * ```
 *
 * Protobuf type `uni_model_proto.ResourceHandleProto`
 */
public object ResourceHandleProtoKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: graphdef.ResourceHandleProto.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: graphdef.ResourceHandleProto.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): graphdef.ResourceHandleProto = _builder.build()

    /**
     * ```
     * Unique name for the device containing the resource.
     * ```
     *
     * `string device = 1;`
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
     * Unique name for the device containing the resource.
     * ```
     *
     * `string device = 1;`
     */
    public fun clearDevice() {
      _builder.clearDevice()
    }

    /**
     * ```
     * Container in which this resource is placed.
     * ```
     *
     * `string container = 2;`
     */
    public var container: kotlin.String
      @JvmName("getContainer")
      get() = _builder.getContainer()
      @JvmName("setContainer")
      set(value) {
        _builder.setContainer(value)
      }
    /**
     * ```
     * Container in which this resource is placed.
     * ```
     *
     * `string container = 2;`
     */
    public fun clearContainer() {
      _builder.clearContainer()
    }

    /**
     * ```
     * Unique name of this resource.
     * ```
     *
     * `string name = 3;`
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
     * Unique name of this resource.
     * ```
     *
     * `string name = 3;`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * ```
     * Hash code for the type of the resource. Is only valid in the same device
     * and in the same execution.
     * ```
     *
     * `uint64 hash_code = 4;`
     */
    public var hashCode: kotlin.Long
      @JvmName("getHashCode")
      get() = _builder.getHashCode()
      @JvmName("setHashCode")
      set(value) {
        _builder.setHashCode(value)
      }
    /**
     * ```
     * Hash code for the type of the resource. Is only valid in the same device
     * and in the same execution.
     * ```
     *
     * `uint64 hash_code = 4;`
     */
    public fun clearHashCode() {
      _builder.clearHashCode()
    }

    /**
     * ```
     * For debug-only, the name of the type pointed to by this handle, if
     * available.
     * ```
     *
     * `string maybe_type_name = 5;`
     */
    public var maybeTypeName: kotlin.String
      @JvmName("getMaybeTypeName")
      get() = _builder.getMaybeTypeName()
      @JvmName("setMaybeTypeName")
      set(value) {
        _builder.setMaybeTypeName(value)
      }
    /**
     * ```
     * For debug-only, the name of the type pointed to by this handle, if
     * available.
     * ```
     *
     * `string maybe_type_name = 5;`
     */
    public fun clearMaybeTypeName() {
      _builder.clearMaybeTypeName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class DtypesAndShapesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * ```
     * Data types and shapes for the underlying resource.
     * ```
     *
     * `repeated .uni_model_proto.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;`
     */
     public val dtypesAndShapes: com.google.protobuf.kotlin.DslList<graphdef.ResourceHandleProto.DtypeAndShape, DtypesAndShapesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getDtypesAndShapesList()
      )
    /**
     * ```
     * Data types and shapes for the underlying resource.
     * ```
     *
     * `repeated .uni_model_proto.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;`
     * @param value The dtypesAndShapes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addDtypesAndShapes")
    public fun com.google.protobuf.kotlin.DslList<graphdef.ResourceHandleProto.DtypeAndShape, DtypesAndShapesProxy>.add(value: graphdef.ResourceHandleProto.DtypeAndShape) {
      _builder.addDtypesAndShapes(value)
    }
    /**
     * ```
     * Data types and shapes for the underlying resource.
     * ```
     *
     * `repeated .uni_model_proto.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;`
     * @param value The dtypesAndShapes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignDtypesAndShapes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<graphdef.ResourceHandleProto.DtypeAndShape, DtypesAndShapesProxy>.plusAssign(value: graphdef.ResourceHandleProto.DtypeAndShape) {
      add(value)
    }
    /**
     * ```
     * Data types and shapes for the underlying resource.
     * ```
     *
     * `repeated .uni_model_proto.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;`
     * @param values The dtypesAndShapes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllDtypesAndShapes")
    public fun com.google.protobuf.kotlin.DslList<graphdef.ResourceHandleProto.DtypeAndShape, DtypesAndShapesProxy>.addAll(values: kotlin.collections.Iterable<graphdef.ResourceHandleProto.DtypeAndShape>) {
      _builder.addAllDtypesAndShapes(values)
    }
    /**
     * ```
     * Data types and shapes for the underlying resource.
     * ```
     *
     * `repeated .uni_model_proto.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;`
     * @param values The dtypesAndShapes to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllDtypesAndShapes")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<graphdef.ResourceHandleProto.DtypeAndShape, DtypesAndShapesProxy>.plusAssign(values: kotlin.collections.Iterable<graphdef.ResourceHandleProto.DtypeAndShape>) {
      addAll(values)
    }
    /**
     * ```
     * Data types and shapes for the underlying resource.
     * ```
     *
     * `repeated .uni_model_proto.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;`
     * @param index The index to set the value at.
     * @param value The dtypesAndShapes to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setDtypesAndShapes")
    public operator fun com.google.protobuf.kotlin.DslList<graphdef.ResourceHandleProto.DtypeAndShape, DtypesAndShapesProxy>.set(index: kotlin.Int, value: graphdef.ResourceHandleProto.DtypeAndShape) {
      _builder.setDtypesAndShapes(index, value)
    }
    /**
     * ```
     * Data types and shapes for the underlying resource.
     * ```
     *
     * `repeated .uni_model_proto.ResourceHandleProto.DtypeAndShape dtypes_and_shapes = 6;`
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearDtypesAndShapes")
    public fun com.google.protobuf.kotlin.DslList<graphdef.ResourceHandleProto.DtypeAndShape, DtypesAndShapesProxy>.clear() {
      _builder.clearDtypesAndShapes()
    }

  }
  @kotlin.jvm.JvmName("-initializedtypeAndShape")
  public inline fun dtypeAndShape(block: graphdef.ResourceHandleProtoKt.DtypeAndShapeKt.Dsl.() -> kotlin.Unit): graphdef.ResourceHandleProto.DtypeAndShape =
    graphdef.ResourceHandleProtoKt.DtypeAndShapeKt.Dsl._create(graphdef.ResourceHandleProto.DtypeAndShape.newBuilder()).apply { block() }._build()
  /**
   * ```
   * Protocol buffer representing a pair of (data type, tensor shape).
   * ```
   *
   * Protobuf type `uni_model_proto.ResourceHandleProto.DtypeAndShape`
   */
  public object DtypeAndShapeKt {
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    @com.google.protobuf.kotlin.ProtoDslMarker
    public class Dsl private constructor(
      private val _builder: graphdef.ResourceHandleProto.DtypeAndShape.Builder
    ) {
      public companion object {
        @kotlin.jvm.JvmSynthetic
        @kotlin.PublishedApi
        internal fun _create(builder: graphdef.ResourceHandleProto.DtypeAndShape.Builder): Dsl = Dsl(builder)
      }

      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _build(): graphdef.ResourceHandleProto.DtypeAndShape = _builder.build()

      /**
       * `.uni_model_proto.DataType dtype = 1;`
       */
      public var dtype: graphdef.DataType
        @JvmName("getDtype")
        get() = _builder.getDtype()
        @JvmName("setDtype")
        set(value) {
          _builder.setDtype(value)
        }
      public var dtypeValue: kotlin.Int
        @JvmName("getDtypeValue")
        get() = _builder.getDtypeValue()
        @JvmName("setDtypeValue")
        set(value) {
          _builder.setDtypeValue(value)
        }
      /**
       * `.uni_model_proto.DataType dtype = 1;`
       */
      public fun clearDtype() {
        _builder.clearDtype()
      }

      /**
       * `.uni_model_proto.TensorShapeProto shape = 2;`
       */
      public var shape: graphdef.TensorShapeProto
        @JvmName("getShape")
        get() = _builder.getShape()
        @JvmName("setShape")
        set(value) {
          _builder.setShape(value)
        }
      /**
       * `.uni_model_proto.TensorShapeProto shape = 2;`
       */
      public fun clearShape() {
        _builder.clearShape()
      }
      /**
       * `.uni_model_proto.TensorShapeProto shape = 2;`
       * @return Whether the shape field is set.
       */
      public fun hasShape(): kotlin.Boolean {
        return _builder.hasShape()
      }
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun graphdef.ResourceHandleProto.copy(block: `graphdef`.ResourceHandleProtoKt.Dsl.() -> kotlin.Unit): graphdef.ResourceHandleProto =
  `graphdef`.ResourceHandleProtoKt.Dsl._create(this.toBuilder()).apply { block() }._build()

@kotlin.jvm.JvmSynthetic
public inline fun graphdef.ResourceHandleProto.DtypeAndShape.copy(block: `graphdef`.ResourceHandleProtoKt.DtypeAndShapeKt.Dsl.() -> kotlin.Unit): graphdef.ResourceHandleProto.DtypeAndShape =
  `graphdef`.ResourceHandleProtoKt.DtypeAndShapeKt.Dsl._create(this.toBuilder()).apply { block() }._build()

public val graphdef.ResourceHandleProto.DtypeAndShapeOrBuilder.shapeOrNull: graphdef.TensorShapeProto?
  get() = if (hasShape()) getShape() else null

