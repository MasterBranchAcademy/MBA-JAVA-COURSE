package Day_7;

public class Bahceye_gidilen_gun_sayisi {
    public static void main(String[] args) {

        int gidilenGunSayisi =0;

        for (int i = 1; i <=365 ; i++) {
            if(i%7==1 && i%8==0 ){
                System.out.println("bahceye gidilmeli!!!");
                gidilenGunSayisi++;
            }
        }

        int saatlikucret = 50;
        System.out.println("toplamucret = " + gidilenGunSayisi*saatlikucret);













    }
}
