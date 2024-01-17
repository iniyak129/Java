package org.ik.dsa;

public class IntArray implements Array {
    private final int[] array;
    private final int length;

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

    int linearSearch(int searchKey) {
        for (int i = 0; i < length; i++) {
            if (array[i] == searchKey) {
                return i;
            }
        }
        return -1;
    }
}
