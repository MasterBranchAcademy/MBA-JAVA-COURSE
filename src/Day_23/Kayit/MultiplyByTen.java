package Day_23.Kayit;

public class MultiplyByTen {
    public static void main(String[] args) {

        int [] sayilar = {1,2,3,4,5,6,7,8,9,10};
        multiplyByTen(sayilar);
    }

    public static void multiplyByTen(int [] sayilar){
        for (int sayi : sayilar) {
            System.out.println("sonuc = " + sayi * 10);
        }
    }















}
