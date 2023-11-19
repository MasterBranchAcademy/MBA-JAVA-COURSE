package Day_19.Etut;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


/*        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ilk kelimeyi giriniz: ");
        String ilkKelime = scanner.nextLine();

        System.out.println("lutfen ikici kelimeyi giriniz: ");
        String ikinciKelime = scanner.nextLine();

        boolean esitMi = ilkKelime.equals(ikinciKelime);

        String mesaj = (esitMi)? "Esit":"Esit degil";

        System.out.println("mesaj : " + mesaj);*/




        //TASK

/*        String dogruPassword = "password";

        Scanner scanner = new Scanner(System.in);

        String girilenPassword;
        do{
            System.out.println("lutfen dogru passwordu giriniz: ");
            girilenPassword = scanner.nextLine();

            if(girilenPassword.equals(dogruPassword)){
                System.out.println("Basarili giris!!!");
            }

        }while (!girilenPassword.equals(dogruPassword));*/




        //Task
/*
        String dogruEmail = "masterbranchacademy@gmail.com";

        Scanner scanner = new Scanner(System.in);
        String girilenEmail;

        do{
            System.out.println("Lutfen dogru passwordu giriniz:");
            girilenEmail =  scanner.nextLine();

            if(girilenEmail.equalsIgnoreCase(dogruEmail)){
                System.out.println("Basarili giris!!!");
            }
        }while (!girilenEmail.equalsIgnoreCase(dogruEmail));*/





        //task
/*        String sifre = "master";

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz:");
        String cumle = scanner.nextLine();

        System.out.println("cumle : " + cumle);

        if(cumle.contains(sifre)){
            System.out.println("cumle, sifreyi iceriyor ");
        }else{
            System.out.println("cumle, sifreyi icermiyor ");
        }*/



        //TASK

/*        String sifre = "gizliMBApassword";

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz:");
        String cumle = scanner.nextLine();

        System.out.println("cumle : " + cumle);

        if(cumle.contains(sifre)){
            System.out.println("Giris onaylandi!");
        }else{
            System.out.println("Sahte password");
        }*/

        //task

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz :");
        String cumle = scanner.nextLine();
        String mesaj1 = "inheritance";
        String mesaj2 = "polymorphism";
        String mesaj3 = "encapsulation";
        String mesaj4 = "abstraction";
        if (cumle.contains(mesaj1) && cumle.contains(mesaj2) && cumle.contains(mesaj3) && cumle.contains(mesaj4)) {
            System.out.println("evet,birseyler biliyorsunuz!");
        } else {
            System.out.println("siz OOP bilmioyrsunuz!");
        }



















    }




}
