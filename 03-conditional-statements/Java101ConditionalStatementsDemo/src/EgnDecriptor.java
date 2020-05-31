import java.util.Scanner;

public class EgnDecriptor {

    public static void main(String[] args) {

        //9504141811
        Scanner console = new Scanner(System.in);
        long egn = console.nextLong();

        int year = (int) (egn / 100000000);
        int month = (int) (egn / 1000000 % 100);
        int date = (int) (egn / 10000 % 100);
        int regionalCode = (int) (egn / 10 % 1000);
        int sexDigit = (int) (egn / 10 % 10);
        boolean isMale = sexDigit % 2 == 0;
        String sex = isMale ? "мъж" : "жена";
        String region;

        if(regionalCode <= 43) {
            region = "Благоевград";
        } else if(regionalCode <= 93) {
            region = "Бургас";
        }  else if(regionalCode <= 139) {
            region = "Варна";
        }  else if(regionalCode <= 169) {
            region = "Велико Търново";
        }  else if(regionalCode <= 183) {
            region = "Видин";
        } else if(regionalCode <= 217) {
            region = "Враца";
        } else if(regionalCode <= 233) {
            region = "Габрово";
        } else if(regionalCode <= 281) {
            region = "Кърджали";
        } else {
            region = "не се знае";
        }

        System.out.println("ЕГН:" + egn);
        System.out.println("Година на раждане:" + year);
        System.out.println("Месец на раждане:" + month);
        System.out.println("Дата на раждане:" + date);
        System.out.println("Пол:" + sex);
        System.out.println("Регионален код:" + regionalCode);
        System.out.println("Регион:" + region);

    }
}
