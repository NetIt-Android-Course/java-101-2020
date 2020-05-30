import java.util.Scanner;

public class DegreeCalculator {

    public static void main(String [] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Enter name: ");
        String name = console.nextLine();
        System.out.println("Enter degrees: ");
        double farenheitDegrees = console.nextDouble();

        double celsiusDegrees = (farenheitDegrees - 32) / 1.8;

        System.out.println(name + ", here is the result:" + celsiusDegrees);
    }
}
