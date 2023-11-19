package Day_10;

public class Break_practice {
    public static void main(String[] args) {


   /*     for (int i = 0; i <=20 ; i+=2) {
            if(i %4 == 0){
            continue;
            }
            System.out.println(i);
        }*/


/*        int toplam =0;
        for (int i = 1; i <=30 ; i++) {// 1 2 3 4 5 6 = 21

            toplam = i + toplam;
            System.out.println(i);
            if(toplam == 21){
                break;
            }

        }

        System.out.println("toplam = " + toplam);*/





        //task

/*        for (int i = 100; i >=1 ; i--) {

            if(i %2 != 0){
                continue;
            }

            if(i < 90){
                System.out.println("Bu sayi dahil edilmedi!!!");
                continue;
            }

            if(i <= 75){
                break;
            }
            System.out.println(i);
        }*/



        //task

        for (int i = 20; i <=60 ; i++) {

            if(i %2 != 0 || i %13 == 0){
                continue;
            }
            System.out.println(i);
        }





















    }
}
