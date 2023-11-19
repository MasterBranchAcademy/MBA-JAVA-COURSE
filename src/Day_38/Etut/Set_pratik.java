package Day_38.Etut;


import java.util.*;

public class Set_pratik {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("merhaba");
        mySet.add("Dunya");
        mySet.add("java");
        mySet.add("Programlama");
        mySet.add("programlama");
        mySet.add("dunya");

        System.out.println(mySet);

   /*     for (String kelime:mySet) {
            System.out.println(kelime);
        }*/

        mySet.remove("java");

        System.out.println(mySet);





















    }
}
