package Day_37.Etut;

public class SutUrunleriBolgesi extends  UrunBolgesi{
    @Override
    public void urunListele() {
        System.out.println("Urun listesi: sut, yogurt, peynir");
    }

    @Override
    public void stokKontrol() {
        System.out.println("Stok kontrol edildi");
    }
}
