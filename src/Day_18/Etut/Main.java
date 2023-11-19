package Day_18.Etut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String kelime = scanner.nextLine();

        System.out.println("kelime : " + kelime);

        int kelimeUzunlugu = kelime.length();
        System.out.println("kelimeUzunlugu : " + kelimeUzunlugu);

        char ilkKarakter = kelime.charAt(0);
        System.out.println("ilkKarakter : " + ilkKarakter);

        String birlesmisKelime = kelime.concat("concatenation");
        System.out.println("birlesmisKelime :" + birlesmisKelime);

        String substring = kelime.substring(1);
        System.out.println("substring : " + substring);

        String kelimeBuyuk = kelime.toUpperCase();
        System.out.println("kelimeBuyuk : " + kelimeBuyuk);

*/



        //TASK

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String girilenKelime = scanner.nextLine();

        System.out.println("girilenKelime : " + girilenKelime);

        int ortaIndex = girilenKelime.length()/2;
        System.out.println("ortaIndex : " + ortaIndex);

        char ortadakiKarakter = girilenKelime.charAt(ortaIndex);
        System.out.println("ortadakiKarakter : " + ortadakiKarakter);*/



        //TASK
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String girilenCumle = scanner.nextLine();

        System.out.println("girilenCumle : " + girilenCumle);

        int ortaIndex = girilenCumle.length()/2;//25:2 = 13

        String ikinciSubstring = girilenCumle.substring(ortaIndex);
        System.out.println("ikinciSubstring : " + ikinciSubstring);

        String birinciSubstring = girilenCumle.substring(2,ortaIndex);
        System.out.println("birinciSubstring : " + birinciSubstring);*/


        //TASK
/*       Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String girilenKelime = scanner.nextLine();

        System.out.println("girilenKelime : " + girilenKelime);

        int kelimeUzunluk = girilenKelime.length();
        System.out.println("kelimeUzunluk : " + kelimeUzunluk);

        if(kelimeUzunluk > 5){
            String ilkUcHarf = girilenKelime.substring(0,3);
            System.out.println("ilkUcHarf : " + ilkUcHarf);
        }else{
            String sonIkiHarf = girilenKelime.substring(girilenKelime.length() - 2);//4 - 2 =2
            System.out.println("sonIkiHarf : " + sonIkiHarf);
        }*/


        //TASK

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String girilenKelime = scanner.nextLine();

        System.out.println("girilenKelime : " + girilenKelime);

        int uzunluk = girilenKelime.length();
        int index = 0;//012345

        while (index < uzunluk){//5

            char karakter = girilenKelime.charAt(index);

            String yeniString = karakter + "nny";
            System.out.println("yeniString : " + yeniString);

            index++;
        }*/



        //task
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz:");
        String girilenKelime = scanner.nextLine();

        System.out.println("girilenKelime : " + girilenKelime);


        for (int i = girilenKelime.length()-1; i >=0 ; i--) {
            char karakter = girilenKelime.charAt(i);
            System.out.print(karakter);
        }*/
















    }
}
