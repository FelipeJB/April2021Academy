package Data;

import java.util.ArrayList;
import java.util.List;

public class University {

    //The university includes a list of teachers, a list of students and a list of courses
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();


    /*public University(ArrayList<Teacher> teachers, ArrayList<Student> students, ArrayList<Course> courses) {
        this.teachers = teachers;
        this.students = students;
        this.courses = courses;
    }*/

    public ArrayList<Teacher> getTeacher() {
        return teachers;
    }

    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }

    public ArrayList<Student> getStudent() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourse() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
}
