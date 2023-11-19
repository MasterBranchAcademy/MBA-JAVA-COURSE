package Day_6;

public class Dil_seviyesi {
    public static void main(String[] args) {

        char dilSeviyesi = 'K';

        String dilSeviyesiMesaji=    (dilSeviyesi == 'A')? "Mukemmel ingilizce dil seviyesine sahipsiniz"
                                    :(dilSeviyesi == 'B')? "iyi bir ingilizce dil seviyeniz var"
                                    :(dilSeviyesi == 'C')? "Normal bir ingilizce seviyeniz var"
                                    :(dilSeviyesi == 'D')? "ingilizce seviyenizi gelistirmelisiniz"
                                    :(dilSeviyesi == 'E')? "ingilizce seviyeniz yeterli degil"
                                    :"Gecersiz seviye";

        System.out.println("dilSeviyesiMesaji = " + dilSeviyesiMesaji);

    }
}
