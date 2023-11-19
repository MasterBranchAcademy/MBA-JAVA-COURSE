package Day_6;

public class SansliGun {
    public static void main(String[] args) {
        String mevsim = "yaz";
        int hafta = 2;


        if(mevsim == "ilkbahar"){
            if(hafta == 1){
                System.out.println("Bugun sansli gununuz");
            }else{
                System.out.println("Bugun sansli gununuz degil!!!");
            }

        } else if (mevsim == "yaz") {
            if(hafta == 2){
                System.out.println("Bugun sansli gununuz");
            }else{
                System.out.println("Bugun sansli gununuz degil!!!");
            }

        } else if (mevsim == "sonbahar") {
            if(hafta == 3){
                System.out.println("Bugun sansli gununuz");
            }else{
                System.out.println("Bugun sansli gununuz degil!!!");
            }

        } else if (mevsim == "kis") {
            if(hafta == 4){
                System.out.println("Bugun sansli gununuz");
            }else{
                System.out.println("Bugun sansli gununuz degil!!!");
            }
        }else {
            System.out.println("Gecersiz mevsim!!!");
        }


    }
}
