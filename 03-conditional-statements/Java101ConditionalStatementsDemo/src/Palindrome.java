import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        int number = con.nextInt();

        int firstDigit = number / 1000;
        int secondDigit = number / 100 % 10;
        int thirdDigit = number / 10 % 10;
        int lastDigit = number % 10;

        System.out.println("Digits are " + firstDigit + secondDigit + thirdDigit + lastDigit);

        if(firstDigit == lastDigit && secondDigit == thirdDigit) {
            System.out.println("Is palindrome");
        } else {
            System.out.println("is not");
        }
    }
}
