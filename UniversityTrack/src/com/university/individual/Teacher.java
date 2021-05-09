package com.university.individual;

import com.university.individual.Person;

public class Teacher extends Person {

    private double salary;

    public Teacher(String name, String lastname, int age, double salary) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
