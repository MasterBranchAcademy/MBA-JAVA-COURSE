package Day_14.Package4;

public class Main {
    public static void main(String[] args) {

        Araba araba = new Araba();

        System.out.println("ilk Degerler:");
        System.out.println("markaIsmi   :" + araba.markaIsmi);
        System.out.println("satisFiyati :" +araba.satisFiyati);
        System.out.println("piyasadaMi  :" +araba.piyasadaMi);

        System.out.println("////////////////////////////////");

        araba.markaIsmi = "Toyota";
        araba.satisFiyati= 75000;
        araba.piyasadaMi= false;

        System.out.println("Degisen Degerler:");
        System.out.println("markaIsmi   :" + araba.markaIsmi);
        System.out.println("satisFiyati :" +araba.satisFiyati);
        System.out.println("piyasadaMi  :" +araba.piyasadaMi);

    }
}
