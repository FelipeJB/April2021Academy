package Data;

public class Student {
    private int id;
    private String name;
    private int age;
    private static int count = 0;


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = Student.count++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
