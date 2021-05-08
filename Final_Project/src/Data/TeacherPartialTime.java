package Data;

public class TeacherPartialTime  extends Teacher {

    private int activeHoursPerWeek;

    public TeacherPartialTime(String pName, float pBaseSalary, int pActiveHours){
        super(pName, pBaseSalary);
        this.activeHoursPerWeek = pActiveHours;
    }

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(int activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public float calculateSalary() {
        return 0;
    }
    //For part time teachers: base salary multiplied for its active hours per week.
}
