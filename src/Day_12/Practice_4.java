package Day_12;

public class Practice_4 {
    public static void main(String[] args) {

        double vizeSinavi = 44.5;
        double finalSinavi = 85.7;

       double ortalam =  ortalamaHesapla(vizeSinavi, finalSinavi);
        System.out.println("ortalam = " + ortalam);
    }


    public static double ortalamaHesapla(double vizeSinavi, double finalSinavi){
        double ortalama = ((vizeSinavi*0.4) + (finalSinavi*0.6));
        return ortalama;
    }
}
