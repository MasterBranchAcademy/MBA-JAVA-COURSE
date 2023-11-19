package Day_29.Etut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        ArrayList<Integer> sayilar = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        for (Integer sayi : sayilar) {
            System.out.println(sayi);
        }*/

/*
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.println("lutfen bir sayi giriniz:");
            int gelenSayi = scanner.nextInt();
            sayilar.add(gelenSayi);
        }

        for (int i = 0; i <sayilar.size() ; i++) {
            System.out.print(sayilar.get(i) +", ");
        }*/


        //TASK
/*        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        int toplam=0;
        while (true){
            System.out.println("Lutfen bir sayi giriniz:");
            int sayi = scanner.nextInt();

            if(sayi == 0){
                break;
            }
            toplam += sayi;
            sayilar.add(sayi);

        }
        System.out.println("toplam : " + toplam);
        System.out.println(sayilar);*/




        //task
/*
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> enIyiArkadaslar = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.println("Lutfen en iyi arkadasinizin ismini giriniz:");
            String isim = scanner.nextLine();
            enIyiArkadaslar.add(isim);
        }

        System.out.println(enIyiArkadaslar);

        String yeniIsim = "";
        for (String arkadasIsmi:enIyiArkadaslar) {
            yeniIsim += arkadasIsmi.charAt(0);
        }

        System.out.println("yeniIsim : " + yeniIsim);
*/

/*        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> sayilar = new ArrayList<>();

        while (true){
            System.out.println("Lutfen bir sayi giriniz:");
            int sayi = scanner.nextInt();

            if(sayi == 0){
                break;
            }

            if(sayi%2 == 0) {
                sayilar.add(sayi);
            }
        }

        System.out.println(sayilar);*/















    }
}
