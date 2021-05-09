package data;

public abstract class Teacher extends Person{
    protected double salary;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public abstract double calculateSalary();
}
