//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: graphdef/full_type.proto

package graphdef;

@kotlin.jvm.JvmName("-initializefullTypeDef")
public inline fun fullTypeDef(block: graphdef.FullTypeDefKt.Dsl.() -> kotlin.Unit): graphdef.FullTypeDef =
  graphdef.FullTypeDefKt.Dsl._create(graphdef.FullTypeDef.newBuilder()).apply { block() }._build()
public object FullTypeDefKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: graphdef.FullTypeDef.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: graphdef.FullTypeDef.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): graphdef.FullTypeDef = _builder.build()

    /**
     * <pre>
     * The principal type represented by this object. This may be a concrete type
     * (Tensor, Dataset) a type variable (used for dependent types) a type
     * symbol (Any, Union). See FullTypeId for details.
     * </pre>
     *
     * <code>.uni_model_proto.FullTypeId type_id = 1;</code>
     */
    public var typeId: graphdef.FullTypeId
      @JvmName("getTypeId")
      get() = _builder.getTypeId()
      @JvmName("setTypeId")
      set(value) {
        _builder.setTypeId(value)
      }
    /**
     * <pre>
     * The principal type represented by this object. This may be a concrete type
     * (Tensor, Dataset) a type variable (used for dependent types) a type
     * symbol (Any, Union). See FullTypeId for details.
     * </pre>
     *
     * <code>.uni_model_proto.FullTypeId type_id = 1;</code>
     */
    public fun clearTypeId() {
      _builder.clearTypeId()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ArgsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .uni_model_proto.FullTypeDef args = 2;</code>
     */
     public val args: com.google.protobuf.kotlin.DslList<graphdef.FullTypeDef, ArgsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getArgsList()
      )
    /**
     * <code>repeated .uni_model_proto.FullTypeDef args = 2;</code>
     * @param value The args to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addArgs")
    public fun com.google.protobuf.kotlin.DslList<graphdef.FullTypeDef, ArgsProxy>.add(value: graphdef.FullTypeDef) {
      _builder.addArgs(value)
    }
    /**
     * <code>repeated .uni_model_proto.FullTypeDef args = 2;</code>
     * @param value The args to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignArgs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<graphdef.FullTypeDef, ArgsProxy>.plusAssign(value: graphdef.FullTypeDef) {
      add(value)
    }
    /**
     * <code>repeated .uni_model_proto.FullTypeDef args = 2;</code>
     * @param values The args to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllArgs")
    public fun com.google.protobuf.kotlin.DslList<graphdef.FullTypeDef, ArgsProxy>.addAll(values: kotlin.collections.Iterable<graphdef.FullTypeDef>) {
      _builder.addAllArgs(values)
    }
    /**
     * <code>repeated .uni_model_proto.FullTypeDef args = 2;</code>
     * @param values The args to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllArgs")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<graphdef.FullTypeDef, ArgsProxy>.plusAssign(values: kotlin.collections.Iterable<graphdef.FullTypeDef>) {
      addAll(values)
    }
    /**
     * <code>repeated .uni_model_proto.FullTypeDef args = 2;</code>
     * @param index The index to set the value at.
     * @param value The args to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setArgs")
    public operator fun com.google.protobuf.kotlin.DslList<graphdef.FullTypeDef, ArgsProxy>.set(index: kotlin.Int, value: graphdef.FullTypeDef) {
      _builder.setArgs(index, value)
    }
    /**
     * <code>repeated .uni_model_proto.FullTypeDef args = 2;</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearArgs")
    public fun com.google.protobuf.kotlin.DslList<graphdef.FullTypeDef, ArgsProxy>.clear() {
      _builder.clearArgs()
    }


    /**
     * <code>string s = 3;</code>
     */
    public var s: kotlin.String
      @JvmName("getS")
      get() = _builder.getS()
      @JvmName("setS")
      set(value) {
        _builder.setS(value)
      }
    /**
     * <code>string s = 3;</code>
     */
    public fun clearS() {
      _builder.clearS()
    }
    /**
     * <code>string s = 3;</code>
     * @return Whether the s field is set.
     */
    public fun hasS(): kotlin.Boolean {
      return _builder.hasS()
    }
    public val attrCase: graphdef.FullTypeDef.AttrCase
      @JvmName("getAttrCase")
      get() = _builder.getAttrCase()

    public fun clearAttr() {
      _builder.clearAttr()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun graphdef.FullTypeDef.copy(block: graphdef.FullTypeDefKt.Dsl.() -> kotlin.Unit): graphdef.FullTypeDef =
  graphdef.FullTypeDefKt.Dsl._create(this.toBuilder()).apply { block() }._build()

