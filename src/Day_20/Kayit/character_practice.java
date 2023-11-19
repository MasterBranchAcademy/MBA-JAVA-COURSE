package Day_20.Kayit;

import java.util.Scanner;

public class character_practice {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();

        int boslukSayisi =0;

        for (int i = 0; i < metin.length(); i++) {
            if(Character.isWhitespace(metin.charAt(i))){//m
                boslukSayisi++;
            }
        }

        System.out.println("boslukSayisi = " + boslukSayisi);












    }
}
