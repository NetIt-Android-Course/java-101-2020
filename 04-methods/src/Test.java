import java.util.Random;

public class Test {

    public static void main(String[] args) {
        System.out.println(getNearestTo100(2, 9, 11));
    }

    public static int getNearestTo100(int num1, int num2) {
        int distance1To100 = Math.abs(100 - num1);
        int distance2To100 = Math.abs(100 - num2);
        return distance1To100 > distance2To100 ? num2 : num1;
    }

    public static int getNearestTo100(int a, int b, int c) {
        int minAB = getNearestTo100(a, b);
        int minABC = getNearestTo100(c, minAB);
        return minABC;
    }

    public static boolean areEqual(int a, int b){
        return a == b;
    }

    public static boolean areEqual(int a, int b, int c){
        return areEqual(a, b) && areEqual(b, c);
    }

    public static boolean areLastDigitsOfPowerOf2Equal(int a, int b) {
        int aPowerOf2 = toPowerOf2(a);
        int bPowerOf2 = toPowerOf2(b);
        boolean result = areLastDigitsEqual(aPowerOf2, bPowerOf2);
        return result;
    }

    static boolean areLastDigitsEqual(int num1, int num2) {
        boolean result;
        int lastDigitNum1 = num1 % 10;
        int lastDigitNum2 = num2 % 10;
        result = lastDigitNum1 == lastDigitNum2;
        return result;
    }

    public static int toPowerOf2(int number) {
        return number * number;
    }

    public static void printRandomCompliment() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(3);
        String compl = getCompliment(randomNumber);
        System.out.println(compl);
    }

    public static String getCompliment(int number) {
        String compliment;
        switch (number) {
            case 0: compliment = "Добър програмист си. Ставаш."; break;
            case 1: compliment = "Страхотен програмист си."; break;
            case 2: compliment = "Имаш голяма глава."; break;
            default: compliment = "Просто те игнорирам";
        }
        return compliment;
    }

    public static void simulateDog() {
        bark();
        pee();
    }

    public static void bark() {
        System.out.println("Djaf Djaf Djaf");
    }

    public static void pee() {
        System.out.println("------");
    }
}
