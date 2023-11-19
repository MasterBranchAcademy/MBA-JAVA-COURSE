package Day_23.Kayit;

public class Count_words {
    public static void main(String[] args) {
        String [] kelimeler = {"Hello world hey A","world","Earth","hey"};
        int keilmeSayisi = countWords(kelimeler);
        System.out.println("keilmeSayisi = " + keilmeSayisi);

    }

    public static int countWords(String [] kelimeler){

        int kelimeSayisi=0;
        for (String kelime :kelimeler) {
             String []  arr = kelime.split(" "); //String []  arr = {"Hello", "world", "hey", "A"}
             kelimeSayisi += arr.length;
        }
        return kelimeSayisi;
    }













}
