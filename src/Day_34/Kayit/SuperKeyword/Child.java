package Day_34.Kayit.SuperKeyword;

public class Child extends Parent{

    private int id;

    protected Child(int id){
        super("MBA");
        this.id = id;
        System.out.println("Burasi child classs");
        System.out.println("id : " + id);
    }

    public void evIsleri(){
        System.out.println("Ev Isleri: ");
        super.bahceIsler();
        super.mutfakIsler();
        super.KilerIsler();
    }

    public void selamlama(){
        System.out.println("Child: Selamlama");
        super.selamlama();
    }
}
