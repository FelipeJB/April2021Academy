package Data;


import java.util.ArrayList;
import java.util.Scanner;

public class University {
    private ArrayList <Teacher> teacherList = new ArrayList<>();
    private ArrayList <Student> studentList = new ArrayList<>();
    private ArrayList <Course> courseList = new ArrayList<>();
    private ArrayList <Person> persons = new ArrayList<>();


    //1.	Initialize minimum 2 different teachers of each type (full time, part time).

    public void initialiteTeachers() {
        Teacher t1 = new Teacher(40, "Mariana Velez", 3, 6);
        Teacher t2 = new Teacher(36, "Javier Ramirez", 2, 8);
        Teacher t3 = new Teacher(42, "Camila Suarez", 7, 40);
        Teacher t4 = new Teacher(50, "Ismael Osorio", 8, 40);

        teacherList.add(t1);
        teacherList.add(t2);
        teacherList.add(t3);
        teacherList.add(t4);
    }

    //2.	Initialize minimum 6 different students

    public void initialiteStudents(){
        Student student1 = new Student(20, "Mario Pombo");
        Student student2 = new Student(25, "Eduardo Rodriguez");
        Student student3 = new Student(21, "Luisa Calle");
        Student student4 = new Student(22, "Mariana Pajón");
        Student student5 = new Student(21, "Martin Rosales");
        Student student6 = new Student(19, "Ana Perez");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);

    }


    //3.	Initialize minimum 4 different classes including its teacher , students and other relevant data

    public void initialiteCourses() {
        Course c1 = new Course("Mathematics", "A01", 6, getTeacherList().get(0));
        c1.addStudent(getCourseStudentList().get(0));
        c1.addStudent(getCourseStudentList().get(1));
        c1.addStudent(getCourseStudentList().get(3));
        courseList.add(c1);

        Course c2 = new Course("Business", "A02", 7, getTeacherList().get(1));
        c2.addStudent(getCourseStudentList().get(1));
        c2.addStudent(getCourseStudentList().get(4));
        c2.addStudent(getCourseStudentList().get(5));
        courseList.add(c2);

        Course c3 = new Course("Arts", "B01", 8, getTeacherList().get(2));
        c3.addStudent(getCourseStudentList().get(0));
        c3.addStudent(getCourseStudentList().get(2));
        c3.addStudent(getCourseStudentList().get(4));
        c3.addStudent(getCourseStudentList().get(5));
        courseList.add(c3);


        Course c4 = new Course("Humanities", "B02", 8, getTeacherList().get(3));
        c4.addStudent(getCourseStudentList().get(1));
        c4.addStudent(getCourseStudentList().get(2));
        c4.addStudent(getCourseStudentList().get(3));
        courseList.add(c4);

    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public ArrayList<Student> getCourseStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public ArrayList<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(ArrayList<Course> courseList) {
        this.courseList = courseList;
    }


    public void addStudentToCourse(Course c,Student s){
        c.addStudent(s);
    }


    public Course createCourse(String courseName,String assignedClassRoom,int noOfStudents, Teacher teacher){
        Course cnew = new Course(courseName, assignedClassRoom, noOfStudents, teacher);
        courseList.add(cnew);
     return cnew;
    }

    public Student createStudent(int age, String name){
        Student snew = new Student(age,name);
        return snew;
    }


    public Teacher createTeacher(int age, String name,int experienceYears,int activeHoursWeek){
        Teacher tnew = new Teacher(age,name,experienceYears,activeHoursWeek);
        return tnew;
    }

    public void printListOfTeachers(University r) {

        for (int i = 0; i < r.getTeacherList().size(); i++) {
            System.out.println(r.getTeacherList().get(i));
        }

    }



    public void listCoursesOfStudent(University r,int id4) {
     for (int i =0;i<r.getCourseList().size();i++) {

     if (r.getCourseList().get(i).getStudentFromCourse(id4)==true) {

     System.out.println("The student is enrolled in: " + r.getCourseList().get(i).getCourseName());
     }
     else {
     System.out.println("The student is NOT enrolled in: "+ r.getCourseList().get(i).getCourseName());
     }
     }
    }



    public ArrayList <Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList <Person> persons) {
        this.persons = persons;
    }

    public University(){
        this.courseList= new ArrayList<>();
        this.studentList= new ArrayList<>();
        this.teacherList= new ArrayList<>();
        this.persons= new ArrayList<>();
    }



}
