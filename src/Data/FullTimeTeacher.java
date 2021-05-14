package Data;

public class FullTimeTeacher extends Teacher {
    //private int experienceYears;

    public FullTimeTeacher(String name, int baseSalary, int experienceYears, int activeHoursPerWeek) {
        super(name, baseSalary, experienceYears, activeHoursPerWeek);
        //this.experienceYears = experienceYears;
    }


    @Override
    public int calculateSalary() {
        return baseSalary * experienceYears * 110 / 100;
    }
}
