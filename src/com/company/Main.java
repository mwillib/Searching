package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Creating a Scanner to set the Array's Length
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Array Length:");
        int arrayLength = scanner.nextInt();
        int[] array = new int[arrayLength];

        //Getting an Input
        System.out.println("What would you like to search for?");
        int input = scanner.nextInt();

        //Creating a New Random Array for each sort.
        for(int i = 0; i < arrayLength; i++){
            array[i] = (int) (Math.random()*100);
        }

        //Doing both searches
        Linear.search(array, input);
        Binary.search(array, input);

    }
}
