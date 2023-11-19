package Day_31.Etut;

public class Ogrenci {

    String isim;//Ahmet
    String soyIsim;//vural
    int yas;

    String nickName;

    int derseGelmedigiGunSayisi;
    boolean ogrenimDurumu;

    char ehliyet;
    boolean ehliyetYetkinlik;

    double burs;
    double aylikKazanc;
    double aylikGider;

    double matematikVizeSinavSonucu;
    double matematikFinalSinavSonucu;

    public Ogrenci(String isim, double gelir, double gider){
    this.isim = isim;
    this.aylikKazanc = gelir;
    this.aylikGider = gider;
    }

    public Ogrenci(String isim, String soyIsim, int yas){//Ahmet vural
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.yas = yas;
    }

    public Ogrenci(double vizeSonucu, double finalSonucu){//80 20
      this.matematikVizeSinavSonucu = vizeSonucu;
      this.matematikFinalSinavSonucu = finalSonucu;
    }

    public String nickName(){
        String nickName = isim + soyIsim+"nyyy";//nullnullnyyy
        return nickName;
    }

    public String fullName(){
        String nickName = isim + soyIsim;
        return nickName;
    }

    public boolean ehliyetYetkinligi(){
        if(yas>=18){
            ehliyetYetkinlik=true;
        }else {
            ehliyetYetkinlik=false;
        }
       return ehliyetYetkinlik;
    }

    public double ortalama(){
        double ortalam = (matematikVizeSinavSonucu + matematikFinalSinavSonucu)/2;
        return ortalam;
    }

    public String burs(){
        String mesaj="";
        double gelirGiderFarki = aylikKazanc - aylikGider;
        if(gelirGiderFarki<1000){
            mesaj = "Tebrikler, burs almaya hak kazandiniz";
        }else{
            mesaj = "Malesef, burs almaya hak kazanamadiniz";
        }
        return mesaj;
    }


}
