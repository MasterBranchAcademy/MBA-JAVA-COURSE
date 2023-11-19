package Day_29.Kayit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayList_practice {
    public static void main(String[] args) {


        //TASK
/*        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i <10 ; i++) {
            int intRandom = random.nextInt(100) + 1;
            list.add(intRandom);
        }
        System.out.println(list);*/


        //TASK

/*        ArrayList<Integer> list = new ArrayList<>();

        list.add(19);
        list.add(56);
        list.add(5);
        System.out.println(list);

        for (int i = 0; i <list.size() ; i++) {
            list.set(i,5);
        }

        System.out.println(list);*/





        //task

/*        ArrayList<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(4);
        list.add(45);
        list.add(5);
        list.add(47);
        System.out.println("Orjinal liste: " + list);

        for (int i = list.size() -1; i >=0 ; i--) {
            int sayi = list.get(i);
            if(sayi%2 == 0){
                System.out.println(list.get(i));
                list.remove(i);
            }

        }
        System.out.println("Silinmis liste: " + list);*/






        //TASK
/*
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(97);
        list.add(46);
        list.add(57);
        list.add(3);
        System.out.println(list);

        for (int i = list.size() -1; i >=0 ; i--) {
            int sayi = list.get(i);
            if(sayi%2 == 0){
                list.remove(i);
            }
        }

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);


*/


/*

        //TASK
        ArrayList<Double> derecelendirme = new ArrayList<>();

        derecelendirme.add(5.5);
        derecelendirme.add(6.7);
        derecelendirme.add(1.2);
        derecelendirme.add(8.7);
        derecelendirme.add(9.2);

        int toplam=0;
        for (Double derece: derecelendirme) {
            toplam += derece;
        }

        System.out.println("toplam = " +toplam);
        double ortalama = toplam/derecelendirme.size();
        System.out.println("ortalama = " +ortalama);


        if(ortalama>8){
            System.out.println("Bu film mukemmel!!!");
        } else if (ortalama<= 8 && ortalama>=6) {
            System.out.println("Bu filmler oldukca iyi!");
        } else if (ortalama<6) {
            System.out.println("bu filmler pek iyi degil");
        }else{
            System.out.println("Gecersiz ortalama");
        }*/


        //task
/*
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("elma");
        fruits.add("muz");
        fruits.add("portakal");
        fruits.add("kiwi");
        fruits.add("mango");
        for (String meyve :fruits) {
            System.out.println(meyve);
        }

        ArrayList<String> upperCaseFruits = new ArrayList<>();

        for (String meyve :fruits) {
            upperCaseFruits.add(meyve.toUpperCase());
        }
        System.out.println(upperCaseFruits);*/

/*

        //TASK
        ArrayList<Double> temperatures = new ArrayList<>();
        temperatures.add(23.4);
        temperatures.add(27.9);
        temperatures.add(21.6);
        temperatures.add(19.8);
        temperatures.add(25.1);

        int toplam = 0;
        for (Double sicaklik:temperatures) {
            toplam+=sicaklik;
        }
        System.out.println("toplam = " + toplam);
        double ortalama = toplam/temperatures.size();
        System.out.println("ortalama = " + ortalama);

        ArrayList<Double> highTemperatures = new ArrayList<>();

        for (Double sicaklik:temperatures) {
            if(sicaklik>=25){
                highTemperatures.add(sicaklik);
            }
        }
        System.out.println(highTemperatures);

*/

/*       //TASK
       ArrayList<String> words =new ArrayList<>();
        words.add("elma");
        words.add("muz");
        words.add("kedi");
        words.add("kopek");
        words.add("fil");
        words.add("kurbaga");
        words.add("goril");
        System.out.println(words);

        ArrayList<String> longWords =new ArrayList<>();
        for (String kelime: words) {
            if(kelime.length()>4){
                longWords.add(kelime);
            }
        }
        System.out.println(longWords);*/

        //task
/*
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        int sayac=0;
        while (sayac<5){
            int sayi = random.nextInt(100) + 1;
            numbers.add(sayi);
           sayac++;
        }
        System.out.println(numbers);


        int index =0;
        int toplam =0;
        int min = numbers.get(0);
        int max = numbers.get(0);
        while(index < numbers.size()){
            int eleman = numbers.get(index);
            toplam+= eleman;

            if(eleman<min){
                min=eleman;
            }
            if(eleman>max){
                max=eleman;
            }

           index++;
        }
        System.out.println("toplam = " + toplam);
        System.out.println("min = " + min);
        System.out.println("max = " + max);*/



















    }
}
