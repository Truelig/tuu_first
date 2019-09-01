package com.luban.nio;

import io.netty.buffer.ByteBuf;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;

public class Demo10 {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getLocalHost().getAddress() );
        byte[] bytes="taibai".getBytes();
        ByteBuffer bf = ByteBuffer.wrap(bytes);
        ByteBuf byteBuf = null;
        for (int i = 0; i <bf.capacity() ; i++) {

            System.out.println( bf.get());
        }
    }
}
