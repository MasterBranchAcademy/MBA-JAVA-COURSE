package Day_20.Kayit;

import java.util.Scanner;

public class Replace_practice {
    public static void main(String[] args) {
    /*    String orginalString = "ten";


        String modifiedString = orginalString.replace("e"," ");

        System.out.println("orginalString =" +  orginalString);
        System.out.println("modifiedString =" +  modifiedString);*/



        //TASK
/*        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz:");
        String metin = scanner.nextLine();

        System.out.println("metin = " + metin);

        String modifiedString = metin.replace("a", "@");

        System.out.println("modifiedString = " + modifiedString);*/



        //TASK

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir email giriniz:");
        String email = scanner.nextLine();

        System.out.println("lutfen yeni bir domain giriniz giriniz:");
        String yeniDomain = scanner.nextLine();

        String modifiedString = email.replace("@gmail.com", yeniDomain);

        System.out.println("modifiedString = " + modifiedString);





















    }
}
