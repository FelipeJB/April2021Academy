package Data;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String assignedClassRoom;
    private int noOfStudents;
    ArrayList <Student> studentList;
    private Teacher teacher;

    public Course(){
        this.noOfStudents = 0;
        this.courseName = "Not Set";
        this.teacher = null;
        studentList = new ArrayList<Student>();
    }

    public Course(String courseName,String assignedClassRoom,int noOfStudents, Teacher teacher)
        {
            this.courseName=courseName;
            this.noOfStudents = noOfStudents;
            this.assignedClassRoom = assignedClassRoom;
            studentList = new ArrayList<Student>();
            this.teacher = teacher;
        }



    public void addStudent(Student newStudent){
        if(studentList.size()==noOfStudents){
            System.out.println("This course is full, you cannot enroll a new Student.");
        }
        else {
            studentList.add(newStudent);
        }
    }



    /**
    public boolean addStudent(Student student){
        if (student==null || studentList.contains(student)) {
            return false;
        }
        studentList.add(student);
        return true;
    }

**/

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getAssignedClassRoom() {
        return assignedClassRoom;
    }

    public void setAssignedClassRoom(String assignedClassRoom) {
        this.assignedClassRoom = assignedClassRoom;
    }


    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }



    @Override
    public String toString() {
        return //"{" +
                    " Course name ='" + courseName + '\'' +
                    ", Number of students = " + studentList.size()  +
                    ", Assigned classroom = " + assignedClassRoom +
                    ", Teacher = " + teacher.getName() +
                    ' ';

    }


    public String printCourse() {
        return //"{" +
                " Course name ='" + courseName + '\'' +
                        ", Students list = " + studentList  +
                        ", Assigned classroom = " + assignedClassRoom +
                        ", Teacher = " + teacher.getName() +
                        ' ';

    }



    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }


}
