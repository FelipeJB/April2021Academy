package co.com.javacourse.university.model;

import co.com.javacourse.university.utils.Constans;

import java.util.ArrayList;
import java.util.List;

public class University {
    String name = Constans.UNIVERSITY_NAME;
    private List<Person> studentList = new ArrayList<>();
    private List<Person> teacherList = new ArrayList<>();
    private List<ClassRoom> classList = new ArrayList<>();

    public List<Person> getStudentList() {
        return studentList;
    }

    public List<Person> getTeacherList() {
        return teacherList;
    }

    public List<ClassRoom> getClassList() {
        return classList;
    }

    public void setAddStudent(Person s){
        getStudentList().add(s);
    }

    public void setAddTeacher(Teacher t){
        getTeacherList().add(t);
    }

    public void setAddCourse(ClassRoom c){
        getClassList().add(c);
    }

    public void getPrintStudentList(){
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(" * " + studentList.get(i));
        }
    }

    public void getPrintTeacherList(){
        for (int i = 0; i < teacherList.size(); i++){
            System.out.println(" * " + teacherList.get(i));
        }
    }

    public void getPrintClassList(){
        for (int i = 0; i < classList.size(); i++){
            System.out.println(" * " + classList.get(i));
        }
    }

    public String getClassInfo(int id){
        String printClassInfo = "";
        for (ClassRoom c: classList){
            if (c.getId() == id){
                String printClassInfo = "";
                printClassInfo += c + "\n";
                printClassInfo += "Teacher info:\n" + c.getTeacher() + "\n";
                printClassInfo += "Student List:\n" + c.getCourseStudentsList();
            }else{
                printClassInfo = "Incorrect Id Number";
            }
        }
        return printClassInfo;
    }

    public Boolean getClassExist (int id){
        Boolean result = false;
        for (ClassRoom c: classList){
            if (c.getId() == id){
                result = true;
            }else{
                result = false;
            }
        }
        return result;
    }

    public void start (){
        Student student1 = new Student("yefry",15);
        Student student2 = new Student("Lina", 15);
        Student student3 = new Student("Pedro",15);
        Student student4 = new Student("Claudia", 15);
        Student student5 = new Student("Felipe", 15);
        Student student6 = new Student("Jessica", 15);
        Student student7 = new Student("Liliana",15);
        Student student8 = new Student("Ronal", 15);
        PartTimeTeacher teacher1 = new PartTimeTeacher("Jimenez", 10);
        PartTimeTeacher teacher2 = new PartTimeTeacher("Bohorquez", 20);
        FullTimeTeacher teacher3 = new FullTimeTeacher("Jesus", 20);
        FullTimeTeacher teacher4 = new FullTimeTeacher("Margarita", 10);
        setAddStudent(student1);
        setAddStudent(student2);
        setAddStudent(student3);
        setAddStudent(student4);
        setAddStudent(student5);
        setAddStudent(student6);
        setAddStudent(student7);
        setAddStudent(student8);
        setAddTeacher(teacher1);
        setAddTeacher(teacher2);
        setAddTeacher(teacher3);
        setAddTeacher(teacher4);
        ClassRoom room1 = new ClassRoom("Math",8,"F1R101",teacher1);
        ClassRoom room2 = new ClassRoom("Java",8,"F1R102",teacher2);
        room1.setStudents(student1);
        room1.setStudents(student2);
        room2.setStudents(student1);
        room2.setStudents(student2);
        room2.setStudents(student3);
        room2.setStudents(student4);
        room2.setStudents(student5);
        setAddCourse(room1);
        setAddCourse(room2);
    }










}
