package Day_22.Kayit;

import java.util.Scanner;

public class Array_practice {
    public static void main(String[] args) {

/*
        int x;
        double y;
        String z;

        char ch = 'C';

        String ogrenci_id_1 = "gwer98_45";
        String ogrenci_id_2 = "gwer98_467";
        String ogrenci_id_3 = "gwer98_4665";
        String ogrenci_id_4 = "gwer98_454";
        String ogrenci_id_5 = "gwer98_435";


        int [] xx;
        double [] yy;
        String [] zz;*/

        //ARRAY OLUSTURMA
/*
        //1
        char [] chch = {'A','B','C'};

        //2
        char [] xxxx= new char[10];
        String [] isim_listesi = new String[100];


        //Array ogelerine erisim

        String [] liste = {"elma","kiraz","muz"};*/

      /*  System.out.println(liste[0]);
        System.out.println(liste[1]);
        System.out.println(liste[2]);*/

   /*     int [] numbers = {12,3,34,4,455,577};
        System.out.println(numbers[2]);*/





        //task

/*        int [] sayi_listesi = {5,10,15,20,25};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 0 ile 4 arasinda bir sayi giriniz:");
        int girilen_sayi = scanner.nextInt();

        if(girilen_sayi>=0 && girilen_sayi<=4){
            System.out.println(sayi_listesi[girilen_sayi]);
        }else{
            System.out.println("Gecersiz sayi");
        }*/


        //TASK

 /*       String [] meyve_listesi = {"elma", "muz","kiraz","hurma","ebegumeci"};



        String ikinciEleman = meyve_listesi[1];

        System.out.println("ikinciEleman = " + ikinciEleman);

        System.out.println(ikinciEleman.charAt(0));*/


        //TASK

/*        int [] sayi_listesi = {3,5,7,9,11,13};

        int birinciEleman = sayi_listesi[0];
        int ucuncuEleman = sayi_listesi[2];
        int besinciEleman = sayi_listesi[4];

        System.out.println(birinciEleman + ucuncuEleman + besinciEleman);

        System.out.println(sayi_listesi[0] + sayi_listesi[2] + sayi_listesi[4]);*/

    //Array degeri atama

    String [] meyve_listesi = {"elma","portakal","muz","armut"};

    String [] sebze_listesi = new String[5];
    sebze_listesi[0]="patlican";
    sebze_listesi[1]="Marul";
    sebze_listesi[2]="sogan";
    sebze_listesi[3]="sarimsak";
    sebze_listesi[4]="maydonoz";

    //System.out.println(sebze_listesi[3]);

    //Array deger degistirme
     meyve_listesi[0]="Ananas";
     //System.out.println(meyve_listesi[0]);

     sebze_listesi[4]="Domates";
     //System.out.println(sebze_listesi[4]);




     //TASK

/*        int [] sayiListesi = {1,2,3,4,5};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int girilenSayi = scanner.nextInt();

        if(girilenSayi>= 0 && girilenSayi<=4){
            sayiListesi[girilenSayi] = 100;
        }else{
            System.out.println("sayi gecersiz");
        }

        System.out.println(sayiListesi[2]);*/


/*        String [] isimListesi = {"Ahmet", "Mehmet", "Ayse"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz:");
        int girilenSayi = scanner.nextInt();


        if(girilenSayi>=0 && girilenSayi<= 4){
            isimListesi[girilenSayi]= "John";
        }else{
            System.out.println("Gecersiz sayi!!!");
        }

        System.out.println("Degistirilen isim: " + isimListesi[girilenSayi]);*/



        //Array uzunluk
/*
        String [] cars = {"BMW","Mercedes","Mazda","Volvo"};
        //System.out.println(cars.length);

        int [] sayilar = {10,20,30,40,50};

        //System.out.println("sayilar arrayinin uzunlugu : " + sayilar.length);

        //System.out.println(sayilar[0]);

        for (int sayi : sayilar) {
            System.out.println("sayi : " + sayi);
        }*/
/*


        //TASK

        int [] array_1 = {1,3,5,7,9};
        int [] array_2 = {2,4,6,8,10};

        int [] array_3 = new int[array_1.length];

        for (int i = 0; i <array_1.length ; i++) {
           array_3[i] = array_1[i] + array_2[i];
        }

        for (int arr_1:array_1) {
            System.out.println("arr_1 = " + arr_1);
        }
        System.out.println("//////////////////");
        for (int arr_2:array_2) {
            System.out.println("arr_2 = " + arr_2);
        }
        System.out.println("//////////////////");
        for (int arr_3:array_3) {
            System.out.println("arr_3 = " + arr_3);
        }
*/



        //TASK

/*        int [] sayilar = {3,1,56,0,23};

        int min = sayilar[0];
        int max = sayilar[0];

        for (int i = 0; i < sayilar.length; i++) {
            if(sayilar[i] < min){//0 < 3//true
                min = sayilar[i];//min = 0
            }

            if(sayilar[i] > max){
                max = sayilar[i];
            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);*/





/*        int sayilar [] = {2,4,6,8,10};

        int toplam=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam+=sayilar[i];
        }

        System.out.println("toplam = " + toplam);
        System.out.println("ortalama = " + toplam/sayilar.length);*/




        //TASK

/*
        int [] sayilar = {1,2,3,4,5,2,4,6,7};

        for (int i = 0; i <sayilar.length ; i++) {// 0 1 2 3 4 5 6 7 8
            for (int j = i + 1; j <sayilar.length ; j++) {
                if(sayilar[i] == sayilar[j]){// i = 2, j = 1,2,3,4,5,6,7
                    System.out.println(sayilar[i]);
                    break;
                }
            }
        }
*/




        //Arrayleri yazdirma

 /*    String [] isim_listesi = {"John" , "Marry", "David","Ali"};

        for (String  isim : isim_listesi) {
            System.out.println("isim = " + isim);
        }*/


        //task

/*        double [] puanListesi = {23, 34.5, 50, 85.7, 100};

        for (double puan :puanListesi) {
            puan +=10;
            System.out.println("puan = " + puan);
        }*/



        // task

        String [] isim_listesi = {"Ahmet", "Mehmet", "Ali"};

        for (String isim : isim_listesi) {
           char ilkkarakter =  isim.charAt(0);
            System.out.println("ilkkarakter = " + ilkkarakter);
        }
















    }
}
