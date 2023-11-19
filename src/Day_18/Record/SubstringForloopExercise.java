package Day_18.Record;

public class SubstringForloopExercise {
    public static void main(String[] args) {

        String text = "MASTER";//0 2 4

        String sonuc =  getEveryOtherCharacter(text);//MSE

        System.out.println("sonuc = " + sonuc);
    }
    public static String getEveryOtherCharacter(String str){
        String result = "";
        for (int i = 0; i < str.length() ; i+=2) {
             result += str.substring(i, i+1);
        }
        return result;
    }
}
