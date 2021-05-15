package Test;


import Data.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {



    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        University u = new University();
        initializeUniversity(u);

        boolean exit = false;


        do{
            printMainMenu();
            Scanner scan = new Scanner(System.in);

            int op = scan.nextInt();

            switch (op){
                case 1:
                    //a. Print all the professors with its data
                    System.out.println("LISTA DE PROFESORES");
                    System.out.println("*******************");

                    for (int i = 0; i< u.getTeacher().size(); i++){
                        System.out.println("Nombre: " + u.getTeacher().get(i).getName() + "\nSalario base($): " +
                                u.getTeacher().get(i).getBaseSalary() + "\nAños exp.: " +
                                u.getTeacher().get(i).getExperienceYears() + "\nHoras activas por semana: " +
                                u.getTeacher().get(i).getActiveHoursPerWeek() + "\nSalario ($): " +
                                u.getTeacher().get(i).calculateSalary() + "\n");
                    }

                    break;

                case 2:
                    //b. Print all the courses
                    System.out.println("LISTA DE CURSOS");
                    System.out.println("*******************");

                    for (int i = 0; i < u.getCourse().size(); i++){
                        System.out.println(i+1 + ". " + u.getCourse().get(i).getName());
                    }

                    //and a submenu to select a course in order to print the courses data including its teacher and students
                    System.out.println("\n***Seleccione el curso que desea consultar***");
                    int c = scan.nextInt();
                    System.out.println("Nombre del curso: " + u.getCourse().get(c-1).getName() + "\nSalón: " +
                            u.getCourse().get(c-1).getClassroom() + "\nNombre del Profesor: " +
                            u.getCourse().get(c-1).getCourseTeacher().getName() + "\n");

                    System.out.println("Estos son los estudiantes matriculados en este curso: \n");
                    for (int i = 0; i < u.getCourse().get(c-1).getCourseStudents().size(); i++){
                        System.out.println(u.getCourse().get(c-1).getCourseStudents().get(i).getName());
                    }

                    break;
                case 3:
                    //c. Create a new student and add it to an existing course
                    System.out.println("Mediante esta opción podrá matricular un estudiante a un curso\n");
                    System.out.println("Favor ingrese el nombre del estudiante a matricular");

                    String studentName = reader.readLine();

                    System.out.println("Favor ingrese la edad del estudiante");
                    int studentAge = scan.nextInt();

                    Student s = new Student(studentName, studentAge);

                    u.getStudent().add(s);

                    //enroll the student to the course
                    System.out.println("Estas son las clases disponibles para matricular a " + s.getName() + "\n" +
                            "Seleccione la clase a la que desea matricularlo\n");

                    for (int i = 0; i < u.getCourse().size(); i++){
                        System.out.println(i+1 + ". " + u.getCourse().get(i).getName());
                    }

                    int e = scan.nextInt();

                    u.getCourse().get(e-1).getCourseStudents().add(s);
                    System.out.println(s.getName() + " ha quedado matriculado en la clase: " +
                            u.getCourse().get(e-1).getName());
                    System.out.println("Dirijase a la opción 2 del menú principal para consultar su registro exitoso");

                    break;

                case 4:
                    //d. Create a new course and add a teacher, students, and its relevant data
                    System.out.println("Mediante esta opción podrá agregar un nuevo curso\n");
                    System.out.println("Favor ingrese el nombre del curso que desea agregar");
                    String courseName = reader.readLine();

                    System.out.println("Favor ingrese el número del salón de clases");
                    int classRoom = scan.nextInt();

                    //add a teacher
                    System.out.println("Favor seleccione el profesor para la clase\n");
                    for (int i = 0; i < u.getTeacher().size(); i++){
                        System.out.println(i+1 + ". " + u.getTeacher().get(i).getName());
                    }

                    int t = scan.nextInt();

                    Course co = new Course(courseName, classRoom, u.getTeacher().get(t-1));

                    //add students to the course:
                    System.out.println("\nFavor ingrese la cantidad de estudiantes que desea matricular en la clase:");
                    int st = scan.nextInt();
                    System.out.println("\n");

                    System.out.println("Favor seleccione los estudiantes que desea matricular en la clase:\n");
                    for(int i = 0; i < u.getStudent().size(); i++){
                        System.out.println(i+1 + ". " + u.getStudent().get(i).getName());
                    }

                    for (int j = 0; j < st; j++){
                        System.out.println("Favor seleccione el estudiante que desea matricular en la clase:");
                        int sId = scan.nextInt();
                        System.out.println("\n");
                        co.getCourseStudents().add(u.getStudent().get(sId - 1));
                    }

                    //Course added to the list:
                    u.getCourse().add(co);

                    System.out.println("El curso " + (u.getCourse().get(u.getCourse().size()-1).getName()) + " ha quedado inscrito exitosamente\n");
                    System.out.println("Dirijase a la opción 2 del menú principal para consultar su registro exitoso");

                    break;

                case 5:
                    //e. List all the courses in which a given student is included (hint: search by id)
                    System.out.println("\nMediante esta opción podrá consultar los cursos en los que se encuentra matriculado un estudiante");
                    System.out.println("Seleccione el estudiante que desea consultar");
                    for(int i = 0; i < u.getStudent().size(); i++){
                        System.out.println(i+1 + ". " + u.getStudent().get(i).getName());
                    }

                    int studId = scan.nextInt();

                    Course studentById = new Course();
                    studentById.getStudentFromClassById(studId);

                    for (int i = 0; i < u.getCourse().size(); i++){
                        System.out.println(i+1 + ". " + u.getCourse().get(i).getName());
                    }


                    break;

                //f. Exit
                default:
                    exit = true;
                    System.out.println("Sesión finalizada");

                    break;

            }



        }while (exit == false);


    }

    //implemented method to print the main menu
    public static void printMainMenu(){

        System.out.println("******************************************************");
        System.out.println("***************Universidad Harvey Yepes***************");
        System.out.println("******************************************************");
        System.out.println("\n Menú Principal");
        System.out.println("1. Mostrar todos los profesores");
        System.out.println("2. Mostrar todos los cursos");
        System.out.println("3. Matricular un estudiante nuevo a un curso");
        System.out.println("4. Crear un curso");
        System.out.println("5. Buscar un curso por estudiante");
        System.out.println("6. Salir");

    }

    //1.Initialize minimum 2 different teachers of each type (full time, part time).
    public static void initializeUniversity(University university){
        FullTimeTeacher fullTimeTeacherJose = new FullTimeTeacher("Jose", 2000000, 4,45);
        FullTimeTeacher fullTimeTeacherCristina = new FullTimeTeacher("Cristina", 1500000, 2,40);
        PartTimeTeacher partTimeTeacherPedro = new PartTimeTeacher("Pedro", 3000000, 20,15);
        PartTimeTeacher partTimeTeacherMaria = new PartTimeTeacher("Maria", 4500000, 15,15);

        university.getTeacher().add(fullTimeTeacherJose);
        university.getTeacher().add(fullTimeTeacherCristina);
        university.getTeacher().add(partTimeTeacherPedro);
        university.getTeacher().add(partTimeTeacherMaria);



        //2.Initialize minimum 6 different students
        Student studentMiguel = new Student("Miguel", 20);
        Student studentAna = new Student("Ana", 17);
        Student studentOscar = new Student("Oscar", 24);
        Student studentJuan = new Student("Juan", 21);
        Student studentDora = new Student("Dora", 30);
        Student studentNatalia = new Student("Natalia", 24);
        Student studentRodrigo = new Student("Rodrigo", 28);
        Student studentBrayan = new Student("Brayan", 18);
        Student studentLeidy = new Student("Leidy", 19);
        Student studentJosefina = new Student("Josefina", 24);


        university.getStudent().add(studentMiguel);
        university.getStudent().add(studentAna);
        university.getStudent().add(studentOscar);
        university.getStudent().add(studentJuan);
        university.getStudent().add(studentDora);
        university.getStudent().add(studentNatalia);
        university.getStudent().add(studentRodrigo);
        university.getStudent().add(studentBrayan);
        university.getStudent().add(studentLeidy);
        university.getStudent().add(studentJosefina);

        //Initialize minimum 4 different courses including its teacher, students, and other relevant data
        Course mathCourse = new Course("Math",101,university.getTeacher().get(0));
        Course spanishCourse = new Course("Spanish",102,university.getTeacher().get(2));
        Course LawsCourse = new Course("Laws",103,university.getTeacher().get(2));
        Course PhysicsCourse = new Course("Physics",104,university.getTeacher().get(2));
        Course MarketingCourse = new Course("Marketing",105,university.getTeacher().get(2));
        Course JavaCourse = new Course("Java",106,university.getTeacher().get(2));


        //list of students of each course:
        //Course 1: Math
        mathCourse.getCourseStudents().add(university.getStudent().get(0));
        mathCourse.getCourseStudents().add(university.getStudent().get(2));
        mathCourse.getCourseStudents().add(university.getStudent().get(4));

        //Course 2: Spanish
        spanishCourse.getCourseStudents().add(university.getStudent().get(1));
        spanishCourse.getCourseStudents().add(university.getStudent().get(3));
        spanishCourse.getCourseStudents().add(university.getStudent().get(5));

        //Course 3: Laws
        LawsCourse.getCourseStudents().add(university.getStudent().get(6));
        LawsCourse.getCourseStudents().add(university.getStudent().get(8));
        LawsCourse.getCourseStudents().add(university.getStudent().get(9));

        //Course 4: Physics
        PhysicsCourse.getCourseStudents().add(university.getStudent().get(0));
        PhysicsCourse.getCourseStudents().add(university.getStudent().get(4));
        PhysicsCourse.getCourseStudents().add(university.getStudent().get(7));

        //Course 5: Marketing
        MarketingCourse.getCourseStudents().add(university.getStudent().get(0));
        MarketingCourse.getCourseStudents().add(university.getStudent().get(3));
        MarketingCourse.getCourseStudents().add(university.getStudent().get(8));
        MarketingCourse.getCourseStudents().add(university.getStudent().get(9));

        //Course 6: Java
        JavaCourse.getCourseStudents().add(university.getStudent().get(0));
        JavaCourse.getCourseStudents().add(university.getStudent().get(2));
        JavaCourse.getCourseStudents().add(university.getStudent().get(4));
        JavaCourse.getCourseStudents().add(university.getStudent().get(5));
        JavaCourse.getCourseStudents().add(university.getStudent().get(7));

        //Course List:
        university.getCourse().add(mathCourse);
        university.getCourse().add(spanishCourse);
        university.getCourse().add(LawsCourse);
        university.getCourse().add(PhysicsCourse);
        university.getCourse().add(MarketingCourse);
        university.getCourse().add(JavaCourse);

    }







}
