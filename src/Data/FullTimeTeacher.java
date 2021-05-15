package Data;

public class FullTimeTeacher extends Teacher {
    private String contract;

    public FullTimeTeacher(String name, int baseSalary, int experienceYears, int activeHoursPerWeek) {
        super(name, baseSalary, experienceYears, activeHoursPerWeek);
        this.contract = "Full Time";
    }


    @Override
    public int calculateSalary() {
        return baseSalary * experienceYears * 110 / 100;
    }

    public String getContract() {
        return contract;
    }
}
