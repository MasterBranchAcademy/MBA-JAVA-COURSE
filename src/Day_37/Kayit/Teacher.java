package Day_37.Kayit;

public class Teacher extends  MBA implements  Government{
    public void toplanti(){
        System.out.println("Butun ogretmenler saat 22 de toplanmali");
    }

    public void calisma(){
        System.out.println("Butun ogretmenler en az 8 saat calismali");
    }

    @Override
    public void lesson() {

    }

    @Override
    public void sleep() {

    }

    @Override
    public void eat() {

    }
}
