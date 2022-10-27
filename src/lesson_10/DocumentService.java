package lesson_10;

public class DocumentService {
    private static final String LOWER_CASE = "lower_case";
    private static final String UPPER_CASE = "upper_case";

    public static void printData(String str) {
        System.out.println(str);
    }

    //        - Вывести на экран в одну строку два первых блока по 4 цифры.

    public static void getFirstFourNumbers(Document document) {
        String[] splitDocNumber = document.getDocNumber().split("-");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < splitDocNumber.length; i++) {
            String elem = splitDocNumber[i];
            boolean isDigitOnly = checkIsDigitString(elem);
            if (elem.length() == 4 && isDigitOnly) {
                stringBuilder.append(elem).append(" ");
            }
        }
        printData("Первых два блока по четыре цифры: " + stringBuilder.toString());

    }

    private static boolean checkIsDigitString(String elem) {
        char[] chars = elem.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char sbl = chars[i];
            if (!Character.isDigit(sbl)) {
                return false;
            }
        }
        return true;
    }

    public static void getSwitchLetter(Document document) {
        String docNumber = document.getDocNumber();
        String[] splitDocNumber = document.getDocNumber().split("-");

        for (int i = 0; i < splitDocNumber.length; i++) {
            String elem = splitDocNumber[i];
            if (elem.length() == 3) {
                docNumber = docNumber.replaceAll(elem, "***");
            }
        }
        printData("Блоки из трёх букв заменить на *: " + docNumber);
    }

    public static void getLetterToLowerCase(Document document) {
        String docNumber = document.getDocNumber();
        docNumber = transform(docNumber, LOWER_CASE);

        StringBuilder stringBuilder = transformToCase(docNumber);
        printData("Буквы в нижнем регистре: " + stringBuilder);
    }

    public static void getLetterToUpperCase(Document document) {
        String docNumber = document.getDocNumber();
        docNumber = transform(docNumber, UPPER_CASE);

        StringBuilder stringBuilder = transformToCase(docNumber);
        printData("Буквы в верхнем регистре: " + stringBuilder);
    }

    private static StringBuilder transformToCase(String docNumber) {
        String[] splitDocNumber = docNumber.split("-");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < splitDocNumber.length; i++) {
            String elem = splitDocNumber[i];
            boolean isDigitString = checkIsDigitString(elem);
            if (!isDigitString && elem.length() == 3) {
                stringBuilder.append(elem).append("/");
            } else {
                stringBuilder = handleMixedStr(stringBuilder, elem);
            }
        }
        return stringBuilder;
    }

    private static String transform(String elem, String aCase) {
        switch (aCase) {
            case LOWER_CASE:
                return elem.toLowerCase();
            case UPPER_CASE:
                return elem.toUpperCase();
        }
        return elem;
    }

    private static StringBuilder handleMixedStr(StringBuilder stringBuilder, String elem) {
        char[] chars = elem.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            boolean isLetter = Character.isLetter(aChar);
            if (isLetter) {
                stringBuilder.append(aChar);
                if (i != chars.length - 1) {
                    stringBuilder.append("/");
                }
            }
        }
        return stringBuilder;
    }

    public static void checkSequence(Document document) {
        String docNumber = document.getDocNumber();
        if (docNumber.contains("abc")) {
            printData("Есть в наличии последовательность: abc!");
        } else if (docNumber.contains("ABC")) {
            printData("Есть в наличии последовательность: ABC!");
        } else {
            printData("Последовательности abc/ABC нету в наличии!");
        }

    }
    public static void checkFirstLetter (Document document){
        String docNumber = document.getDocNumber();
        if (docNumber.startsWith("555")) {
            printData("Есть в начале!");
        } else {
            printData("Нету в начале!");
        }
    }
    public static void checkLatestLetter (Document document){
        String docNumber = document.getDocNumber();
        if (docNumber.endsWith("1a2b")) {
            printData("Есть в конце!");
        } else {
            printData("Нету в конце!");
        }
    }

}



