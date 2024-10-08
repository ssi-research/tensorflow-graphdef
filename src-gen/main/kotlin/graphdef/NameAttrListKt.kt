// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: graphdef/attr_value.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package graphdef;

@kotlin.jvm.JvmName("-initializenameAttrList")
public inline fun nameAttrList(block: graphdef.NameAttrListKt.Dsl.() -> kotlin.Unit): graphdef.NameAttrList =
  graphdef.NameAttrListKt.Dsl._create(graphdef.NameAttrList.newBuilder()).apply { block() }._build()
/**
 * ```
 * A list of attr names and their values. The whole list is attached
 * with a string name.  E.g., MatMul[T=float].
 * ```
 *
 * Protobuf type `uni_model_proto.NameAttrList`
 */
public object NameAttrListKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: graphdef.NameAttrList.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: graphdef.NameAttrList.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): graphdef.NameAttrList = _builder.build()

    /**
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
     * `string name = 1;`
     */
    public fun clearName() {
      _builder.clearName()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class AttrProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * `map<string, .uni_model_proto.AttrValue> attr = 2;`
     */
     public val attr: com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      @kotlin.jvm.JvmSynthetic
      @JvmName("getAttrMap")
      get() = com.google.protobuf.kotlin.DslMap(
        _builder.getAttrMap()
      )
    /**
     * `map<string, .uni_model_proto.AttrValue> attr = 2;`
     */
    @JvmName("putAttr")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .put(key: kotlin.String, value: graphdef.AttrValue) {
         _builder.putAttr(key, value)
       }
    /**
     * `map<string, .uni_model_proto.AttrValue> attr = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("setAttr")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .set(key: kotlin.String, value: graphdef.AttrValue) {
         put(key, value)
       }
    /**
     * `map<string, .uni_model_proto.AttrValue> attr = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("removeAttr")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .remove(key: kotlin.String) {
         _builder.removeAttr(key)
       }
    /**
     * `map<string, .uni_model_proto.AttrValue> attr = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("putAllAttr")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .putAll(map: kotlin.collections.Map<kotlin.String, graphdef.AttrValue>) {
         _builder.putAllAttr(map)
       }
    /**
     * `map<string, .uni_model_proto.AttrValue> attr = 2;`
     */
    @kotlin.jvm.JvmSynthetic
    @JvmName("clearAttr")
    public fun com.google.protobuf.kotlin.DslMap<kotlin.String, graphdef.AttrValue, AttrProxy>
      .clear() {
         _builder.clearAttr()
       }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun graphdef.NameAttrList.copy(block: `graphdef`.NameAttrListKt.Dsl.() -> kotlin.Unit): graphdef.NameAttrList =
  `graphdef`.NameAttrListKt.Dsl._create(this.toBuilder()).apply { block() }._build()

