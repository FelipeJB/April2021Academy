package co.com.javacourse.university.model;

import co.com.javacourse.university.utils.Constans;

public class Student extends Person{
    private String name;
    private int age;
    private int id;

    public Student(String name, int age) {
        super(name);
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student {" +
                "Id= " + super.getId() +
                ", Name='" + super.getName() + '\'' +
                ", age=" + age +
                '}';
    }
}
