package com.sinlov.java.jniguide.hello;

public class HelloWorld {
    public native void print();

    static {
        System.loadLibrary("hello");
    }
}
