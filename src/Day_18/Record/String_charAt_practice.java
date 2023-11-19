package Day_18.Record;

import java.util.Scanner;

public class String_charAt_practice {

    public static void main(String[] args) {
 /*        String text = "This text conatins two a in it";
        System.out.println("birinci indexteki karakter = " + text.charAt(2));*/

        //TASK

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir text giriniz:");
        String text = scanner.nextLine();

        char ilkKarakter = text.charAt(0);
        System.out.println("ilkKarakter : " + ilkKarakter);

        char sonKarakter = text.charAt(text.length() - 1);   //length() - 1 = 5 - 1= 4
        System.out.println("Sonkarakter: " + sonKarakter);*/

        //task

/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir text giriniz:");
        String text = scanner.nextLine();

        System.out.println("lutfen bir karakter giriniz:");
        char karakter = scanner.next().charAt(0);

        boolean karakterBulundu = false;

        for (int i = 0; i < text.length(); i++){

            if(text.charAt(i) == karakter){
                karakterBulundu=true;
                break;
            }
        }
        String mesaj = karakterBulundu ?
                "Karakter text icerisinde bulundu":
                "Karakter text icerisinde bulunamadi";

        System.out.println(mesaj);
*/




        //TASK

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir text giriniz:");
        String text = scanner.nextLine();


        for (int i = 0; i <text.length() ; i++) {
            System.out.println(text.charAt(i) + " index :" + i);
        }*/



        //TASK
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();

        int i =0;
        while ( i < metin.length()){//         0 1 2 3 4

            char karakter = metin.charAt(i);// A h m e t
            karakter = Character.toLowerCase(karakter);
            if(karakter == 'a'
                    || karakter == 'e'
                    || karakter == 'i'
                    ||karakter == 'o'
                    ||karakter == 'u'){
                System.out.println(karakter);
            }
          i++;
        }*/





        //TASK
 /*       Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();
        // a h m e t
        // 0 1 2 3 4
        int i = 0;
        int j = metin.length() - 1; //5 - 1=4
        boolean palindrom = true;

        while (i < j){
            if(metin.charAt(i) != metin.charAt(j) ){//a != t = true
                palindrom=false;
                break;
            }
           i++;
           j--;
        }
        if(palindrom){
            System.out.println("Girilen metin bir palindrom");
        }else{
            System.out.println("Girilen metin bir palindrom degil!!!!");
        }*/


















    }
}
