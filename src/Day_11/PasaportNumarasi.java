package Day_11;

public class PasaportNumarasi {
    public static void main(String[] args) {

        int dogumYili = 1985;
        String ilinKodu = "EST";
        String kutukNumarasi = "1G2G34";
        pasaportNumarasiOlustur(dogumYili, ilinKodu, kutukNumarasi);
    }
    public static void pasaportNumarasiOlustur(int dogumYili, String ilinKodu, String kutukNumarasi){
        String pasaportNumarasi = dogumYili + ilinKodu + kutukNumarasi;
        System.out.println("pasaportNumarasi = " + pasaportNumarasi);
    }
}
