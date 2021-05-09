package data;

public abstract class Teacher extends Person{
    protected double salary;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateSalary();
}
