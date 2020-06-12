package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        printNumbersFrom1To10();
//        printNumbersWithLoop();
//        enterNumbersWithWhile();
//        enterNumbersWithDoWhile();
//        sumNumbers();
//        testBreak();
//        enterNumbersWithWhileAndBreak();
//        testContinue();
//        printEvenTo(100);
//        sumFromTo(2, 10);
//        printFactoriel(5);
//        printAllDividableBy2And3(10, 30);
//        playGuessingGame();
        printText(10);
    }

    private static void printText(int limit) {
        int counter = 0;
        while (counter < limit) {
            System.out.print("text");
            counter++;
        }
    }

    private static void playGuessingGame() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(20) + 1;
        Scanner console = new Scanner(System.in);
        int userGuessNumber;
        do {
            System.out.println("Please, enter number:");
            userGuessNumber = console.nextInt();
        } while(userGuessNumber != randomNumber);
        System.out.println("Congrats!");
    }

    private static void printAllDividableBy2And3(int lowerLimit, int upperLimit) {
        int counter = lowerLimit;
        while (counter <= upperLimit) {
            if(counter % 6 == 0) {
                System.out.println(counter);
            }
            counter++;
        }
    }

    private static void printFactoriel(int number) {
        int counter = 1;
        int product = 1;
        while (counter <= number) {
            product = product * counter;
            counter++;
        }
        System.out.println(product);
    }

    private static void sumFromTo(int lowerLimt, int upperLimit) {
        int counter = lowerLimt;
        int sum = 0;
        while (counter <= upperLimit) {
            sum += counter;
            counter++;
        }
        System.out.println("Sum of from " + lowerLimt + " to " + upperLimit + " is " + sum);
    }

    private static void printEvenTo(int limit) {
        int counter = 1;
        while (counter <= limit) {
            if (counter % 2 == 0) System.out.println(counter);
            counter++;
        }
    }

    private static void testContinue() {
        int counter = 0;
        while (counter < 20) {
            counter++;
            System.out.println("Test:" + counter);
            if (counter % 2 == 0) {
                continue;
            }
            System.out.println("continue not called: " + counter);
        }
    }

    private static void enterNumbersWithWhileAndBreak() {
        Scanner console = new Scanner(System.in);
        int number = -1;
        while (true) {
            number = console.nextInt();
            System.out.println("Въведено число:" + number);

            if (number == 0) {
                break;
            }
        }
    }

    private static void testBreak() {
        while (true) {
            System.out.println("Едно нещо");
            break;
        }
    }

    private static void sumNumbers() {
        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int sum = sumNumbersFrom1To(n);
        System.out.println("Sum is " + sum);
    }

    private static int sumNumbersFrom1To(int n) {
        int sum = 0;
        int counter = 1;
        while (counter <= n) {
            sum = sum + counter;
            counter++;
        }
        return sum;
    }

    private static void enterNumbersWithDoWhile() {
        Scanner console = new Scanner(System.in);
        int number;
        do {
            number = console.nextInt();
            System.out.println("Въведено число:" + number);
        } while (number != 0);
    }

    private static void enterNumbersWithWhile() {
        Scanner console = new Scanner(System.in);
        int number = -1;
        while (number != 0) {
            number = console.nextInt();
            System.out.println("Въведено число:" + number);
        }
    }

    private static void printNumbersWithLoop() {
        int counter = 1;
        while (counter <= 10) {
            System.out.println(counter);
            counter++;
        }
    }

    private static void printNumbersFrom1To10() {
        int counter = 1;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
    }
}
