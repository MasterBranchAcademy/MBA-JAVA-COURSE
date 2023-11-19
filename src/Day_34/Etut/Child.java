package Day_34.Etut;

public class Child extends Parent{

    public void kisiBilgileri(){
        System.out.println("Kisi bilgileri:");
        System.out.println("Anne adi      :"+ super.motherName);
        System.out.println("Baba adi      :"+ super.fatherName);
    }
}
