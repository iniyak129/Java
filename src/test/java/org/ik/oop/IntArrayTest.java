package org.ik.oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntArrayTest {
    int[] array = {1, 2, 3};
    IntArray testArray = new IntArray(array);

    @Test
    void shouldInitialiseArray(){
        assertEquals(3, testArray.getLength());
        assertEquals(array, testArray.getArray());
    }
}