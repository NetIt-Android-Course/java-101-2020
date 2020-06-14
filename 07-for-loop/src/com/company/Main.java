package com.company;

import java.util.Scanner;

public class Main {

    static Scanner console = new Scanner(System.in);
    static int a, b, c, d, e, f;

    public static void main(String[] args) {
        inputArguments();

        int methodIndex = chooseMethod();
        String result = getResultForMethod(methodIndex);

        //Output of result
        System.out.println("Result:" + result);


    }

    private static void inputArguments() {
        System.out.println("Enter number of arguments needed:");
        int numberOfArgs = console.nextInt();
        for (int argIndex = 1; argIndex <= numberOfArgs; argIndex++) {
            System.out.println("Enter argument No." + argIndex + ": ");
            int consoleInput = console.nextInt();
            putValueInArg(argIndex, consoleInput);
        }
    }

    private static void putValueInArg(int argIndex, int value) {
        switch (argIndex) {
            case 1: a = value; break;
            case 2: b = value; break;
            case 3: c = value; break;
            case 4: d = value; break;
            case 5: e = value; break;
            case 6: f = value; break;
        }
    }

    private static int chooseMethod() {
        System.out.println("Choose method number:");
        return console.nextInt();
    }

    private static String getResultForMethod(int methodIndex) {
        String result;
        switch (methodIndex) {
            case 1: result = "" + sumNumbersTo(a); break;
            case 2: result = "" + factorielOf(a); break;
            case 3: result = "" + getDivisableBy5(a, b); break;
            case 4: result = "" + getTriangleWithSide(a); break;
            case 5: result = "" + getHappyNumber(); break;
            case 6: result = "" + getHappyNumber2(); break;
            case 7: result = "" + getHappyNumber3(); break;
            case 8: result = "" + getSnowflakeTriangle(a); break;
            case 9: result = "" + getSnowflakeIsoscelesTriangle(a); break;
            case 10: result = "" + getPrimeNumber(a); break;
            case 11: result = "" + getRomb(a); break;
            default: result = "No such method";
        }
        return result;
    }

    //Operations:

    private static int factorielOf(int number) {
        int product = 1;
        for (int counter = 1; counter <= number; counter++) {
            product = product * counter;
        }
        return product;
    }

    private static int sumNumbersTo(int upperLimit) {
        int sum = 0;
        for (int counter = 0; counter <= upperLimit; counter++) {
            sum = sum + counter;
        }
        return sum;
    }

    private static String getDivisableBy5(int lowerLimit, int upperLimit) {
        String result = "";
        for (int index = lowerLimit; index <= upperLimit; index++) {
            if(index % 5 == 0) {
                result = result + ", " + index;
            }
        }
        return result;
    }

    private static String getTriangleWithSide(int n) {
        String result = "";
        for (int rowIndex = 0; rowIndex <= n; rowIndex++) {
            for (int letterIndex = 1; letterIndex <= rowIndex; letterIndex++) {
                result = result + letterIndex;
            }

            result = result + "\n";
        }
        return result;
    }

    private static String getHappyNumber() {
        String result = "";
        for (int number = 1000; number <= 9999; number++) {
            int firstDigit = number / 1000;
            int secondDigit = number / 100 % 10;
            int thirdDigit = number / 10 % 10;
            int forthDigit = number % 10;
            if(firstDigit + secondDigit == thirdDigit + forthDigit) {
                result = result + ", " + number;
            }
        }
        return result;
    }

    private static String getHappyNumber2() {
        String result = "";
        long beforeLoopTimestamp = System.currentTimeMillis();
        for (int thousands = 1; thousands <= 9; thousands++) {
            for (int hundreds = 0; hundreds <= 9; hundreds++) {
                for (int tens = 0; tens <= 9; tens++) {
                    for (int lastDigit = 0; lastDigit <= 9; lastDigit++) {
                        if(thousands + hundreds == tens + lastDigit) {
                            result = result + ", " + thousands + hundreds + tens + lastDigit;
                        }
                    }
                }
            }
        }
        long currentTimestamp = System.currentTimeMillis();
        System.out.println("Execution took: " + (currentTimestamp - beforeLoopTimestamp));
        return result;
    }

    private static String getHappyNumber3() {
        StringBuilder result = new StringBuilder();
        long beforeLoopTimestamp = System.currentTimeMillis();
        //11064
        //32
        for (int hundredthousands = 1; hundredthousands <= 9; hundredthousands++) {
            for (int tenthousands = 0; tenthousands <= 9; tenthousands++) {
                for (int thousands = 0; thousands <= 9; thousands++) {
                    for (int hundreds = 0; hundreds <= 9; hundreds++) {
                        for (int tens = 0; tens <= 9; tens++) {
                            for (int lastDigit = 0; lastDigit <= 9; lastDigit++) {
                                if (thousands + hundreds == tens + lastDigit ||
                                        thousands + hundreds == hundredthousands + tenthousands) {
                                    result.append(", ");
                                    result.append(hundredthousands);
                                    result.append(tenthousands);
                                    result.append(thousands);
                                    result.append(hundreds);
                                    result.append(tens);
                                    result.append(lastDigit);
                                }
                            }
                        }
                    }
                }
            }
        }
        long currentTimestamp = System.currentTimeMillis();
        System.out.println("Execution took: " + (currentTimestamp - beforeLoopTimestamp));
        return result.toString();
    }

    private static String getSnowflakeTriangle(int n) {
        String result = "\n";
        for (int rowIndex = 1; rowIndex <= n; rowIndex++) {
            for (int charIndex = 1; charIndex <= rowIndex; charIndex++) {
                result = result + "*";
            }
            result = result + "\n";
        }
        
        return result;
    }

    private static String getSnowflakeIsoscelesTriangle(int n) {
        String result = "\n";
        //Upper half of triangle
        for (int rowIndex = 1; rowIndex <= n; rowIndex++) {
            for (int charIndex = 1; charIndex <= rowIndex; charIndex++) {
                result = result + "*";
            }
            result = result + "\n";
        }
        //Lower half of triangle
        for (int i = n - 1; i > 0; i--) {
            for (int charIndex = 1; charIndex <= i; charIndex++) {
                result = result + "*";
            }
            result = result + "\n";
        }

        return result;
    }

    public static String getPrimeNumber(int n) {
        String result = "";

        long startTimestamp = System.currentTimeMillis();
        for (int number = 2; number <= n; number++) {
            //is number a prime number?
            boolean isNumberPrime = true;
            for (int divider = 2; divider < number; divider++) {
                if(number % divider == 0)  {
                    isNumberPrime = false;
                    break;
                }
            }
            if(isNumberPrime) result = result + ", " + number;
        }
        System.out.println("Time:" + (System.currentTimeMillis() - startTimestamp));

        return result;
    }

    public static String getRomb(int n) {
        String result = "\n";

        //Prints upper part
        for (int rowIndex = 1; rowIndex <= n; rowIndex++) {
            //Prints first spaces
            for (int spaceIndex = n - rowIndex; spaceIndex > 0; spaceIndex--) {
                result = result + " ";
            }
            result = result + "/";
            for (int spaceIndex = 1; spaceIndex < rowIndex; spaceIndex++) {
                result = result + "  ";
            }
            result = result + "\\";
            result = result + "\n";
        }

        //Prints lower part
        for (int rowIndex = 0; rowIndex < n; rowIndex++) {
            //Prints first spaces
            for (int spaceIndex = 0; spaceIndex < rowIndex; spaceIndex++) {
                result = result + " ";
            }
            result = result + "\\";
            for (int spaceIndex = n - rowIndex - 1; spaceIndex > 0; spaceIndex--) {
                result = result + "  ";
            }
            result = result + "/";
            result = result + "\n";
        }

        return result;
    }
}
