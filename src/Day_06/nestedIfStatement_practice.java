package Day_06;

public class nestedIfStatement_practice {
    public static void main(String[] args) {

        boolean anahtar_1 = true;
        boolean anahtar_2 = false;

        if(anahtar_1){
            System.out.println("anahtar_1 den iceri girdi");

            if(anahtar_2){
                System.out.println("anahtar_2 den iceri girdi");
            }else{
                System.out.println("anahtar_2 den iceri girmedi");
            }

        }else{

            System.out.println("anahtar_1 den iceri girmedi");
        }












    }
}
