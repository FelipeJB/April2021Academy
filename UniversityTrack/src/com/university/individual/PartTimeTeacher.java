package com.university.individual;

import java.util.ArrayList;

public class PartTimeTeacher extends Person implements Salary{

    private static final double baseSalary = 1700000.0;
    private int hours;
    private double salary;
    private String timeType;


    public PartTimeTeacher(String name, String lastname, int age, int hours) {
        super(name, lastname, age);
        this.hours = hours;
        this.timeType = "Part";
        this.salary = calculateSalary(hours);
    }


    public PartTimeTeacher() { }

    public int getHours() {
        return hours;
    }

    public double calculateSalary(int hours) {
        return ((baseSalary/160) * hours);//160 active monthly hours
    }

    @Override
    public String toString() {
        return "PartTimeTeacher =>  " +
                "hours:" + hours +
                ", salary:" + salary +
                ", timeType:" + timeType +
                ", name:" + name +
                ", lastname:" + lastname +
                ", age:" + age ;
    }
}
