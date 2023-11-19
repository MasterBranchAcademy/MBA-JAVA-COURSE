package Day_26;

import java.util.Arrays;
import java.util.Scanner;

public class Pratik {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ogrenci bilgilerini giriniz:");
        String ogrenciBilgisi = scanner.nextLine();

        temelOgrenciBilgileri(ogrenciBilgisi);
    }

    public static void temelOgrenciBilgileri(String ogrenciBilgisi){
        String [] basliklar = {"Adi","Soyadi","Ulke","Alan"};
        String [] bilgiler = ogrenciBilgisi.split(",");
        System.out.println(Arrays.toString(bilgiler));

        for (int i = 0; i < basliklar.length ; i++) {
            System.out.println(basliklar[i] +"   "+ bilgiler[i]);
        }
    }






}
