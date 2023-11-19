package Day_35.Package1;

public class Main {
    public static void main(String[] args) {

   /*     Child_Practice childPractice = new Child_Practice();
        childPractice.selam();*/


        Animal animal = new Animal();
        animal.eat();

        Cat cat = new Cat();
        cat.eat();

        Dog dog = new Dog();
        dog.eat();



















    }

    public static void toplam(int x, int y){
        System.out.println(x + y);
        System.out.println("int parametre alan method");
    }

    public static void toplam(double x, double y){
        System.out.println(x + y);
        System.out.println("double parametre alan method");
    }



}
