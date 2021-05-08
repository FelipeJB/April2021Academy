package Data;

public class TeacherFullTime extends Teacher {

    private int yearsExperience;

    public TeacherFullTime(String pName, float pBaseSalary, int pYearsExperience){
        super(pName, pBaseSalary);
        this.yearsExperience = pYearsExperience;

    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    @Override
    public float calculateSalary() {
        return 0;
    }
    //For the full time teachers: base salary (attribute) multiplied by 110% of its experience years.

}
