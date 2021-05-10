package Data;

public class Student extends Person {

    public Student(int id,int age, String name){
        super(id,age,name);

    }




    @Override
    public String toString() {
        return "{" +
                "Student name = '" + Student.this.getName() + '\'' +
                ", Student age = " + Student.this.getAge() +
                '}';
    }


}
