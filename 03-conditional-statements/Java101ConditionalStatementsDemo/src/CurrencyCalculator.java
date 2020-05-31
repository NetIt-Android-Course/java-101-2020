import java.util.Scanner;

public class CurrencyCalculator {


    public static final double BGN_TO_USD_RATE = 1.7408;
    public static final double BGN_TO_EUR_RATE = 1.9557;
    public static final double BGN_TO_GBP_RATE = 2.6415;

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        double inputMoney = Double.parseDouble(con.nextLine());
        String outputCurrency = con.nextLine();
        double outputMoney = 0;

        switch (outputCurrency){
            case "USD": outputMoney = inputMoney / BGN_TO_USD_RATE; break;
            case "EUR": outputMoney = inputMoney / BGN_TO_EUR_RATE; break;
            case "GBP": outputMoney = inputMoney / BGN_TO_GBP_RATE; break;
        }

        System.out.println(inputMoney + " leva is " + outputMoney + " " + outputCurrency);
    }
}
