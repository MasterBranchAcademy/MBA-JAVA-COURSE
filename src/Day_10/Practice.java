package Day_10;

public class Practice {
    public static void main(String[] args) {

        //break

/*        for (int i = 1; i <=10 ; i++) {

            if(i == 5) {
                System.out.println(i);
                break;
            }
        }*/

        //continue

/*        for (int i = 1; i <=10 ; i++) {

            if(i==5){
              continue;
            }
            System.out.println(i);
        }*/




        //while loop / continue

/*        boolean statu = true;
        int sayac = 0;

        while (statu){

            if(sayac == 5){
                continue;
            }

            System.out.println("Hello world!!");

           sayac++;
        }*/


/*        for (int i = 1; i <=100 ; i+=2) {
            if(i == 53){
                System.out.println(i);
                break;
            }
        }*/



        //task

        String mevsim = "dfghfsdh";

        switch (mevsim){
            case "ilkbahar":
                System.out.println("Gelmiş bahar, açmış çiçekler,\n" +
                        "Renk renk doğa, sevinçle doldu gökler.");
break;
            case "yaz":
                System.out.println("Sıcak güneş yükseldi tepelere,\n" +
                        "Denizde serinlik, ferah bir esintiye.");
break;
            case "sonbahar":
                System.out.println("Düşen yapraklar, kızıllıkla süslendi,\n" +
                        "Rüzgar eserken, doğanın sırrı çözüldü.");
break;
            case "kis":
                System.out.println("Beyaz örtü, düşmüş tüm yollara,\n" +
                        "Sıcacık çaylarla ısınıyor her evin odası.");
                break;
            default:
                System.out.println("Gecersiz mevsim!");

        }

























    }

















}
