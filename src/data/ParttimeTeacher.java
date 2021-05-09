package data;

public class ParttimeTeacher extends Teacher {

    private float baseSalary;
    private int hoursPerWeek;

    public ParttimeTeacher(String name, int age, float baseSalary, int hoursPerWeek) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.hoursPerWeek = hoursPerWeek;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    public double calculateSalary() {
        return salary = this.baseSalary * this.hoursPerWeek;
    }
}
