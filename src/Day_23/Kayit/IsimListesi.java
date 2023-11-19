package Day_23.Kayit;

public class IsimListesi {
    public static void main(String[] args) {

        for (String isim: classNameList()) {
            System.out.println("isim = " + isim);
        }

    }

    public static String[] classNameList(){

        String [] isimler = {"John", "Marry", "Mike"};
        return isimler;
    }











}
