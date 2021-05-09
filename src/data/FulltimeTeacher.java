package data;

public class FulltimeTeacher extends Teacher{

    private double baseSalary;
    private int experienceYears;

    public FulltimeTeacher(String name, int age, double baseSalary, int experienceYears) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.experienceYears = experienceYears;
    }

    public double calculateSalary() {
        return salary = this.baseSalary * ((this.experienceYears * 110)/100);
    }
}
