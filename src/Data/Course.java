package Data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int classroom;
    private ArrayList<Student> studentsList;
    //private Teacher teacherName;



    public Course(String name, int classroom,  ArrayList<Student> studentsList) {
        //super(studentsList);
        this.name = name;
        this.classroom = classroom;
        this.studentsList = studentsList;
        //this.teacherName = teacherName;
        //this.studentsList = studentsList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }


    public ArrayList<Student> getStudentsList() {
        return this.studentsList;
    }


    //a list of students and
    //un atributo de tipo Teacher



}
