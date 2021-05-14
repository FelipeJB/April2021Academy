package Data;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher {
    protected String name;
    protected int baseSalary;
    protected int experienceYears;
    protected int activeHoursPerWeek;


    public Teacher(String name, int baseSalary, int experienceYears, int activeHoursPerWeek) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.experienceYears = experienceYears;
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    public abstract int calculateSalary();


    public String getName() {
        return name;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }
}
