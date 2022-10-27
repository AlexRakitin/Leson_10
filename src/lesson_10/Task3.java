package lesson_10;

public class Task3 {

    public static void doubleLetter() {
        String helloWorld = "HelloWorld";
        char[] hChar = helloWorld.toCharArray();
        char duplicateLetter;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < hChar.length; i++) {
            duplicateLetter = hChar[i];
            stringBuilder.append(duplicateLetter).append(duplicateLetter);

        }
        DocumentService.printData("Вывод: "+stringBuilder);
    }
}
