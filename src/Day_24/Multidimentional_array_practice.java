package Day_24;

public class Multidimentional_array_practice {
    public static void main(String[] args) {

/*        int x = 5;

        int [] tekSayilar = {1,3,5,7,9};

        int [] ciftSayilar = {2,4,6,8,10};


        int [] [] sayilar = {{1,3,5,7,9},{2,4,6,8,10}};*/




        //Iki boyutlu Array olusturma
/*
        String [] sebzeler = {"Patlican", "Domates","Salatalik"};
        String [] meyveler = {"Portakal", "Elma","Havuc"};

        //Literal
        String [] [] alisverisListesi = {{"Patlican", "Domates","Salatalik"}, {"Portakal", "Elma","Havuc"}};

        //new keyword
        String [] [] satisListesi = new String[2][];*/


        //TASK

/*        int [] [] myArray = new int[3][3];

        myArray[0][0] = 1;
        myArray[0][1] = 2;
        myArray[0][2] = 3;

        myArray[1][0] = 4;
        myArray[1][1] = 5;
        myArray[1][2] = 6;

        myArray[2][0] = 7;
        myArray[2][1] = 8;
        myArray[2][2] = 9;*/



        //TASK

/*        int [] [] sayilar = {{1,2},{3,4}};


        //1    satir sutun
        sayilar [0] [0] = 5;

        //2
        sayilar [0] [1] = 6;

        //3
        sayilar [1] [0] = 7;

        //4
        sayilar [1] [1] = 8;*/



        //TASK

        int [] [] array = {{1,2,3}, {4,5,6}, {7,8,9}};

  /*  *//*    int bir =  array[0][0]; // int bir = 1;
        //System.out.println(bir);

        int iki = array[0][1];
        //System.out.println(iki);

        int uc = array[0][2];
        System.out.println(uc);*//*

        int bes = array[1][1];
        //System.out.println(bes);


        int dokuz = array[2][2];
        System.out.println(dokuz);*/



        //TASK

/*        int [] [] sayilar = {{10,11,12},{13,14,15},{16,17,18}};

        System.out.println(sayilar[2][1]);*/



        //task - ilk satirin toplami

/*        int [] [] sayilar = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

      int toplam =   sayilar[0][0] + sayilar[0][1] + sayilar[0][2] + sayilar[0][3];

        System.out.println("toplam = " + toplam);*/




/*       {1,2,3,4}
        {5,6,7,8}
        {9,10,11,12}
        {13,14,15,16}*/







        //TASK

/*        int [][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        int ilkDeger    = arr[0][0];
        int ikinciDeger = arr[0][1];
        int ucuncuDeger = arr[0][2];

        int max = ilkDeger;

        if(ikinciDeger > max){
           max = ikinciDeger;
        }

        if (ucuncuDeger > max){
            max = ucuncuDeger;
        }

        System.out.println("max = " + max);*/




        //TASK
/*
        int [][] myArray = {
                {1,2,3},         //[0][0] [0][1] [0][2] // 1 2 3
                {4,5,6},         //[1][0] [1][1] [1][2] // 4 5 6
                {7,8,9}          //[2][0] [2][1] [2][2] // 7 8 9
        };

        for (int i = 0; i <myArray.length ; i++) {
            for (int j = 0; j < myArray.length ; j++) {
                System.out.print(myArray[i][j]);
            }
            System.out.println();
        }
*/



        //TASK
/*
        int [][] myArray = {
                {1,2,3},         //[0][0] [0][1] [0][2] // 1 2 3
                {4,5,6},         //[1][0] [1][1] [1][2] // 4 5 6
                {7,8,9}          //[2][0] [2][1] [2][2] // 7 8 9
        };                                              // 12 15 18

        int sutunUzunlugu = myArray[0].length;

        for (int i = 0; i <sutunUzunlugu ; i++) {

            int toplamSutun = 0;

            for (int j = 0; j < myArray.length ; j++) {

                toplamSutun += myArray[j][i];//[0][2] [1][2] [2][2]
            }
            System.out.println("toplamSutun = " + toplamSutun);
        }*/



        //TASK
/*

        int [][] myArray = {
                {1,2,3,0},         //[0][0] [0][1] [0][2] [0][3]
                {4,5,6,4},
                {7,8,9,7},
                {2,5,6,7}
        };

        int min = myArray[0][0];//1
        int max = myArray[0][0];

        for (int i = 0; i < myArray.length ; i++) {
            for (int j = 0; j < myArray[0].length ; j++) {

                if(myArray[i][j] < min){ // 0 < 1
                    min = myArray[i][j];// min = 0
                }
                if(myArray[i][j] > max){
                    max = myArray[i][j];
                }

            }
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);


*/


        //cok boyutlu arraydeki her bir arraye ulasma

        int [][] myArray = {
                {1,2,3,0},         //[0][0] [0][1] [0][2] [0][3]
                {4,5,6,4},
                {7,8,9,7},
                {2,5,6,7}
        };

        int [] ilkArray = myArray[1];

        for (int eleman: ilkArray) {
            System.out.println("eleman = " + eleman);
        }



























    }
}
