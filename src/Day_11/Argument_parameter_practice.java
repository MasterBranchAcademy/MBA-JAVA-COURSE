package Day_11;

public class Argument_parameter_practice {

    public static void main(String[] args) {
        int x = 5;
        int y = 6;
        String text = "text";
        myMethod(x,y,text);//argument
    }

    public static void myMethod(int x, int y, String text){//parameter
        x = x +2;
        y = y -2;
        text = text+ "test";
        System.out.println("ID = " + x +y+text);
    }















}
