package Data;

public class Student {
    private int id;
    private String name;
    private int age;


    public Student(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    //Create a new student and add it to an existing course

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public int getAge(){
        return age;
    }

    public void setId(int newId){
        id = newId;
    }

    public void setAge(int newAge){
        age = newAge;
    }

}
