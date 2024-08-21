# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: graphdef/function.proto
# Protobuf Python Version: 4.25.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from graphdef import attr_value_pb2 as graphdef_dot_attr__value__pb2
from graphdef import node_def_pb2 as graphdef_dot_node__def__pb2
from graphdef import op_def_pb2 as graphdef_dot_op__def__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17graphdef/function.proto\x12\x0funi_model_proto\x1a\x19graphdef/attr_value.proto\x1a\x17graphdef/node_def.proto\x1a\x15graphdef/op_def.proto\"\xb7\x01\n\x12\x46unctionDefLibrary\x12.\n\x08\x66unction\x18\x01 \x03(\x0b\x32\x1c.uni_model_proto.FunctionDef\x12.\n\x08gradient\x18\x02 \x03(\x0b\x32\x1c.uni_model_proto.GradientDef\x12\x41\n\x14registered_gradients\x18\x03 \x03(\x0b\x32#.uni_model_proto.RegisteredGradient\"\xfb\x06\n\x0b\x46unctionDef\x12)\n\tsignature\x18\x01 \x01(\x0b\x32\x16.uni_model_proto.OpDef\x12\x34\n\x04\x61ttr\x18\x05 \x03(\x0b\x32&.uni_model_proto.FunctionDef.AttrEntry\x12;\n\x08\x61rg_attr\x18\x07 \x03(\x0b\x32).uni_model_proto.FunctionDef.ArgAttrEntry\x12U\n\x16resource_arg_unique_id\x18\x08 \x03(\x0b\x32\x35.uni_model_proto.FunctionDef.ResourceArgUniqueIdEntry\x12*\n\x08node_def\x18\x03 \x03(\x0b\x32\x18.uni_model_proto.NodeDef\x12\x32\n\x03ret\x18\x04 \x03(\x0b\x32%.uni_model_proto.FunctionDef.RetEntry\x12\x41\n\x0b\x63ontrol_ret\x18\x06 \x03(\x0b\x32,.uni_model_proto.FunctionDef.ControlRetEntry\x1aG\n\tAttrEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.uni_model_proto.AttrValue:\x02\x38\x01\x1a\x92\x01\n\x08\x41rgAttrs\x12=\n\x04\x61ttr\x18\x01 \x03(\x0b\x32/.uni_model_proto.FunctionDef.ArgAttrs.AttrEntry\x1aG\n\tAttrEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.uni_model_proto.AttrValue:\x02\x38\x01\x1aU\n\x0c\x41rgAttrEntry\x12\x0b\n\x03key\x18\x01 \x01(\r\x12\x34\n\x05value\x18\x02 \x01(\x0b\x32%.uni_model_proto.FunctionDef.ArgAttrs:\x02\x38\x01\x1a:\n\x18ResourceArgUniqueIdEntry\x12\x0b\n\x03key\x18\x01 \x01(\r\x12\r\n\x05value\x18\x02 \x01(\r:\x02\x38\x01\x1a*\n\x08RetEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01\x1a\x31\n\x0f\x43ontrolRetEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01J\x04\x08\x02\x10\x03\";\n\x0bGradientDef\x12\x15\n\rfunction_name\x18\x01 \x01(\t\x12\x15\n\rgradient_func\x18\x02 \x01(\t\"G\n\x12RegisteredGradient\x12\x15\n\rgradient_func\x18\x01 \x01(\t\x12\x1a\n\x12registered_op_type\x18\x02 \x01(\tBp\n\x08graphdefB\x0e\x46unctionProtosP\x01ZOgithub.com/tensorflow/tensorflow/tensorflow/go/core/framework/function_go_proto\xf8\x01\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'graphdef.function_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\010graphdefB\016FunctionProtosP\001ZOgithub.com/tensorflow/tensorflow/tensorflow/go/core/framework/function_go_proto\370\001\001'
  _globals['_FUNCTIONDEF_ATTRENTRY']._options = None
  _globals['_FUNCTIONDEF_ATTRENTRY']._serialized_options = b'8\001'
  _globals['_FUNCTIONDEF_ARGATTRS_ATTRENTRY']._options = None
  _globals['_FUNCTIONDEF_ARGATTRS_ATTRENTRY']._serialized_options = b'8\001'
  _globals['_FUNCTIONDEF_ARGATTRENTRY']._options = None
  _globals['_FUNCTIONDEF_ARGATTRENTRY']._serialized_options = b'8\001'
  _globals['_FUNCTIONDEF_RESOURCEARGUNIQUEIDENTRY']._options = None
  _globals['_FUNCTIONDEF_RESOURCEARGUNIQUEIDENTRY']._serialized_options = b'8\001'
  _globals['_FUNCTIONDEF_RETENTRY']._options = None
  _globals['_FUNCTIONDEF_RETENTRY']._serialized_options = b'8\001'
  _globals['_FUNCTIONDEF_CONTROLRETENTRY']._options = None
  _globals['_FUNCTIONDEF_CONTROLRETENTRY']._serialized_options = b'8\001'
  _globals['_FUNCTIONDEFLIBRARY']._serialized_start=120
  _globals['_FUNCTIONDEFLIBRARY']._serialized_end=303
  _globals['_FUNCTIONDEF']._serialized_start=306
  _globals['_FUNCTIONDEF']._serialized_end=1197
  _globals['_FUNCTIONDEF_ATTRENTRY']._serialized_start=729
  _globals['_FUNCTIONDEF_ATTRENTRY']._serialized_end=800
  _globals['_FUNCTIONDEF_ARGATTRS']._serialized_start=803
  _globals['_FUNCTIONDEF_ARGATTRS']._serialized_end=949
  _globals['_FUNCTIONDEF_ARGATTRS_ATTRENTRY']._serialized_start=729
  _globals['_FUNCTIONDEF_ARGATTRS_ATTRENTRY']._serialized_end=800
  _globals['_FUNCTIONDEF_ARGATTRENTRY']._serialized_start=951
  _globals['_FUNCTIONDEF_ARGATTRENTRY']._serialized_end=1036
  _globals['_FUNCTIONDEF_RESOURCEARGUNIQUEIDENTRY']._serialized_start=1038
  _globals['_FUNCTIONDEF_RESOURCEARGUNIQUEIDENTRY']._serialized_end=1096
  _globals['_FUNCTIONDEF_RETENTRY']._serialized_start=1098
  _globals['_FUNCTIONDEF_RETENTRY']._serialized_end=1140
  _globals['_FUNCTIONDEF_CONTROLRETENTRY']._serialized_start=1142
  _globals['_FUNCTIONDEF_CONTROLRETENTRY']._serialized_end=1191
  _globals['_GRADIENTDEF']._serialized_start=1199
  _globals['_GRADIENTDEF']._serialized_end=1258
  _globals['_REGISTEREDGRADIENT']._serialized_start=1260
  _globals['_REGISTEREDGRADIENT']._serialized_end=1331
# @@protoc_insertion_point(module_scope)
