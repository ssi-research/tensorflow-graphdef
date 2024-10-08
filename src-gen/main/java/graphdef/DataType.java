// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: graphdef/types.proto

// Protobuf Java Version: 3.25.3
package graphdef;

/**
 * <pre>
 * (== suppress_warning documentation-presence ==)
 * LINT.IfChange
 * </pre>
 *
 * Protobuf enum {@code uni_model_proto.DataType}
 */
public enum DataType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <pre>
   * Not a legal value for DataType.  Used to indicate a DataType field
   * has not been set.
   * </pre>
   *
   * <code>DT_INVALID = 0;</code>
   */
  DT_INVALID(0),
  /**
   * <pre>
   * Data types that all computation devices are expected to be
   * capable to support.
   * </pre>
   *
   * <code>DT_FLOAT = 1;</code>
   */
  DT_FLOAT(1),
  /**
   * <code>DT_DOUBLE = 2;</code>
   */
  DT_DOUBLE(2),
  /**
   * <code>DT_INT32 = 3;</code>
   */
  DT_INT32(3),
  /**
   * <code>DT_UINT8 = 4;</code>
   */
  DT_UINT8(4),
  /**
   * <code>DT_INT16 = 5;</code>
   */
  DT_INT16(5),
  /**
   * <code>DT_INT8 = 6;</code>
   */
  DT_INT8(6),
  /**
   * <code>DT_STRING = 7;</code>
   */
  DT_STRING(7),
  /**
   * <pre>
   * Single-precision complex
   * </pre>
   *
   * <code>DT_COMPLEX64 = 8;</code>
   */
  DT_COMPLEX64(8),
  /**
   * <code>DT_INT64 = 9;</code>
   */
  DT_INT64(9),
  /**
   * <code>DT_BOOL = 10;</code>
   */
  DT_BOOL(10),
  /**
   * <pre>
   * Quantized int8
   * </pre>
   *
   * <code>DT_QINT8 = 11;</code>
   */
  DT_QINT8(11),
  /**
   * <pre>
   * Quantized uint8
   * </pre>
   *
   * <code>DT_QUINT8 = 12;</code>
   */
  DT_QUINT8(12),
  /**
   * <pre>
   * Quantized int32
   * </pre>
   *
   * <code>DT_QINT32 = 13;</code>
   */
  DT_QINT32(13),
  /**
   * <pre>
   * Float32 truncated to 16 bits.  Only for cast ops.
   * </pre>
   *
   * <code>DT_BFLOAT16 = 14;</code>
   */
  DT_BFLOAT16(14),
  /**
   * <pre>
   * Quantized int16
   * </pre>
   *
   * <code>DT_QINT16 = 15;</code>
   */
  DT_QINT16(15),
  /**
   * <pre>
   * Quantized uint16
   * </pre>
   *
   * <code>DT_QUINT16 = 16;</code>
   */
  DT_QUINT16(16),
  /**
   * <code>DT_UINT16 = 17;</code>
   */
  DT_UINT16(17),
  /**
   * <pre>
   * Double-precision complex
   * </pre>
   *
   * <code>DT_COMPLEX128 = 18;</code>
   */
  DT_COMPLEX128(18),
  /**
   * <code>DT_HALF = 19;</code>
   */
  DT_HALF(19),
  /**
   * <code>DT_RESOURCE = 20;</code>
   */
  DT_RESOURCE(20),
  /**
   * <pre>
   * Arbitrary C++ data types
   * </pre>
   *
   * <code>DT_VARIANT = 21;</code>
   */
  DT_VARIANT(21),
  /**
   * <code>DT_UINT32 = 22;</code>
   */
  DT_UINT32(22),
  /**
   * <code>DT_UINT64 = 23;</code>
   */
  DT_UINT64(23),
  /**
   * <pre>
   * Do not use!  These are only for parameters.  Every enum above
   * should have a corresponding value below (verified by types_test).
   * </pre>
   *
   * <code>DT_FLOAT_REF = 101;</code>
   */
  DT_FLOAT_REF(101),
  /**
   * <code>DT_DOUBLE_REF = 102;</code>
   */
  DT_DOUBLE_REF(102),
  /**
   * <code>DT_INT32_REF = 103;</code>
   */
  DT_INT32_REF(103),
  /**
   * <code>DT_UINT8_REF = 104;</code>
   */
  DT_UINT8_REF(104),
  /**
   * <code>DT_INT16_REF = 105;</code>
   */
  DT_INT16_REF(105),
  /**
   * <code>DT_INT8_REF = 106;</code>
   */
  DT_INT8_REF(106),
  /**
   * <code>DT_STRING_REF = 107;</code>
   */
  DT_STRING_REF(107),
  /**
   * <code>DT_COMPLEX64_REF = 108;</code>
   */
  DT_COMPLEX64_REF(108),
  /**
   * <code>DT_INT64_REF = 109;</code>
   */
  DT_INT64_REF(109),
  /**
   * <code>DT_BOOL_REF = 110;</code>
   */
  DT_BOOL_REF(110),
  /**
   * <code>DT_QINT8_REF = 111;</code>
   */
  DT_QINT8_REF(111),
  /**
   * <code>DT_QUINT8_REF = 112;</code>
   */
  DT_QUINT8_REF(112),
  /**
   * <code>DT_QINT32_REF = 113;</code>
   */
  DT_QINT32_REF(113),
  /**
   * <code>DT_BFLOAT16_REF = 114;</code>
   */
  DT_BFLOAT16_REF(114),
  /**
   * <code>DT_QINT16_REF = 115;</code>
   */
  DT_QINT16_REF(115),
  /**
   * <code>DT_QUINT16_REF = 116;</code>
   */
  DT_QUINT16_REF(116),
  /**
   * <code>DT_UINT16_REF = 117;</code>
   */
  DT_UINT16_REF(117),
  /**
   * <code>DT_COMPLEX128_REF = 118;</code>
   */
  DT_COMPLEX128_REF(118),
  /**
   * <code>DT_HALF_REF = 119;</code>
   */
  DT_HALF_REF(119),
  /**
   * <code>DT_RESOURCE_REF = 120;</code>
   */
  DT_RESOURCE_REF(120),
  /**
   * <code>DT_VARIANT_REF = 121;</code>
   */
  DT_VARIANT_REF(121),
  /**
   * <code>DT_UINT32_REF = 122;</code>
   */
  DT_UINT32_REF(122),
  /**
   * <code>DT_UINT64_REF = 123;</code>
   */
  DT_UINT64_REF(123),
  UNRECOGNIZED(-1),
  ;

  /**
   * <pre>
   * Not a legal value for DataType.  Used to indicate a DataType field
   * has not been set.
   * </pre>
   *
   * <code>DT_INVALID = 0;</code>
   */
  public static final int DT_INVALID_VALUE = 0;
  /**
   * <pre>
   * Data types that all computation devices are expected to be
   * capable to support.
   * </pre>
   *
   * <code>DT_FLOAT = 1;</code>
   */
  public static final int DT_FLOAT_VALUE = 1;
  /**
   * <code>DT_DOUBLE = 2;</code>
   */
  public static final int DT_DOUBLE_VALUE = 2;
  /**
   * <code>DT_INT32 = 3;</code>
   */
  public static final int DT_INT32_VALUE = 3;
  /**
   * <code>DT_UINT8 = 4;</code>
   */
  public static final int DT_UINT8_VALUE = 4;
  /**
   * <code>DT_INT16 = 5;</code>
   */
  public static final int DT_INT16_VALUE = 5;
  /**
   * <code>DT_INT8 = 6;</code>
   */
  public static final int DT_INT8_VALUE = 6;
  /**
   * <code>DT_STRING = 7;</code>
   */
  public static final int DT_STRING_VALUE = 7;
  /**
   * <pre>
   * Single-precision complex
   * </pre>
   *
   * <code>DT_COMPLEX64 = 8;</code>
   */
  public static final int DT_COMPLEX64_VALUE = 8;
  /**
   * <code>DT_INT64 = 9;</code>
   */
  public static final int DT_INT64_VALUE = 9;
  /**
   * <code>DT_BOOL = 10;</code>
   */
  public static final int DT_BOOL_VALUE = 10;
  /**
   * <pre>
   * Quantized int8
   * </pre>
   *
   * <code>DT_QINT8 = 11;</code>
   */
  public static final int DT_QINT8_VALUE = 11;
  /**
   * <pre>
   * Quantized uint8
   * </pre>
   *
   * <code>DT_QUINT8 = 12;</code>
   */
  public static final int DT_QUINT8_VALUE = 12;
  /**
   * <pre>
   * Quantized int32
   * </pre>
   *
   * <code>DT_QINT32 = 13;</code>
   */
  public static final int DT_QINT32_VALUE = 13;
  /**
   * <pre>
   * Float32 truncated to 16 bits.  Only for cast ops.
   * </pre>
   *
   * <code>DT_BFLOAT16 = 14;</code>
   */
  public static final int DT_BFLOAT16_VALUE = 14;
  /**
   * <pre>
   * Quantized int16
   * </pre>
   *
   * <code>DT_QINT16 = 15;</code>
   */
  public static final int DT_QINT16_VALUE = 15;
  /**
   * <pre>
   * Quantized uint16
   * </pre>
   *
   * <code>DT_QUINT16 = 16;</code>
   */
  public static final int DT_QUINT16_VALUE = 16;
  /**
   * <code>DT_UINT16 = 17;</code>
   */
  public static final int DT_UINT16_VALUE = 17;
  /**
   * <pre>
   * Double-precision complex
   * </pre>
   *
   * <code>DT_COMPLEX128 = 18;</code>
   */
  public static final int DT_COMPLEX128_VALUE = 18;
  /**
   * <code>DT_HALF = 19;</code>
   */
  public static final int DT_HALF_VALUE = 19;
  /**
   * <code>DT_RESOURCE = 20;</code>
   */
  public static final int DT_RESOURCE_VALUE = 20;
  /**
   * <pre>
   * Arbitrary C++ data types
   * </pre>
   *
   * <code>DT_VARIANT = 21;</code>
   */
  public static final int DT_VARIANT_VALUE = 21;
  /**
   * <code>DT_UINT32 = 22;</code>
   */
  public static final int DT_UINT32_VALUE = 22;
  /**
   * <code>DT_UINT64 = 23;</code>
   */
  public static final int DT_UINT64_VALUE = 23;
  /**
   * <pre>
   * Do not use!  These are only for parameters.  Every enum above
   * should have a corresponding value below (verified by types_test).
   * </pre>
   *
   * <code>DT_FLOAT_REF = 101;</code>
   */
  public static final int DT_FLOAT_REF_VALUE = 101;
  /**
   * <code>DT_DOUBLE_REF = 102;</code>
   */
  public static final int DT_DOUBLE_REF_VALUE = 102;
  /**
   * <code>DT_INT32_REF = 103;</code>
   */
  public static final int DT_INT32_REF_VALUE = 103;
  /**
   * <code>DT_UINT8_REF = 104;</code>
   */
  public static final int DT_UINT8_REF_VALUE = 104;
  /**
   * <code>DT_INT16_REF = 105;</code>
   */
  public static final int DT_INT16_REF_VALUE = 105;
  /**
   * <code>DT_INT8_REF = 106;</code>
   */
  public static final int DT_INT8_REF_VALUE = 106;
  /**
   * <code>DT_STRING_REF = 107;</code>
   */
  public static final int DT_STRING_REF_VALUE = 107;
  /**
   * <code>DT_COMPLEX64_REF = 108;</code>
   */
  public static final int DT_COMPLEX64_REF_VALUE = 108;
  /**
   * <code>DT_INT64_REF = 109;</code>
   */
  public static final int DT_INT64_REF_VALUE = 109;
  /**
   * <code>DT_BOOL_REF = 110;</code>
   */
  public static final int DT_BOOL_REF_VALUE = 110;
  /**
   * <code>DT_QINT8_REF = 111;</code>
   */
  public static final int DT_QINT8_REF_VALUE = 111;
  /**
   * <code>DT_QUINT8_REF = 112;</code>
   */
  public static final int DT_QUINT8_REF_VALUE = 112;
  /**
   * <code>DT_QINT32_REF = 113;</code>
   */
  public static final int DT_QINT32_REF_VALUE = 113;
  /**
   * <code>DT_BFLOAT16_REF = 114;</code>
   */
  public static final int DT_BFLOAT16_REF_VALUE = 114;
  /**
   * <code>DT_QINT16_REF = 115;</code>
   */
  public static final int DT_QINT16_REF_VALUE = 115;
  /**
   * <code>DT_QUINT16_REF = 116;</code>
   */
  public static final int DT_QUINT16_REF_VALUE = 116;
  /**
   * <code>DT_UINT16_REF = 117;</code>
   */
  public static final int DT_UINT16_REF_VALUE = 117;
  /**
   * <code>DT_COMPLEX128_REF = 118;</code>
   */
  public static final int DT_COMPLEX128_REF_VALUE = 118;
  /**
   * <code>DT_HALF_REF = 119;</code>
   */
  public static final int DT_HALF_REF_VALUE = 119;
  /**
   * <code>DT_RESOURCE_REF = 120;</code>
   */
  public static final int DT_RESOURCE_REF_VALUE = 120;
  /**
   * <code>DT_VARIANT_REF = 121;</code>
   */
  public static final int DT_VARIANT_REF_VALUE = 121;
  /**
   * <code>DT_UINT32_REF = 122;</code>
   */
  public static final int DT_UINT32_REF_VALUE = 122;
  /**
   * <code>DT_UINT64_REF = 123;</code>
   */
  public static final int DT_UINT64_REF_VALUE = 123;


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
  public static DataType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DataType forNumber(int value) {
    switch (value) {
      case 0: return DT_INVALID;
      case 1: return DT_FLOAT;
      case 2: return DT_DOUBLE;
      case 3: return DT_INT32;
      case 4: return DT_UINT8;
      case 5: return DT_INT16;
      case 6: return DT_INT8;
      case 7: return DT_STRING;
      case 8: return DT_COMPLEX64;
      case 9: return DT_INT64;
      case 10: return DT_BOOL;
      case 11: return DT_QINT8;
      case 12: return DT_QUINT8;
      case 13: return DT_QINT32;
      case 14: return DT_BFLOAT16;
      case 15: return DT_QINT16;
      case 16: return DT_QUINT16;
      case 17: return DT_UINT16;
      case 18: return DT_COMPLEX128;
      case 19: return DT_HALF;
      case 20: return DT_RESOURCE;
      case 21: return DT_VARIANT;
      case 22: return DT_UINT32;
      case 23: return DT_UINT64;
      case 101: return DT_FLOAT_REF;
      case 102: return DT_DOUBLE_REF;
      case 103: return DT_INT32_REF;
      case 104: return DT_UINT8_REF;
      case 105: return DT_INT16_REF;
      case 106: return DT_INT8_REF;
      case 107: return DT_STRING_REF;
      case 108: return DT_COMPLEX64_REF;
      case 109: return DT_INT64_REF;
      case 110: return DT_BOOL_REF;
      case 111: return DT_QINT8_REF;
      case 112: return DT_QUINT8_REF;
      case 113: return DT_QINT32_REF;
      case 114: return DT_BFLOAT16_REF;
      case 115: return DT_QINT16_REF;
      case 116: return DT_QUINT16_REF;
      case 117: return DT_UINT16_REF;
      case 118: return DT_COMPLEX128_REF;
      case 119: return DT_HALF_REF;
      case 120: return DT_RESOURCE_REF;
      case 121: return DT_VARIANT_REF;
      case 122: return DT_UINT32_REF;
      case 123: return DT_UINT64_REF;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DataType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      DataType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<DataType>() {
          public DataType findValueByNumber(int number) {
            return DataType.forNumber(number);
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
    return graphdef.TypesProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final DataType[] VALUES = values();

  public static DataType valueOf(
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

  private DataType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:uni_model_proto.DataType)
}

