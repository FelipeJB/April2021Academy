package co.com.javacourse.university.test;

import co.com.javacourse.university.model.*;
import co.com.javacourse.university.utils.Constans;


import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        University u = new University();
        boolean exit = false;

        u.start();

        do{
            System.out.println("\n ----------------------------------------- ");
            System.out.println(" ---------- " + Constans.UNIVERSITY_NAME + " ----------");
            System.out.println(" ----------------------------------------- ");
            System.out.println("1. Print the professors list");
            System.out.println("2. Print all the classes " );
            System.out.println("3. Create a new student and add it to an existing class");
            System.out.println("4. create a new class and add a teacher and some students");
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
                    System.out.println(u.getClassInfo(courseOption));
                    break;

                case 3:
                    System.out.println(" ---------- " + "Add new student" + " ----------");
                    System.out.println("Student Name:");
                    String name = scan.next();
                    System.out.println("Student Age:");
                    int age = scan.nextInt();
                    System.out.println("Please select the ID of the class from 0 to " + (Constans.COURSE_ID - 1) + " to add the new student");
                    u.getPrintClassList();
                    courseOption = scan.nextInt();
                    Student studentNew = u.setStudent(name,age);
                    if (u.getClassExist(courseOption)){
                        u.setAddStudentInCourse(studentNew,u.getClassList().get(courseOption));
                    } else {
                        System.out.println("Incorrect number Class ID, the student was created but was not assigned to any class");
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
                    System.out.println("Please select the teacher Number for the new class from 1 to "+ u.getTeacherList().size());
                    u.getPrintTeacherList();
                    int teacherOption = scan.nextInt() -1;
                    if (teacherOption > u.getTeacherList().size() || teacherOption < 0){
                        System.out.println("Incorrect teacher ID, the course wasn't created.");
                    }else{
                        Teacher newTeacher = u.getTeacherList().get(teacherOption);
                        ClassRoom cr = new ClassRoom(className, weekHour, room, newTeacher);
                        u.setAddCourse(cr);
                        System.out.println("Course added!!, Please select the id of the student you will add");
                        System.out.println("How many students will you add (lower than " + u.getStudentList().size() + ")");
                        int numberStudents = scan.nextInt();
                        if (numberStudents >= u.getStudentList().size() || numberStudents == 0){
                            System.out.println("incorrect number.");
                        }else{
                            for (int i = 1; i <= numberStudents; i ++ ){
                                System.out.println("Enter the ID for the student number " + i + " from the following list of students");
                                System.out.println( u.getPrintStudentOutOfCourse(cr.getCourseStudents()) );
                                int ids = scan.nextInt();
                                cr.setStudents(u.getStudent(ids));
                            }
                        }
                    }

                    break;

                case 5:
                    System.out.println(" ---------- " + "Student is on course?" + " ----------");
                    System.out.println("Please add the ID of the student that are list");
                    u.getPrintStudentList();
                    int studentId = scan.nextInt();
                    Student studentFound = u.getStudent(studentId);
                    System.out.println("The Student " + studentFound.getName() + u.getClassesOfStudent(studentId));
                    //System.out.println("The Student " + getStudentObject(foundStudent,studentList).getName() + u.getClassesOfStudent(classList,foundStudent));
                    break;

                default:
                    exit = true;
                    break;
            }

        } while (!exit);


    }
}
