# TensorFlow GraphDef

This repository contains the protobuf files copied from TensorFlow, specifically `NodeDef`, `GraphDef`, and related definitions. We run `protoc` to generate Java and Python files from these protobuf definitions, and the build scripts allow us to publish the generated source files to Maven Central and PyPI.

## Overview

The `tensorflow-graphdef` project provides lightweight Java and Python libraries containing the protobuf definitions from TensorFlow. These libraries are much lighter compared to the full TensorFlow library, which includes the runtime and many other components.

## Proto Files Included

The following protobuf files are included in this repository:

- `attr_value.proto`
- `full_type.proto`
- `function.proto`
- `graph.proto`
- `node_def.proto`
- `op_def.proto`
- `resource_handle.proto`
- `tensor.proto`
- `tensor_shape.proto`
- `types.proto`
- `versions.proto`

## Features

- Contains only the necessary protobuf definitions from TensorFlow.
- Lightweight compared to the full TensorFlow distribution.
- Supports both Java and Python.
- Source files are published to Maven Central and PyPI for easy integration.