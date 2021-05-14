package Data;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String universityName;
    private List<Course> courses;
    private List<Teacher> teachers;
    private List<Student> studentU;

    public University() {
        this.universityName = "Universidad Proyecto";
        this.courses = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.studentU = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public List<Course> getCourse() {
        return courses;
    }

    public void setCourse(List<Course> course) {
        this.courses = course;
    }

    public List<Teacher> getTeacher() {
        return teachers;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teachers = teacher;
    }

    public List<Student> getStudentU() {
        return studentU;
    }

    public void setStudentU(List<Student> studentU) {
        this.studentU = studentU;
    }

    public void addStudent(Student student) {
        studentU.add(student);
    }

    public void addTeacher(Teacher pTeacher) {
        teachers.add(pTeacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void displayTeachers() {
        for (int i = 0; i < teachers.size(); i++) {
            System.out.println("************************************");
            getTeacher().get(i).getInfo();
        }
    }

    public void displayCourses() {
        for (int i = 0; i < courses.size(); i++) {
            System.out.println(i + 1 + ". " + courses.get(i).getName() + " ");
        }
    }

    public void displayStudents() {
        for (int i = 0; i < studentU.size(); i++) {
            System.out.print(studentU.get(i).getId() + " ");
            System.out.println(studentU.get(i).getName());
        }
    }

    public void addStudenttoCourse(Student student, String nameCourse) {
        for (int i = 0; i < courses.size(); i++) {
            Course courseTemporal = courses.get(i);
            if (courseTemporal.getName().equalsIgnoreCase(nameCourse)) {
                courseTemporal.addStudentToCourse(student);
            }
        }
    }

    public Teacher addTeachertoCourse(String nameTeacher) { //Probar mañana para arreglar opcion 5
        Teacher teacherTemporal = null;
        for (int i = 0; i < teachers.size(); i++) {
            teacherTemporal = teachers.get(i);
            if (teacherTemporal.getName().equalsIgnoreCase(nameTeacher)){
                teacherTemporal = teachers.get(i);
                }
            }
        return teacherTemporal;
        }


    public String getCoursesforStudent(int pId) {
        String course = "";
        String allCourses = "";
        for (int i = 0; i < courses.size(); i++) {
            if(courses.get(i).getStudentFromCourseById(pId) != 0){
                course = courses.get(i).getName();
                allCourses = allCourses + " - " + course;
            }
        }
        if (allCourses == "") {
            System.out.println("El estudiante no esta asignado a ninguna clase");
        }
        return allCourses;
    }
}
