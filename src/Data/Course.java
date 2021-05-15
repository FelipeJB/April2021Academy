package Data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private int classroom;
    private ArrayList<Student> courseStudents = new ArrayList<>();
    private Teacher courseTeacher;

    public Course(String name, int classroom, Teacher courseTeacher) {
        //super(studentsList);
        this.name = name;
        this.classroom = classroom;
        this.courseTeacher = courseTeacher;
    }

    public Course(){

    }

    public Student getStudentFromClassById(int id){
        Student foundStudent = new Student();
        for (Student s:this.courseStudents) {
            if (s.getId() == id){
                foundStudent = s;
            }

        }
        return foundStudent;
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

    public Teacher getCourseTeacher() {
        return courseTeacher;
    }

    public void setCourseTeacher(Teacher courseTeacher) {
        this.courseTeacher = courseTeacher;
    }

    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(ArrayList<Student> courseStudents){
        this.courseStudents = courseStudents;
    }


}
