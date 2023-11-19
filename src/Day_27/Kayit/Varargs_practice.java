package Day_27.Kayit;

public class Varargs_practice {
    public static void main(String[] args) {


        int toplam =   toplam("Ahmet",3,4,5,10);
        System.out.println("toplam = " + toplam);
    }
    public static int toplam(String name, int ... sayilar){
        int toplam=0;
        for (int sayi: sayilar) {
            toplam+=sayi;
        }
        return toplam;
    }
}
