public class Test {

    public static void main(String[] args) {
        int a = 2;
        float b = 3.14f;
        double c = 4.1234123;
        long d = 123123123;

        long result = d - a;
        float resultFloating = 4.55f - b;

//        System.out.println(a / 0);

//        int e = 17;
//        System.out.println(e / (float) a);
//
//        double f = 3;
//        int g = 16;
//        System.out.println(g % f);

//        int h = -1;
//        System.out.println(h--);
//        System.out.println(-h);

//        int i = 2;
//        System.out.print(19.4 / i++);
//
//        int j = 2;
//        int k = 2;
//        System.out.print(k != j);

        boolean l = false;
        boolean m = true;
//        System.out.println(!(((l || m) && m) || (l && m || l)));

//        int n = 7;
//        int o = 8;
//        o %= n;
////        o = o % n;
////        o = o * n;
//        System.out.println(o);

        boolean condition = !((l || m) && m) || (l && m || l);
        String drink = condition ? "Cola" : "Pepsi";
        System.out.println(drink);

        System.out.print(3 + 4 / 2 > (true ? 3 : 8));

        //        int i = 0;
//        int result = i++ + ++i;
//        System.out.println(i);

        int i = 19;
        int j = -5;
        System.out.print(i % j);
    }
}
