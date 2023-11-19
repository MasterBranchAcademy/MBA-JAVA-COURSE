package Day_8;

public class Pratik {
    public static void main(String[] args) {

        //for iteration loop

/*
        for (int i = 0; i <2; i++) {
            System.out.println("i = " + i);

            for (int j = 0; j < 2 ; j++) {//0 1
                System.out.println("j = " + j);
            }
        }
*/

        //TASK

/*        for (int i = 10; i >=0 ; i--) {
            System.out.println("i = " + i);
        }*/



        //task

/*        int toplam = 0;
        for (int i = 1; i <= 50 ; i++) {
            toplam += i;// toplam = toplam + i
        }

        System.out.println("toplam = " + toplam);*/



        //TASK

/*        for (int i = 1; i <=5 ; i++) {
            System.out.print(i + ".");
            for (int j = 1; j <=4 ; j++) {
                System.out.print("0");
            }
            System.out.println();
        }*/

        

        //TASK

 /*       for (int i = 1; i <=5 ; i++) {
            System.out.print(i + ".");
            for (int j = 1; j <=5 ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }*/


        //task

/*
        for (int i = 1; i <=5 ; i++) {
            System.out.print(i + ".(");
            for (int j = 5; j >=1 ; j--) {
                System.out.print(j);
            }
            System.out.println(")");
        }
*/




        //

/*        for (int i = 1; i <=5 ; i++) {
            System.out.print(i + ".(");
            for (int j = 10; j >1 ; j-=2) {
                System.out.print(j);
            }
            System.out.println(")");
        }*/



        //String isim = "Ahmet";

        //String []  isimler  = {"Ahmet", "Mehmet","Ayse"};
   /*     int []  sayilar  = {2, 3,4};

        for (int sayi : sayilar) {
            System.out.println(sayi);
        }*/


/*        String []  isimler  = {"Ahmet", "Mehmet","Ayse"};

        for (String isim : isimler) {
            System.out.println("isim = " + isim);
        }*/



/*        String [] colors = {"kirmizi", "sari","yesil","mavi","turuncu" };

        for (String color : colors) {
            System.out.println(color);
        }*/

        //TASK

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};

        for (int number : numbers) {

            if(number %2 == 1){//  2%2 == 1 = false
                System.out.println(number);
            }


        }























    }
}
