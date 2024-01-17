package org.ik.oop;

public class IntArray implements Array {

    private final int length;
    private final int[] array;

    IntArray(int[] array) {
        this.length = array.length;
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public int getLength() {
        return length;
    }
}
