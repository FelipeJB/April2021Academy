package Person;

public class Student extends Person{

    private int age;

    public Student (int id, String name, int age){
        super(id, name);
        this.age = age;
    }


    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
