package Test;


import Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {



    public static void main(String[] args) {
        //List<Teacher> teachers = new ArrayList<>();

        //llamada inicialización de la lista de Teachers
        ArrayList<Teacher> teachers = new ArrayList<>();
        initializeTeachers(teachers);

        //llamada inicialización de la lista de Students
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> mathStudents = new ArrayList<>();
        ArrayList<Student> spanishStudents = new ArrayList<>();
        ArrayList<Student> lawsStudents = new ArrayList<>();
        ArrayList<Student> physicsStudents = new ArrayList<>();
        ArrayList<Student> marketingStudents = new ArrayList<>();
        ArrayList<Student> javaStudents = new ArrayList<>();
        initializeStudents(students, mathStudents, spanishStudents, lawsStudents, physicsStudents, marketingStudents, javaStudents);


        //llamada inicialización de la lista de Courses
        ArrayList<Course> courses = new ArrayList<>();

        //Initialize minimum 4 different courses including its teacher, students, and other relevant data
        Course courseMath = new Course("Math",101,mathStudents);
        Course courseSpanish = new Course("Spanish",102,spanishStudents);
        Course courseLaws = new Course("Laws",103,lawsStudents);
        Course coursePhysics = new Course("Physics",104,physicsStudents);
        Course courseMarketing = new Course("Marketing",105,marketingStudents);
        Course courseJava = new Course("Java",106,javaStudents);
        courses.add(courseMath);
        courses.add(courseSpanish);
        courses.add(courseLaws);
        courses.add(coursePhysics);
        courses.add(courseMarketing);
        courses.add(courseJava);





        boolean exit = false;



        do{
            printMainMenu();
            Scanner scan = new Scanner(System.in);
            int op = scan.nextInt();

            switch (op){
                case 1:
                    System.out.println("LISTA DE PROFESORES");
                    System.out.println("*******************");

                    for (Teacher teacher : teachers){
                        System.out.println("Nombre: " + teacher.getName() + "\nSalario base($): " +
                                teacher.getBaseSalary() + "\nAños exp.: " +
                                teacher.getExperienceYears() + "\nHoras activas por semana: " +
                                teacher.getActiveHoursPerWeek() + "\nSalario calculado($): " +
                                teacher.calculateSalary() + "\n");
                    }
                    break;

                case 2:
                    System.out.println("LISTA DE CURSOS");
                    System.out.println("*******************");

                    for (Course course: courses) {
                        System.out.println(course.getName());
                    }





                    break;
                case 3:

                    break;

                case 4:

                    break;
                case 5:

                    break;

                case 6:

                    break;

            }



        }while (exit == false);






    }


    //1.Initialize minimum 2 different teachers of each type (full time, part time).
    public static void initializeTeachers(ArrayList<Teacher> teachers){
        FullTimeTeacher fullTimeTeacherJose = new FullTimeTeacher("Jose", 2000000, 4,45);
        FullTimeTeacher fullTimeTeacherCristina = new FullTimeTeacher("Cristina", 1500000, 2,40);
        PartTimeTeacher partTimeTeacherPedro = new PartTimeTeacher("Pedro", 3000000, 20,15);
        PartTimeTeacher partTimeTeacherMaria = new PartTimeTeacher("Maria", 4500000, 15,15);

        teachers.add(fullTimeTeacherJose);
        teachers.add(fullTimeTeacherCristina);
        teachers.add(partTimeTeacherPedro);
        teachers.add(partTimeTeacherMaria);
    }

    //2.Initialize minimum 6 different students

    public static void initializeStudents(ArrayList<Student> students, ArrayList<Student> mathStudents,
                                          ArrayList<Student> spanishStudents, ArrayList<Student> lawsStudents,
                                          ArrayList<Student> physicsStudents, ArrayList<Student> marketingStudents,
                                          ArrayList<Student> javaStudents){
        Student studentMiguel = new Student("Miguel", 1001, 20);
        Student studentAna = new Student("Ana", 1002, 17);
        Student studentOscar = new Student("Oscar", 1003, 24);
        Student studentJuan = new Student("Juan", 1004, 21);
        Student studentDora = new Student("Dora", 1005, 30);
        Student studentNatalia = new Student("Natalia", 1006, 24);
        Student studentRodrigo = new Student("Rodrigo", 1007, 28);
        Student studentBrayan = new Student("Brayan", 1008, 18);
        Student studentLeidy = new Student("Leidy", 1009, 19);
        Student studentJosefina = new Student("Josefina", 1010, 24);
        //Enroll student 1
        students.add(studentMiguel);
        mathStudents.add(studentMiguel);
        physicsStudents.add(studentMiguel);

        //Enroll student 2
        students.add(studentAna);
        spanishStudents.add(studentAna);
        lawsStudents.add(studentAna);

        //Enroll student 3
        students.add(studentOscar);
        spanishStudents.add(studentOscar);

        //Enroll student 4
        students.add(studentJuan);
        spanishStudents.add(studentJuan);
        lawsStudents.add(studentJuan);
        marketingStudents.add(studentJuan);

        //Enroll student 5
        students.add(studentDora);
        spanishStudents.add(studentDora);
        lawsStudents.add(studentDora);

        //Enroll student 6
        students.add(studentNatalia);
        mathStudents.add(studentNatalia);
        spanishStudents.add(studentNatalia);
        lawsStudents.add(studentNatalia);
        physicsStudents.add(studentNatalia);
        marketingStudents.add(studentNatalia);
        javaStudents.add(studentNatalia);
        students.add(studentNatalia);
    }







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





}
