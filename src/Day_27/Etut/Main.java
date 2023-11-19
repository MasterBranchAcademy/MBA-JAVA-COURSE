package Day_27.Etut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*        //autoboxing

        int x=5;

        Integer objectSayi = x;
        Integer objectSayi2 = 10;

        Integer number = new Integer(12);

        //auto-unboxing

        int primitiveSayi = objectSayi;
        int primitiveSayi2 = objectSayi2;*/





        //task
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen alisveris tutarini giriniz:");
        Double alisverisTutarini = scanner.nextDouble();//50

        System.out.println("lutfen odenen tutarini giriniz:");
        Double odenenTutarini = scanner.nextDouble();//70

        Double paraUstu = odenenTutarini - alisverisTutarini;
        System.out.println("paraUstu : " + paraUstu);*/


        //task
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen yasinizi giriniz:");
        Integer yas = scanner.nextInt();

        System.out.println("yas : " + yas);

        Boolean yasDurumu = yas >=18;

        if(yasDurumu){
            System.out.println("18 yasindan buyuksunuz, ehliyet alabilirsiniz");
        }else{
            System.out.println("Ehliyet almak icin yasiniz henuz uygun degil");
        }*/



        //TASK
/*

        String shirt = "$20";
        String shorts = "$30";
        String shoes = "$30";

        String toplam = "$80";

        //System.out.println(shirt + shorts + shoes);

        String shirtArr = shirt.replace("$","");
        String shortsArr = shorts.replace("$","");
        String shoesArr = shoes.replace("$","");
        String toplamArr = toplam.replace("$","");

        System.out.println(shirtArr + shortsArr + shoesArr);

        Integer shirtInt = Integer.parseInt(shirtArr);
        Integer shortsInt = Integer.parseInt(shortsArr);
        Integer shoesInt = Integer.parseInt(shoesArr);

        Integer toplamInt = Integer.parseInt(toplamArr);

        System.out.println(shirtInt+shortsInt+shoesInt );

        String ToplamDurumu = (shirtInt+shortsInt+shoesInt == toplamInt)?"Esit":"Esit degil";

        System.out.println(ToplamDurumu);

*/


        //TASK
/*
        String senston = "€49.99";
        String net = "€54.8";
        String timo = "€13.89";

        String toplam = "€118.68";

        String senstonArr = senston.replace("€","");
        String netArr = net.replace("€","");
        String timoArr = timo.replace("€","");
        String toplamArr = toplam.replace("€","");

        System.out.println(senstonArr + ", "+netArr+ ", "+timoArr+ ", "+toplamArr);

        Double senstonInt = Double.parseDouble(senstonArr);
        Double netInt = Double.parseDouble(netArr);
        Double timoInt = Double.parseDouble(timoArr);
        Double toplamInt = Double.parseDouble(toplamArr);

        System.out.println(senstonInt + netInt + timoInt);
        System.out.println(toplamInt);

        String sonuc = (senstonInt + netInt + timoInt == toplamInt)?"Esit":"Esit degil";

        System.out.println(sonuc);*/




















    }
}
