package Day_23.Etut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        for (String isim :isimlist()) {
            System.out.println("isim : " + isim);
        }
    }
    public static String [] isimlist(){
        String [] isimler = new String[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 5 tane isim giriniz: ");

        for (int i = 0; i <isimler.length ; i++) {
            isimler[i] = scanner.nextLine();
        }
        return isimler;
    }
























}
