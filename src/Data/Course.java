package Data;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String classroom;
    private List<Student> courseStudents = new ArrayList<>();
    private Teacher teacher;

    public Course(String icourseName, String iclassroom, Teacher iteacher, List<Student> icourseStudents ){
     courseName = icourseName;
     classroom = iclassroom;
     teacher = iteacher;
     courseStudents = icourseStudents;
    }

    public void set1NewStudentoCourse(Student inewStudent){
        courseStudents.add(inewStudent);
    }

    //How to find an student by id in the list of courses
    public boolean isStudentInTheCourse(int id){
        // foreach
        for(Student s:this.courseStudents){
            if(s.getStudentId() == id){
                return true;
            }
        }
        return false;
    }


    public List<Student> getCourseStudents() {
        return courseStudents;
    }

    public void setCourseStudents(List<Student> courseStudents) {
        this.courseStudents = courseStudents;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }




}
