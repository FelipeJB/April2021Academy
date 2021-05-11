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
        System.out.print("Teacher(s): ");
        int numTeacher = main.scan.nextInt();
        System.out.print("Student(s): ");
        int numStudent = main.scan.nextInt();
        System.out.print("Class(es): ");
        int numClass = main.scan.nextInt();

        //Add teacher to List
        for (int i = 0; i < numTeacher; i++){
            System.out.println("\nNow, Please insert the data of " + (i + 1) + "° teacher: ");
            System.out.print("Identification: ");
            int id = main.scan.nextInt();
            System.out.print("Name: ");
            String name = main.scan.next();
            System.out.print("Base Salary: ");
            double baseSalary = main.scan.nextDouble();
            System.out.print("Experience Year(s): ");
            int experienceYear = main.scan.nextInt();
            System.out.print("Full Time Labor: Yes/No ");
            String timeLabor = main.scan.next();
            double finalSalary;
            if(timeLabor.equals("No")){
                System.out.print("\nSo, indicate how many hours the teacher works per week: ");
                int workingHour = main.scan.nextInt();
                finalSalary = myTeacher.calculatePartTimeLabor(baseSalary, workingHour);
            }else{
            finalSalary = myTeacher.calculateFullTimeLabor(baseSalary, experienceYear);
            }

            Teacher teacher = new Teacher(id, name, finalSalary, experienceYear, timeLabor);
            teacherList.add(teacher);

        }

        //Add student to List
        for (int i = 0; i < numStudent; i++){
            System.out.println("\nNow, Please insert the data of " + (i + 1) + "° student: ");
            System.out.print("Identification: ");
            int id = main.scan.nextInt();
            System.out.print("Name: ");
            String name = main.scan.next();
            System.out.print("Age: ");
            int age = main.scan.nextInt();

            Student student = new Student(id, name, age);
            studentList.add(student);

        }

        //Add class to List
        for (int i = 0; i < numClass; i++){
            System.out.println("\nNow, Please insert the data of " + (i + 1) + "° class: ");
            System.out.print("Identification: ");
            int id = main.scan.nextInt();
            System.out.print("Name: ");
            String nameClass = main.scan.next();

            System.out.print("\nPlease, Select teacher by ID to add him/her to this class: ");
            int selectTeacher = main.scan.nextInt();
            for (Teacher teacher : teacherList) {
                if (selectTeacher == teacher.getId()) {
                    myTeacher = teacher;
                }
            }

            System.out.print("Indicate the number of the students for " + nameClass + " class: ");
            int numOfStudents = main.scan.nextInt();
            int studentCounter = 0;
            ArrayList myStudentsList = new ArrayList();
            while(studentCounter < numOfStudents) {
                System.out.print("Select the " + (studentCounter + 1) + "° student by ID to add him/her to this class: ");
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
        showMenu();
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
                        System.out.println((teacher.getId()) + " " + (teacher.getName()) + " " + (teacher.getBaseSalary()) + " " + (teacher.getExperienceYear()) + " " + (teacher.getTimeLabor()));

                    }
                }else if(main.option == 2) {

                    int classCounter = 1;
                    for (CourseRoom courseRoom : classList) {
                        System.out.println("(" + classCounter + "). "  + (courseRoom.getIdClass()) + " " + (courseRoom.getName()));
                        classCounter++;
                    }
                    System.out.print("What class do you want to see? :");
                    main.option = main.scan.nextInt();
                    while(main.option > classCounter){
                        System.out.println(message);
                        main.option = main.scan.nextInt();
                    }

                    System.out.println("\n" + (classList.get(main.option - 1).getName()) + "Class:");
                    System.out.println("\nTeacher: " + (classList.get(main.option - 1).getTeacher().getName()));
                    for (int i = 0; i < classList.get(main.option - 1).getStudentList().size(); i++) {
                        System.out.println((i + 1) + "° Student:");
                        System.out.println((classList.get(main.option - 1).getStudentList().get(i).getId()) + " " + (classList.get(main.option - 1).getStudentList().get(i).getName()) + " " + (classList.get(main.option - 1).getStudentList().get(i).getAge()));
                    }

                }else if(main.option == 3) {
                        System.out.println("Create a new Student");
                        System.out.println("\nNow, Please insert the data of the new student: ");
                        System.out.print("Identification: ");
                        int id = main.scan.nextInt();
                        System.out.print("Name: ");
                        String name = main.scan.next();
                        System.out.print("Age: ");
                        int age = main.scan.nextInt();

                        Student student = new Student(id, name, age);
                        studentList.add(student);

                        System.out.println("\nNow, What class do you want to add the student to? ");
                        int classCounter = 1;
                        for (CourseRoom courseRoom : classList) {
                            System.out.println("(" + classCounter + "). " + (courseRoom.getName()));
                            classCounter++;
                        }

                        main.option = main.scan.nextInt();
                        classList.get(main.option - 1).getStudentList().add(studentList.get(studentList.size()-1));

                }else if(main.option == 4) {
                    //Create a new Class
                    System.out.println("\nNow, Please insert the data of the new class: ");
                    System.out.print("Identification: ");
                    int id = main.scan.nextInt();
                    System.out.print("Name: ");
                    String nameClass = main.scan.next();

                    System.out.print("\nPlease, Select teacher by ID to add him/her to this class: ");
                    int selectTeacher = main.scan.nextInt();
                    for (Teacher teacher : teacherList) {
                        if (selectTeacher == teacher.getId()) {
                            myTeacher = teacher;
                        }
                    }

                    System.out.print("Indicate the number of the students for " + nameClass + " class: ");
                    int numOfStudents = main.scan.nextInt();
                    int studentCounter = 0;
                    ArrayList myStudentsList = new ArrayList();
                    while(studentCounter < numOfStudents) {
                        System.out.print("Select the " + (studentCounter + 1) + "° student by ID to add him/her to this class: ");
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

                }else{
                    //List All Classes
                    System.out.println("Below, It is the Student list so far: ");
                    for (Student student: studentList) {
                        System.out.println(student.getId() + " " + student.getName() + " " + student.getAge());
                    }
                    System.out.print("Enter the Student ID that you are looking for: ");
                    int searchStudent = main.scan.nextInt();

                    System.out.print("Below, It is the Class List so far: ");
                    for (CourseRoom searchByCourse : classList ) {
                        for(int i = 0; i < searchByCourse.getStudentList().size(); i++) {
                            if (searchStudent == searchByCourse.getStudentList().get(i).getId()) {
                                System.out.println(searchByCourse.getName());
                            }
                        }
                    }

                }
                showMenu();

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
    private static void showMenu() {
        System.out.println("""
                        What do you want to do next? (Please, Make a choice)
                        (1). Print all the Professors.
                        (2). Print all the Classes.
                        (3). Create a new Student.
                        (4). Create a new Class.
                        (5). List all the classes.
                        (6). Exit.""");
    }

}
