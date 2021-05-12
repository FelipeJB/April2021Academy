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

    //Aqui hace falta generar los ids automaticos de forma estatica, atributo estatico en la
    // clase que me diga en cual instancia vamos, y al construir cada estudiante iguale el id a esa cantidad y le sune 1 a la cantidad
    public Student getStudentFromClassById(int id){
        Student foundStudent = null;
        for (Student s:this.students) {
            if (s.getId() == id){
                foundStudent = s;
            }
        }
        return foundStudent;
    }

    public void getInfoCourse() {
        System.out.println("Nombre de la clase: " + getName());
        System.out.println("Numero de clase: " + getClassRoom());
        System.out.println("Profesor: " + getTeacher().getName());
        for (int i = 0; i < students.size(); i++){
            System.out.println("Estudiantes: " + students.get(i).getName());
        }
    }

}
