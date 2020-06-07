import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int inputValue = console.nextInt();
        printModuleValue(inputValue);

        int newModuleValue = getModuleValue();
        System.out.println(newModuleValue);
    }

    public static int getModuleValue() {
        Scanner console = new Scanner(System.in);
        int inputValue = console.nextInt();
        return Math.abs(inputValue);
    }

    private static void printModuleValue(int number) {
        System.out.println(Math.abs(number));
    }
}
