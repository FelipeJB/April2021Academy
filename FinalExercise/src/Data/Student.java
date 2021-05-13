package Data;

public class Student extends Person {

    public Student(String name, int ID, int age) {
        super(name, ID, age);
    }

    public Student(){
    }

    public int getID() {
        return ID;
    }

}
