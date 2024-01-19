package org.ik.dsa;

public class IntArray {
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

    int binarySearch(int searchKey) {
        int low = 0, high = length - 1;
        while (high >= low) {
            int mid = low + (high - low) / 2;
            if (array[mid] == searchKey)
                return mid;
            else if (array[mid] > searchKey)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
