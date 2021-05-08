package Data;

import java.util.ArrayList;
import java.util.List;

public class Course extends University{

    private String name;
    private int classRoom;
    private List<Student> students;
    private Teacher teacher;

    public Course(String pName, int pClassRoom, Teacher pTeacher){
        this.name = pName;
        this.classRoom = pClassRoom;
        this.teacher = pTeacher;
        this.students = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(int classRoom) {
        this.classRoom = classRoom;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    //@Override
    //public List<Teacher> getTeacher() {
      //  return teacher;
    //}


    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

}
