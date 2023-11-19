package Day_39;

import java.util.List;
import java.util.Set;

public class Basic {


    public static int numberOfStudent(List<String> studentList){
            int ogrenciSayisi = studentList.size();
            return ogrenciSayisi;
    }

    public static int sumOfId(Set<Integer> idList){
        int toplam = 0;
        for (Integer id:idList) {
            toplam += id;
        }
        return toplam;
    }
}
