package Day_23.Kayit;

public class Find_max {
    public static void main(String[] args) {
        int [] array = {2,4,2,5,7,812,3};
        int sonuc = findMax(array);
        System.out.println(sonuc);
    }

    public static int findMax(int [] array){

        int max =0;
        for (int arr: array) {
            if(arr > max){
                max=arr;
            }
        }
        return max;
    }
















}
