package Test;

import Data.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        University myUniversity = new University();
        initializeStudents(myUniversity);
        initializeTeachers(myUniversity);
        initializeCourses(myUniversity);


        System.out.println("Bienvenidos a su " + myUniversity.getUniversityName());
        boolean exit = false;


        do{
            System.out.println("Ingrese el número de la opcion que quiere realizar");
            System.out.println("1. Imprimir los profesores con sus respectivos datos");
            System.out.println("2. Imprimir las clases");
            System.out.println("3. Crear un nuevo estudiante y agregarlo a una clase");
            System.out.println("4. Crear un nuevo curso, con toda su información");
            System.out.println("5. Listar todas las clases donde esta un estudiante (Por Id) ");
            System.out.println("6. Salir");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println("****************PROFESORES**************");
                    myUniversity.displayTeachers();
                    System.out.println("****************************************");
                    break;
                case 2:
                    System.out.println("Esta es la lista de Cursos. Para conocer el detalle escriba el curso");
                    myUniversity.displayCourses();
                    int optionCourse = scan.nextInt();
                    boolean finish = false;
                    while (optionCourse <= myUniversity.getCourse().size() && !finish) {
                      switch (optionCourse) {
                        case 1:
                          myUniversity.getCourse().get(0).getInfoCourse();
                          finish = true;
                          break;

                        }
                    }
                    break;

                case 3:
                    System.out.println("Estas en la opcion tres");
                    break;

                case 4:
                    System.out.println("Estas en la opcion cuatro");
                    break;

                case 5:
                    System.out.println("Estas en la opcion cinco");
                    break;

                default:
                    exit = true;
                    break;
            }
        } while (exit == false);
    }


    public static void initializeTeachers(University university){
        TeacherFullTime firstTeacherFull = new TeacherFullTime("Marina", 2000000, 3);
        TeacherFullTime secondTeacherFull = new TeacherFullTime("Carlos", 3000000, 5);
        TeacherPartialTime firstTeacherPartial = new TeacherPartialTime("Camilo", 500000, 5);
        TeacherPartialTime secondTeacherPartial = new TeacherPartialTime("Catalina", 700000, 6);

        university.addTeacher(firstTeacherFull);
        university.addTeacher(secondTeacherFull);
        university.addTeacher(firstTeacherPartial);
        university.addTeacher(secondTeacherPartial);
    }

    public static void initializeStudents(University university){
        Student one = new Student(1, "Santiago", 1, "Psicologia", 20);
        Student two = new Student(2, "Maria Jose", 2, "Ingenieria de Sistemas", 25);
        Student three = new Student(3, "Camilo", 5, "Medicina", 32);
        Student four = new Student(4, "Miranda", 8, "Derecho", 19);
        Student five = new Student(5, "Malak", 4, "Veterinaria", 22);
        Student six = new Student(6, "Jacob", 1, "Ingenieria de Sistemas", 24);
        Student seven = new Student(7, "Matias", 7, "Odontologia", 23);

        university.addStudent(one);
        university.addStudent(two);
        university.addStudent(three);
        university.addStudent(four);
        university.addStudent(five);
        university.addStudent(six);
        university.addStudent(seven);
    }

    public static void initializeCourses(University university){
       Course math = new Course("Matematicas", 200, university.getTeacher().get(0), new ArrayList<>(Arrays.asList(university.getStudentU().get(0), university.getStudentU().get(1))));
       Course biology = new Course("Biologia", 201, university.getTeacher().get(1), new ArrayList<>(Arrays.asList(university.getStudentU().get(2), university.getStudentU().get(3))));
       Course spanish = new Course("Español", 202, university.getTeacher().get(2), new ArrayList<>(Arrays.asList(university.getStudentU().get(4), university.getStudentU().get(5))));
       Course english = new Course("Ingles", 203, university.getTeacher().get(3), new ArrayList<>(Arrays.asList(university.getStudentU().get(6))));

        university.addCourse(math);
        university.addCourse(biology);
        university.addCourse(spanish);
        university.addCourse(english);
    }
}


