package MBA_CLASS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        ArrayList<String> bizimSinif = new ArrayList<>(Arrays.asList("Salih", "Meral","Ramazan","Ehsanullah","Mucahit","Rumeysa","Yunus","Niyaz","Gulay","Ahmad","Zubeyde"));

        Random random = new Random();
        int sansliRakam = random.nextInt(10)+1;

        System.out.println("Sansli kisi:  " +bizimSinif.get(sansliRakam)+ " !!!!!!");















    }
}
