package Day_12;

public class Practice_3 {
    public static void main(String[] args) {

        boolean okulaDevamDurumu = true;
        boolean derslerdenGecmeDurumu = false;

        boolean diplomaHakki = checkDiplomaEligibility(okulaDevamDurumu, derslerdenGecmeDurumu);

        if(diplomaHakki){
            System.out.println("tebrikler, diploma almaya hak kazandiniz!!!");
        }else{
            System.out.println("Sinif tekrari");
        }


    }
    public static boolean checkDiplomaEligibility(boolean okulaDevamDurumu, boolean derslerdenGecmeDurumu){
        boolean diplomaHakki = (okulaDevamDurumu && derslerdenGecmeDurumu);// true && true = true
        return diplomaHakki;
    }
}
