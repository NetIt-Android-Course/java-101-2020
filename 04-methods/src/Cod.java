public class Cod {

    public static void main(String[] args) {
        int lastDigit = 0;
        String typeLastDigit = "";

//        if (lastDigit == 0) {
//            typeLastDigit = " ";
//        } else {
//            switch (lastDigit) {
//                case 1:
//                    typeLastDigit = " И ЕДНО";
//                    break;
//                case 2:
//                    typeLastDigit = " И ДВЕ";
//                    break;
//                case 3:
//                    typeLastDigit = " И ТРИ";
//                    break;
//                case 4:
//                    typeLastDigit = " И ЧЕТИРИ";
//                    break;
//                case 5:
//                    typeLastDigit = " И ПЕТ";
//                    break;
//                case 6:
//                    typeLastDigit = " И ШЕСТ";
//                    break;
//                case 7:
//                    typeLastDigit = " И СЕДЕМ";
//                    break;
//                case 8:
//                    typeLastDigit = " И ОСЕМ";
//                    break;
//                default:
//                    typeLastDigit = " И ДЕВЕТ";
//            }
//        }
        switch (lastDigit) {
            case 0:
                typeLastDigit = " ";
                break;
            case 1:
                typeLastDigit = " И ЕДНО";
                break;
            case 2:
                typeLastDigit = " И ДВЕ";
                break;
            case 3:
                typeLastDigit = " И ТРИ";
                break;
            case 4:
                typeLastDigit = " И ЧЕТИРИ";
                break;
            case 5:
                typeLastDigit = " И ПЕТ";
                break;
            case 6:
                typeLastDigit = " И ШЕСТ";
                break;
            case 7:
                typeLastDigit = " И СЕДЕМ";
                break;
            case 8:
                typeLastDigit = " И ОСЕМ";
                break;
        }

        System.out.println(typeLastDigit);
    }
}
