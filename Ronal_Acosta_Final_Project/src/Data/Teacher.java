package Data;

public class Teacher {
    private double baseSalary;
    //private double baseSalary;
    private String name;
    //private int id;
    private int experienceYears;
    private int activeHoursWeek;


    public Teacher(String name, int experienceYears, int activeHoursWeek) {
        this.name = name;
        //  this.id = id;
        this.experienceYears = experienceYears;
        this.activeHoursWeek = activeHoursWeek;
        this.baseSalary = 908526;
    }


    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", experience years=" + experienceYears +
                ", active hours per week=" + activeHoursWeek +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**public int getId() {
     return id;
     }**/

    /**
     * public void setId(int id) {
     * this.id = id;
     * }
     **/

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

