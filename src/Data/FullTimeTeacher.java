package Data;

public class FullTimeTeacher extends Teacher {
    private int experienceYears;

    public FullTimeTeacher(String name, int baseSalary, int experienceYears) {
        super(name, baseSalary);
        this.experienceYears = experienceYears;
    }


    @Override
    public int calculateSalary() {
        return baseSalary * experienceYears * 110 / 100;
    }
}
