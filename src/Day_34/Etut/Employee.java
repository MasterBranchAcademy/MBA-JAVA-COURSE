package Day_34.Etut;

public class Employee {

    String adSoyAd;
    int calisilanSaat;
    final double saatlikUcret= 20;

    public Employee(String adSoyAd, int calisilanSaat) {
        this.adSoyAd = adSoyAd;
        this.calisilanSaat = calisilanSaat;
    }

    public void maasHesapla(){
        double maas = saatlikUcret * calisilanSaat;

        System.out.println("Calisan adi soyadi: " + adSoyAd);
        System.out.println("Calisilan saat    :" + calisilanSaat);
        System.out.println("Maas              :" + maas);
    }
}
