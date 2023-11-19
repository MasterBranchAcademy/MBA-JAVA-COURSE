package Day_19.Kayit;

import java.util.Scanner;

public class language_checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir programlama dili giriniz:");
        String programlama_dili = scanner.nextLine();
        
        if(programlama_dili.equalsIgnoreCase("java")){
            System.out.println("Girilen dir java. Basarili");
        } else if (programlama_dili.equalsIgnoreCase("python")) {
            System.out.println("Girilen dir python. Basarili");
        } else if (programlama_dili.equalsIgnoreCase("c++")) {
            System.out.println("Girilen dir c++. Basarili");
        }else{
            System.out.println("Girilen dil kabul edilmedi. Basarisiz");
        }
    }
}
