package org.test;

import org.example.Main;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Testing {

    @Test
    public void testBinarySearch() {
        int[] array = {2, 3, 4, 10, 40};
        int target = 10;
        int expected = 3;
        assertEquals(expected, Main.binarySearch(array, target));

        array = new int[]{1, 2, 3, 4, 5};
        target = 3;
        expected = 2;
        assertEquals(expected, Main.binarySearch(array, target));

        array = new int[]{1, 2, 3, 4, 5};
        target = 6;
        expected = -1;
        assertEquals(expected, Main.binarySearch(array, target));
    }
}
