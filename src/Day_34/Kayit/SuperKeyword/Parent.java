package Day_34.Kayit.SuperKeyword;

public class Parent {
    String name;

    public Parent(String name){
        this.name =name;
        System.out.println("Burasi Parent classss");
        System.out.println("name : " + name);
    }

    public void bahceIsler(){
        System.out.println("bahce temizlenmeli");
    }

    public void mutfakIsler(){
        System.out.println("mutfak temizlenmeli");
    }

    public void KilerIsler(){
        System.out.println("kiler temizlenmeli");
    }

    public void selamlama(){
        System.out.println("Parent: Selamlama");
    }

}
