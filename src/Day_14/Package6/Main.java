package Day_14.Package6;

public class Main {
    public static void main(String[] args) {

        UcgenAlan ucgenAlan = new UcgenAlan();

        double uzunluk = 15.5;
        double yukseklik = 10;

        double alan = ucgenAlan.alanHesapla(uzunluk, yukseklik);
        System.out.println("alan = " + alan);

        int      x  = 5;
        //double alan = alanHesapla(uzunluk, yukseklik);//50
        System.out.println("x    = " + x);
        System.out.println("alan = " + alan);
    }

    public static double alanHesapla( double uzunluk, double yukseklik ){
        double alan = (uzunluk*yukseklik)/2;//(10*10)/2= 50
        return alan;//50
    }
}
