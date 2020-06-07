import java.util.Scanner;

public class Game {

    static boolean hasBranch;
    static boolean hasTorch;

    public static void main(String[] args) {
        printGameTitle();
        printGameStory();
        startLevel1();

    }

    private static void startLevel1() {
        printLevel1Description();
        printUserOptions("наляво", "надясно");
        String userInput = getUserInput();
        switch (userInput) {
            case "наляво": startLevel2(); break;
            case "надясно": startLevel3(); break;
            default: finishGameWithError();
        }
    }

    private static void startLevel3() {

    }

    private static void startLevel2() {
        printLevel2Description();
        printUserOptions("забързвам се", "хващам нещото");
        String userInput = getUserInput();
        switch (userInput) {
            case "забързвам се": finishGameWithScenario(
                    "От забързването, не виждате как пропадате във висока пропаст."); break;
            case "хващам нещото": startLevel4(); break;
            default: finishGameWithError();
        }
    }

    private static void startLevel4() {
        printLevel4Description();
        hasBranch = true;
        printUserOptions("палим", "не палим");
        String userInput = getUserInput();
        switch (userInput) {
            case "палим": {
                hasTorch = true;
                startLevel5();
                break;
            }
            case "не палим": startLevel5(); break;
            default: finishGameWithError();
        }
    }

    private static void startLevel5() {

    }

    private static void printLevel4Description() {
        System.out.println("Обръщате се и го хващате. Оказва се просто клонка. Имате кибрит в джоба. Палите ли клонката?.");
    }

    private static void finishGameWithScenario(String scenario) {
        System.out.println("Умряхте. " + scenario);
    }

    private static void printLevel2Description() {
        System.out.println("Става все по-тъмно. Нещо докосва крака ви. Какво правите?");
    }

    private static void finishGameWithError() {
        System.out.println("Имаше грешка в програмата или във вас.");
    }

    private static String getUserInput() {
        Scanner console = new Scanner(System.in);
        return console.nextLine();
    }

    private static void printUserOptions(String option1, String option2) {
        System.out.println("Изберете от " + option1 + "/" + option2);
    }

    private static void printLevel1Description() {
        System.out.println("Стигате до разклонение в тунела. Накъде поемате?");
    }

    private static void printGameStory() {
        System.out.println("Вървите през гората. " +
                "Падата в яма. Ямата е дълбока. " +
                "Виждате тунел. Тръгвате по него. Тунелът е нисък, трябва да пълзите");
        System.out.println("          .     .  .      +     .      .          .\n" +
                "     .       .      .     #       .           .\n" +
                "        .      .         ###            .      .      .\n" +
                "      .      .   \"#:. .:##\"##:. .:#\"  .      .\n" +
                "          .      . \"####\"###\"####\"  .\n" +
                "       .     \"#:.    .:#\"###\"#:.    .:#\"  .        .       .\n" +
                "  .             \"#########\"#########\"        .        .\n" +
                "        .    \"#:.  \"####\"###\"####\"  .:#\"   .       .\n" +
                "     .     .  \"#######\"\"##\"##\"\"#######\"                  .\n" +
                "                .\"##\"#####\"#####\"##\"           .      .\n" +
                "    .   \"#:. ...  .:##\"###\"###\"##:.  ... .:#\"     .\n" +
                "      .     \"#######\"##\"#####\"##\"#######\"      .     .\n" +
                "    .    .     \"#####\"\"#######\"\"#####\"    .      .\n" +
                "            .     \"      000      \"    .     .\n" +
                "       .         .   .   000     .        .       .\n" +
                ".. .. ..................O000O........................ ......");
    }

    private static void printGameTitle() {
        System.out.println("<<<Лабиринтът на смъртта>>>");
    }
}
