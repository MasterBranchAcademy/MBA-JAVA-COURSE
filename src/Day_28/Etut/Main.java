package Day_28.Etut;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Create ArrayList
        //1
        ArrayList<Integer> myList = new ArrayList<>();
        System.out.println(myList);
        myList.add(17);
        myList.add(18);
        System.out.println(myList);

        //2
        ArrayList<String> yourlist = new ArrayList<>(Arrays.asList("Ahmet", "Ayse", "John", "Marry"));
        //System.out.println(yourlist);

        System.out.println("size: " +yourlist.size());
        System.out.println(yourlist.get(2));
        System.out.println(yourlist.remove("John"));
        System.out.println(yourlist);
        System.out.println("size: " + yourlist.size());

        System.out.println(yourlist.isEmpty());

        yourlist.set(0,"David");
        System.out.println(yourlist);

        yourlist.clear();
        System.out.println(yourlist);



















    }
}
