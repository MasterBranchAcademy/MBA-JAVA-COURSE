package Day_31.Etut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz:");
        int yas = scanner.nextInt();

        Ogrenci ogrenci_1 = new Ogrenci("Ahmet","vural", yas);

        System.out.println(ogrenci_1.ehliyetYetkinligi());*/


 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen vize sonucunu giriniz:");
        Double vizeSonucunu = scanner.nextDouble();

        System.out.println("Lutfen final sonucunu giriniz:");
        Double finalSonucunu = scanner.nextDouble();

        Ogrenci matematik = new Ogrenci(vizeSonucunu,finalSonucunu);
        System.out.println(matematik.ortalama());*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz:");
        String isim = scanner.nextLine();

        System.out.println("Lutfen gelir giriniz:");
        Double gelir = scanner.nextDouble();

        System.out.println("Lutfen gider giriniz:");
        Double gider = scanner.nextDouble();

        Ogrenci bursDurumu = new Ogrenci(isim,gelir,gider);

        String mesaj = bursDurumu.burs();
        System.out.println(mesaj);






















    }

}
