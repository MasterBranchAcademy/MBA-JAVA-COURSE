package Day_32.Kayit;

public class Main {
    public static void main(String[] args) {

        //belirli bir değişkenin objeye özgü olmamasını istiyorsanız, statik kullanın

        Company ahmet = new Company();

        ahmet.id=2345;
        ahmet.salary=2323;
        ahmet.ceo="John";

        Company ayse = new Company();
        ayse.id=3464;
        ayse.salary=4532;
        ayse.ceo="John";

        ahmet.ceo = "Marry";

        System.out.println(ahmet.ceo);
        System.out.println(ayse.ceo);


        //Static variablelar class ismi ile cagrilabilir

        Company.ceo = "Mehmet";
        Company.salary = 4356;
        System.out.println(ahmet.ceo);


        //Static methods


        int toplam = Company.toplam(4,5);
        System.out.println("toplam = " + toplam);




















    }


}
