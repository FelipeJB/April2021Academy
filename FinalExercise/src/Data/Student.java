package Data;

public class Student extends Person {

    private int ID;

    public Student(String name, int age, int ID) {
        super(name, age);
        this.ID = ID;
    }
}
