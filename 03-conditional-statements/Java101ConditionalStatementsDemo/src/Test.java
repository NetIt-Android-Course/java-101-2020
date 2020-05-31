import java.util.Scanner;

public class Test {

    static final int MIN_NUM_OF_SALES_FOR_BONUS = 100;

    public static void main(String[] args) {

        Scanner con = new Scanner(System.in);
        double netSalary = con.nextDouble();
        int salesMadeInMonth = con.nextInt();
        double monthlyBonus = netSalary / 2;

        if(salesMadeInMonth >= MIN_NUM_OF_SALES_FOR_BONUS) {
            netSalary = netSalary + monthlyBonus;
        }

        System.out.println("Employee salary is " + netSalary);
    }
}
