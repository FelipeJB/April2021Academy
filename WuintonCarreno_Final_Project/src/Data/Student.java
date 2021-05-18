package Data;

public class Student extends Person{

    private int studentId;

    public Student(String name, int ID, int age) {
        super(name, ID, age);
    }

    public int getID() {
        return studentId;
    }

    public void setID(int studentId) {
        this.studentId = studentId;
    }

}
