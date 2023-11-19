package Day_37.Etut;

public interface Interface_practice {


     void test();
     void abc();
     void xyz();

    default void default_xyz(){
         System.out.println("Default metot");
    };

     static void static_xyz(){
          System.out.println("Default metot");
     };

}
