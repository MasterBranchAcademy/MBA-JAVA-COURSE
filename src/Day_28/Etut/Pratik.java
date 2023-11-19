package Day_28.Etut;

import java.util.*;

public class Pratik {
    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimler = new ArrayList<>();

        for (int i = 0; i <5 ; i++) {
            System.out.println("lutfen isim giriniz: ");
            isimler.add(scanner.nextLine());
        }

        System.out.println(isimler);*/






        //TASK

/*        ArrayList<Integer> sayilar = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i <10 ; i++) {
            int rastgeleSayi = random.nextInt(100)+1;
            sayilar.add(rastgeleSayi);
        }
        System.out.println(sayilar);*/



//TASK


/*
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String girilenCumle = scanner.nextLine();

        System.out.println("girilenCumle :"  + girilenCumle);
        String [] kelimeListesi = girilenCumle.split(" ");
        System.out.println("Array: " + Arrays.toString(kelimeListesi));

        ArrayList<String> myList = new ArrayList<>();
        Collections.addAll(myList, kelimeListesi);
        myList.addAll(Arrays.asList(kelimeListesi));

        System.out.println("ArrayList: " + myList);

        Collections.reverse(myList);

        System.out.println("Reverse ArrayList: " + myList);

        for (String kelime:myList) {
            System.out.print(kelime + " ");
        }


        //Arrays.asList("Ayse", "Ahmet")
        System.out.println(Arrays.asList("Ayse", "Ahmet"));
*/




        //TASK

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> isimListesi = new ArrayList<>();

        while (true){
            System.out.println("Lutfen isim giriniz: ");
            String isim = scanner.nextLine();

            if(isim.equalsIgnoreCase("yeter")){
                break;
            }

            isimListesi.add(isim);
        }

        System.out.println("isimListesi : " + isimListesi);

        Collections.sort(isimListesi);

        System.out.println("isimListesi : " + isimListesi);

























    }
}
