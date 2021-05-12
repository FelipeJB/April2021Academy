package co.com.javacourse.university.model;

import co.com.javacourse.university.utils.Constans;

public class FullTimeTeacher extends Teacher{

    private int experienceYears;

    public FullTimeTeacher(String name, int experienceYears) {
        super(Constans.FULL_TIME_BASIC_SALARY, name, Constans.FULL_TIME_TEACHER);
        this.experienceYears = experienceYears;
    }

    @Override
    public double getSalary(){
        return getBasicSalary() * experienceYears * 1.1;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Id = " + super.getId() +
                ", Name=" + super.getName() +
                ", Contract info=" + Constans.FULL_TIME_TEACHER +
                ", Years of experience=" + experienceYears +
                ", Salary=" + getSalary() +
                '}';
    }
}
