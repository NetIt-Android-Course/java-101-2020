package com.teo;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Sorts {

    public static void main(String[] args) {

//        int[] numbers = {2, 5, 8, 1, 3, 4, 10, 7 ,9, 6};
        int[] numbers = new int[100000];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }
        shuffleArray(numbers);

        long startTimestamp = System.currentTimeMillis();
//        int[] results = sortByBubbleSort(numbers); //26053
//        int[] results = sortBySelectionSort(numbers); //12661
//        int[] results = sortByBubbleSortOptimized(numbers); //21214
        int[] results = sortByInsertionSort(numbers); //4207
        System.out.println("Execution time: " + (System.currentTimeMillis() - startTimestamp));

//        System.out.println(Arrays.toString(results));
    }

    private static int[] sortByInsertionSort(int[] num) {
        for (int i = 1; i < num.length; i++) {
            int j = i;
            int temp;
            while (j > 0 && num[j - 1] > num[j]) {
                temp = num[j - 1];
                num[j - 1] = num[j];
                num[j] = temp;
                j--;
            }
        }
        return num;
    }

    private static int[] sortByBubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        }
        return numbers;
    }

    private static int[] sortByBubbleSortOptimized(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int swap = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = swap;
                }
            }
        }
        return numbers;
    }

    private static int[] sortBySelectionSort(int[] numbers) {
        int[] results = new int[numbers.length];

        for (int resultsIndex = 0; resultsIndex < results.length; resultsIndex++) {

            int minNumber = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (minNumber > numbers[i]) {
                    minNumber = numbers[i];
                    minIndex = i;
                }
            }
            numbers[minIndex] = Integer.MAX_VALUE;
            results[resultsIndex] = minNumber;
        }
        return results;
    }

    static void shuffleArray(int[] ar) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            int a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}
