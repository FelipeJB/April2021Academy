package ClassRoom;

import Person.Student;
import Person.Teacher;

import java.util.ArrayList;

public class CourseRoom extends ClassRoom{

    private ArrayList<Student> studentList;
    private Teacher teacher;

    //Defined Constructor
    public CourseRoom(int idClass, String name, Teacher teacher, ArrayList studentList){
        super(idClass, name);
        this.teacher = teacher;
        this.studentList = studentList;
    }

    //Getters and Setters section
    @Override
    public int getIdClass() {
        return this.idClass;
    }

    @Override
    public String getName() {
        return this.name;
    }

    //Two Lists for Teachers and Students

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
