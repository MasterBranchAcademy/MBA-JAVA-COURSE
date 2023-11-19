package Day_18.Record;

public class countOccurances {
    public static void main(String[] args) {

        String girilenString = "hello hello hello world hello";
        String substring = "hello";

        int tekrarSayisi = countOccurances(girilenString,substring);
        System.out.println("tekrarSayisi = " + tekrarSayisi);
    }


    public static  int countOccurances(String girilenString, String substring){
        int count=0;
        int index=0;

        while (index != -1){
            index = girilenString.indexOf(substring,index);

            if(index != -1){
               count++;
               index +=substring.length();
            }
        }
        return count;
    }
}
