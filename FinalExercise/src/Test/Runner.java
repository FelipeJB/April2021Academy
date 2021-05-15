package Test;

import Data.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Teacher> teachers = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        boolean exit = false;
        Scanner scan = new Scanner(System.in);

        initializeTeachers(teachers);
        initializeStudents(students);
        initializeCourses(courses, teachers, students);

        do {
            mainMenu();
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    printAllTeachers(teachers);
                    break;
                case 2:
                    printAllCourses(courses);
                    break;
                case 3:
                    createNewStudent(courses, students);
                    break;
                case 4:
                    createNewCourse(teachers, courses, students);
                    break;
                case 5:
                    listCoursesStudentIncluded(students, courses);
                    break;
                default:
                    exit = true;
                    break;

            }
        } while (!exit);

    }

    public static void initializeTeachers(ArrayList<Teacher> teachers) {

        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher("Juan Garcia", 2001, 35, 3000000, 10);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher("Pedro Martinez", 2002, 27, 2500000, 5);

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher("Carlos Villa", 2003, 36, 2000000, 20);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher("Javier Perez", 2004, 30, 1500000, 15);

        teachers.add(fullTimeTeacher1);
        teachers.add(fullTimeTeacher2);
        teachers.add(partTimeTeacher1);
        teachers.add(partTimeTeacher2);

    }


    public static void initializeStudents(ArrayList<Student> students) {

        Student student1 = new Student("Andres Escobar", 1001, 25);
        Student student2 = new Student("Alexis Perez", 1002, 30);
        Student student3 = new Student("Benito Guerrero", 1003, 22);
        Student student4 = new Student("Karla Jaramillo", 1004, 21);
        Student student5 = new Student("Sandra Giraldo", 1005, 27);
        Student student6 = new Student("Tatiana Alvarez", 1006, 21);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
    }

    public static void initializeCourses(ArrayList<Course> courses, ArrayList<Teacher> teachers, ArrayList<Student> students) {

        Course course1 = new Course("Programacion I", 401, teachers.get(0));
        course1.addStudent(students.get(0));
        course1.addStudent(students.get(1));
        course1.addStudent(students.get(2));

        Course course2 = new Course("Programacion II", 402, teachers.get(1));
        course2.addStudent(students.get(3));
        course2.addStudent(students.get(4));
        course2.addStudent(students.get(5));

        Course course3 = new Course("Fisica I", 501, teachers.get(2));
        course3.addStudent(students.get(1));
        course3.addStudent(students.get(2));
        course3.addStudent(students.get(3));

        Course course4 = new Course("Calculo I", 502, teachers.get(3));
        course4.addStudent(students.get(0));
        course4.addStudent(students.get(4));
        course4.addStudent(students.get(5));

        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

    }

    public static void printAllTeachers(ArrayList<Teacher> teachers) {
        System.out.println("*****************Teachers List********************");
        for (Teacher t : teachers) {
            System.out.println(t.getName() + " - " + t.getID() + " - " + t.getAge() + " - " + t.calculateSalary());
        }
    }


    public static void printAllCourses(ArrayList<Course> courses) {

        Scanner scan = new Scanner(System.in);
        boolean exit = false;

        System.out.println("*****************Courses List******************\n");
        for (Course c : courses) {
            System.out.println(courses.indexOf(c) + 1 + " - " + "Course name: " + c.getName() + " - " + "Classroom: " + c.getClassroom());
        }

        do {
            subMenu();
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Course name: " + courses.get(0).getName() + " - " + "Classroom: " + courses.get(0).getClassroom()
                            + " - " + "Teacher name: " + courses.get(0).getTeacher().getName());
                    System.out.println("The students are:");
                    courses.get(0).printDataNameStudent();
                    break;
                case 2:
                    System.out.println("Course name: " + courses.get(1).getName() + " - " + "Classroom: " + courses.get(1).getClassroom()
                            + " - " + "Teacher name: " + courses.get(1).getTeacher().getName());
                    System.out.println("The students are:");
                    courses.get(1).printDataNameStudent();
                    break;
                case 3:
                    System.out.println("Course name: " + courses.get(2).getName() + " - " + "Classroom: " + courses.get(2).getClassroom()
                            + " - " + "Teacher name: " + courses.get(2).getTeacher().getName());
                    System.out.println("The students are:");
                    courses.get(2).printDataNameStudent();
                    break;
                case 4:
                    System.out.println("Course name: " + courses.get(3).getName() + " - " + "Classroom: " + courses.get(3).getClassroom()
                            + " - " + "Teacher name: " + courses.get(3).getTeacher().getName());
                    System.out.println("The students are:");
                    courses.get(3).printDataNameStudent();
                    break;
                default:
                    exit = true;
                    break;

            }
        } while (!exit);

    }

    public static void subMenu() {
        System.out.println("\n ****************Courses Submenu*************** \n");
        System.out.println("Select the option 1 (Programacion I) to display the course detail");
        System.out.println("Select the option 2 (Programacion II) to display the course detail");
        System.out.println("Select the option 3 (Fisica I) to display the course detail");
        System.out.println("Select the option 4 (Calculo I) to display the course detail");
    }

    public static void createNewStudent(ArrayList<Course> coursesList, ArrayList<Student> studentsList) {
        Scanner scan = new Scanner(System.in);
        Student student;
        String response;

        do {
            System.out.println("Input the student name: ");
            String studentName = scan.nextLine();
            System.out.println("Input the student ID: ");
            int ID = Integer.parseInt(scan.nextLine());
            System.out.println("Input the student age: ");
            int studentAge = Integer.parseInt(scan.nextLine());
            student = new Student(studentName, ID, studentAge);
            studentsList.add(student);

            System.out.println("Select a course to add the student\n");
            for (Course c : coursesList) {
                System.out.println(coursesList.indexOf(c) + 1 + " - " + "Course name: " + c.getName());
            }
            int option = Integer.parseInt(scan.nextLine());

            switch (option) {
                case 1:
                    coursesList.get(0).getCourseStudents().add(student);
                    System.out.println("successfully added student");
                    break;
                case 2:
                    coursesList.get(1).getCourseStudents().add(student);
                    System.out.println("successfully added student");
                    break;
                case 3:
                    coursesList.get(2).getCourseStudents().add(student);
                    System.out.println("successfully added student");
                    break;
                case 4:
                    coursesList.get(3).getCourseStudents().add(student);
                    System.out.println("successfully added student");
                    break;
                default:
                    System.out.println("You have input an wrong option");
                    break;
            }
            System.out.println("Do you want to add another student? (yes/no)");
            response = scan.nextLine();
        } while (response.equalsIgnoreCase("yes"));
    }

    public static void createNewCourse(ArrayList<Teacher> teacherList, ArrayList<Course> coursesList, ArrayList<Student> studentList) {

        Course courseNew;
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the course name: ");
        String courseName = scan.nextLine();
        System.out.println("Input the classroom: ");
        int classroom = scan.nextInt();

        System.out.println("Select the teacher to add");

            for (Teacher t : teacherList) {
                System.out.println(teacherList.indexOf(t) + 1 + " - " + "Teacher name: " + t.getName() + " - " + "ID: " + t.getID());
            }
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    courseNew = new Course(courseName, classroom, teacherList.get(0));
                    System.out.println("successfully assigned teacher \n");
                    courseNew.addStudent(studentList.get(0));
                    courseNew.addStudent(studentList.get(1));
                    coursesList.add(courseNew);
                    break;
                case 2:
                    courseNew = new Course(courseName, classroom, teacherList.get(1));
                    System.out.println("successfully assigned teacher \n");
                    courseNew.addStudent(studentList.get(2));
                    courseNew.addStudent(studentList.get(3));
                    coursesList.add(courseNew);
                    break;
                case 3:
                    courseNew = new Course(courseName, classroom, teacherList.get(2));
                    System.out.println("successfully assigned teacher \n");
                    courseNew.addStudent(studentList.get(4));
                    courseNew.addStudent(studentList.get(5));
                    coursesList.add(courseNew);
                    break;
                case 4:
                    courseNew = new Course(courseName, classroom, teacherList.get(3));
                    System.out.println("successfully assigned teacher \n");
                    courseNew.addStudent(studentList.get(0));
                    courseNew.addStudent(studentList.get(1));
                    coursesList.add(courseNew);
                    break;
                default:
                    System.out.println("You have input an wrong option");
                    break;
            }

    }

    public static void listCoursesStudentIncluded(ArrayList<Student> studentList, ArrayList<Course> coursesList){

        Scanner scan = new Scanner(System.in);

        for (Student s: studentList) {
            System.out.println("Student name: " + s.getName() + " - " + "ID: " + s.getID());
        }
        System.out.println("Input the student ID to display the courses in which it is included");

        int ID = scan.nextInt();
        for (Course c: coursesList) {
            if (c.getStudentFromCourse(ID))
                System.out.println("Course name: " + c.getName() + " - " + "Classroom: " + c.getClassroom());
        }
    }

    public static void mainMenu() {
        System.out.println("******************************Main Menu******************************** \n");
        System.out.println("1. Print all the professors with its data");
        System.out.println("2. Print all the classes");
        System.out.println("3. Create a new student and add it to an existing class");
        System.out.println("4. Create a new class and add a teacher, students and its relevant data");
        System.out.println("5. List all the classes in which a given student is included");
        System.out.println("6. Exit");
    }
}

