package Day_12;

public class Practice_5 {
    public static void main(String[] args) {

        double otomasyonYuzdesi = 65;
        System.out.println(mesajVer(otomasyonYuzdesi));
    }
    public static String mesajVer(double otomasyonYuzdesi){
        String mesaj = "";
        if(otomasyonYuzdesi == 0){
           mesaj = "Henuz hic otomasyonlastirma yapilmadi";
        } else if (otomasyonYuzdesi>0 && otomasyonYuzdesi<50) {
            mesaj = "Otomasyonlastirilan testlerin yuzdesi dusuk";
        } else if (otomasyonYuzdesi >= 50) {
            mesaj = "Testlerin buyuk bir kismi otomasyonlatirildi";
        }else{
            mesaj = "Gecersiz otomasyon yuzdesi";
        }

        return mesaj;
    }
}
