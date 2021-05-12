package Data;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher {
    protected String name;
    protected int baseSalary;
    //protected int experienceYears;
    //protected int activeHoursPerWeek;


    public Teacher(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
        //this.experienceYears = experienceYears;
        //this.activeHoursPerWeek = activeHoursPerWeek;
    }

    public abstract int calculateSalary();


    public String getName() {
        return name;
    }


}
