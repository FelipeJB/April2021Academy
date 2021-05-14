package Runner;

import Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        int option=0;
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Adriana Garcia", 22, 1);
        Student student2 = new Student("Cristal Rubio", 17, 2);
        Student student3 = new Student("Jaime Perez", 16, 3);
        Student student4 = new Student("Laura Parra", 20, 4);
        Student student5 = new Student("Mateo Velez", 22, 5);
        Student student6 = new Student("Raul Restrepo", 24, 6);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher("Alejandro Gonzales",33,2021301,200,8,"Full time",35);
        Teacher teacher2 = new Teacher("Vanessa Milan",22,2021203,50,2,"Partial time",40);
        Teacher teacher3 = new Teacher("Jorge Valdez",40,2021807,200,13,"Full time",35);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        List<Subject> subjects = new ArrayList<>();
        Subject subject1 = new Subject("Economy","B12",2021301,5,1);
        Subject subject2 = new Subject("Chemistry","F02",2021807,3,1);
        Subject subject3 = new Subject("Math","C10",2021203,2,4);
        Subject subject4 = new Subject("POO","B08",2021301,2,6);
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);

//----------------------------------------------------------------------------------------------
        while (option <= 5) {
            option= getOption();
            switch (option) {
                case 1:
                    System.out.println("option 1");
                    break;
                case 2:
                    System.out.println("option 2");
                    break;
                case 3:
                    System.out.println("option 3");
                    break;
                case 4:
                    System.out.println("option 4");
                    break;
                case 5:
                    System.out.println("option 5");
                    break;
                case 6:
                    break;
            }
        }
    }


    public static int getOption(){
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1) Print all the professors with its data ");
        System.out.println("2) Print all the classes and a submenu to select a class in order to print the class data including its teacher and students ");
        System.out.println("3) Create a new student ");
        System.out.println("4) Create a new class and add a teacher, students and its relevant data ");
        System.out.println("5) List all the classes in which a given student is included ");
        System.out.println("6) Exit ");

        return scan.nextInt();
    }
}