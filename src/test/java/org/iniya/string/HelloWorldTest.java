package org.iniya.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    HelloWorld helloWorld = new HelloWorld();

    @Test
    void testHelloWorld() {
        String actualResult = helloWorld.print();

        assertEquals("HELLO WORLD!!!", actualResult);
    }
}
