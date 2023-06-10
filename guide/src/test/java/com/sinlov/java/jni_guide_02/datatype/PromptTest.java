package com.sinlov.java.jni_guide_02.datatype;

import org.junit.Test;

import static org.junit.Assert.*;

public class PromptTest {

    @Test
    public void getLine() {
        Prompt prompt = new Prompt();
        String line = prompt.getLine("foo");
        System.out.println("line = " + line);
        assertNotNull(line);
    }
}