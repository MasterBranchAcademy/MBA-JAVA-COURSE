package Day_19.Kayit;

public class EqualIgnorecase_practice {
    public static void main(String[] args) {

        String text_1 = "TEST";
        String text_2 = "test";

        boolean metinlerEsitMi = text_1.equalsIgnoreCase(text_2);
        System.out.println("metinlerEsitMi = " + metinlerEsitMi);
    }
}
