#!/usr/bin/env bash

DIR=.
PATH=../kotlin-native/dist/bin:$PATH

# -lcsfml-graphics -lcsfml-audio -lcsfml-window -lcsfml-network -lcsfml-system
LINKER_ARGS_linux="-L/usr/lib/x86_64-linux-gnu -lglfw -lGL"
LINKER_ARGS_macbook="-L/usr/local/lib -lglfw"

if [ x$TARGET == x ]; then
case "$OSTYPE" in
  darwin*)  TARGET=macbook ;;
  linux*)   TARGET=linux ;;
  *)        echo "unknown: $OSTYPE" && exit 1;;
esac
fi

var=CFLAGS_${TARGET}
CFLAGS=${!var}
var=LINKER_ARGS_${TARGET}
LINKER_ARGS=${!var}
var=COMPILER_ARGS_${TARGET}
COMPILER_ARGS=${!var} # add -opt for an optimized build.

konanc $COMPILER_ARGS -target $TARGET src -library glfw.klib -linker-options "$LINKER_ARGS" -o HelloGlfw.kexe -opt || exit 1
