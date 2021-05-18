package Data;

import java.util.ArrayList;

public class Subject extends Classroom{

    private ArrayList<Student> studentList;
    private Teacher teacher;

    public Subject(int idClass, String name, Teacher teacher, ArrayList studentList){
        super(idClass, name);
        this.teacher = teacher;
        this.studentList = studentList;
    }
    @Override
    public int getIdClass() {
        return 0;
    }

    @Override
    public String getName() {
        return null;
    }
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
