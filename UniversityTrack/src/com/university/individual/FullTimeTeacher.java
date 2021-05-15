package com.university.individual;

import java.util.ArrayList;

public class FullTimeTeacher extends Person implements Salary {

    private static final double baseSalary = 1700000.0;
    private int experienceYears;
    private double salary;
    private String timeType;

    public FullTimeTeacher(String name, String lastname, int age, int experienceYears) {
        super(name, lastname, age);
        this.experienceYears = experienceYears;
        this.timeType = "Full";
        this.salary = calculateSalary(experienceYears);
    }

    public FullTimeTeacher() {
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public double calculateSalary(int experienceYears) {
        return (baseSalary * (1.10 * experienceYears)) + baseSalary;
    }

    @Override
    public String toString() {
        return "FullTimeTeacher =>  " +
                "experienceYears:" + experienceYears +
                ", salary:" + salary +
                ", timeType:" + timeType +
                ", name:" + name +
                ", lastname:" + lastname +
                ", age:" + age ;
    }
}
