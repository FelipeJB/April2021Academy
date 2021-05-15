package com.university.individual;

public class Student extends Person {

    private int Id;
    private int semester;
    private String course;

    public Student(int Id, String name, String lastname, int age, int semester, String course) {
        super(name,lastname,age);
        this.Id = Id;
        this.semester = semester;
        this.course = course;
    }

    public Student() {

    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", Id=" + Id +
                '}';
    }
}

