package Day_21;

public class Utilities {




    public int toplam(int sayi_1, int sayi_2){
        int toplam = sayi_1+ sayi_2;
        return toplam;
    }


    public char ilkHarfAl(String str){
             char ilkKarakter = str.charAt(0);
             return ilkKarakter;
    }

    public String substringAl(String str, int sayi){
             String text =  str.substring(0,sayi);//Hello
             return text;
    }

    public char sonKarakteriAl(String str){
        String lowerStr = str.toLowerCase();
        char sonKarakter = lowerStr.charAt(lowerStr.length()-1);
        return sonKarakter;
    }

    public String isContains(String str_1, String str_2){

        boolean statu = str_1.contains(str_2);
        return (statu)? "iceriyor":"icermiyor";
    }

















}
