package Day_18.Record;

import java.util.Scanner;

public class String_baslangic_bitis_index_pratik {
    public static void main(String[] args) {
     /*   String text = "This is a text";
        System.out.println(text.substring(12,13));*/

   /*     String MyString = "Master";
        System.out.println(MyString.substring(3,6));*/



        //TASK
/*
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz:");
        String metin = scanner.nextLine();

        String altString = metin.substring(1,4);
        System.out.println("altString = " + altString);
        boolean containsA = false;
        for (int i = 0; i < altString.length(); i++) {
            if(altString.charAt(i) == 'a') {
                containsA = true;
                break;
            }
        }

        if(containsA){
            System.out.println("Alt string a icerir");
        }else{
            System.out.println("Alt string a icermez");
        }*/



        //TASK
  /*      Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen meting giriniz:");
        String metin = scanner.nextLine();

        System.out.println("Lutfen startIndex giriniz:");
        int startIndex = scanner.nextInt();

        System.out.println("Lutfen endIndex giriniz:");
        int endIndex = scanner.nextInt();

        if(endIndex > metin.length()){
            endIndex=metin.length();
        }

        String substring = metin.substring(startIndex,endIndex);
        System.out.println("substring : " + substring);*/



    //TASK

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen meting giriniz:");
        String metin = scanner.nextLine();

        System.out.println("Lutfen sayi giriniz:");
        int nciKarakter = scanner.nextInt();//2

        for (int i = 0; i < metin.length(); i+=nciKarakter) {//0 2 4 6
            System.out.print(metin.charAt(i) + "   ");
        }

        System.out.println();






















    }
}
