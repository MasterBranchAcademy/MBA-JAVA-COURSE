package Day_22.Etut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

  /*      String [] isimler = {"Ahmet", "Mehmet","Ayse","John","Marry"};

        for (String isim : isimler) {
            System.out.println(isim);
        }*/




        //TASK

/*        int [] sayilar = new int[5];
        sayilar[0]=12;
        sayilar[1]=13;
        sayilar[2]=14;
        sayilar[3]=15;
        sayilar[4]=16;

        for (int sayi: sayilar) {
            System.out.println(sayi);
        }*/



        //task
/*
        double [] ondalikSayilar = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 1.0};

        double ucuncuSayi = ondalikSayilar[3];
        double yedinciSayi = ondalikSayilar[7];

        System.out.println(ucuncuSayi + yedinciSayi);*/


/*
        int [] sayilar = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0; i < sayilar.length ; i++) {
                   sayilar[i] = sayilar[i] + 5;
        }

        for (int sayi : sayilar) {
            System.out.println(sayi);
        }*/



        //TASK
/*        int [] sayilar = {1,2,3,4,5,6,7,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int girilenSayi = scanner.nextInt();


        for (int sayi : sayilar) {
            if(sayi == girilenSayi){
                System.out.println("geciyor");
                break;
            }else{
                System.out.println("gecmiyor");
            }
        }*/

        //TASK

        int [] arr_1 = {1,2,3,4,5,6,7,8,9,10};
        int [] arr_2 = {1,2,3,4,5,6,7,8,9,10};

        boolean flag = true;
        int index = 0;

        if(arr_1.length != arr_2.length){
            flag = false;
        }else{
            for (int sayi:arr_1) {
                if(sayi != arr_2[index]){
                    flag = false;
                    break;
                }
                index++;
            }
        }

        if(flag){
            System.out.println("Esittir");
        }else{
            System.out.println("Esit degildir");
        }




























    }
}
