package Day_23.Kayit;

public class String_birlestir {
    public static void main(String[] args) {

        String [] array1 = {"Merhaba", "Dunya"};
        String [] array2 = {"Nasilsiniz", "Iyimisiniz"};

        for (String eleman: arrayBirlestirme(array1, array2)) {
            System.out.println(eleman);
        }

    }
        public static String[] arrayBirlestirme(String [] array1, String [] array2){
        int toplamBoyut = array1.length + array2.length;

        String [] birlesmisArray = new String[toplamBoyut];

            int index =0;
            for (String eleman: array1) {
                birlesmisArray[index] = eleman;
                index++;
            }

            for (String eleman: array2) {
                birlesmisArray[index] = eleman;
                index++;
            }
        return birlesmisArray;
        }












}
