package Day_23.Kayit;

public class Array_dondurme {
    public static void main(String[] args) {

        int [] sayilar = {1,2,3,4,5,6,7,8,9};

        for (int arr: getEvenNumbers(sayilar)) {
            System.out.println(arr);
        }

    }
    public static int[] getEvenNumbers(int [] sayilar){

        int sayac =0;
        for (int sayi : sayilar) {
            if(sayi %2 == 0){
                sayac++;
            }
        }
        int [] ciftSayilar = new int[sayac];

        int index=0;
        for (int sayi: sayilar) {
            if(sayi %2 == 0){
                ciftSayilar[index] = sayi;
                index++;
            }

        }

        return ciftSayilar;
    }

















}
