package Data;

import java.util.ArrayList;

public class Course {

    private String name;
    private int classroom;
    private Teacher teacher;
    private ArrayList<Student> courseStudents;


    public Course(String name, int classroom, Teacher teacher) {
        this.name = name;
        this.classroom = classroom;
        this.teacher = teacher;
        this.courseStudents = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getClassroom() {
        return classroom;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getCourseStudents() {
        return courseStudents;
    }

    public boolean getStudentFromCourse(int ID) {

        boolean foundStudent = false;
        if (courseStudents.size() == 0)
            foundStudent = false;
        else {
            for (Student s : courseStudents) {
                if (s.getID() == ID)
                    foundStudent = true;
            }
        }
        return foundStudent;
    }


    public void addStudent(Student student) {

        if (getStudentFromCourse(student.getID()))
            System.out.println("The student is already in the students list");
        else {
            courseStudents.add(student);
        }
    }

    public void printDataNameStudent(){
        for (Student s: courseStudents) {
            System.out.println(s.getName());
        }
    }
}