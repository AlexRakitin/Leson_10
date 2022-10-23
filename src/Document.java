import java.util.Arrays;

public class Document {
    private final String docNumber = "1234-abv-5678-gde-9y0x";

    public String getDocNumber() {
        return this.docNumber;
    }


    //        - Вывести на экран в одну строку два первых блока по 4 цифры.
    public void getFirstFourNumbers() {
        String [] massiveGetFirstFourNumbers = this.docNumber.split("-");
//        for (int i = 0; i<2; i++){
//            System.out.print(massiveGetFirstFourNumbers[i]);
//        }
//        System.out.println(Arrays.toString(massiveGetFirstFourNumbers));
        System.out.print("Два первых блока по 4 цифры: " + massiveGetFirstFourNumbers[0]+" " + massiveGetFirstFourNumbers[2]);
    }
}
