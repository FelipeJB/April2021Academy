package FinalProject.Data;

public abstract class Person {

    protected String name;

    public Person(String name){
        this.name = name;
    }

    public abstract String getName();

}
