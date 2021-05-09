package data;

public class Student extends Person{
    protected int id;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id = id;
    }
}
