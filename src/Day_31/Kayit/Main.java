package Day_31.Kayit;

public class Main {
    public static void main(String[] args) {

        //Student student1 = new Student("John", "4356",true);
        //Student student2 = new Student("Marry", "3453",false);
        //Rectangle rectangle = new Rectangle(7,12);
        //Car car = new Car("Toyota","Corolla",1999,-15000);
/*

        Product product1 = new Product("elma",1.5,10);
        Product product2 = new Product("Muz", -2, 5);
        Product product3 = new Product("Portakal", 3, -3);
*/




        Dikdortgen rect1 = new Dikdortgen(5.0, 3.0);


        Dikdortgen rect2 = new Dikdortgen(0.0, 0.0);

        rect2.uzunluk = rect1.uzunluk;
        rect2.genislik = rect1.genislik;


        System.out.println("rect2.uzunluk : " + rect2.uzunluk);
        System.out.println("rect2.genislik : " + rect2.genislik);










    }


}
