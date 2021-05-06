package Data;

public class Teacher implements Person{

    static int salary = 50000;
    public boolean contractor;
    public int yearsExperience;
    public String data;


    public Teacher(String name, String id, int age, boolean contractor, int yearsExperience) {
        setName(name);
        setId(id);
        setAge(age);
        this.contractor = contractor;
        this.yearsExperience = yearsExperience;
        data = "Name= "+name + " ID= " + id;
    }

    @Override
    public String setName(String name) {
        return name;
    }

    @Override
    public String setId(String id) {
        return null;
    }

    @Override
    public int setAge(int age) {
        return 0;
    }

    public String getTeacher (){
        return data;
    }

    @Override
    public String toString() {
        return "Teacher{" + data +
                ", contractor= " + contractor +
                ", Experience= " + yearsExperience + " years" +
                ", " + data +
                '}';
    }
}
