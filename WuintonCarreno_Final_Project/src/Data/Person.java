package Data;

public class Person {
    protected String name;
    protected int age;
    protected int ID;

    public Person(int id, String name){
    }
    public Person(String name, int ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;

    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
}
