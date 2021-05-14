package Data;

import java.util.ArrayList;
import java.util.List;

public class University {

    //The university includes a list of teachers, a list of students and a list of courses
    List<Teacher> teachers = new ArrayList<>();
    List<Student> students = new ArrayList<>();
    List<Course> courses = new ArrayList<>();


    public University(List<Teacher> teachers, List<Student> students, List<Course> courses) {
        this.teachers = teachers;
        this.students = students;
        this.courses = courses;
    }

    public List<Student> getStudentsList() {
        return students;
    }

    /*
*/


}
