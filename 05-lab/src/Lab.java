import java.util.Scanner;

public class Lab {

    static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {
//        problem1();
//        problem2();
//        problem3();
        problem4();
    }

    private static void problem4() {
        double degreesForConversion = Double.parseDouble(console.nextLine());
        char inputDegreeUnit = console.nextLine().charAt(0);
        char outputDegreeUnit = console.nextLine().charAt(0);

        if( (inputDegreeUnit != 'K' && inputDegreeUnit != 'C' && inputDegreeUnit != 'F') ||
                (outputDegreeUnit != 'K' && outputDegreeUnit != 'C' && outputDegreeUnit != 'F')) {
            return;
        }

        double degreesInKelvin = getDegreesInKelvin(degreesForConversion, inputDegreeUnit);
        double outputDegrees = getDegreesFromKelvin(outputDegreeUnit, degreesInKelvin);

        System.out.println(degreesForConversion + " " +
                inputDegreeUnit + " is converted to " +
                outputDegrees + " " + outputDegreeUnit);
    }

    private static double getDegreesFromKelvin(char outputDegreeUnit, double degreesInKelvin) {
        double outputDegrees;
        switch (outputDegreeUnit) {
            case 'C': outputDegrees = degreesInKelvin - 273.15; break;
            case 'F': outputDegrees = (degreesInKelvin * (9/5.0)) - 459.67; break;
            default: outputDegrees = degreesInKelvin;
        }
        return outputDegrees;
    }

    private static double getDegreesInKelvin(double degreesForConversion, char inputDegreeUnit) {
        double degreesInKelvin;
        switch (inputDegreeUnit) {
            case 'C': degreesInKelvin = degreesForConversion + 273.15; break;
            case 'F': degreesInKelvin = (degreesForConversion + 459.67) * (5/9.0); break;
            default: degreesInKelvin = degreesForConversion;
        }
        return degreesInKelvin;
    }

    private static void problem3() {
        double weightOnEarth = console.nextDouble();
        double weightOnMoon = (weightOnEarth / 9.81) * 1.622;
        System.out.println("On the Moon, " +
                round(weightOnEarth, 2) + "kg would be " +
                round(weightOnMoon, 2) + "kg");
    }

    public static double round(double number, int roundingPositions) {
        double divider = Math.pow(10, roundingPositions);
        return Math.round(number * divider) / divider;
    }

    private static void problem2() {
        int indexDayOfWeek = console.nextInt();
        boolean isCurrentlyInVratsa = console.nextInt() == 1;

        if(indexDayOfWeek < 1 || indexDayOfWeek > 7) {
            return;
        }

        boolean isIvanFishing;
        if(isCurrentlyInVratsa) {
            isIvanFishing = indexDayOfWeek < 6;
        } else {
            isIvanFishing = indexDayOfWeek == 6 || indexDayOfWeek == 7;
        }

        System.out.println("Ivan is fishing:" + isIvanFishing);
    }

    private static void problem1() {
        int threeDigitNumber = console.nextInt();

        if(threeDigitNumber < 100 || threeDigitNumber > 999) {
            //out of bounds
            return;
        }

        int firstDigit = threeDigitNumber / 100;
        int secondDigit = threeDigitNumber / 10 % 10;
        int thirdDigit = threeDigitNumber % 10;

        System.out.println("Sum of digits: " + (firstDigit + secondDigit + thirdDigit));
        System.out.println("Reverse order: " + thirdDigit + secondDigit + firstDigit);
        System.out.println("Last digit is first now: " + thirdDigit + firstDigit + secondDigit);

    }


}
