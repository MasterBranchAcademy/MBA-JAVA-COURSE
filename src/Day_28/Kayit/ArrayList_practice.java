package Day_28.Kayit;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayList_practice {
    public static void main(String[] args) {


/*
        //Array
        String [] cars = new String[10];
        String [] cars1 = {"BMW","Mercedes","Toyota"};

        //Arraylist
        ArrayList<Integer> sayilar = new ArrayList<>();
        ArrayList<Integer> sayilar1 = new ArrayList<>(Arrays.asList(1,3,65,34,3,3));

*/


        //ArrayListe eleman ekleme
/*        ArrayList<Integer> sayilar = new ArrayList<>();

        sayilar.add(10);
        sayilar.add(12);
        sayilar.add(100);*/

        //TASK

/*        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");
        names.add("Dave");

        System.out.println(names);*/


        //TASK
/*
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        System.out.println(numbers);
        System.out.println(numbers.get(0));*/



        //TASK
/*        ArrayList<Integer> intList = new ArrayList<>();

        intList.add(101);
        intList.add(202);
        intList.add(303);
        intList.add(404);
        intList.add(505);

        System.out.println(intList.get(0));
        System.out.println(intList.get(3));*/


        //TASK

 /*       ArrayList<String> stringlist = new ArrayList<>();

        stringlist.add("apple");
        stringlist.add("banana");
        stringlist.add("cherry");
        stringlist.add("date");
        stringlist.add("elderberry");

        System.out.println(stringlist.get(2));
        System.out.println(stringlist.get(4));*/



        //TASK

/*        ArrayList<String> cars = new ArrayList<>();

        cars.add("BMW");
        cars.add("Mercedes");
        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);*/


        //TASK

/*        ArrayList<Integer> numberList = new ArrayList<>();

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        numberList.add(50);
        System.out.println("Tam list : " + numberList);

        numberList.remove(3);

        System.out.println("3. index silindikten sonra : " + numberList);*/



       //TASK

/*       ArrayList<String> cars = new ArrayList<>();
       cars.add("BMW");
       cars.add("Mercedes");
       cars.add("Toyota");

       System.out.println(cars.size());*/





        //TASK
/*
        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(45);
        sayilar.add(6);
        sayilar.add(456);
        sayilar.add(4);
        sayilar.add(7);

        System.out.println(sayilar.size());

        if(sayilar.size()<5){
            System.out.println("Arraylist boyutu 5ten kucuk");
        } else if (sayilar.size()>5) {
            System.out.println("Arraylist boyutu 5ten buyuk");
        }else{
            System.out.println("Arraylist boyutu 5 e esit");
        }*/



/*        //set()
        //task

        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes");

        System.out.println("Orjinal liste: " + cars);

        cars.set(0,"Ford");

        System.out.println("Degistirilen liste: " + cars);*/


        //TASK

/*        ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Mercedes1");
        cars.add("Mercedes2");
        cars.add("Mercedes3");
        cars.add("Mercedes4");
        cars.add("Mercedes5");
        cars.add("Mercedes6");
        cars.add("Mercedes7");

        System.out.println(cars);

        if(cars.size() > 5){
            System.out.println("Liste boyutu 5 ten buyuk");
            cars.set(6, "6nci indexteki eleman degistirildi");
        }else{
            System.out.println("Liste boyutu 5 ten kucuk");
            cars.add("Yeni eleman eklendi");
        }

        System.out.println(cars);*/





        //isEmpty()
        //TASK
/*
        ArrayList<String> cars = new ArrayList<>();

        System.out.println(cars.isEmpty());

        cars.add("toyota");

        if(cars.isEmpty()){
            cars.add("Ilk eleman eklendi");
            System.out.println(cars);
        }else{
            cars.set(0, "mercedes");
            System.out.println(cars);
        }
*/




        //Collection.sort()
        //TASK

        ArrayList<Character> karakterler = new ArrayList<>();
        karakterler.add('d');
        karakterler.add('g');
        karakterler.add('a');
        karakterler.add('t');
        karakterler.add('b');
        karakterler.add('c');
        karakterler.add('u');


        System.out.println("Orjinal arrayList: " + karakterler);

        Collections.sort(karakterler);

        System.out.println("siralanmis arrayList: " + karakterler);

        Collections.reverse(karakterler);

        System.out.println("ters siralanmis arrayList: " + karakterler);









    }
}
