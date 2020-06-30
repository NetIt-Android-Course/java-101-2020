package com.teo;

import java.util.Scanner;

public class VendingPricing {

    static final int CODE_EXIT = 0;
    static final int CODE_WHISKEY = 1;
    static final int CODE_VODKA = 2;
    static final int CODE_JIN = 3;
    static final int CODE_RAKIA = 4;
    static final int CODE_SIDER = 10;

    static int[] drinkCodes = {
            CODE_WHISKEY, CODE_VODKA, CODE_JIN, CODE_RAKIA, CODE_SIDER
    };
    static String[] drinkNames = {
            "уиски", "водка", "джин", "ракия", "сайдер"
    };
    static double[] drinkPrices = {
            4.50, 2.50, 3, 2, 1.10
    };


    public static void main(String[] args) {
        startVendingMachine();
    }

    private static void startVendingMachine() {
        print("Моля, въведете възрастта си за да продъжлите.");
        int age = getValidAgeFromUser();
        if (age < 18) {
            print("Не може.");
            return;
        }
        printDrinkInformation();

        double orderSum = 0;
        print("Моля, въведете код на напитка. Ако искате да завършите поръчката, въведете 0.");
        int enteredCode = getValidDrinkCodeFromUser();
        while (enteredCode != CODE_EXIT) {
            orderSum = orderSum + drinkPrices[getDrinkIndexFromCode(enteredCode)];
            printDrinkOrder(enteredCode);
            printOrderSummary(orderSum);
            print("Моля, въведете код на напитка. Ако искате да завършите поръчката, въведете 0.");
            enteredCode = getValidDrinkCodeFromUser();
        }
    }

    private static void printOrderSummary(double orderSum) {
        print("Вашата сметка до момента е " + orderSum);
    }

    private static void printDrinkOrder(int drinkCode) {
        int drinkIndex = getDrinkIndexFromCode(drinkCode);
        String drinkName = drinkNames[drinkIndex];
        print("Заповядай " + drinkName);
    }

    private static int getDrinkIndexFromCode(int searchedDrinkCode) {
        for (int i = 0; i < drinkCodes.length; i++) {
            if (drinkCodes[i] == searchedDrinkCode) {
                return i;
            }
        }
        return -1;
    }

    private static void printDrinkInformation() {
        for (int i = 0; i < drinkCodes.length; i++) {
            print("Код на напитка " + drinkNames[i] + ": " + drinkCodes[i] + " - цена: " + drinkPrices[i]);
        }
    }

    private static int getValidDrinkCodeFromUser() {
        int drinkCode = getNumberFromUser();
        while (getDrinkIndexFromCode(drinkCode) == -1 && drinkCode != CODE_EXIT) {
            print("Невалиден код. Въведете отново.");
            drinkCode = getNumberFromUser();
        }
        return drinkCode;
    }

    private static int getValidAgeFromUser() {
        int age = getNumberFromUser();
        while (age < 1 || age > 130) {
            print("Невалидна възраст. Моля, въведете отново.");
            age = getNumberFromUser();
        }
        return age;
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void print(String text) {
        System.out.println(text);
    }
}
