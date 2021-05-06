package Data;

public class Student implements Person{

    public String program;
    public String data;

    public Student(String name, String id, int age, String program) {
        setName(name);
        setId(id);
        setAge(age);
        this.program = program;
        data = name + ", ID= " + id;
    }

    @Override
    public String setName(String name) {
        return null;
    }

    @Override
    public String setId(String id) {
        return null;
    }


    @Override
    public int setAge(int Age) {
        return 0;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= " + data +
                ", program= " + program +
                '}';
    }

    public String getStudent (){
        return data;
    }
}
