package Day_7;

public class Calisma_ucreti {

    public static void main(String[] args) {

        String gun = "pazar";
        int mesaiUcreti;
        int calisilanSaat;
        int toplamUcret;

        switch (gun){
            case "pazartesi":
                 mesaiUcreti = 10;
                 calisilanSaat = 5;
                 toplamUcret = mesaiUcreti * calisilanSaat;
                System.out.println("Bugun kazanciniz : " + toplamUcret);
                break;
            case "sali":
                 mesaiUcreti = 12;
                 calisilanSaat = 5;
                 toplamUcret = mesaiUcreti * calisilanSaat;
                System.out.println("Bugun kazanciniz : " + toplamUcret);
                break;
            case "carsamba":
                mesaiUcreti = 8;
                calisilanSaat = 10;
                toplamUcret = mesaiUcreti * calisilanSaat;
                System.out.println("Bugun kazanciniz : " + toplamUcret);
                break;
            case "persembe":
                mesaiUcreti = 7;
                calisilanSaat = 12;
                toplamUcret = mesaiUcreti * calisilanSaat;
                System.out.println("Bugun kazanciniz : " + toplamUcret);
                break;
            case "cuma":
                mesaiUcreti = 12;
                calisilanSaat = 5;
                toplamUcret = mesaiUcreti * calisilanSaat;
                System.out.println("Bugun kazanciniz : " + toplamUcret);
                break;
            case "cumartesi":
                mesaiUcreti = 30;
                calisilanSaat = 2;
                toplamUcret = mesaiUcreti * calisilanSaat;
                System.out.println("Bugun kazanciniz : " + toplamUcret);
                break;
            case "pazar":
                mesaiUcreti = 0;
                calisilanSaat = 0;
                toplamUcret = mesaiUcreti * calisilanSaat;
                System.out.println("Bugun tatil : " + toplamUcret);
                break;
            default:
                System.out.println("Gecersiz gun!!!!");

        }




















    }
}
