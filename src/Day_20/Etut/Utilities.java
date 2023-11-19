package Day_20.Etut;

public class Utilities {

    public String boslukSil(String text){
        return text.trim();
    }

    public String ilkHarfBuyuk(String isim){//ahmet, Ahmet

        String ilkKarakterbuyuk= "";
        for (int i = 0; i <isim.length() ; i++) {//i=0
            String harf = isim.charAt(i)+"";//a
            if(i == 0){
                ilkKarakterbuyuk = harf.toUpperCase();//A
            }else{
                ilkKarakterbuyuk += harf;//Ahmet
            }
        }
       return ilkKarakterbuyuk;
    }



}
