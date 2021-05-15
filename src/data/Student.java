package data;

public class Student extends Person{
    protected int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }

    public Student() {
        super();
    }

    public int getId() {
        return id;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    public void setId(int id) {
        this.id = id;
    }
}
