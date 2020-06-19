package com.teo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        swapArrayDumb();
//        swapArraySmart();
//        printMaxElement();
//        printElementsDividableBy5();
//        int[] numbers = {6 , 3, 3, 4, 3, 6};
//        is6LeadingOrAtTheEnd(numbers);
//        checkArraysEqual();
//        checkArraysFirstElement();
        removeLetterA();
    }

    private static void removeLetterA() {
        Scanner console = new Scanner(System.in);
        String inputText = console.nextLine();
        String result = "";
        char[] inputChars = inputText.toCharArray();
        for (int i = 0; i < inputChars.length; i++) {
            if(inputChars[i] != 'a' && inputChars[i] != 'A') {
                result = result + inputChars[i];
            }
        }
        System.out.println(result);
    }

    private static void checkArraysFirstElement() {
        int[] arrayOne = {1, 2, 3, 4, 5, 4};
        int[] arrayTwo = {1, 21, 31, 41, 51, 61, 4};

        boolean isFirstElementEqual = arrayOne[0] == arrayTwo[0];
        boolean isLastElementEqual = arrayOne[arrayOne.length - 1] == arrayTwo[arrayTwo.length - 1];

        System.out.println(isFirstElementEqual || isLastElementEqual);
    }

    private static void checkArraysEqual() {
        Scanner console = new Scanner(System.in);
        int arrayASize = console.nextInt();
        int arrayBSize = console.nextInt();
        int[] arrayA = new int[arrayASize];
        int[] arrayB = new int[arrayBSize];

        for (int i = 0; i < arrayASize; i++) {
            arrayA[i] = console.nextInt();
        }

        for (int i = 0; i < arrayBSize; i++) {
            arrayB[i] = console.nextInt();
        }

        if(arrayASize != arrayBSize) {
            System.out.println("Arrays are NOT equal. They are different size.");
        } else {
            boolean areArraysEqual = true;
            for (int i = 0; i < arrayASize; i++) {
                if(arrayA[i] != arrayB[i]) {
                    areArraysEqual = false;
                    break;
                }
            }
            System.out.println("Arrays are equal: " + areArraysEqual);
        }
    }

    private static void is6LeadingOrAtTheEnd(int[] numbers) {
        boolean result =
                numbers[0] == 6 ||
                        numbers[numbers.length - 1] == 6;
        System.out.println(result);
    }

    private static void printElementsDividableBy5() {
        int[] numbersDividableBy5 = new int[20];
        for (int i = 0; i < numbersDividableBy5.length; i++) {
            numbersDividableBy5[i] = i * 5;
            System.out.println(numbersDividableBy5[i]);
        }
    }

    private static void printMaxElement() {
        int[] array = {43, 56, 4, 3, 6, 8, 43, 5, 7, 87, 4, 3, 5, 6};
        int maxElement = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if(maxElement < array[i]) {
                maxElement = array[i];
            }
        }

        System.out.println(maxElement);
    }

    private static void swapArraySmart() {
        int[] numbers = new int[10];
        int arrayLength = numbers.length;
        for (int index = 0; index < arrayLength; index++) {
            numbers[index] = index + 100;
        }

        for (int index = 0; index < arrayLength; index++) {
            int tempNumber = numbers[index];
            numbers[index] = numbers[arrayLength - 1 - index];
            numbers[arrayLength - 1 - index] = tempNumber;
        }

        for (int i = 0; i < arrayLength; i++) {
            System.out.println(numbers[i]);
        }
    }

    private static void swapArrayDumb() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        System.out.println(numbers[6]);

        int tempNumber = numbers[0];
        numbers[0] = numbers[6];
        numbers[6] = tempNumber;

        tempNumber = numbers[1];
        numbers[1] = numbers[5];
        numbers[5] = tempNumber;

        tempNumber = numbers[2];
        numbers[2] = numbers[4];
        numbers[4] = tempNumber;

        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        System.out.println(numbers[6]);
    }
}
