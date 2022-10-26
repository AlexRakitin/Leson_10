import java.util.Arrays;

public class Document {
    private final String docNumber = "1234-abv-5678-gde-9y0x";

    public String getDocNumber() {
        return this.docNumber;
    }

    String[] massiveGetFirstFourNumbers = this.docNumber.split("-");
    String massiveOne = massiveGetFirstFourNumbers[0];
    String massiveTwo = massiveGetFirstFourNumbers[1];
    String massiveThree = massiveGetFirstFourNumbers[2];
    String massiveFour = massiveGetFirstFourNumbers[3];
    String massiveFive = massiveGetFirstFourNumbers[4];

    //        - Вывести на экран в одну строку два первых блока по 4 цифры.
    public void getFirstFourNumbers() {
        System.out.print("Два первых блока по 4 цифры: " + massiveOne + " " + massiveThree + "\n");
    }

    //       - Вывести на экран номер документа, но блоки из трех букв заменить
    //       на *** (каждая буква заменятся на *)
    public void getStarLetter() {
        StringBuilder changeLetterToStar = new StringBuilder();
        String massiveTwoStar = massiveTwo.replaceAll(massiveTwo, "***");
        String massiveFourStar = massiveFour.replaceAll(massiveFour, "***");
        changeLetterToStar.append(massiveOne + "-").append(massiveTwoStar + "-").append(massiveThree + "-").append(massiveFourStar + "-").append(massiveFive);
        System.out.println("Блоки из трёх букв заменить на *: " + changeLetterToStar.toString());
    }

    //    - Вывести на экран только одни буквы из номера документа в формате
//    yyy/yyy/y/y в нижнем регистре.
    public void getLetterBottomRegister() {
        char[] strMassiveFive = massiveFive.toCharArray();
        char letter;
        String twoLetter;
        StringBuilder twoFindLetter = new StringBuilder();
        for (int i = 0; i < strMassiveFive.length; i++) {
            letter = strMassiveFive[i];
            boolean letterTrueFalse = Character.isDigit(letter);
            if (letterTrueFalse) {
            } else {
                twoFindLetter.append(strMassiveFive[i]);
            }
        }
        System.out.println("Искомое: " + twoFindLetter);
        System.out.println();
        StringBuilder letterBottomRegister = new StringBuilder();
        letterBottomRegister.append(massiveTwo + "/").append(massiveFour + "/").append(twoFindLetter);
        System.out.println("Буквы в нижнем регистре: " + letterBottomRegister);
    }
}

