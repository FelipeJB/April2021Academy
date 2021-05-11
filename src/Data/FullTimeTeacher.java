package Data;

import java.util.ArrayList;

public class FullTimeTeacher extends Teacher {
    private int experienceYears;

    public FullTimeTeacher(String name, int baseSalary, int experienceYears) {
        super(name, baseSalary);
        this.experienceYears = experienceYears;
    }



    @Override
    //For the full-time teachers: base salary (attribute) multiplied by 110% of its experience years.
    public int calculateSalary() {
        return baseSalary * experienceYears * 110 / 100;
    }
}
