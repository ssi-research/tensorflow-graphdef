# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: graphdef/attr_value.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import builder as _builder
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from graphdef import tensor_pb2 as graphdef_dot_tensor__pb2
from graphdef import tensor_shape_pb2 as graphdef_dot_tensor__shape__pb2
from graphdef import types_pb2 as graphdef_dot_types__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x19graphdef/attr_value.proto\x12\x0funi_model_proto\x1a\x15graphdef/tensor.proto\x1a\x1bgraphdef/tensor_shape.proto\x1a\x14graphdef/types.proto\"\xd3\x04\n\tAttrValue\x12\x0b\n\x01s\x18\x02 \x01(\x0cH\x00\x12\x0b\n\x01i\x18\x03 \x01(\x03H\x00\x12\x0b\n\x01\x66\x18\x04 \x01(\x02H\x00\x12\x0b\n\x01\x62\x18\x05 \x01(\x08H\x00\x12)\n\x04type\x18\x06 \x01(\x0e\x32\x19.uni_model_proto.DataTypeH\x00\x12\x32\n\x05shape\x18\x07 \x01(\x0b\x32!.uni_model_proto.TensorShapeProtoH\x00\x12.\n\x06tensor\x18\x08 \x01(\x0b\x32\x1c.uni_model_proto.TensorProtoH\x00\x12\x34\n\x04list\x18\x01 \x01(\x0b\x32$.uni_model_proto.AttrValue.ListValueH\x00\x12-\n\x04\x66unc\x18\n \x01(\x0b\x32\x1d.uni_model_proto.NameAttrListH\x00\x12\x15\n\x0bplaceholder\x18\t \x01(\tH\x00\x1a\xfd\x01\n\tListValue\x12\t\n\x01s\x18\x02 \x03(\x0c\x12\r\n\x01i\x18\x03 \x03(\x03\x42\x02\x10\x01\x12\r\n\x01\x66\x18\x04 \x03(\x02\x42\x02\x10\x01\x12\r\n\x01\x62\x18\x05 \x03(\x08\x42\x02\x10\x01\x12+\n\x04type\x18\x06 \x03(\x0e\x32\x19.uni_model_proto.DataTypeB\x02\x10\x01\x12\x30\n\x05shape\x18\x07 \x03(\x0b\x32!.uni_model_proto.TensorShapeProto\x12,\n\x06tensor\x18\x08 \x03(\x0b\x32\x1c.uni_model_proto.TensorProto\x12+\n\x04\x66unc\x18\t \x03(\x0b\x32\x1d.uni_model_proto.NameAttrListB\x07\n\x05value\"\x9c\x01\n\x0cNameAttrList\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x35\n\x04\x61ttr\x18\x02 \x03(\x0b\x32\'.uni_model_proto.NameAttrList.AttrEntry\x1aG\n\tAttrEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.uni_model_proto.AttrValue:\x02\x38\x01\x42s\n\x08graphdefB\x0f\x41ttrValueProtosP\x01ZQgithub.com/tensorflow/tensorflow/tensorflow/go/core/framework/attr_value_go_proto\xf8\x01\x01\x62\x06proto3')

_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, globals())
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'graphdef.attr_value_pb2', globals())
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\010graphdefB\017AttrValueProtosP\001ZQgithub.com/tensorflow/tensorflow/tensorflow/go/core/framework/attr_value_go_proto\370\001\001'
  _ATTRVALUE_LISTVALUE.fields_by_name['i']._options = None
  _ATTRVALUE_LISTVALUE.fields_by_name['i']._serialized_options = b'\020\001'
  _ATTRVALUE_LISTVALUE.fields_by_name['f']._options = None
  _ATTRVALUE_LISTVALUE.fields_by_name['f']._serialized_options = b'\020\001'
  _ATTRVALUE_LISTVALUE.fields_by_name['b']._options = None
  _ATTRVALUE_LISTVALUE.fields_by_name['b']._serialized_options = b'\020\001'
  _ATTRVALUE_LISTVALUE.fields_by_name['type']._options = None
  _ATTRVALUE_LISTVALUE.fields_by_name['type']._serialized_options = b'\020\001'
  _NAMEATTRLIST_ATTRENTRY._options = None
  _NAMEATTRLIST_ATTRENTRY._serialized_options = b'8\001'
  _ATTRVALUE._serialized_start=121
  _ATTRVALUE._serialized_end=716
  _ATTRVALUE_LISTVALUE._serialized_start=454
  _ATTRVALUE_LISTVALUE._serialized_end=707
  _NAMEATTRLIST._serialized_start=719
  _NAMEATTRLIST._serialized_end=875
  _NAMEATTRLIST_ATTRENTRY._serialized_start=804
  _NAMEATTRLIST_ATTRENTRY._serialized_end=875
# @@protoc_insertion_point(module_scope)
