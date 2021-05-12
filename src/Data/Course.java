package Data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int classroom;
    //private List<Student> studentsList;
    private Teacher teacherName;

    private ArrayList<Student> students = new ArrayList<>();

    public Course(String name, int classroom, Teacher teacherName) {
        this.name = name;
        this.classroom = classroom;

        this.teacherName = teacherName;
    }







    //a list of students and
    //un atributo de tipo Teacher



}
