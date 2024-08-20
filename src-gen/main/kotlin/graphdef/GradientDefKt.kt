// Generated by the protocol buffer compiler. DO NOT EDIT!
// source: graphdef/function.proto

// Generated files should ignore deprecation warnings
@file:Suppress("DEPRECATION")
package graphdef;

@kotlin.jvm.JvmName("-initializegradientDef")
public inline fun gradientDef(block: graphdef.GradientDefKt.Dsl.() -> kotlin.Unit): graphdef.GradientDef =
  graphdef.GradientDefKt.Dsl._create(graphdef.GradientDef.newBuilder()).apply { block() }._build()
/**
 * ```
 * GradientDef defines the gradient function of a function defined in
 * a function library.
 *
 * A gradient function g (specified by gradient_func) for a function f
 * (specified by function_name) must follow the following:
 *
 * The function 'f' must be a numerical function which takes N inputs
 * and produces M outputs. Its gradient function 'g', which is a
 * function taking N + M inputs and produces N outputs.
 *
 * I.e. if we have
 *    (y1, y2, ..., y_M) = f(x1, x2, ..., x_N),
 * then, g is
 *    (dL/dx1, dL/dx2, ..., dL/dx_N) = g(x1, x2, ..., x_N,
 *                                      dL/dy1, dL/dy2, ..., dL/dy_M),
 * where L is a scalar-value function of (x1, x2, ..., xN) (e.g., the
 * loss function). dL/dx_i is the partial derivative of L with respect
 * to x_i.
 * ```
 *
 * Protobuf type `uni_model_proto.GradientDef`
 */
public object GradientDefKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: graphdef.GradientDef.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: graphdef.GradientDef.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): graphdef.GradientDef = _builder.build()

    /**
     * ```
     * The function name.
     * ```
     *
     * `string function_name = 1;`
     */
    public var functionName: kotlin.String
      @JvmName("getFunctionName")
      get() = _builder.getFunctionName()
      @JvmName("setFunctionName")
      set(value) {
        _builder.setFunctionName(value)
      }
    /**
     * ```
     * The function name.
     * ```
     *
     * `string function_name = 1;`
     */
    public fun clearFunctionName() {
      _builder.clearFunctionName()
    }

    /**
     * ```
     * The gradient function's name.
     * ```
     *
     * `string gradient_func = 2;`
     */
    public var gradientFunc: kotlin.String
      @JvmName("getGradientFunc")
      get() = _builder.getGradientFunc()
      @JvmName("setGradientFunc")
      set(value) {
        _builder.setGradientFunc(value)
      }
    /**
     * ```
     * The gradient function's name.
     * ```
     *
     * `string gradient_func = 2;`
     */
    public fun clearGradientFunc() {
      _builder.clearGradientFunc()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun graphdef.GradientDef.copy(block: `graphdef`.GradientDefKt.Dsl.() -> kotlin.Unit): graphdef.GradientDef =
  `graphdef`.GradientDefKt.Dsl._create(this.toBuilder()).apply { block() }._build()

