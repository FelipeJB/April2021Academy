package Person;

public abstract class Person {

    public int id;
    public String name;

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Person() {

    }

    public abstract int getId();

    public abstract String getName();

}
