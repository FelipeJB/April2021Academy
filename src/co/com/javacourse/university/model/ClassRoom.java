package co.com.javacourse.university.model;

import java.util.ArrayList;
import java.util.List;

public class ClassRoom {
    private String name;
    private int hoursWeek;
    private String room;
    private List<Student> courseStudents = new ArrayList<>();
    private Teacher teacher;

    public ClassRoom(String name, int hoursWeek, String room, Teacher teacher) {
        this.name = name;
        this.hoursWeek = hoursWeek;
        this.room = room;
        this.courseStudents = new ArrayList<>();
        this.teacher = teacher;
    }

    public boolean getStudentFromCourse (int id){
        boolean found = false;
        if (courseStudents.size()==0){
            found = false;
            }else {
                for (Student s: courseStudents){
                    if (s.getId() == id){
                        found = true;
                    }
                }
        }
        return found;
    }

    public void setCourseStudents(List<Student> courseStudents) {
        for (Student s: courseStudents){
            if (getStudentFromCourse(s.getId())){
                this.courseStudents.add(s);
            }else{
                System.out.println("Student ID = " + s.getId() + " Nombre = " + s.getName() + " Already Added in course =" + getName());
            }
        }
    }

    public void setStudents(Student s){
        if (getStudentFromCourse(s.getId())){
            System.out.println("Student ID = " + s.getId() + " Nombre = " + s.getName() + " Already Added in course =" + getName());
        }else{
            this.courseStudents.add(s);
            }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWeek() {
        return hoursWeek;
    }

    public void setHoursWeek(int hoursWeek) {
        this.hoursWeek = hoursWeek;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public List<Student> getCourseStudents() {
        return courseStudents;
    }

    public String getCourseStudentsList() {
        String printStudents ="";
        for (int i = 0; i < courseStudents.size(); i++){
            printStudents += ((i + 1) + ".) "+courseStudents.get(i)) + "\n";
        }
        return printStudents;
    }


    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Class Room{" +
                "name='" + name + '\'' +
                ", hours at week=" + hoursWeek +
                ", Room='" + room + '\'' +
                ", Number of students=" + courseStudents.size() +
                ", Teacher=" + teacher.getName() +
                '}';
    }
}
