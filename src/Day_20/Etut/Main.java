package Day_20.Etut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //TASK

        //replace()
 /*       String text = "Hello world!";

        String degistirilmisText = text.replace("Hello","Merhaba");
        System.out.println("degistirilmisText : " + degistirilmisText);*/


        //trim()

    /*    String text = "     Hello world!    ";

        System.out.println(">" + text + "<");

        String degistirilmisText = text.trim();

        System.out.println(">" + degistirilmisText + "<");*/


        //startsWith()

/*        String text = "Hello world!";

        boolean statu = text.startsWith("Hel");
        System.out.println("statu : " + statu);*/


        //endsWith()

   /*     String text = "Hello world!";

        boolean statu = text.endsWith("!fg");
        System.out.println("statu : " + statu);*/


        //Character

/*        String text = "Hello world!";
        String sayi = "5";

        boolean statu = Character.isLetter(text.charAt(0));

        //System.out.println("statu : " + statu);


        boolean statu1 = Character.isDigit(sayi.charAt(0));

        System.out.println("statu1 : " + statu1);*/


        //TASK
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz:");
        String girilenAd = scanner.nextLine();// master brach 30 erek

        String degistirilenAd = girilenAd.replace(girilenAd, "academy");
        System.out.println("degistirilenAd : " + degistirilenAd);*/


        //TASK

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir paragraf giriniz:");
        String girilenParagraf = scanner.nextLine();

        System.out.println("girilenParagraf : " + girilenParagraf);

        String kahramanIsmi = "Harry Potter".toUpperCase();

        String degistirilmisParagraf = girilenParagraf.replace("Keloğlan",kahramanIsmi);

        System.out.println("degistirilmisParagraf :" + degistirilmisParagraf);



*/



        //TASK
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 1. ogrenci ismini giriniz:");
        String birinciOgrenci = scanner.nextLine();

        System.out.println("Lutfen 2. ogrenci ismini giriniz:");
        String ikinciOgrenci = scanner.nextLine();

        System.out.println("Lutfen 3. ogrenci ismini giriniz:");
        String ucuncuOgrenci = scanner.nextLine();

        //System.out.println(birinciOgrenci + ", " + ikinciOgrenci + ", " + ucuncuOgrenci);

        if(birinciOgrenci.endsWith("t")){
            System.out.println(birinciOgrenci +"nny");
        }else{
            System.out.println(birinciOgrenci);
        }

        if(ikinciOgrenci.endsWith("t")){
            System.out.println(birinciOgrenci +"nny");
        }else{
            System.out.println(ikinciOgrenci);
        }

        if(ucuncuOgrenci.endsWith("t")){
            System.out.println(ucuncuOgrenci +"nny");
        }else{
            System.out.println(ucuncuOgrenci);
        }*/



        Utilities utilities = new Utilities();

        String isim = "ahmet";//Ahmet

        String ilkKarakterBuyuk = utilities.ilkHarfBuyuk(isim);//String ilkKarakterBuyuk = Ahmet

        System.out.println("ilkKarakterBuyuk "  + ilkKarakterBuyuk);





















    }
}
