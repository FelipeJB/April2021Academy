package Data;

public class Student extends Person {
    private int id ;

    public Student(String name, int age, int id) {
        super(name, age);
        this.id=id;
    }

    public int getId() { return id; }
}
