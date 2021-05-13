package Data;

public abstract class Teacher extends Person {

    protected double baseSalary;

    public Teacher(String name, int ID, int age, double baseSalary) {
        super(name, ID, age);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public abstract double calculateSalary();

}
