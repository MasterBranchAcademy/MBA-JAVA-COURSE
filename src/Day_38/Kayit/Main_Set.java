package Day_38.Kayit;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main_Set {
    public static void main(String[] args) {

        TreeSet<String> myList = new TreeSet<>();

        myList.add("elma");
        myList.add("muz");
        myList.add("kiraz");
        myList.add("elma");
        myList.add("portakal");

        for (String meyve:myList) {
            System.out.println(meyve);
        }

        System.out.println("/////////////////");
        myList.remove("elma");

        for (String meyve:myList) {
            System.out.println(meyve);
        }

        System.out.println("/////////////////");

        myList.add("armut");
        for (String meyve:myList) {
            System.out.println(meyve);
        }

        System.out.println("/////////////////");
        myList.clear();
        System.out.println(myList.size());

        System.out.println(myList);








    }
}
