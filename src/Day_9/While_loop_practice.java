package Day_9;

public class While_loop_practice {
    public static void main(String[] args) {


   /*     boolean statu = true;
        int x = 0;

        while (statu){
            x++;
            if(x == 1){
                System.out.println("If blogunun icine girdi");
                break;
            }

        }*/



        //TASK

/*        int sayi = 1;

        while (sayi <=10){
            System.out.println("sayi = " + sayi);
            sayi++;
        }*/




        //task

/*        int sayi =0;

        while (sayi <=100){
            System.out.println("sayi = " + sayi);
            sayi+=2;
        }*/


        //task

/*        int sayi = 0;
        int toplam=0;

        while (sayi <= 100){
            System.out.println("sayi = " + sayi);
            sayi+=2;
            toplam = toplam + sayi;//2 + 4 =6
            System.out.println("toplam = " + toplam);
        }*/


        //TASK
        // 1+2+3+4+5+6+7+8+9+10+11 = 66

/*        int sayi =1;
        int toplam = 0;

        while (true){
            toplam = toplam + sayi;

            if(toplam % 33 == 0){
               break;
            }
            sayi++;
        }

        System.out.println("toplam = " + toplam);
        System.out.println("sayi = " + sayi);*/



        //TASK

        int gun = 1;
        int saat = 1;
        while (gun <= 15){
            if(saat >= 22 && saat <= 24){
                System.out.println("gun = " + gun + ": Ders saati");
            }

            gun++;
        }

















    }
}
