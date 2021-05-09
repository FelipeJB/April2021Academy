package data;

public class ParttimeTeacher extends Teacher {

    private double baseSalary;
    private int hoursPerWeek;

    public ParttimeTeacher(String name, int age, double baseSalary, int hoursPerWeek) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double calculateSalary() {
        return salary = this.baseSalary * this.hoursPerWeek;
    }
}
