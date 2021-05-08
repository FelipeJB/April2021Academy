package co.com.javacourse.university.model;

import co.com.javacourse.university.utils.Constans;

public class Student{
    public String name;
    public int age;
    public int id;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = Constans.STUDENT_ID;
        Constans.STUDENT_ID = Constans.STUDENT_ID + 1;
    }

    public String getName() {
        return name;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
