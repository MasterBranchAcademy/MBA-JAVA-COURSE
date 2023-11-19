package Day_36;

public class Teacher {
    private String name;
    private int age;

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Bilgiler: {" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
