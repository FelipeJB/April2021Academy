package Data;

import java.util.ArrayList;
import java.util.Random;

public class Teacher extends Person{
    double baseSalary;
    int experience, workHours;
    boolean isFullTime;

    public Teacher(String name, int age, double baseSalary , int experience, int workHours, boolean isFullTime) {
        super(name, age);
        this.experience=experience;
        this.workHours=workHours;
        this.isFullTime=isFullTime;
        this.baseSalary=baseSalary;
    }

    public int getExperience() {
        return this.experience;
    }

    public int getWorkHours() {
        return this.workHours;
    }

    public boolean getIsfulltime() {
        return this.isFullTime;
    }

    public double getSalary(boolean isFullTime, int experience, int workHours){
        if (isFullTime){
           return this.baseSalary*(experience*1.1);
        }else{
            return this.baseSalary*workHours;
        }
    }




}
