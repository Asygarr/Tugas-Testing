package org.example;

import java.lang.System;

public class Main {
    public static void main(String[] args) {
        // manual testing 1
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 2;
        int result = binarySearch(array, target);

        if (result == 1) {
            System.out.println("Test case 1 passed");
        } else {
            System.out.println("Test case 1 failed");
        }

        // manual testing 2
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target2 = 11;
        int result2 = binarySearch(array2, target2);

        if (result2 == -1) {
            System.out.println("Test case 2 passed");
        } else {
            System.out.println("Test case 2 failed");
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target tidak ditemukan
    }
}