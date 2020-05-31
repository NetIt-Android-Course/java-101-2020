import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class MonthSwitchTask {


    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int monthIndex = console.nextInt();

        String result;

        switch (monthIndex) {
            case 1: result = "януари"; break;
            case 2: result = "фев"; break;
            case 3: result = "март"; break;
            case 4: result = "април"; break;
            case 5: result = "май"; break;
            case 6: result = "юни"; break;
            case 7: result = "юли"; break;
            case 8: result = "август"; break;
            case 9: result = "септември"; break;
            case 10: result = "октомври"; break;
            case 11: result = "ноември"; break;
            case 12: result = "декември"; break;
            default: result = "не се знае";
        }

        Date date = new Date();
        date.setDate(1);
        date.setMonth(monthIndex - 1);
        Locale localeObject=new Locale("bg");
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM", localeObject);
        System.out.println(dateFormat.format(date));

        System.out.println(monthIndex + " -> " + result);
    }
}
