package data;

import java.util.List;

public class University {

    protected List<Course> courses;
    protected List<Student> students;
    protected List<Teacher> teachers;

    public University(List<Course> courses, List<Student> students, List<Teacher> teachers) {
        this.courses = courses;
        this.students = students;
        this.teachers = teachers;
    }

    public University() {
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
}
