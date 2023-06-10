package com.sinlov.java.jni_guide_02.datatype;

public class Prompt {
    // native method that prints a prompt and reads a line
    public native String getLine(String prompt);

    static {
        System.loadLibrary("datatype");
    }
}
