package Day_32.Kayit.Package1;

import Day_32.Kayit.Package2.TestAccess;

public class Main {
    public static void main(String[] args) {
        TestAccess testAccess = new TestAccess("Test", 25, "Spain");

        testAccess.printInfo();
    }
}
