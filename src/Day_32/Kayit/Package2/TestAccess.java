package Day_32.Kayit.Package2;

public class TestAccess {
    String name;
    int age;
    String address;

    public TestAccess(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void printInfo(){
        System.out.println("name    : " + name);
        System.out.println("age     : " + age);
        System.out.println("address : " + address);
    }
}
