package co.com.javacourse.university.test;

import co.com.javacourse.university.model.*;
import co.com.javacourse.university.utils.Constans;
import sun.rmi.server.InactiveGroupException;


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
            System.out.println("1. Print the teacher list");
            System.out.println("2. Print all the classes " );
            System.out.println("3. Create a new student and add it to an existing class");
            System.out.println("4. create a new class and add a teacher and some students");
            System.out.println("5. List the classes with a student ID");
            System.out.println("6. Extra - Add a new teacher");
            System.out.println("7. Exit");
            Scanner scan = new Scanner(System.in);
            int option = 0;
            try {
                option = scan.nextInt();
            }catch (Exception e){
                System.out.println("Please use a valid value");
            }

            try {
                switch (option) {
                    case 1: //Teacher List
                        System.out.println(" ---------- " + "Teachers Information" + " ----------");
                        System.out.println(" Basic salary for FTT (Full Time Teacher) = " + Constans.FULL_TIME_BASIC_SALARY);
                        System.out.println(" Basic salary for PTT (Part Time Teacher) = " + Constans.PART_TIME_BASIC_SALARY);
                        System.out.println(" ---------- " + "Teachers List" + " ----------");
                        u.getPrintTeacherList();
                        u.getEndStatement();
                        break;

                    case 2:
                        System.out.println(" ---------- " + "Classes List" + " ----------");
                        System.out.println("Please select the number of the class from 0 to " + (Constans.COURSE_ID - 1));
                        u.getPrintClassList();
                        int courseOption = scan.nextInt();
                        System.out.println(u.getClassInfo(courseOption));
                        u.getEndStatement();
                        break;

                    case 3:
                        System.out.println(" ---------- " + "Add new student" + " ----------");
                        System.out.println("Student Name:");
                        String name = scan.next();
                        int age = 0;

                        System.out.println("Student Age:");
                        try {
                            age = Integer.parseInt(scan.next());
                        } catch (NumberFormatException e) {
                            throw new Exception("Wrong value, Invalid age");
                        }
                        System.out.println("Please select the ID of the class from 0 to " + (Constans.COURSE_ID - 1) + " to add the new student");
                        u.getPrintClassList();
                        courseOption = scan.nextInt();
                        Student studentNew = u.setStudent(name, age);
                        if (u.getClassExist(courseOption)) {
                            u.setAddStudentInCourse(studentNew, u.getClassList().get(courseOption));
                        } else {
                            System.out.println("Incorrect number Class ID, the student was created but was not assigned to any class");
                        }
                        u.getEndStatement();
                        break;

                    case 4:
                        System.out.println(" ---------- " + "Add new class" + " ----------");
                        System.out.println("Class name:");
                        String className = scan.next();
                        System.out.println("Weekly hours of the course:");
                        int weekHour = scan.nextInt();
                        System.out.println("Room number to attend the course:");
                        String room = scan.next();
                        System.out.println("Please select the teacher Number for the new class from 1 to " + u.getTeacherList().size());
                        u.getPrintTeacherList();
                        int teacherOption = scan.nextInt() - 1;
                        if (teacherOption > u.getTeacherList().size() || teacherOption < 0) {
                            System.out.println("Incorrect teacher ID, the course wasn't created.");
                        } else {
                            Teacher newTeacher = u.getTeacherList().get(teacherOption);
                            ClassRoom cr = new ClassRoom(className, weekHour, room, newTeacher);
                            u.setAddCourse(cr);
                            System.out.println("Course added!!, Please select the id of the student you will add");
                            System.out.println("How many students will you add (lower than " + u.getStudentList().size() + ")");
                            int numberStudents = scan.nextInt();
                            if (numberStudents >= u.getStudentList().size() || numberStudents == 0) {
                                System.out.println("incorrect number.");
                            } else {
                                for (int i = 1; i <= numberStudents; i++) {
                                    System.out.println("Enter the ID for the student number " + i + " from the following list of students");
                                    System.out.println(u.getPrintStudentOutOfCourse(cr.getCourseStudents()));
                                    int ids = scan.nextInt();
                                    try {
                                        cr.setStudents(u.getStudent(ids));
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }

                                }
                                u.getEndStatement();
                            }
                        }


                        break;

                    case 5:
                        System.out.println(" ---------- " + "Student is on course?" + " ----------");
                        System.out.println("Please add the ID of the student that are list");
                        u.getPrintStudentList();
                        int studentId = scan.nextInt();
                        try {
                            Student studentFound = u.getStudent(studentId);
                            System.out.println("The Student " + studentFound.getName() + u.getClassesOfStudent(studentId));
                            u.getEndStatement();
                        } catch (Exception e) {
                            e.getMessage();
                        }
                        u.getEndStatement();
                        break;

                    case 6:
                        System.out.println(" ---------- " + "New Teacher" + " ----------");
                        System.out.println("Teacher Name:");
                        String teacherName = scan.next();
                        System.out.println("Type of contract: \n1: FTT (Full Time Teacher)\n2: PTT (Part Time Teacher)");
                        int teacherOpt = scan.nextInt();
                            if (teacherOpt == 1){
                                System.out.println("Experience years:");
                                int teacherExp = scan.nextInt();
                                u.setTeacherFTT(teacherName,teacherExp);
                                System.out.println("Teacher " + teacherName + " is now part of the University.");
                            } else if (teacherOpt == 2) {
                                System.out.println("Active Hours at week:");
                                int teacherHours = scan.nextInt();
                                u.setTeacherPTT(teacherName,teacherHours);
                                System.out.println("Teacher " + teacherName + " is now part of the University.");
                                u.getEndStatement();
                            }else {
                                System.out.println("Please select a valid option, the teacher was not created.");
                            }

                        break;

                    default:
                        exit = true;
                        break;
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        } while (!exit);
    }
}
