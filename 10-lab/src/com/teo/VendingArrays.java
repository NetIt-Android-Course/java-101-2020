package com.teo;

import java.util.Scanner;

public class VendingArrays {

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
        printDrinkCodes();
        print("Моля, въведете код на напитка.");
        int drinkCode = getValidDrinkCodeFromUser();
        printDrinkOrder(drinkCode);
    }

    private static void printDrinkOrder(int drinkCode) {
        int drinkIndex = getDrinkIndexFromCode(drinkCode);
        String drinkName = drinkNames[drinkIndex];
        print("Заповядай " + drinkName);
    }

    private static int getDrinkIndexFromCode(int searchedDrinkCode) {
        for (int i = 0; i < drinkCodes.length; i++) {
            if(drinkCodes[i] == searchedDrinkCode) {
                return i;
            }
        }
        return -1;
    }

    private static void printDrinkCodes() {
        for (int i = 0; i < drinkCodes.length; i++) {
            print("Код на напитка " + drinkNames[i] + ": " + drinkCodes[i]);
        }
    }

    private static int getValidDrinkCodeFromUser() {
        int drinkCode = getNumberFromUser();
        while (getDrinkIndexFromCode(drinkCode) == -1) {
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
