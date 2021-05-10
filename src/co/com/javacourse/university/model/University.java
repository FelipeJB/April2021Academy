package co.com.javacourse.university.model;

import co.com.javacourse.university.utils.Constans;

import java.util.ArrayList;
import java.util.List;

public class University {
    String name = Constans.UNIVERSITY_NAME;
    private List<Student> studentList = new ArrayList<>();
    private List<Teacher> teacherList = new ArrayList<>();
    private List<ClassRoom> classList = new ArrayList<>();

    public List<Student> getStudentList() {
        return studentList;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    public List<ClassRoom> getClassList() {
        return classList;
    }

    public void setAddStudent(Student s){
        getStudentList().add(s);
    }

    public void setAddTeacher(Teacher t){
        getTeacherList().add(t);
    }

    public void setAddCourse(ClassRoom c){
        getClassList().add(c);
    }


    public Student setStudent(String name, int age){ //Add the new student
        Student studentNew = new Student(name,age);
        setAddStudent(studentNew);//Is added to the list
        return studentNew; //Is needed to be add it in a course.
    }

    public void setAddStudentInCourse(Student s, ClassRoom c){
        if(c.getStudentFromCourse(s.getId())){
            System.out.println("The student " + s.getName() + " Is already in the course");
        }else{
            c.setStudents(s);
            System.out.println("The student " + s.getName() + " Was Added to the course " + c.getName());
        }
    }

    public Student getStudent(int id){ //Will get the student object.
        Student s = null;

        for (Student x:studentList){
            if (x.getId() == id){
                s = x;
            }
        }
        if (s == null){
            System.out.println("Student Do not exist"); //Check issue with a try catch
        }
        return  s;
    }

    public void getPrintStudentList(){
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(" * " + studentList.get(i));
        }
    }

    public String getPrintStudentOutOfCourse(List<Student> course){
        List<Student> ls = new ArrayList<>();
        String printList = "";
        for (Student i:getStudentList()){
            boolean found = false;
            for(Student j: course){
                if (j.getId() == i.getId()){
                    found = true;
                }
            }
            if (!found){
                ls.add(i);
                printList += "Id= " + i.getId() + ", Name= " + i.getName() + "\n";
            }
        }
        return printList;
    }

    public void getPrintTeacherList(){
        for (int i = 0; i < teacherList.size(); i++){
            System.out.println((i + 1) + ".) " + teacherList.get(i));
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
                printClassInfo += c + "\n";
                printClassInfo += "Teacher info:\n" + c.getTeacher() + "\n";
                printClassInfo += "Student List:\n" + c.getCourseStudentsList();
            }
        }
        if (printClassInfo == ""){
            printClassInfo = "Incorrect value";
        }
        return printClassInfo;
    }

    public Boolean getClassExist (int id){//Check if the ID of a class is valid.
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

    public String getClassesOfStudent (int id){
        String printClasses = "";
        for (int i = 0; i < classList.size(); i++){
            if (classList.get(i).getStudentFromCourse(id)){
                printClasses += "Class name:" + classList.get(i).getName() + "\n";
            }
        }
        if(printClasses == ""){
            printClasses = " is not presented in a class";
        }else {
            printClasses = " is presented in the classes:\n" + printClasses;
        }
        return printClasses;
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

        room1.getCourseStudents().add(student1);
        room1.getCourseStudents().add(student3);
        room1.getCourseStudents().add(student5);
        room1.getCourseStudents().add(student7);

        room2.getCourseStudents().add(student1);
        room2.getCourseStudents().add(student2);
        room2.getCourseStudents().add(student3);
        room2.getCourseStudents().add(student4);
        room2.getCourseStudents().add(student5);
        room2.getCourseStudents().add(student6);
        room2.getCourseStudents().add(student7);
        room2.getCourseStudents().add(student8);

        setAddCourse(room1);
        setAddCourse(room2);
    }


}
