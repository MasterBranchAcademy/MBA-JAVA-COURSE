package Day_31.Kayit;

public class Dikdortgen {

    double uzunluk;
    double genislik;

    public Dikdortgen(double uzunluk, double genislik){
        this.uzunluk= uzunluk;
        this.genislik=genislik;
        double alan = uzunluk*genislik;
        System.out.println(alan);
    }
}
