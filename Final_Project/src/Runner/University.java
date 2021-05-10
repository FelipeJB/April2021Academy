package Runner;

import ClassRoom.CourseRoom;
import Person.Student;
import Person.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class University {

    private final Scanner scan = new Scanner(System.in);
    private int option;
    private static String message = "It is not a valid option, please try again!";

    public static void main(String[] args){

        University main = new University();
        ArrayList<Teacher> teacherList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<CourseRoom> classList = new ArrayList<>();

        Teacher myTeacher = new Teacher();
        //Student myStudent = new Student();

        System.out.println("Please, enter the number of... ");
        System.out.print("Teachers: ");
        int numTeacher = main.scan.nextInt();
        System.out.print("Students: ");
        int numStudent = main.scan.nextInt();
        System.out.print("Classes: ");
        int numClass = main.scan.nextInt();

        //Add teacher to List
        for (int i = 0; i < numTeacher; i++){
            System.out.println("\nNow, Please insert the data of " + (i + 1) + "° teacher: ");
            System.out.print("Identification: ");
            int id = main.scan.nextInt();
            System.out.print("Name: ");
            String name = main.scan.next();
            System.out.print("Base Salary: ");
            double salary = main.scan.nextDouble();
            System.out.print("Experience Year(s): ");
            int experienceYear = main.scan.nextInt();
            System.out.print("Full Time Labor: Yes/No ");
            String timeLabor = main.scan.next();


            Teacher teacher = new Teacher(id, name, salary, experienceYear, timeLabor);
            teacherList.add(teacher);

        }

        //Add student to List
        for (int i = 0; i < numStudent; i++){
            System.out.println("Please insert the data of " + (i + 1) + "° student: ");
            int id = main.scan.nextInt();
            System.out.println("Please insert the name of " + (i + 1) + "° student: ");
            String name = main.scan.next();
            System.out.println("Please insert the age of " + (i + 1) + "° student: ");
            int age = main.scan.nextInt();

            Student student = new Student(id, name, age);
            studentList.add(student);

        }

        //Add class to List
        for (int i = 0; i < numClass; i++){
            System.out.println("Please insert the data of " + (i + 1) + "° class: ");
            int id = main.scan.nextInt();
            String nameClass = main.scan.next();

            System.out.print("Select teacher by ID ");
            int selectTeacher = main.scan.nextInt();
            for (Teacher teacher : teacherList) {
                if (selectTeacher == teacher.getId()) {
                    myTeacher = teacher;
                }
            }

            System.out.print("Indicate the number of the students for " + nameClass + " class");
            int numOfStudents = main.scan.nextInt();
            int studentCounter = 0;
            ArrayList myStudentsList = new ArrayList();
            while(studentCounter < numOfStudents) {
                System.out.print("Select the " + (studentCounter + 1) + "° student by ID ");
                int selectStudent = main.scan.nextInt();
                for (Student student : studentList) {
                    if (selectStudent == student.getId()) {
                        myStudentsList.add(student);
                    }
                }
                studentCounter++;
            }

            CourseRoom courseRoom = new CourseRoom(id, nameClass, myTeacher, myStudentsList);
            classList.add(courseRoom);

        }

        System.out.println("\n******************DATA HAS BEEN CORRECTLY ENTERED******************\n");
        System.out.println("What action do you want to execute? (Please, Make a choice)\n" + "(1). Print all the Professors.\n (2). Print all the Classes.\n (3). Create a new Student.\n (4). Create a new Class.\n (5). List all the classes.\n (6). Exit.");
        main.option = main.scan.nextInt();

        while(main.option > 6){
            System.out.println(message);
            main.option = main.scan.nextInt();
        }

        if(main.option == 1 || main.option == 2 || main.option == 3 || main.option == 4 || main.option == 5) {
            do {
                if(main.option == 1) {

                    //Print the teacher(s) added
                    for (Teacher teacher : teacherList) {
                        System.out.println((teacher.getId()) + " " + (teacher.getName()) + " " + (teacher.getSalary()) + " " + (teacher.getExperienceYear()) + " " + (teacher.getTimeLabor()));

                    }
                }else if(main.option == 2) {

                    //Print the student(s) added
                    for (Student student : studentList) {
                        System.out.println((student.getId()) + " " + (student.getName()) + " " + (student.getAge()));

                    }

                    //Print the class(es) added  *****NEED TO FIX******
                    for (int i = 0; i < classList.size(); i++) {
                        System.out.println((classList.get(i).getIdClass()) + " " + (classList.get(i).getName()) + " " + (classList.get(i).getTeacher().getName()) + " " + (classList.get(i).getStudentList().get(i).getName()));

                    }
                }else if(main.option == 3) {
                    System.out.println("Create a new Student");
                }else if(main.option == 4) {
                    System.out.println("Create a new Class");
                }else{
                    System.out.println("List All Classes");
                }
                System.out.println("What do you want to do next? (Please, Make a choice)\n" + "(1). Print all the Professors.\n (2). Print all the Classes.\n (3). Create a new Student.\n (4). Create a new Class.\n (5). List all the classes.\n (6). Exit.");
                main.option = main.scan.nextInt();
                while(main.option > 6){
                    System.out.println(message);
                    main.option = main.scan.nextInt();
                }
            }while(main.option != 6);
        }else{
            System.exit(0);
        }

    }

}
