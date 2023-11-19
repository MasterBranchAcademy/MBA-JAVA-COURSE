package Day_37.Etut;

public class Ulkerspor extends Ulker{

    public String sirketGezisi(){
        return "Ulkerspor ile mutlu bir kamp gezisi";
    }

    @Override
    public void calismaSaatleri() {
        System.out.println("Ulkerspor calisanlari 10 saat mesai yapmak zorunda");
    }

    @Override
    public void sirketeGirisSaatleri() {
        System.out.println("Sirkete giris saati sabah 10:00");
    }
}
