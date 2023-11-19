package Day_37.Kayit;

public class Student extends MBA implements Government{

    public void toplanti(){
        System.out.println("Butun ogrenciler saat 20 de toplanmali");
    }

    public void calisma(){
        System.out.println("Butun ogrenciler en az 8 saat calismali");
    }

    @Override
    public void lesson() {
        System.out.println("ogrenciler 8 saat pratik yapmali");
    }

    @Override
    public void sleep() {
        System.out.println("ogrenciler 8 saat uyumali");
    }

    @Override
    public void eat() {
        System.out.println("ogrenciler en az iki sefer yemek yemeli");
    }
}
