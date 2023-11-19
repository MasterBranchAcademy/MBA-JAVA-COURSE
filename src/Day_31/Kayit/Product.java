package Day_31.Kayit;

public class Product {
    String ad;
    double fiyat;
    int miktar;

    public Product(String ad,double fiyat, int miktar){

        this.ad= ad;
        this.fiyat = fiyat;
        this.miktar = miktar;

        if(fiyat < 0 || miktar < 0){
            fiyat =0;
            miktar =0;
            System.out.println("Gecersiz fiyat veya miktar");
        }else{
            System.out.println("ad     : " + ad);
            System.out.println("fiyat  : " + fiyat);
            System.out.println("miktar : " + miktar);
        }

    }

}
