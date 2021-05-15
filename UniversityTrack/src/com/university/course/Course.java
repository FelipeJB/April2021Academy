package com.university.course;

import com.university.individual.Person;
import com.university.individual.Student;
import java.util.ArrayList;
import java.util.List;

public class Course {

    private String course;
    private Person person;
    private int classroom;
    private List<Student> student;

    public Course(String course, Person person, int classroom, List<Student> student) {
        this.course = course;
        this.classroom = classroom;
        this.student = student;
        this.person = person;
    }

    public Course() {

    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    public Student getStudentFromCourseByID(int id) {
        Student foundStudent = new Student();
        for (int i = 0; i <student.size(); i++) {
            if (student.get(i).getId() == id) {
                foundStudent = student.get(i);
            }
        }
        return foundStudent;
    }

    @Override
    public String toString() {
        return "Course => " +
                "subject='" + course + '\'' +
                ", teacher=" + person +
                ", classroom=" + classroom +
                ", student=" + student
                ;
    }
}
