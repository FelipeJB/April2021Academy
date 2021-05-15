package Data;

public class PartTimeTeacher extends Teacher {


    public PartTimeTeacher(String name, int baseSalary, int experienceYears, int activeHoursPerWeek) {
        super(name, baseSalary, experienceYears, activeHoursPerWeek);
        //this.activeHoursPerWeek = activeHoursPerWeek;
    }


    @Override
    public int calculateSalary() {
        return baseSalary * activeHoursPerWeek;
    }
}
