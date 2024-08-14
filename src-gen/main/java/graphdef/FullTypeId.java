// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/full_type.proto

package graphdef;

/**
 * <pre>
 * Experimental. Represents the complete type information of a TensorFlow value.
 * </pre>
 *
 * Protobuf enum {@code uni_model_proto.FullTypeId}
 */
public enum FullTypeId
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * The default represents an uninitialized values.
   * </pre>
   *
   * <code>TFT_UNSET = 0;</code>
   */
  TFT_UNSET(0),
  /**
   * <pre>
   * Type variables may serve as placeholder for any other type ID in type
   * templates.
   * Examples:
   *   TFT_DATASET[TFT_VAR["T"]] is a Dataset returning a type indicated by "T".
   *   TFT_TENSOR[TFT_VAR["T"]] is a Tensor of n element type indicated by "T".
   *   TFT_TENSOR[TFT_VAR["T"]], TFT_TENSOR[TFT_VAR["T"]] are two tensors of
   *     identical element types.
   *   TFT_TENSOR[TFT_VAR["P"]], TFT_TENSOR[TFT_VAR["Q"]] are two tensors of
   *     potentially different element types.
   * </pre>
   *
   * <code>TFT_VAR = 1;</code>
   */
  TFT_VAR(1),
  /**
   * <pre>
   * Wildcard type. Describes a parameter of unknown type. In TensorFlow, that
   * can mean either a "Top" type (accepts any type), or a dynamically typed
   * object whose type is unknown in context.
   * Important: "unknown" does not necessarily mean undeterminable!
   * </pre>
   *
   * <code>TFT_ANY = 2;</code>
   */
  TFT_ANY(2),
  /**
   * <pre>
   * The algebraic product type. This is an algebraic type that may be used just
   * for logical grouping. Not to confused with TFT_TUPLE which describes a
   * concrete object of several elements.
   * Example:
   *   TFT_DATASET[TFT_PRODUCT[TFT_TENSOR[TFT_INT32], TFT_TENSOR[TFT_FLOAT64]]]
   *     is a Dataset producing two tensors, an integer one and a float one.
   * </pre>
   *
   * <code>TFT_PRODUCT = 3;</code>
   */
  TFT_PRODUCT(3),
  /**
   * <pre>
   * Callable types describe functions and ops.
   * Parametrization:
   *   TFT_CALLABLE[&lt;arg type&gt;, &lt;return type&gt;]
   *   * &lt;arg_type&gt; is the type of the arguments; TFT_PRODUCT represents
   *   multiple
   *     arguments.
   *   * &lt;return_type&gt; is the return type; TFT_PRODUCT represents multiple
   *     return values (that means that callables returning multiple things
   *     don't necessarily return a single tuple).
   * Example:
   *   TFT_CALLABLE[
   *     TFT_ANY,
   *     TFT_PRODUCT[TFT_TENSOR[TFT_INT32], TFT_TENSOR[TFT_FLOAT64]],
   *   ]
   *     is a callable with unspecified (for now) input arguments, and
   *     two return values of type tensor.
   * </pre>
   *
   * <code>TFT_CALLABLE = 100;</code>
   */
  TFT_CALLABLE(100),
  /**
   * <pre>
   * The usual Tensor. This is a parametric type.
   * Parametrization:
   *   TFT_TENSOR[&lt;element type&gt;, &lt;shape type&gt;]
   *   * &lt;element_type&gt; is currently limited to one of the element types
   *     defined below.
   *   * &lt;shape_type&gt; is not yet defined, and may only be TFT_UNKNOWN for now.
   * A TFT_SHAPE type will be defined in the future.
   * Example:
   *   TFT_TENSOR[TFT_INT32, TFT_UNKNOWN]
   *     is a Tensor of int32 element type and unknown shape.
   * TODO(mdan): Define TFT_SHAPE and add more examples.
   * </pre>
   *
   * <code>TFT_TENSOR = 1000;</code>
   */
  TFT_TENSOR(1000),
  /**
   * <pre>
   * Array (or tensorflow::TensorList in the variant type registry).
   * Note: this is not to be confused with the deprecated `TensorArray*` ops
   * which are not supported by FullType.
   * This type represents a random-access list whose elements can be
   * described by a single type. Although immutable, Array is expected to
   * support efficient mutation semantics (i.e. element update) in the
   * user-facing API.
   * The element type may be generic or even TFT_ANY for a heterogenous list.
   * Parametrization:
   *   TFT_ARRAY[&lt;element type&gt;]
   *   * &lt;element_type&gt; may be any concrete type.
   * Examples:
   *   TFT_ARRAY[TFT_TENSOR[TFT_INT32]] is a TensorArray holding int32 Tensors
   *     of any shape.
   *   TFT_ARRAY[TFT_TENSOR[TFT_UNKNOWN]] is a TensorArray holding Tensors of
   *     mixed element types.
   *   TFT_ARRAY[TFT_UNKNOWN] is a TensorArray holding any element type.
   *   TFT_ARRAY[] is equivalent to TFT_ARRAY[TFT_UNKNOWN].
   *   TFT_ARRAY[TFT_ARRAY[]] is an array or arrays (of unknown types).
   * </pre>
   *
   * <code>TFT_ARRAY = 1001;</code>
   */
  TFT_ARRAY(1001),
  /**
   * <pre>
   * Optional (or tensorflow::OptionalVariant in the variant type registry).
   * This type represents a value that may either hold an element of a single
   * specified type, or nothing at all.
   * Parametrization:
   *   TFT_OPTIONAL[&lt;element type&gt;]
   *   * &lt;element_type&gt; may be any concrete type.
   * Examples:
   *   TFT_OPTIONAL[TFT_TENSOR[TFT_INT32]] is an Optional holding an int32
   *     Tensor of any shape.
   * </pre>
   *
   * <code>TFT_OPTIONAL = 1002;</code>
   */
  TFT_OPTIONAL(1002),
  /**
   * <pre>
   * Datasets created by tf.data ops and APIs. Datasets have generator/iterable
   * semantics, that is, one can construct an iterator from them. Like
   * Array, they are considered to return elements that can be described
   * by a single type. Unlike Array, they do not support random access or
   * mutation, and can potentially produce an infinite number of elements.
   * A datasets can produce logical structures (e.g. multiple elements). This
   * is expressed using TFT_PRODUCT.
   * Parametrization: TFT_ARRAY[&lt;element type&gt;].
   * &lt;element_type&gt; may be a concrete type or a type symbol. It represents the
   *   data type of the elements produced by the dataset.
   * Examples:
   *   TFT_DATSET[TFT_TENSOR[TFT_INT32]] is a Dataset producing single int32
   *     Tensors of unknown shape.
   *   TFT_DATSET[TFT_PRODUCT[TFT_TENSOR[TFT_INT32], TFT_TENSOR[TFT_FLOAT32]] is
   *   a
   *     Dataset producing pairs of Tensors, one integer and one float.
   * Note: The high ID number is to prepare for the eventuality that Datasets
   * will be supported by user types in the future.
   * </pre>
   *
   * <code>TFT_DATASET = 10102;</code>
   */
  TFT_DATASET(10102),
  /**
   * <pre>
   * The bool element type.
   * TODO(mdan): Quantized types, legacy representations (e.g. ref)
   * </pre>
   *
   * <code>TFT_BOOL = 200;</code>
   */
  TFT_BOOL(200),
  /**
   * <pre>
   * Integer element types.
   * </pre>
   *
   * <code>TFT_UINT8 = 201;</code>
   */
  TFT_UINT8(201),
  /**
   * <code>TFT_UINT16 = 202;</code>
   */
  TFT_UINT16(202),
  /**
   * <code>TFT_UINT32 = 203;</code>
   */
  TFT_UINT32(203),
  /**
   * <code>TFT_UINT64 = 204;</code>
   */
  TFT_UINT64(204),
  /**
   * <code>TFT_INT8 = 205;</code>
   */
  TFT_INT8(205),
  /**
   * <code>TFT_INT16 = 206;</code>
   */
  TFT_INT16(206),
  /**
   * <code>TFT_INT32 = 207;</code>
   */
  TFT_INT32(207),
  /**
   * <code>TFT_INT64 = 208;</code>
   */
  TFT_INT64(208),
  /**
   * <pre>
   * Floating-point element types.
   * </pre>
   *
   * <code>TFT_HALF = 209;</code>
   */
  TFT_HALF(209),
  /**
   * <code>TFT_FLOAT = 210;</code>
   */
  TFT_FLOAT(210),
  /**
   * <code>TFT_DOUBLE = 211;</code>
   */
  TFT_DOUBLE(211),
  /**
   * <code>TFT_BFLOAT16 = 215;</code>
   */
  TFT_BFLOAT16(215),
  /**
   * <pre>
   * Complex element types.
   * TODO(mdan): Represent as TFT_COMPLEX[TFT_DOUBLE] instead?
   * </pre>
   *
   * <code>TFT_COMPLEX64 = 212;</code>
   */
  TFT_COMPLEX64(212),
  /**
   * <code>TFT_COMPLEX128 = 213;</code>
   */
  TFT_COMPLEX128(213),
  /**
   * <pre>
   * The string element type.
   * </pre>
   *
   * <code>TFT_STRING = 214;</code>
   */
  TFT_STRING(214),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * The default represents an uninitialized values.
   * </pre>
   *
   * <code>TFT_UNSET = 0;</code>
   */
  public static final int TFT_UNSET_VALUE = 0;
  /**
   * <pre>
   * Type variables may serve as placeholder for any other type ID in type
   * templates.
   * Examples:
   *   TFT_DATASET[TFT_VAR["T"]] is a Dataset returning a type indicated by "T".
   *   TFT_TENSOR[TFT_VAR["T"]] is a Tensor of n element type indicated by "T".
   *   TFT_TENSOR[TFT_VAR["T"]], TFT_TENSOR[TFT_VAR["T"]] are two tensors of
   *     identical element types.
   *   TFT_TENSOR[TFT_VAR["P"]], TFT_TENSOR[TFT_VAR["Q"]] are two tensors of
   *     potentially different element types.
   * </pre>
   *
   * <code>TFT_VAR = 1;</code>
   */
  public static final int TFT_VAR_VALUE = 1;
  /**
   * <pre>
   * Wildcard type. Describes a parameter of unknown type. In TensorFlow, that
   * can mean either a "Top" type (accepts any type), or a dynamically typed
   * object whose type is unknown in context.
   * Important: "unknown" does not necessarily mean undeterminable!
   * </pre>
   *
   * <code>TFT_ANY = 2;</code>
   */
  public static final int TFT_ANY_VALUE = 2;
  /**
   * <pre>
   * The algebraic product type. This is an algebraic type that may be used just
   * for logical grouping. Not to confused with TFT_TUPLE which describes a
   * concrete object of several elements.
   * Example:
   *   TFT_DATASET[TFT_PRODUCT[TFT_TENSOR[TFT_INT32], TFT_TENSOR[TFT_FLOAT64]]]
   *     is a Dataset producing two tensors, an integer one and a float one.
   * </pre>
   *
   * <code>TFT_PRODUCT = 3;</code>
   */
  public static final int TFT_PRODUCT_VALUE = 3;
  /**
   * <pre>
   * Callable types describe functions and ops.
   * Parametrization:
   *   TFT_CALLABLE[&lt;arg type&gt;, &lt;return type&gt;]
   *   * &lt;arg_type&gt; is the type of the arguments; TFT_PRODUCT represents
   *   multiple
   *     arguments.
   *   * &lt;return_type&gt; is the return type; TFT_PRODUCT represents multiple
   *     return values (that means that callables returning multiple things
   *     don't necessarily return a single tuple).
   * Example:
   *   TFT_CALLABLE[
   *     TFT_ANY,
   *     TFT_PRODUCT[TFT_TENSOR[TFT_INT32], TFT_TENSOR[TFT_FLOAT64]],
   *   ]
   *     is a callable with unspecified (for now) input arguments, and
   *     two return values of type tensor.
   * </pre>
   *
   * <code>TFT_CALLABLE = 100;</code>
   */
  public static final int TFT_CALLABLE_VALUE = 100;
  /**
   * <pre>
   * The usual Tensor. This is a parametric type.
   * Parametrization:
   *   TFT_TENSOR[&lt;element type&gt;, &lt;shape type&gt;]
   *   * &lt;element_type&gt; is currently limited to one of the element types
   *     defined below.
   *   * &lt;shape_type&gt; is not yet defined, and may only be TFT_UNKNOWN for now.
   * A TFT_SHAPE type will be defined in the future.
   * Example:
   *   TFT_TENSOR[TFT_INT32, TFT_UNKNOWN]
   *     is a Tensor of int32 element type and unknown shape.
   * TODO(mdan): Define TFT_SHAPE and add more examples.
   * </pre>
   *
   * <code>TFT_TENSOR = 1000;</code>
   */
  public static final int TFT_TENSOR_VALUE = 1000;
  /**
   * <pre>
   * Array (or tensorflow::TensorList in the variant type registry).
   * Note: this is not to be confused with the deprecated `TensorArray*` ops
   * which are not supported by FullType.
   * This type represents a random-access list whose elements can be
   * described by a single type. Although immutable, Array is expected to
   * support efficient mutation semantics (i.e. element update) in the
   * user-facing API.
   * The element type may be generic or even TFT_ANY for a heterogenous list.
   * Parametrization:
   *   TFT_ARRAY[&lt;element type&gt;]
   *   * &lt;element_type&gt; may be any concrete type.
   * Examples:
   *   TFT_ARRAY[TFT_TENSOR[TFT_INT32]] is a TensorArray holding int32 Tensors
   *     of any shape.
   *   TFT_ARRAY[TFT_TENSOR[TFT_UNKNOWN]] is a TensorArray holding Tensors of
   *     mixed element types.
   *   TFT_ARRAY[TFT_UNKNOWN] is a TensorArray holding any element type.
   *   TFT_ARRAY[] is equivalent to TFT_ARRAY[TFT_UNKNOWN].
   *   TFT_ARRAY[TFT_ARRAY[]] is an array or arrays (of unknown types).
   * </pre>
   *
   * <code>TFT_ARRAY = 1001;</code>
   */
  public static final int TFT_ARRAY_VALUE = 1001;
  /**
   * <pre>
   * Optional (or tensorflow::OptionalVariant in the variant type registry).
   * This type represents a value that may either hold an element of a single
   * specified type, or nothing at all.
   * Parametrization:
   *   TFT_OPTIONAL[&lt;element type&gt;]
   *   * &lt;element_type&gt; may be any concrete type.
   * Examples:
   *   TFT_OPTIONAL[TFT_TENSOR[TFT_INT32]] is an Optional holding an int32
   *     Tensor of any shape.
   * </pre>
   *
   * <code>TFT_OPTIONAL = 1002;</code>
   */
  public static final int TFT_OPTIONAL_VALUE = 1002;
  /**
   * <pre>
   * Datasets created by tf.data ops and APIs. Datasets have generator/iterable
   * semantics, that is, one can construct an iterator from them. Like
   * Array, they are considered to return elements that can be described
   * by a single type. Unlike Array, they do not support random access or
   * mutation, and can potentially produce an infinite number of elements.
   * A datasets can produce logical structures (e.g. multiple elements). This
   * is expressed using TFT_PRODUCT.
   * Parametrization: TFT_ARRAY[&lt;element type&gt;].
   * &lt;element_type&gt; may be a concrete type or a type symbol. It represents the
   *   data type of the elements produced by the dataset.
   * Examples:
   *   TFT_DATSET[TFT_TENSOR[TFT_INT32]] is a Dataset producing single int32
   *     Tensors of unknown shape.
   *   TFT_DATSET[TFT_PRODUCT[TFT_TENSOR[TFT_INT32], TFT_TENSOR[TFT_FLOAT32]] is
   *   a
   *     Dataset producing pairs of Tensors, one integer and one float.
   * Note: The high ID number is to prepare for the eventuality that Datasets
   * will be supported by user types in the future.
   * </pre>
   *
   * <code>TFT_DATASET = 10102;</code>
   */
  public static final int TFT_DATASET_VALUE = 10102;
  /**
   * <pre>
   * The bool element type.
   * TODO(mdan): Quantized types, legacy representations (e.g. ref)
   * </pre>
   *
   * <code>TFT_BOOL = 200;</code>
   */
  public static final int TFT_BOOL_VALUE = 200;
  /**
   * <pre>
   * Integer element types.
   * </pre>
   *
   * <code>TFT_UINT8 = 201;</code>
   */
  public static final int TFT_UINT8_VALUE = 201;
  /**
   * <code>TFT_UINT16 = 202;</code>
   */
  public static final int TFT_UINT16_VALUE = 202;
  /**
   * <code>TFT_UINT32 = 203;</code>
   */
  public static final int TFT_UINT32_VALUE = 203;
  /**
   * <code>TFT_UINT64 = 204;</code>
   */
  public static final int TFT_UINT64_VALUE = 204;
  /**
   * <code>TFT_INT8 = 205;</code>
   */
  public static final int TFT_INT8_VALUE = 205;
  /**
   * <code>TFT_INT16 = 206;</code>
   */
  public static final int TFT_INT16_VALUE = 206;
  /**
   * <code>TFT_INT32 = 207;</code>
   */
  public static final int TFT_INT32_VALUE = 207;
  /**
   * <code>TFT_INT64 = 208;</code>
   */
  public static final int TFT_INT64_VALUE = 208;
  /**
   * <pre>
   * Floating-point element types.
   * </pre>
   *
   * <code>TFT_HALF = 209;</code>
   */
  public static final int TFT_HALF_VALUE = 209;
  /**
   * <code>TFT_FLOAT = 210;</code>
   */
  public static final int TFT_FLOAT_VALUE = 210;
  /**
   * <code>TFT_DOUBLE = 211;</code>
   */
  public static final int TFT_DOUBLE_VALUE = 211;
  /**
   * <code>TFT_BFLOAT16 = 215;</code>
   */
  public static final int TFT_BFLOAT16_VALUE = 215;
  /**
   * <pre>
   * Complex element types.
   * TODO(mdan): Represent as TFT_COMPLEX[TFT_DOUBLE] instead?
   * </pre>
   *
   * <code>TFT_COMPLEX64 = 212;</code>
   */
  public static final int TFT_COMPLEX64_VALUE = 212;
  /**
   * <code>TFT_COMPLEX128 = 213;</code>
   */
  public static final int TFT_COMPLEX128_VALUE = 213;
  /**
   * <pre>
   * The string element type.
   * </pre>
   *
   * <code>TFT_STRING = 214;</code>
   */
  public static final int TFT_STRING_VALUE = 214;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static FullTypeId valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static FullTypeId forNumber(int value) {
    switch (value) {
      case 0: return TFT_UNSET;
      case 1: return TFT_VAR;
      case 2: return TFT_ANY;
      case 3: return TFT_PRODUCT;
      case 100: return TFT_CALLABLE;
      case 1000: return TFT_TENSOR;
      case 1001: return TFT_ARRAY;
      case 1002: return TFT_OPTIONAL;
      case 10102: return TFT_DATASET;
      case 200: return TFT_BOOL;
      case 201: return TFT_UINT8;
      case 202: return TFT_UINT16;
      case 203: return TFT_UINT32;
      case 204: return TFT_UINT64;
      case 205: return TFT_INT8;
      case 206: return TFT_INT16;
      case 207: return TFT_INT32;
      case 208: return TFT_INT64;
      case 209: return TFT_HALF;
      case 210: return TFT_FLOAT;
      case 211: return TFT_DOUBLE;
      case 215: return TFT_BFLOAT16;
      case 212: return TFT_COMPLEX64;
      case 213: return TFT_COMPLEX128;
      case 214: return TFT_STRING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<FullTypeId>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      FullTypeId> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FullTypeId>() {
          public FullTypeId findValueByNumber(int number) {
            return FullTypeId.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return graphdef.FullTypeProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final FullTypeId[] VALUES = values();

  public static FullTypeId valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private FullTypeId(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:uni_model_proto.FullTypeId)
}

