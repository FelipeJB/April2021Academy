package Test;

import Data.University;
import Data.Course;
import Data.Student;
import Data.Teacher;
import Data.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Runner {

    public static void main(String[] args) {

        ArrayList studentList = new ArrayList<Student>();
        ArrayList teacherList = new ArrayList<Teacher>();
        ArrayList courseList = new ArrayList<Course>();
        ArrayList persons = new ArrayList<Person>();

        Scanner scan = new Scanner(System.in);


        //1.	Initialize minimum 2 different teachers of each type (full time, part time).

            Teacher t1 = new Teacher(1, 40, "Mariana Velez", 3, 6);
            Teacher t2 = new Teacher(2, 36, "Javier Ramirez", 2, 8);
            Teacher t3 = new Teacher(3, 42, "Camila Suarez", 7, 40);
            Teacher t4 = new Teacher(4, 50, "Ismael Osorio", 8, 40);

            teacherList.add(t1);
            teacherList.add(t2);
            teacherList.add(t3);
            teacherList.add(t4);

        //2.	Initialize minimum 6 different students

            Student student1 = new Student(1, 20, "Mario Pombo");
            Student student2 = new Student(2, 25, "Eduardo Rodriguez");
            Student student3 = new Student(3, 21, "Luisa Calle");
            Student student4 = new Student(4, 22, "Mariana Pajón");
            Student student5 = new Student(5, 21, "Martin Rosales");
            Student student6 = new Student(6, 19, "Ana Perez");

            studentList.add(student1);
            studentList.add(student2);
            studentList.add(student3);
            studentList.add(student4);
            studentList.add(student5);
            studentList.add(student6);


        //3.	Initialize minimum 4 different classes including its teacher , students and other relevant data

        Course c1 = new Course("Mathematics","A01",6,t1);
        c1.addStudent(student1);
        c1.addStudent(student2);
        c1.addStudent(student4);
        courseList.add(c1);
        Course c2 = new Course("Business","A02",7,t2);
        c2.addStudent(student2);
        c2.addStudent(student5);
        c2.addStudent(student6);
        courseList.add(c2);
        Course c3 = new Course("Arts","B01",8,t3);
        c3.addStudent(student1);
        c3.addStudent(student3);
        c3.addStudent(student5);
        c3.addStudent(student6);
        courseList.add(c3);
        Course c4 = new Course("Humanities","B02",8,t4);
        c4.addStudent(student2);
        c4.addStudent(student3);
        c4.addStudent(student4);
        courseList.add(c4);


        boolean exit = false;
        do {
            System.out.println(" Please select one option:");
            System.out.println("1 - Print all the professors with its data ");
            System.out.println("2 - Print all the classes");
            System.out.println("3 - Print the class data including its teacher and students");
            System.out.println("4 - Create a new student and add it to an existing class");
            System.out.println("5 - Create a new class and add a teacher, students and its relevant data");
            System.out.println("6 - List all the classes in which a given student is included");
            System.out.println("7 - exit");
            int opt = scan.nextInt();

            switch (opt) {
                case 1:
                    System.out.println("List of teachers");
                    for (int i = 0; i < teacherList.size(); i++) {
                        System.out.println(i + "- " + teacherList.get(i) + "\n");
                    }
                    break;


                case 2:

                    System.out.println("List of Courses");
                    for(int i = 0; i < courseList.size(); i++) {
                        System.out.println(courseList.get(i));
                    }
                    break;


                case 3:
                    break;

                case 4:
                    System.out.println("Please enter the name of the Student: ");
                    String name2 = scan.next();
                    System.out.println("Please enter the age of the Student: ");
                    int age2 = scan.nextBigInteger().intValueExact();
                    System.out.println("Please enter the id of the Student");
                    int id2 = scan.nextInt();
                    System.out.println("Please select one of the following courses");
                    for (Object o : courseList) {
                        System.out.println(o);
                    }
                    int option = scan.nextInt();

                    if (option == 1) {
                        Student newStudent = new Student(id2, age2, name2);
                        studentList.add(newStudent);
                        c1.addStudent(newStudent);
                    } else if (option == 2) {
                        Student newStudent = new Student(id2, age2, name2);
                        studentList.add(newStudent);
                        c2.addStudent(newStudent);
                    } else if (option == 3) {
                        Student newStudent = new Student(id2, age2, name2);
                        studentList.add(newStudent);
                        c3.addStudent(newStudent);
                    }else if (option == 4) {
                        Student newStudent = new Student(id2, age2, name2);
                        studentList.add(newStudent);
                        c4.addStudent(newStudent);
                    } else {
                    }
                    break;

                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    exit = true;
                    break;
                default:
                    System.out.println("Error, this option doesn't exist");
                    break;
            }

        } while (exit == false);

    }


}
