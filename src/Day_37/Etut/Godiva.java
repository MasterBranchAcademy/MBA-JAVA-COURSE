package Day_37.Etut;

public class Godiva extends Ulker{

    public String sirketGezisi(){
        return "Godiva ile mutlu bir gezi";
    }

    @Override
    public void calismaSaatleri() {
        System.out.println("Godiva calisanlari 8 saat measi yapmak zorunda");
    }

    @Override
    public void sirketeGirisSaatleri() {
        System.out.println("Sirkete giris saati sabah 06:00");
    }
}
