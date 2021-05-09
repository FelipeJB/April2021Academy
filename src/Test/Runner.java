package Test;

import co.com.javacourse.university.model.*;
import co.com.javacourse.university.utils.Constans;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        boolean exit = false;
        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();
        List<ClassRoom> classList = new ArrayList<>();

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
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        ClassRoom room1 = new ClassRoom("Math",8,"F1R101",teacher1);
        ClassRoom room2 = new ClassRoom("Java",8,"F1R102",teacher2);
        room1.setStudents(student1);
        room1.setStudents(student2);
        room2.setStudents(student1);
        room2.setStudents(student2);
        room2.setStudents(student3);
        room2.setStudents(student4);
        room2.setStudents(student5);
        classList.add(room1);
        classList.add(room2);


        do{
            System.out.println("\n ----------------------------------------- ");
            System.out.println(" ---------- " + Constans.UNIVERSITY_NAME + " ----------");
            System.out.println(" ----------------------------------------- ");
            System.out.println("1. Print the professors list");
            System.out.println("2. Print all the classes " );
            System.out.println("3. Create a new student and add it to an existing class");
            System.out.println("4. create a new class and add a teacher and a list of students");
            System.out.println("5. List the classes with a student ID");
            System.out.println("6. Exit");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println(" ---------- " + "Professor List" + " ----------");
                    getPrintList(teacherList);
                    break;
                case 2:
                    System.out.println(" ---------- " + "Classes List" + " ----------");
                    System.out.println("Please select the number of the class from 0 to " + (classList.size() - 1));
                    getPrintList(classList);
                    int courseOption = scan.nextInt();
                    if (courseOption >= classList.size() || courseOption < 0){
                        System.out.println("Incorrect number.");
                    }else{
                        System.out.println(getClassInfo(classList.get(courseOption)));
                    }
                    break;
                case 3:
                    System.out.println(" ---------- " + "Add new student" + " ----------");
                    System.out.println("Student Name:");
                    String name = scan.next();
                    System.out.println("Student Age:");
                    int age = scan.nextInt();
                    Student studentN = new Student(name,age);
                    getPrintList(classList);
                    System.out.println("Please select the number of the class from 0 to " + (classList.size() - 1) + " to add thee new student");
                    courseOption = scan.nextInt();
                    if (courseOption >= classList.size() || courseOption < 0){
                        System.out.println("Incorrect number.");
                    }else{
                        classList.get(courseOption).setStudents(studentN);
                        System.out.println("Student " + studentN.getName() + ", Added to " + classList.get(courseOption).getName() + " class.");
                    }
                    break;

                case 4:
                    System.out.println(" ---------- " + "Add new class" + " ----------");
                    System.out.println("Class name:");
                    String className = scan.next();
                    System.out.println("Weekly hours of the course:");
                    int weekHour = scan.nextInt();
                    System.out.println("Room number to attend the course:");
                    String room = scan.next();
                    System.out.println("Please select the teacher assign to the class from 0 to " + (teacherList.size() - 1));
                    getPrintList(teacherList);
                    int teacherOption = scan.nextInt();
                    if (teacherOption >= teacherList.size() || teacherOption < 0){
                        System.out.println("Incorrect number.");
                    }else{
                        ClassRoom cr = new ClassRoom(className,weekHour,room,teacherList.get(teacherOption));
                        classList.add(cr);
                        System.out.println("Course added!!, Please select the id of the student you will add");
                        System.out.println("How many students will you add (lower than " + studentList.size() + ")");
                        int numberStudents = scan.nextInt();
                        if (numberStudents>= studentList.size() || numberStudents == 0){
                            System.out.println("incorrect number.");
                        }else{
                            for (int i = 1; i <= numberStudents; i = (cr.getCourseStudents().size() + 1)){
                                System.out.println("Enter the ID for the student number " + i + " from the following list of students");
                                getPrintList(getStudentsOutOfCouRse(studentList, cr.getCourseStudents()));
                                int ids = scan.nextInt();
                                cr.setStudents(getStudentObject(ids, studentList));
                            }
                        }

                    }

                    break;

                case 5:
                    System.out.println(" ---------- " + "Student is on course?" + " ----------");
                    System.out.println("Please add the ID of the student that are list (from 0 to " + (Constans.STUDENT_ID - 1) + ")");
                    getPrintList(studentList);
                    int foundStudent = scan.nextInt();
                    System.out.println("The Student " + getStudentObject(foundStudent,studentList).getName() + getClassesOfStudent(classList,foundStudent));
                    break;

                default:
                    exit = true;
                    break;
            }

        } while (exit == false);


    }
    public static void getPrintList(List list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(i + ".) "+list.get(i));
        }
    }

    public static List<Student> getStudentsOutOfCouRse(List<Student> list, List<Student> course){
        List<Student> ls = new ArrayList<>();
        for (Student i:list){
            boolean found = false;
            for(Student j: course){
                if (j.getId() == i.getId()){
                    found = true;
                }
            }
            if (found == false){
                ls.add(i);
            }
        }
        return ls;
    }

    public static String getClassInfo (ClassRoom cr){
        String printClassInfo = "";
        printClassInfo += cr + "\n";
        printClassInfo += "Teacher info:\n" + cr.getTeacher() + "\n";
        printClassInfo += "Student List:\n" + cr.getCourseStudentsList();
        return printClassInfo;
    }

    private static Student getStudentObject(int id, List<Student> list){
        for (Student student: list){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public static String getClassesOfStudent (List<ClassRoom> listCR, int id){
        String printClasses = "";
        for (int i = 0; i < listCR.size(); i++){
            if (listCR.get(i).getStudentFromCourse(id) == true){
                printClasses += "Class name:" + listCR.get(i).getName() + "\n";
            }
        }
        if(printClasses == ""){
            printClasses = " is not presented in a class";
        }else {
            printClasses = " is presented in the classes:\n" + printClasses;
        }
        return printClasses;
    }
}
