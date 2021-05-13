package Data;

public class Student extends Person {

    public Student(int age, String name){
        super(age,name);

    }




    @Override
    public String toString() {
        return "{" +
                "Student id = '" + Student.this.getId() + '\'' +
                ", Student name = '" + Student.this.getName() + '\'' +
                ", Student age = " + Student.this.getAge() +
                '}';
    }


}
