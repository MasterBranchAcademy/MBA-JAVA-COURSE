package Day_6;

public class Kredibasvurusu_practice {
    public static void main(String[] args) {

        int maas = 2000;
        int ek_gelir = 1000;
        int yas = 9;


        String sonuc = ((maas>2000 || ek_gelir>= 1000) && yas>=18)? "kredi basvurusu onaylandi":"kredi basvurusu onaylanmadi";
                      //(false     ||    true  ) // true && false   = false
        System.out.println("sonuc = " + sonuc);














    }
}
