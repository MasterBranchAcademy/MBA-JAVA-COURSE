package Day_36.Etut;

public class Film {

    private String filmAdi;
    private String yonetmen;
    private int vizyonYili;
    private String tur;

    public Film(String filmAdi, String yonetmen, int vizyonYili, String tur) {
        this.filmAdi = filmAdi;
        this.yonetmen = yonetmen;
        this.vizyonYili = vizyonYili;
        this.tur = tur;
    }
    @Override
    public String toString() {
        return "Haftanin filmleri {" +
                "filmAdi='" + filmAdi + '\'' +
                ", yonetmen='" + yonetmen + '\'' +
                ", vizyonYili=" + vizyonYili +
                ", tur='" + tur + '\'' +
                '}';
    }
}
