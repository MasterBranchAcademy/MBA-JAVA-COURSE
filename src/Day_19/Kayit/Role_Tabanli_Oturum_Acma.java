package Day_19.Kayit;

import java.util.Scanner;

public class Role_Tabanli_Oturum_Acma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir role giriniz:");
        String role = scanner.nextLine();

        System.out.println("lutfen bir password giriniz:");
        String password = scanner.nextLine();

        if(role.equalsIgnoreCase("yonetici")){
            if(password.equals("AdminPasword")){
                System.out.println("Yonetici girisi basarili");
            }else{
                System.out.println("lutfen dogru yonetici passwordunu giriniz");
            }
        } else if (role.equalsIgnoreCase("moderator")) {
            if(password.equals("ModeratorPassword")){
                System.out.println("Moderator girisi basarili");
            }else{
                System.out.println("lutfen dogru Moderator passwordunu giriniz");
            }
        } else if (role.equalsIgnoreCase("kullanici")) {
            if(password.equals("KullaniciPassword")){
                System.out.println("Kullanici girisi basarili");
            }else{
                System.out.println("lutfen dogru Kullanici passwordunu giriniz");
            }
        }else{
            System.out.println("lutfen dogru kullanici girisini kullaniniz!!!");
        }


    }
}
