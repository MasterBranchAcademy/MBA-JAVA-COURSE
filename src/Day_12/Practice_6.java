package Day_12;

public class Practice_6 {
    public static void main(String[] args) {

        int dogumTarihi = 2015;
        int mevcutYil = 2023;

        int kisinnYasi = yasHesaplama(dogumTarihi, mevcutYil);//int kisinnYasi = 8
        System.out.println("kisinnYasi = " + kisinnYasi);

        String yeterlilik = ehliyetYeterliligi(kisinnYasi);
        System.out.println("yeterlilik = " + yeterlilik);
    }

    public static int yasHesaplama(int dogumTarihi, int mevcutYil){
        int yas = mevcutYil - dogumTarihi;
        return yas;
    }

    public static String ehliyetYeterliligi(int yas){
        String mesaj = "";
        if(yas > 18){
            mesaj  = "Ehliyet almaya hakkiniz var";
        }else{
            mesaj = "Ehliyet almaya hakkiniz yok";
        }
        return mesaj;
    }



}
