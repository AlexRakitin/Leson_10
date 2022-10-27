package lesson_10;

public class Main {
    private static final String DOC_NUMBER = "Номер документа: ";

    public static void main(String[] args) {

//        На вход передать строку (будем считать, что это номер документа).
//        Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
//        а y — это буква.
        Document document = new Document();
        DocumentService.printData(DOC_NUMBER + document.getDocNumber());


//        - Вывести на экран в одну строку два первых блока по 4 цифры.
        DocumentService.getFirstFourNumbers(document);
//       - Вывести на экран номер документа, но блоки из трех букв заменить
//       на *** (каждая буква заменятся на *)
        DocumentService.getSwitchLetter(document);
        // - Вывести буквы в нижнем регистре yyy/yyy/y/y
        DocumentService.getLetterToLowerCase(document);
        DocumentService.getLetterToUpperCase(document);
//- Проверить содержит ли номер документа последовательность abc ABC
        DocumentService.checkSequence(document);
//       -Проверить начинается ли номер документа с последовательности 555
    DocumentService.checkFirstLetter(document);
//    -Проверить заканчивается ли номер документа на последовательность 1a2b
        DocumentService.checkLatestLetter(document);
    }


}
