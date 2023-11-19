package Day_11;

public class TekMIciftMi {
    public static void main(String[] args) {
        int sayi = 13;
        tekMiCiftMi(sayi);
    }
    public static void tekMiCiftMi(int sayi){
        if(sayi%2 == 0){
            System.out.println("Sayi cift bir sayidir");
        }else{
            System.out.println("Sayi tek bir sayidir");
        }

    }
}
