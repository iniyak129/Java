package org.ik.dsa;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Nested;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntArrayTest {

    int[] array = {5, 8, 10};
    IntArray testArray = new IntArray(array);

    @Test
    void shouldInitialiseArray() {
        assertEquals(3, testArray.getLength());
        assertEquals(array, testArray.getArray());
    }


    @Nested
    @DisplayName("Linear Search")
    class LinearSearch {
        @Test
        void shouldReturnIndexTwoForSequentiallySearchedElementTen() {
            int index = testArray.linearSearch(10);

            assertEquals(2, index);
        }

        @Test
        void shouldReturnMinusOneWhenSearchElementDoesNotExistInTheArray() {
            int index = testArray.linearSearch(1);

            assertEquals(-1, index);
        }
    }
}