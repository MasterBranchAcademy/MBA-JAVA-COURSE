package Day_16;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    /*    Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz:");
        int sayi  = scanner.nextInt();
        System.out.println(sayi*sayi);*/



        //TASK
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Luften karenin bir kenar uzunlugunu giriniz:");

        double kenarUzunlugu = scanner.nextDouble();

        System.out.println("kenarUzunlugu : " + kenarUzunlugu);

        double alan = kenarUzunlugu * kenarUzunlugu;

        System.out.println("alan : " + alan);

        double cevre = kenarUzunlugu*4;

        System.out.println("cevre : " + cevre);*/




        //task

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("yas : " + yas);

        if(yas >= 18){
            System.out.println("Ehliyet alabilirsiniz");
        }else{
            System.out.println("Ehliyet alamazsiniz");
        }*/





        //task

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ehliyet turunu giriniz:");
        String ehliyetTuru = scanner.nextLine();

        System.out.println("ehliyetTuru : " + ehliyetTuru);

        String ehliyet = ehliyetTuru.toUpperCase();

        switch (ehliyet){
            case "A":
                System.out.println("Motosiklet kullanabilirsiniz");
                break;
            case "B":
                System.out.println("Otomobil ve minibus kullanabilirsiniz");
                break;
            case "C":
                System.out.println("kamyon ve otobus kullanabilirsiniz");
                break;
            default:
                System.out.println("Gecersiz ehliyet turu");
        }*/



        //TASK

 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz: ");

        int sayi = scanner.nextInt();

        System.out.println("sayi : " + sayi);

        double sayininKarakoku = Math.sqrt(sayi);
        System.out.println("sayininKarakoku : " + sayininKarakoku);*/

/*
        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir ondalik sayi giriniz");
        double Sayi=scanner.nextDouble();
        System.out.println("ondalik sayi:"+Sayi);
        double ondalikSayi=Math.floor(Sayi);
        System.out.println("ondalik sayi:"+ondalikSayi);*/



        //TASK

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ondeliik bir sayi giriniz:");
        double ondalikSayi = scanner.nextDouble();

        System.out.println("ondalikSayi : " + ondalikSayi);

        double yuvarlanmisSayiRound = Math.round(ondalikSayi);
        double yuvarlanmisSayifloor = Math.floor(ondalikSayi);

        System.out.println("yuvarlanmisSayiRound : "  + yuvarlanmisSayiRound);
        System.out.println("yuvarlanmisSayifloor : "  + yuvarlanmisSayifloor);*/


  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir ust sinir giriniz:");
        int ustSinir = scanner.nextInt();

        System.out.println("ustSinir : " +ustSinir);
*/
        Random random = new Random();
        int rastgeleSayi = random.nextInt(100)+1;

        System.out.println("rastgeleSayi : " + rastgeleSayi);















    }
}
