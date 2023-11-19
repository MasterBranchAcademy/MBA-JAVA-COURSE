package Day_11;

public class OgrenciBilgiFormu {
    public static void main(String[] args) {
        String ad = "Mehmet";
        String soyad = "Gursu";
        int dogumTarihi = 1985;
        char ehliyetSinifi = 'B';
        boolean aktif = false;
        ogrenciBilgileri(ad, soyad,dogumTarihi,ehliyetSinifi,aktif);

    }
    public static void ogrenciBilgileri(String ad, String soyad, int dogumTarihi, char ehliyetSinifi, boolean aktif){
        System.out.println("Ogrenci Bilgi Formu:\n" + "ad: " + ad +"\n"+ "soyad: " + soyad +"\n"+ "dogum tarihi: " + dogumTarihi +"\n"+ "Ehliyet sinifi: " + ehliyetSinifi +"\n"+ "Ogrecinin devam durumu: " + aktif);
    }
}
