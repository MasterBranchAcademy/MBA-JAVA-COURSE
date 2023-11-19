package Day_6;

public class Calisma_saatleri_practice {
    public static void main(String[] args) {

        String gun = "dghgh";
        int saat = 15;


        if(gun == "pazartesi" || gun == "sali" || gun == "carsamba" || gun == "persembe" || gun =="cuma"){

            if(saat >= 9 && saat <=17){
                System.out.println("isci hafta ici calisma saatinde");
            }else{
                System.out.println("isci hafta ici calisma saatinde degil");
            }

        }else if(gun == "cumartesi"){

            if(saat >= 10 && saat <=14){
                System.out.println("isci hafta sonu calisma saatinde");
            }else{
                System.out.println("isci hafta sonu calisma saatinde degil");
            }

        }else if(gun == "pazar"){
            System.out.println("isci tatilde");
        }else{
            System.out.println("Gecersiz gun!!!");
        }
















    }
}
