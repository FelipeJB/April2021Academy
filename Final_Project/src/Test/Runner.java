package Test;

import Data.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        University myUniversity = new University();
        initializeStudents(myUniversity);
        initializeTeachers(myUniversity);
        initializeCourses(myUniversity);


        System.out.println("*****************" + "Bienvenidos a su " + myUniversity.getUniversityName() + "****************");
        boolean exit = false;


        do{
            System.out.println("Ingrese el número de la opcion que quiere realizar");
            System.out.println("1. Imprimir los profesores con sus respectivos datos");
            System.out.println("2. Imprimir las clases");
            System.out.println("3. Imprimir los estudiantes");
            System.out.println("4. Crear un nuevo estudiante y agregarlo a una clase existente");
            System.out.println("5. Crear un nuevo curso, y agregarle el profesor y los estudiantes");
            System.out.println("6. Listar todas las clases donde esta un estudiante (Por Id) ");
            System.out.println("7. Salir");
            System.out.println("***********************************************************************");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            System.out.println("***********************************************************************");

            switch (option){
                case 1:
                    System.out.println("****************************PROFESORES**************************");
                    myUniversity.displayTeachers();
                    System.out.println("****************************************************************");
                    break;
                case 2:
                    String answer;
                        System.out.println("**************************************CURSOS***********************************");
                        System.out.println("Esta es la lista de Cursos. Para conocer el detalle escriba el número del curso");
                        myUniversity.displayCourses();
                        System.out.println("*******************************************************************************");
                        int optionCourse = scan.nextInt();
                        if(optionCourse-1 < myUniversity.getCourse().size()) {
                            myUniversity.getCourse().get(optionCourse - 1).getInfoCourse();
                        } else{
                            System.out.println("Lo siento ese curso no existe");
                        }
                    break;

                case 3:
                    System.out.println("****************************ESTUDIANTES**************************");
                    myUniversity.displayStudents();
                    System.out.println("*****************************************************************");
                    break;

                case 4:
                    boolean exitAddStudent = false;
                    while (!exitAddStudent && scan.nextLine()!= "") {
                        System.out.println("Por favor digite el Nombre de el nuevo estudiante ");
                        String name = scan.nextLine();
                        scan = new Scanner(System.in);
                        System.out.println("Por favor digite el semestre ");
                        int semester = Integer.parseInt(scan.nextLine());
                        scan = new Scanner(System.in);
                        System.out.println("Por favor digite la carrera en la que se va a inscribir el estudiante ");
                        String career = scan.nextLine();
                        scan = new Scanner(System.in);
                        System.out.println("Por favor digite la edad ");
                        int age = Integer.parseInt(scan.nextLine());
                        scan = new Scanner(System.in);
                        System.out.println("Digite el nombre del curso, donde quiere inscribir al Estudiante ");
                        myUniversity.displayCourses();
                        String courseName = scan.nextLine();
                        scan = new Scanner(System.in);
                        Student studentTemporal = new Student(name, semester, career, age);
                        myUniversity.addStudent(studentTemporal);
                        myUniversity.addStudenttoCourse(studentTemporal, courseName);
                        exitAddStudent = true;
                    }
                    break;

                case 5:
                    boolean exitAddCourse = false;
                    while (!exitAddCourse && scan.nextLine()!= "") {
                        System.out.println("Por favor digite el Nombre de el nuevo curso ");
                        String nameCourse = scan.nextLine();
                        scan = new Scanner(System.in);
                        System.out.println("Por favor digite el número del curso ");
                        int roomCourse = Integer.parseInt(scan.nextLine());
                        scan = new Scanner(System.in);
                        System.out.println("Digite el nombre del Profesor, que dictara la clase "  +
                                "Marina/Carlos/Camilo/Catalina ");
                        String teacherName = scan.nextLine();
                        scan = new Scanner(System.in);
                        int i;
                        Teacher teacherCourse = null;
                        for(i = 0; i < myUniversity.getTeacher().size(); i++) {
                            if (teacherName.equalsIgnoreCase(myUniversity.getTeacher().get(i).getName())) {
                                teacherCourse = myUniversity.getTeacher().get(i);
                            }
                        }
                        System.out.println("Digite el ID del Estudiante, que desea agregar a la clase "  +
                                "1/2/3/4/5/6/7 ");
                        int studentId = Integer.parseInt(scan.nextLine());
                        scan = new Scanner(System.in);
                        List<Student> studentCourse = null;
                        for(i = 0; i < myUniversity.getStudentU().size(); i++) {
                            if (studentId == myUniversity.getStudentU().get(i).getId()) {
                                studentCourse = new ArrayList<>(Arrays.asList(myUniversity.getStudentU().get(i)));
                            }
                        }
                        Course newCourse = new Course(nameCourse, roomCourse, teacherCourse, studentCourse);
                        myUniversity.addCourse(newCourse);
                        exitAddCourse = true;
                    }
                    break;

                case 6:
                    boolean exitIncludeStudent = false;
                    while (!exitIncludeStudent && scan.nextLine()!= "") {
                        System.out.println("Digite el ID del Estudiante, para conocer los cursos en los que esta incluido ");
                        myUniversity.displayStudents();
                        int studentId = Integer.parseInt(scan.nextLine());
                        scan = new Scanner(System.in);
                        /*String totalCourses = "";
                        for (int i = 0; i < myUniversity.getCourse().size(); i ++) {
                           System.out.println(myUniversity.getCourse().get(i).getStudentFromCourseById(studentId));
                            //System.out.println(myUniversity.getCourse().get(i).getById(studentId));
                        }*/
                        System.out.println(myUniversity.getCoursesforStudent(studentId));
                        exitIncludeStudent = true;
                    }
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
        Student one = new Student("Santiago", 1, "Psicologia", 20);
        Student two = new Student("Maria Jose", 2, "Ingenieria de Sistemas", 25);
        Student three = new Student("Camilo", 5, "Medicina", 32);
        Student four = new Student( "Miranda", 8, "Derecho", 19);
        Student five = new Student("Malak", 4, "Veterinaria", 22);
        Student six = new Student("Jacob", 1, "Ingenieria de Sistemas", 24);
        Student seven = new Student("Matias", 7, "Odontologia", 23);

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
       Course spanish = new Course("Español", 202, university.getTeacher().get(2), new ArrayList<>(Arrays.asList(university.getStudentU().get(2), university.getStudentU().get(5))));
       Course english = new Course("Ingles", 203, university.getTeacher().get(3), new ArrayList<>(Arrays.asList(university.getStudentU().get(2))));

        university.addCourse(math);
        university.addCourse(biology);
        university.addCourse(spanish);
        university.addCourse(english);
    }
}


