package Day_12;

public class Practice {

    public static void main(String[] args) {

        String ad = isim();
        String soyAd = soyIsim();
        String tamIsim = ad + soyAd;

        System.out.println(tamIsim);
    }

    public static String isim(){
        String isim = "Ahmet";
        return isim;
    }

    public static String soyIsim(){
        String soyIsim = "Vural";
        return soyIsim;
    }
}

