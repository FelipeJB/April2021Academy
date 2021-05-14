package Data;

import java.util.ArrayList;
import java.util.List;

public class Course {

    private String name;
    private int classRoom;
    private List<Student> students;
    private Teacher teacher;

    public Course(String pName, int pClassRoom, Teacher pTeacher, List<Student> pStudent){
        this.name = pName;
        this.classRoom = pClassRoom;
        this.teacher = pTeacher;
        this.students = pStudent;
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

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public int getStudentFromCourseById(int id){
        int foundIdStudent = 0;
        boolean foundStudend = false;
        for (int i = 0; i < students.size() && !foundStudend; i++) {
            if (students.get(i).getId() == id){
                foundIdStudent = students.get(i).getId();
                foundStudend = true;
            }
        }
        return foundIdStudent;
    }

    public void getInfoCourse() {
        System.out.println("Nombre de la clase: " + getName());
        System.out.println("Numero de clase: " + getClassRoom());
        System.out.println("Profesor: " + getTeacher().getName());
        for (int i = 0; i < students.size(); i++){
            System.out.println("Estudiantes: " + students.get(i).getName());
        }
    }

    public void addStudentToCourse(Student student){
                students.add(student);
    }

  public Teacher addTeacherToCourse(String pName){
        Teacher teacherFound = null;
        if (pName.equalsIgnoreCase(teacher.getName())) {
            teacherFound = getTeacher();
        }
        System.out.println(teacherFound);
        return teacherFound;
    }
}


