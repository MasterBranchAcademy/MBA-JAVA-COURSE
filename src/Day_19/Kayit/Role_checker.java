package Day_19.Kayit;

import java.util.Scanner;

public class Role_checker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir role giriniz");
        String role = scanner.nextLine();
        
        if(role.equalsIgnoreCase("admin")){
            System.out.println("Admin girisi basarili");
        } else if (role.equalsIgnoreCase("moderator")) {
            System.out.println("moderator girisi basarili");
        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("user girisi basarili");
        }else{
            System.out.println("Kullanici girisi basarisiz!!!");
        }
    }
}
