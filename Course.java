package Data;

import java.util.ArrayList;

public class Course {

    private String name;
    private int room;
    private Teacher teacher;
    private ArrayList <Student> students;

    public Course (String name, int room, Teacher teacher, ArrayList students){
        this.name=name;
        this.room=room;
        this.teacher=teacher;
        this.students=students;
    }

    public String getName() {
        return this.name;
    }

    public int getRoom() {
        return this.room;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public ArrayList<Student> getStudents() {
        return this.students;
    }

    public void setStudent(Student student){
        this.students.add(student);

    }


}
