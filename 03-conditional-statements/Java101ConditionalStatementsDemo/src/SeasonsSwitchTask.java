import java.util.Scanner;

public class SeasonsSwitchTask {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int monthIndex = console.nextInt();

        String result;

        switch (monthIndex) {
            case 12:
            case 1:
            case 2: result = "зима"; break;
            case 3:
            case 4:
            case 5: result = "пролет"; break;
            case 6:
            case 7:
            case 8: result = "лято"; break;
            case 9:
            case 10:
            case 11: result = "есен"; break;
            default: result = "не се знае";
        }

        System.out.println(monthIndex + " -> " + result);
    }
}
