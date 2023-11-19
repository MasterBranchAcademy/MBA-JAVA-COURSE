package Day_38.Kayit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main_List_Set {
    public static void main(String[] args) {

        List<String> myList = new ArrayList<>();

        myList.add("apple");
        myList.add("banana");
        myList.add("orange");
        myList.add("apple");
        myList.add("banana");

        System.out.println("List elemanlari: " + myList);

        Set<String> mySet = new HashSet<>(myList);

        System.out.println("Set elemanlari: " + mySet);












    }
}
