package Data;

public class PartTimeTeacher extends Teacher {
    private int activeHoursPerWeek;

    public PartTimeTeacher(String name, int baseSalary, int activeHoursPerWeek) {
        super(name, baseSalary);
        this.activeHoursPerWeek = activeHoursPerWeek;
    }


    @Override
    public int calculateSalary() {
        return baseSalary * activeHoursPerWeek;
    }
}
