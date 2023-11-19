package Day_15;

public class Ev {
    public static void main(String[] args) {

/*        Ahmet ahmet = new Ahmet();

        Ayse ayse = new Ayse();

        double toplamGelir = ahmet.ahmetGelir() + ayse.ayseGelir();
        double toplamGider = ahmet.ahmetGider() + ayse.ayseGider();

        double biriktirilen = toplamGelir - toplamGider;
        System.out.println(biriktirilen);*/



        OturmaOdasi oturmaOdasi = new OturmaOdasi();
        YatakOdasi yatakOdasi   = new YatakOdasi();
        Banyo banyo             = new Banyo();

        double oturmaOdasiuzunluk = 12.5;
        double oturmaOdasiGenislik =10;

        double oturmaOdasiAlan = oturmaOdasi.hesaplaDikdortgenAlan(oturmaOdasiuzunluk, oturmaOdasiGenislik);
        System.out.println(oturmaOdasiAlan);

        double kenar = 10;
        double yatakOdasiAlan  = yatakOdasi.hesaplaKareAlan(kenar);
        System.out.println(yatakOdasiAlan);

        double taban = 5;
        double yukseklik = 4;
        double banyoAlan = banyo.hesaplaUcgenAlan(taban, yukseklik);
        System.out.println(banyoAlan);


        System.out.println(oturmaOdasiAlan + yatakOdasiAlan + banyoAlan);
















    }
}
