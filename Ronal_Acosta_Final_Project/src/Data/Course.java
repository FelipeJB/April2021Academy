package Data;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseName;
    private String assignedClassRoom;
    private int noOfStudents;
    ArrayList <Student> courseStudentList;
    private Teacher teacher;

    public Course(){
        this.noOfStudents = 0;
        this.courseName = "Not Set";
        this.teacher = null;
        courseStudentList = new ArrayList<Student>();
    }


    public Course(String courseName,String assignedClassRoom,int noOfStudents, Teacher teacher)
        {
            this.courseName=courseName;
            this.noOfStudents = noOfStudents;
            this.assignedClassRoom = assignedClassRoom;
            courseStudentList = new ArrayList<Student>();
            this.teacher = teacher;
        }



    public void addStudent(Student newStudent){
        if(courseStudentList.size()==noOfStudents){
            System.out.println("This course is full, you cannot enroll a new Student.");
        }
        else {
            courseStudentList.add(newStudent);
        }
    }



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


    public ArrayList<Student> getCourseStudentList() {
        return courseStudentList;
    }

    public void setCourseStudentList(ArrayList<Student> courseStudentList) {
        this.courseStudentList = courseStudentList;
    }



    @Override
    public String toString() {
        return //"{" +
                    " Course name ='" + courseName + '\'' +
                    ", Number of students = " + courseStudentList.size()  +
                    ", Assigned classroom = " + assignedClassRoom +
                    ", Teacher = " + teacher.getName() +
                    ' ';

    }


    public String printCourse() {
        return //"{" +
                " Course name ='" + courseName + '\'' +
                        ", Students list = " + courseStudentList  +
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




    public boolean getStudentFromCourse(int id)
    {
        boolean found = false;
        if (getCourseStudentList().size()==0) {
            found = false;
        }else{
            for(Person s:getCourseStudentList()){
                if(s.getId()==id){
                    found=true;
                }
            }
        }
      return found;
    }


}
