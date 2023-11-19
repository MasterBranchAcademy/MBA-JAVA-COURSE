package Day_34.Etut;

public class ABC {

    String sirketIsmi;
    int yillikCiro;

    public ABC(String sirketIsmi, int yillikCiro) {
        this.sirketIsmi = sirketIsmi;
        this.yillikCiro = yillikCiro;
    }

    public void sirketBilgileri(){
        System.out.println("Sirket ismi: " + sirketIsmi);
        System.out.println("Yillik ciro: " + yillikCiro);
    }
}
