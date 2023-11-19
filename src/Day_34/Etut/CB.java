package Day_34.Etut;

public class CB {

    String cbName;
    int cbYas;

    public CB() {
        System.out.println("Coook onemli kod!!!!!!");
    }

    public CB(String cbName, int cbYas) {
        this.cbName = cbName;
        this.cbYas = cbYas;
        System.out.println("Burasi CB, parent class");
    }
}
