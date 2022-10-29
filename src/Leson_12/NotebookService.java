package Leson_12;

import java.util.Random;

public class NotebookService {
    private static  String contract = "contract";
    private static  String docnum = "docnum";
    private static  String docnum123 = "docnum";

    public static void printData(String str) {
        System.out.println(str);
    }

    public static void randomNameText() {
        Random randomTextLetter = new Random();
        String eng = "abcdefghijklmnopqrstuvwxyz";
        String dig = "0123456789";
        String sum = eng + eng.toLowerCase() +
                dig;
        char charAt = sum.charAt(randomTextLetter.nextInt(sum.length()));
//        printData("Рандомная херь: " + charAt);
    }

    public static void fullNameOfString(){
        StringBuilder stringBuilder = new StringBuilder();
        char[] abc= docnum123.toCharArray();
        for (int i = docnum123.length(); i < 15; i++) {
            stringBuilder.append(randomNameText());
        }
        printData("Поток чисел: " +docnum123 + stringBuilder);
    }
}
