package data;

import java.util.List;

public class Course extends University {
    private String courseName;
    private int classroom;
    private List<Student> students;
    private Teacher teacher;

    public Course(String courseName, int classroom, List<Student> students, Teacher teacher) {
        this.courseName = courseName;
        this.classroom = classroom;
        this.students = students;
        this.teacher = teacher;
    }

    public Course() {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
}
