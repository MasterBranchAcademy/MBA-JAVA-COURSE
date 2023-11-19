package Day_34.Kayit.ThisKeyword;

public class Student {

    private String isim;
    private int yas;

    public Student(){
        this("Ahmet",45);
        System.out.println("Heloo");
    }
    public Student(String isim, int yas){
        this.isim =isim;
        this.yas = yas;
        System.out.println(isim + ", " + yas);
    }

}
