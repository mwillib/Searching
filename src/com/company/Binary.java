package com.company;

import java.util.Arrays;

public class Binary {
    public static void search(int[] array, int input) {
        System.out.println("Sorting Array...");
        Arrays.sort(array);

        System.out.println("Performing Binary Search...");
        int first = 0;
        int mid = 0;
        int last = array.length;
        boolean found = false;

        while (first <= last && !found) {
            mid = (first + last) / 2;
            if (array[mid] == input) {
                System.out.println(input + " Found at Index " + mid);
                found = true;
            } else if (array[mid] < input) {
                first = mid + 1;
            } else {
                last = mid - 1;
            }
        }
        if (!found) {
            System.out.println(input + " Not Found");
        }
    }
}
