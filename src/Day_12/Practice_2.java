package Day_12;

public class Practice_2 {
    public static void main(String[] args) {

        String name = "john";
        String nickName = nicknameGenerator(name);//String nickName = johnnny
        System.out.println("nickName = " + nickName);
    }

    public static String nicknameGenerator(String name){
        String nickName = name + "nny";
        return nickName;
    }
}
