package Data;

import java.util.List;

public class Course {
    private String courseName;
    private String assignedClassRoom;
    private List<Student> studentCourseList;
    private String teacher;

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

    public List<Student> getStudentCourseList() {
        return studentCourseList;
    }

    public void setStudentCourseList(List<Student> studentCourseList) {
        this.studentCourseList = studentCourseList;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}
