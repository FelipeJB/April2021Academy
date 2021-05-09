package co.com.javacourse.university.test;

import co.com.javacourse.university.model.*;
import co.com.javacourse.university.utils.Constans;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        boolean exit = false;
        University u = new University();
        u.start();

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
                    System.out.println(" ---------- " + "Teachers List" + " ----------");
                    u.getPrintTeacherList();
                    break;
                case 2:
                    System.out.println(" ---------- " + "Classes List" + " ----------");
                    System.out.println("Please select the number of the class from 0 to " + (Constans.COURSE_ID - 1));
                    u.getPrintClassList();
                    int courseOption = scan.nextInt();
                    u.getClassInfo(courseOption);
                    break;
                case 3:
                    System.out.println(" ---------- " + "Add new student" + " ----------");
                    System.out.println("Student Name:");
                    String name = scan.next();
                    System.out.println("Student Age:");
                    int age = scan.nextInt();
                    Person studentN = new Person(name,age);
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
                                u.getPrintList(getStudentsOutOfCouRse(u.getStudentList(), cr.getCourseStudents()));
                                int ids = scan.nextInt();
                                cr.setStudents(getStudentObject(ids, u.getStudentList()));
                            }
                        }

                    }

                    break;

                case 5:
                    System.out.println(" ---------- " + "Student is on course?" + " ----------");
                    System.out.println("Please add the ID of the student that are list (from 0 to " + (Constans.PERSON_ID - 1) + ")");
                    u.getPrintList(u.getStudentList());
                    int foundStudent = scan.nextInt();
                    System.out.println("The Student " + getStudentObject(foundStudent,studentList).getName() + getClassesOfStudent(classList,foundStudent));
                    break;

                default:
                    exit = true;
                    break;
            }

        } while (!exit);


    }




    public static List<Peerson> getStudentsOutOfCouRse(List<Person> list, List<Person> course){
        List<Peerson> ls = new ArrayList<>();
        for (Person i:list){
            boolean found = false;
            for(Person j: course){
                if (j.getId() == i.getId()){
                    found = true;
                }
            }
            if (!found){
                ls.add(i);
            }
        }
        return ls;
    }

    private static Person getStudentObject(int id, List<Person> list){
        for (Person student: list){
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public static String getClassesOfStudent (List<ClassRoom> listCR, int id){
        String printClasses = "";
        for (int i = 0; i < listCR.size(); i++){
            if (listCR.get(i).getStudentFromCourse(id)){
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
