package Day_37.Etut;

public class BaklagilBolgesi extends UrunBolgesi{
    @Override
    public void urunListele() {
        System.out.println("Urun listesi: Nohut, fasulye, mercimek");
    }

    @Override
    public void stokKontrol() {
        System.out.println("Stok kontrol edildi");
    }
}
