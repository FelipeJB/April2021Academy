package test;

import data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runner {

    static Scanner scanner = new Scanner(System.in);
    static List<Student> students = new ArrayList<>();
    static List<Course> courses = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();


    public static void main(String[] args) {

        University university = new University();
        initializeStudents(university);
        initializeTeachers(university);
        initializeCourse(university);


         boolean exitValue = true;


         while(exitValue) {
             System.out.println("Ingrese una opcion del menu mostrado a continuacion");
             System.out.println("1. Imprimir todos los profesores con su respectivos datos");
             System.out.println("2. Imprimir las clases disponibles");
             System.out.println("3. Crear un estudiante y añadirlo a un curso");
             System.out.println("4. Agregar la informacion de un nuevo curso");
             System.out.println("5. Buscar una clase basado en el id de un estudiante");
             System.out.println("6. Salir");
             int option = scanner.nextInt();

             switch (option) {
                 case 1:
                     printTeachers(university);
                     break;
                 case 2:
                     printCoursesData(university);
                     break;
                 case 3:
                     createStudent(university);
                     break;
                 case 4:
                     //create a new class and add a teacher student etc
                     break;
                 case 5:
                     //search student by student id
                     break;
                 case 6:
                     exitValue = false;
                     break;
             }

         }
    }

    public static void initializeTeachers(University university) {
        FulltimeTeacher teacher1 = new FulltimeTeacher("Romi", 30, 600000, 5);
        FulltimeTeacher teacher2 = new FulltimeTeacher("Pipe", 30, 850000, 10);
        ParttimeTeacher teacher3 = new ParttimeTeacher("Carol", 27, 300000, 30);
        ParttimeTeacher teacher4 = new ParttimeTeacher("Mariana", 28, 250000, 10);

        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        university.setTeachers(teachers);
    }

    public static void initializeStudents(University university) {
        Student student = new Student("Sebas", 22, 01);
        Student student1 = new Student("Javi", 22, 02);
        Student student2 = new Student("Dani", 22, 03);
        Student student3 = new Student("Laura", 50, 04);
        Student student4 = new Student("Ximena", 15, 05);
        Student student5 = new Student("Mateo", 18, 06);


        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        university.setStudents(students);
    }

    public static int initializeCourse(University university) {


        Course courseMath = new Course("Matematicas", 101, university.getStudents(), university.getTeachers().get(0));
        Course courseDevelopment = new Course("Programacion I", 101, university.getStudents(), university.getTeachers().get(1));
        Course courseDB = new Course("Bases de Datos", 101, university.getStudents(), university.getTeachers().get(2));
        Course courseWebDev = new Course("Web development", 101, university.getStudents(), university.getTeachers().get(0));

        courses.add(courseMath);
        courses.add(courseDevelopment);
        courses.add(courseDB);
        courses.add(courseWebDev);

        university.setCourses(courses);

        return courses.size();
    }

    public static void printTeachers(University university) {
        System.out.println("PROFESORES");
        System.out.println("  ");
        for (int i = 0; i < university.getTeachers().size(); i++) {
            System.out.println("Nombre del profesor " + i + ": " + university.getTeachers().get(i).getName());
            System.out.println("Edad del profesor " + i + ": " + university.getTeachers().get(i).getAge() + " años");
            System.out.println("Salario del profesor " + i + ": $" + university.getTeachers().get(i).calculateSalary() );
            System.out.println("------------------------");
            System.out.println("  ");
        }
    }

    public static void createStudent (University university) {
        System.out.println("Ingrese nombre");
        String name = scanner.next();
        System.out.println("Ingrese edad");
        int age = scanner.nextInt();
        System.out.println("Ingrese id");
        int id = scanner.nextInt();

        List<Student> newStudentList = new ArrayList<>(students);

        Student studentCreated = new Student(name, age, id);

        newStudentList.add(studentCreated);
        Random random = new Random();

        int randomNumber = random.nextInt(4);

        university.getCourses().get(randomNumber).setStudents(newStudentList);
        System.out.println("El estudiante fue agregado al curso " + courses.get(randomNumber).getCourseName());

    }

    public static void printCoursesData(University university) {

        System.out.println("Ingrese la opcion del curso que desea conocer");

        for(int i = 0; i<university.getCourses().size(); i++) {
            System.out.println(i + ". para imprimir: " + university.getCourses().get(i).getCourseName());
        }

        int optionSelected = scanner.nextInt();

        for (int i = 0; i < university.getCourses().size(); i++) {
            if (optionSelected == i) {
                System.out.println("Nombre del curso: "+courses.get(i).getCourseName());
                System.out.println("Nombre del docente: "+courses.get(i).getTeacher().getName());
                for (int j = 0; j < university.getCourses().get(i).getStudents().size(); j++) {
                    System.out.println("Nombre del estudiante "+ j + " " + courses.get(i).getStudents().get(j).getName());
                    System.out.println("    ");
                }
            }
        }

    }
}
