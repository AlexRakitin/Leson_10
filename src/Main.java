public class Main {
    public static void main(String[] args) {

//        На вход передать строку (будем считать, что это номер документа).
//        Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число,
//        а y — это буква.
        Document document = new Document();
        String documentNumber = document.getDocNumber();
        System.out.println("Номер документа: " + documentNumber);
//        - Вывести на экран в одну строку два первых блока по 4 цифры.
        document.getFirstFourNumbers();
    }
}
