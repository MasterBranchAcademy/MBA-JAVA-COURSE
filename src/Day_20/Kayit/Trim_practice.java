package Day_20.Kayit;

public class Trim_practice {
    public static void main(String[] args) {

        String name = "      Ahmet                ";//Ahmet

        String trimmedString = name.trim();

        System.out.println("name = " + name);
        System.out.println("trimmedString = " + trimmedString);

        if(name.equals(trimmedString)){
            System.out.println("stringler ayni");
        }else{
            System.out.println("stringler farkli");
        }

    }
}
