package Data;

public abstract class Person {

    private String name;
    private int age;
    private int id;
    private static int contId=1;

    public Person(String name, int age){
        this.name= name;
        this.age=age;
        this.id=contId++;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getId() {
        return this.id;
    }
}
