package Day_33.Kayit;

public class Main {
    public static void main(String[] args) {

        Torun torun = new Torun();

        System.out.println(torun.birikmisPara);
        System.out.println(torun.mulk);

        torun.sacRengi();

        double toplamMiras = torun.bankadakiPara + torun.birikmisPara;

        System.out.println("toplamMiras : " + toplamMiras);

        System.out.println(torun.name);
        System.out.println(torun.id);
        torun.ogrenciBilgisi();

        torun.haberlesme();























    }
}
