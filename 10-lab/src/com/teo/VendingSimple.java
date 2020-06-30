package com.teo;

import java.util.Scanner;

public class VendingSimple {

    static final int CODE_WHISKEY = 1;
    static final int CODE_VODKA = 2;
    static final int CODE_JIN = 3;
    static final int CODE_RAKIA = 4;

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
        switch (drinkCode) {
            case CODE_JIN: print("Заповядай този джин."); break;
            case CODE_RAKIA: print("Заповядай този ракия."); break;
            case CODE_VODKA: print("Заповядай този водка."); break;
            case CODE_WHISKEY: print("Заповядай този уиски."); break;
        }
    }

    private static void printDrinkCodes() {
        print("Код на напитка уиски: " + CODE_WHISKEY);
        print("Код на напитка джин: " + CODE_JIN);
        print("Код на напитка ракия: " + CODE_RAKIA);
        print("Код на напитка водка: " + CODE_VODKA);
    }

    private static int getValidDrinkCodeFromUser() {
        int drinkCode = getNumberFromUser();
        while (drinkCode != CODE_JIN &&
                drinkCode != CODE_RAKIA &&
                drinkCode != CODE_VODKA &&
                drinkCode != CODE_WHISKEY) {
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
