package Data;

public class Teacher extends Person{
    private double baseSalary;
    private int experienceYears;
    private int activeHoursWeek;


    public Teacher(int id,int age, String name,int experienceYears,int activeHoursWeek) {
        super(id,age,name);
        this.experienceYears = experienceYears;
        this.activeHoursWeek = activeHoursWeek;
        this.baseSalary = 908526;
    }


@Override
public String toString() {
    return "Teacher{" +
            "name ='" + Teacher.this.getName() + '\'' +
            ", age =" + Teacher.this.getAge() + '\'' +
            ", experience years =" + Teacher.this.getExperienceYears() + '\'' +
            ", active hours per week =" + Teacher.this.getActiveHoursWeek() +
            '}';
}



    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public int getActiveHoursWeek() {
        return activeHoursWeek;
    }

    public void setActiveHoursWeek(int activeHoursWeek) {
        this.activeHoursWeek = activeHoursWeek;
    }

    public double getSalary(int activeHoursWeek, int experienceYears) {
        if(activeHoursWeek>=40) {
            return (baseSalary * (1.10 * experienceYears));
        }
        else if(activeHoursWeek > 0) {
            return (baseSalary * activeHoursWeek);
        }
        else {
        return 0;
        }

    }


}

