package Day_18.Record;

public class SubstringExercise {

    public static void main(String[] args) {

        String test = "MASTER";
        int n = 2;
        String sonuc =  getSubstring(test, n);
        System.out.println("sonuc = " + sonuc);
    }

    public static String getSubstring(String str, int n){
        if(n >= str.length()){
        return str;
        }else{
         return str.substring(n);
        }
    }
}
