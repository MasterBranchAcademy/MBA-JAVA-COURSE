package Day_20.Kayit;

import java.util.Scanner;

public class startsWith_endsWith_practice {
    public static void main(String[] args) {

     /*   String name = "xaster";

        boolean isStartsWith = name.startsWith("m");
        //System.out.println("isStartsWith = " + isStartsWith);

        boolean isEndsWith = name.endsWith("p");
        System.out.println("isEndsWith = " + isEndsWith);*/







        //TASK

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz: ");
        String metin = scanner.nextLine();

        boolean isStartsWith = metin.startsWith("m");
        System.out.println("isStartsWith = " + isStartsWith);

        boolean isEndsWith = metin.endsWith("y");
        System.out.println("isEndsWith = " + isEndsWith);

















    }
}
