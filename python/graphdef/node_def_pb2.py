# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: graphdef/node_def.proto
# Protobuf Python Version: 4.25.3
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import symbol_database as _symbol_database
from google.protobuf.internal import builder as _builder
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from graphdef import attr_value_pb2 as graphdef_dot_attr__value__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x17graphdef/node_def.proto\x12\x0funi_model_proto\x1a\x19graphdef/attr_value.proto\"\xe1\x02\n\x07NodeDef\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\n\n\x02op\x18\x02 \x01(\t\x12\r\n\x05input\x18\x03 \x03(\t\x12\x0e\n\x06\x64\x65vice\x18\x04 \x01(\t\x12\x30\n\x04\x61ttr\x18\x05 \x03(\x0b\x32\".uni_model_proto.NodeDef.AttrEntry\x12O\n\x17\x65xperimental_debug_info\x18\x06 \x01(\x0b\x32..uni_model_proto.NodeDef.ExperimentalDebugInfo\x1aG\n\tAttrEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12)\n\x05value\x18\x02 \x01(\x0b\x32\x1a.uni_model_proto.AttrValue:\x02\x38\x01\x1aQ\n\x15\x45xperimentalDebugInfo\x12\x1b\n\x13original_node_names\x18\x01 \x03(\t\x12\x1b\n\x13original_func_names\x18\x02 \x03(\tBk\n\x08graphdefB\tNodeProtoP\x01ZOgithub.com/tensorflow/tensorflow/tensorflow/go/core/framework/node_def_go_proto\xf8\x01\x01\x62\x06proto3')

_globals = globals()
_builder.BuildMessageAndEnumDescriptors(DESCRIPTOR, _globals)
_builder.BuildTopDescriptorsAndMessages(DESCRIPTOR, 'graphdef.node_def_pb2', _globals)
if _descriptor._USE_C_DESCRIPTORS == False:
  _globals['DESCRIPTOR']._options = None
  _globals['DESCRIPTOR']._serialized_options = b'\n\010graphdefB\tNodeProtoP\001ZOgithub.com/tensorflow/tensorflow/tensorflow/go/core/framework/node_def_go_proto\370\001\001'
  _globals['_NODEDEF_ATTRENTRY']._options = None
  _globals['_NODEDEF_ATTRENTRY']._serialized_options = b'8\001'
  _globals['_NODEDEF']._serialized_start=72
  _globals['_NODEDEF']._serialized_end=425
  _globals['_NODEDEF_ATTRENTRY']._serialized_start=271
  _globals['_NODEDEF_ATTRENTRY']._serialized_end=342
  _globals['_NODEDEF_EXPERIMENTALDEBUGINFO']._serialized_start=344
  _globals['_NODEDEF_EXPERIMENTALDEBUGINFO']._serialized_end=425
# @@protoc_insertion_point(module_scope)
