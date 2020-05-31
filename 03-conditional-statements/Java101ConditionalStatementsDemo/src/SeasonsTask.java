import java.util.Scanner;

public class SeasonsTask {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int monthIndex = console.nextInt();

        String result;
        if(monthIndex >= 3 && monthIndex <= 5) {
            result = "пролет";
        } else if(monthIndex >= 6 && monthIndex <= 8) {
            result = "лято";
        } else if(monthIndex >= 9 && monthIndex <= 11) {
            result = "есен";
        } else {
            result = "зима";
        }

        System.out.println(monthIndex + " -> " + result);
    }
}
