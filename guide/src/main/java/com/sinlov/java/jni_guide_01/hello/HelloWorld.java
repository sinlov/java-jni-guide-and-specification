package com.sinlov.java.jni_guide_01.hello;

public class HelloWorld {
    public native void print();

    static {
        System.loadLibrary("hello");
    }
}
