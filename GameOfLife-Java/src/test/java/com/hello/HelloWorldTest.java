package com.hello;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayIt() {
        HelloWorld hw = new HelloWorld();

        assertEquals("Hello World", hw.sayIt());
    }
}