package Day_19.Kayit;

import java.util.Scanner;

public class contains_practice {
    public static void main(String[] args) {
/*
        String text_1 = "test";
        String text_2 = "a";

        boolean iceriyorMu = text_1.contains(text_2);
        System.out.println("iceriyorMu = " + iceriyorMu);*/



        //TASK

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz:");
        String cumle = scanner.nextLine();

        System.out.println("Lutfen bir kelime giriniz:");
        String kelime = scanner.nextLine();

        if(cumle.contains(kelime)){
            System.out.println(cumle + "' cumlesi "+ kelime + " kelimesini iceriyor");
        }else{
            System.out.println(cumle + "' cumlesi "+ kelime + " kelimesini icermiyor");
        }*/


        //TASK
/*

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isimleri giriniz:");
        String isimler = scanner.nextLine();

        System.out.println("Lutfen hedef ismi giriniz:");
        String hedefIsim = scanner.nextLine();

        if(isimler.contains(hedefIsim)){
            System.out.println(hedefIsim + " bulundu");
        }else{
            System.out.println(hedefIsim + " bulunamadi");
        }
*/




        ///TASK

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen metin giriniz:");
        String metin = scanner.nextLine();


        System.out.println("Lutfen parola giriniz:");
        String parola = scanner.nextLine();

        if(metin.contains(parola)){
            int parolaIndex = metin.indexOf(parola);
            System.out.println("parola: " + parola +" "+ parolaIndex + " indexte bulundu");
        }else{
            System.out.println("parola bulunamadi");
        }














    }
}
