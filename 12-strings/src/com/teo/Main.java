package com.teo;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        printUserFirstAndLastLetter();

//        languageCheker();
//        formatString();
//        System.out.println(getFirstPositionOf("", "Java"));
//        System.out.println(replaceWord("My favourite language is Java. Java is great.", "Java", "PHP"));
//        System.out.println(cutString("My favourite language is Java. Java is great.", 5));
        String[] address = {
                "Ivan", "Ivanov", "BG", "Sofia", "14 Mak Str", "1000"
        };
//        System.out.println(formatAddress(address));
//        System.out.println(Arrays.toString(wordify("Java is cool")));
//        System.out.println(countCode("codexxcode"));
        explodeStars("asd*asd");
    }

    private static String explodeStars(String str) {
        String result = str;
        int starPos = result.indexOf("*");
        while (starPos != -1) {
            int leftDeadLetter = starPos - 1;
            int endStarPos = starPos;
            for (int i = starPos; i < result.length(); i++) {
                if (result.charAt(i) != '*') {
                    endStarPos = i - 1;
                    break;
                }
            }
            int rightDeadLetter = endStarPos + 1;
            String tempStr = result;
            if (leftDeadLetter < 0) leftDeadLetter = 0;
            if (rightDeadLetter >= tempStr.length()) rightDeadLetter = tempStr.length() - 1;
            result = tempStr.substring(0, leftDeadLetter) + tempStr.substring(rightDeadLetter + 1);
            starPos = result.indexOf("*");
        }
        return result;
    }

    private static int countCode(String str) {
        int resultCounter = 0;
        String tempStr = str;
        int coIndex = tempStr.indexOf("co");
        while (coIndex != -1) {
            if (tempStr.charAt(coIndex + 3) == 'e') resultCounter++;
            tempStr = tempStr.substring(coIndex + 1);
            coIndex = tempStr.indexOf("co");
        }

        return resultCounter;
    }

    private static String[] wordify(String text) {
        return text.split(" ");
    }

    private static String formatAddress(String[] address) {
        String addressPattern = "%s %s\n\n%s\n%s\n%s\n%s";
        return String.format(addressPattern, address[0], address[1], address[2],
                address[3], address[4], address[5]);
    }

    private static String cutString(String text, int index) {
        return text.substring(index);
    }

    private static String replaceWord(String text, String searchWord, String replaceWord) {
        return text.replace(searchWord, replaceWord);
    }

    private static int getFirstPositionOf(String text, String searchWord) {
        if (text == null || searchWord == null) return -5;
        if (text.isEmpty()) return -3;

        return text.indexOf(searchWord);
    }


    private static void formatString() {
        String name = "Ivan";
        int age = 25;
        System.out.println(String.format("Name: %s, Age: %04d years, Height: %.2fm", name, age, 1.8812345));
    }

    private static void languageCheker() {
        String language = scanner.nextLine();
        language = language.toUpperCase();
        if (language.equals("JAVA")) {
            System.out.println("YES");
        } else {
            System.out.println("Nope");
        }
    }

    private static void printUserFirstAndLastLetter() {
        String name = scanner.nextLine();
        if (name == null) return;

        char firstLater = name.charAt(0);
        char lastLetter = name.charAt(name.length() - 1);
        System.out.println("first and last letters: " + firstLater + lastLetter);
    }
}
