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
            System.out.print(studentU.get(i).getId()+ " ");
            System.out.println(studentU.get(i).getName());
        }
    }

   /* public List<String> getCoursesforStudent(int pId){
        List <String> listCourses = new ArrayList<>();
        String course = "";
        for (int i = 0; i < courses.size(); i ++){
            course = courses.get(i).getStudentFromCourseById(pId);
            listCourses.add(course);
        }
        return listCourses;
    }*/

    public String getCoursesforStudent(int pId){
        String course = " ";
        for (int i = 0; i < courses.size(); i ++){
            course = courses.get(i).getStudentFromCourseById(pId);
            System.out.println(course);
        }
        return course;
    }
}
