package com.company;

public class Linear {

    public static void search(int[] array, int input) {
        System.out.println("Performing Linear Search...");
        int found = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == input) {
                found++;
            }
        }
        System.out.println(input + " Found " + found + " Times");
    }
}
