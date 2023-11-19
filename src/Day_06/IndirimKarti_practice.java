package Day_06;

public class IndirimKarti_practice {
    public static void main(String[] args) {

        String durum = "memur";
        int gelir = 1200;

        if(durum == "ogrenci"){
            if(gelir<1000){
                System.out.println("%50 indirimli otobus karti verilir");
            }else{
                System.out.println("indirim karti verilmez");
            }

        } else if (durum == "memur") {
            if(gelir<1000){//1200<1000 = false
                System.out.println("%30 indirimli otobus karti verilir");
            }else{
                System.out.println("indirim karti verilmez");
            }

        } else if (durum == "issiz") {
            if(gelir<1000){
                System.out.println("%20 indirimli otobus karti verilir");
            }else{
                System.out.println("indirim karti verilmez");
            }
        }else{
            System.out.println("gecersiz durum");
        }


    }
}
