package com.github.wololock.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

final class ToIntegerDecoder extends ByteToMessageDecoder {
  @Override
  protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
    if (in.readableBytes() > 4) {
      out.add(in.readInt());
    }
  }
}
