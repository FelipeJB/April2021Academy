package co.com.javacourse.university.model;

import co.com.javacourse.university.utils.Constans;

public class PartTimeTeacher extends Teacher{

    private int activeHours;

    public PartTimeTeacher(String name, int activeHours) {
        super(Constans.PART_TIME_BASIC_SALARY,name, Constans.PART_TIME_TEACHER);
        this.activeHours = activeHours;
    }

    @Override
    public double getSalary(){
        return getBasicSalary() * activeHours;
    }
}
