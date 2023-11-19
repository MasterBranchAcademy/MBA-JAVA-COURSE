package Day_34.Etut;

public class Pratik {

    String name;
    int sayi;
    boolean flag;
    char karakter;

    public Pratik(String name, int sayi, boolean flag, char karakter) {
        this.name = name;
        this.sayi = sayi;
        this.flag = flag;
        this.karakter = karakter;
    }

    public void temelBilgiler(){
        System.out.println("name: " + name);
        System.out.println("sayi: " + sayi);
        System.out.println("flag: " + flag);
        System.out.println("karakter: " + karakter);
    }
}
