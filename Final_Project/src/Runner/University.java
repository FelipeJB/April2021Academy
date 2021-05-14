package Runner;

import ClassRoom.CourseRoom;
import Person.Student;
import Person.Teacher;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/***
 * @autor   juandaniel.castano@globant.com - ing.daniel.castano@gmail.com
 * @version 2.0
 * @since   1.0
 */
public class University {

    private static final University main = new University();;
    //private final Scanner scan = new Scanner(System.in);
    private int option;
    private static final String message = "It is not the expected value, please try again!";

    public static void main(String[] args){
        //Define the list for each object
        ArrayList<Teacher> teacherList = new ArrayList<>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<CourseRoom> classList = new ArrayList<>();
        int counterStudentList;
        int counterClassList;

        //Instantiate the Teacher class
        Teacher myTeacher = new Teacher();

        try {
            //Indicate the number of Teacher(s), Student(s) and Class(es)
            System.out.println("Please, enter the number of... ");
            System.out.print("Teacher(s): ");
            int numTeacher = validateAndAssignInteger();
            while(numTeacher <= 0){
                System.out.println(message);
                numTeacher = validateAndAssignInteger();
            }
            System.out.print("Student(s): ");
            int numStudent = validateAndAssignInteger();
            while(numStudent <= 0){
                System.out.println(message);
                numStudent = validateAndAssignInteger();
            }
            System.out.print("Class(es): ");
            int numClass = validateAndAssignInteger();
            while(numClass <= 0){
                System.out.println(message);
                numClass = validateAndAssignInteger();
            }

            //Add new teacher to a Teacher List
            for (int counterTeacherList = 0; counterTeacherList < numTeacher; counterTeacherList++){
                createNewTeacher(myTeacher, teacherList, counterTeacherList);
            }

            //Add new student to a Student List
            for (counterStudentList = 0; counterStudentList < numStudent; counterStudentList++) {
                createNewStudent(studentList, counterStudentList);
            }

            //Add new class to a Class List
            for (counterClassList = 0; counterClassList < numClass; counterClassList++) {
                createNewClass(classList, teacherList, studentList, myTeacher, counterClassList);
            }
            //Print message when data has been entered as it is expected
            printEnterDataSucceed();
            //Display the main menu
            showMenu();
            main.option = validateAndAssignInteger();
            //Validate the data entered
            while (main.option > 7) {
                System.out.println(message);
                main.option = validateAndAssignInteger();
            }

            if (main.option == 1 || main.option == 2 || main.option == 3 || main.option == 4 || main.option == 5 || main.option == 6) {
                do {
                    //First option to Print all professors
                    if (main.option == 1) {
                        //Print the teacher(s) that have been added
                        teacherList.forEach((n) -> { System.out.println((n.getId()) + "  " + (n.getName()) + "  " + (n.getBaseSalary()) + "  " + (n.getExperienceYear()) + "  " + (n.getTimeLabor())); });

                        //Second option to Print all class(es) that have been added
                    } else if (main.option == 2) {
                        int classCounter = 1;

                        for (CourseRoom courseRoom : classList) {
                            System.out.println("(" + classCounter + "). " + (courseRoom.getIdClass()) + " " + (courseRoom.getName()));
                            classCounter++;
                        }
                        System.out.print("What class do you want to see? :");
                        main.option = validateAndAssignInteger();
                        while (main.option > classCounter) {
                            System.out.println(message);
                            main.option = validateAndAssignInteger();
                        }
                        System.out.println("\n" + (classList.get(main.option - 1).getName()) + " Class:");
                        System.out.println("\nTeacher: " + (classList.get(main.option - 1).getTeacher().getName()));
                        for (int i = 0; i < classList.get(main.option - 1).getStudentList().size(); i++) {
                            System.out.println((i + 1) + "° Student:");
                            System.out.println("\t" + (classList.get(main.option - 1).getStudentList().get(i).getId()) + " " + (classList.get(main.option - 1).getStudentList().get(i).getName()) + " " + (classList.get(main.option - 1).getStudentList().get(i).getAge()));
                        }

                        //Third option to Create a new student
                    } else if (main.option == 3) {
                        System.out.println("\n--- NEW STUDENT ---");
                        createNewStudent(studentList, counterStudentList);

                        System.out.println("\nNow, What class do you want to add the student to? ");
                        int classCounter = 1;
                        for (CourseRoom courseRoom : classList) {
                            System.out.println("(" + classCounter + "). " + (courseRoom.getName()));
                            classCounter++;
                        }

                        main.option = validateAndAssignInteger();
                        classList.get(main.option - 1).getStudentList().add(studentList.get(studentList.size() - 1));

                        //Fourth option to Create a new class
                    } else if (main.option == 4) {
                        //Create a new Class
                        System.out.println("\n--- NEW CLASS ---");
                        createNewClass(classList, teacherList, studentList, myTeacher, counterClassList);
                        counterClassList++;

                        //Fifth option to List all class by a given student
                    } else if (main.option == 5){
                        //List All Classes
                        System.out.println("Below, It is the Student list so far: ");
                        studentList.forEach((n) -> { System.out.println(n.getId() + " " + n.getName() + " " + n.getAge() + " " + n.getScore()); });

                        System.out.print("Enter the Student ID that you are looking for: ");
                        int searchStudent = validateAndAssignInteger();

                        System.out.println("Below, It is the Class List so far: ");
                        for (CourseRoom searchByCourse : classList) {
                            for (int i = 0; i < searchByCourse.getStudentList().size(); i++) {
                                if (searchStudent == searchByCourse.getStudentList().get(i).getId()) {
                                    System.out.println("\n" + searchByCourse.getName());
                                }
                            }
                        }

                    }else{
                        //Print the current Student List
                        System.out.println("Below, It is the Student list so far: ");
                        studentList.forEach((n) -> { System.out.println(n.getId() + " " + n.getName() + " " + n.getAge() + " " + n.getScore()); });
                        String keepScoring = "Yes";
                        do {

                            System.out.print("Enter the Student ID that you want to score: ");
                            int selectStudent = validateAndAssignInteger();

                            for (Student student : studentList) {
                                if (selectStudent == student.getId()) {
                                    System.out.print("Please, score to the student " + student.getName() + ": ");
                                    float scoreStudent = validateAndAssignFloat();
                                    student.setScore(scoreStudent);
                                }
                            }
                            System.out.print("Do you want keep scoring: (Yes/No) ");
                            keepScoring = validateAndAssignString();
                            while (!(keepScoring.equals("Yes") || keepScoring.equals("No"))){
                                System.out.print(message + ": ");
                                keepScoring = validateAndAssignString();
                            }
                        }while(keepScoring.equals("Yes"));
                    }
                    showMenu();
                    //Validate the data entered
                    main.option = validateAndAssignInteger();
                    while (main.option > 7) {
                        System.out.println(message);
                        main.option = validateAndAssignInteger();
                    }
                } while (main.option != 7);
                //Sixth option to exit execution off
            } else {
                System.exit(0);
            }
        }catch (Exception e){
            System.out.println("Something went wrong");
        }

    }

    /***
     * Print the main menu
     */
    private static void showMenu() {
        System.out.println("""
                        \nWhat do you want to do next? (Please, Make a choice)
                        (1). Print all the Professors.
                        (2). Print all the Classes.
                        (3). Create a new Student.
                        (4). Create a new Class.
                        (5). List all the classes by typing a student's id.
                        (6). To score the students.
                        (7). Exit.""");
    }

    /***
     *
     * @param myTeacher
     * @param teacherList
     * @param counterTeacherList
     */
    private static void createNewTeacher(Teacher myTeacher, ArrayList<Teacher> teacherList, int counterTeacherList){
        System.out.println("\nNow, Please insert the data of " + (counterTeacherList + 1) + "° teacher: ");
        System.out.print("Identification: ");
        int id = validateAndAssignInteger();
        System.out.print("Name: ");
        String name = validateAndAssignString();
        System.out.print("Base Salary: ");
        double baseSalary = validateAndAssignDouble();
        System.out.print("Experience Year(s): ");
        int experienceYear = validateAndAssignInteger();
        System.out.print("Full Time Labor: Yes/No ");
        String timeLabor = validateAndAssignString();
        while (!(timeLabor.equals("Yes") || timeLabor.equals("No"))){
            System.out.print(message + ": ");
            timeLabor = validateAndAssignString();
        }
        double finalSalary;
        if (timeLabor.equals("No")) {
            System.out.print("\nSo, indicate how many hours the teacher works per week: ");
            int workingHour = validateAndAssignInteger();
            finalSalary = myTeacher.calculatePartTimeLabor(baseSalary, workingHour);
            finalSalary = Math.round(finalSalary * 100.0) / 100.0;
        } else {
            finalSalary = myTeacher.calculateFullTimeLabor(baseSalary, experienceYear);
        }
        Teacher teacher = new Teacher(id, name, finalSalary, experienceYear, timeLabor);
        teacherList.add(teacher);

    }

    /***
     *
     * @param studentList
     * @param counterStudentList
     */
    private static void createNewStudent(ArrayList<Student> studentList, int counterStudentList){
        System.out.println("\nNow, Please insert the data of " + (counterStudentList + 1) + "° student: ");
        System.out.print("Identification: ");
        boolean dataGranted = false;
        int id = validateAndAssignInteger();
        System.out.print("Name: ");
        String name = validateAndAssignString();
        System.out.print("Age: ");
        int age = validateAndAssignInteger();
        float score = 0;
        Student student = new Student(id, name, age, score);
        studentList.add(student);

    }

    /***
     *
     * @param classList
     * @param teacherList
     * @param studentList
     * @param myTeacher
     * @param counterClassList
     */
    private static void createNewClass(ArrayList<CourseRoom> classList, ArrayList<Teacher> teacherList, ArrayList<Student> studentList, Teacher myTeacher, int counterClassList) {
        System.out.println("\nNow, Please insert the data of " + (counterClassList + 1) + "° class: ");
        System.out.print("Identification: ");
        int id = validateAndAssignInteger();
        System.out.print("Name: ");
        String nameClass = validateAndAssignString();
        //Search for a specific teacher by typing his/her entered ID
        System.out.print("\nPlease, Select teacher by ID to add him/her to this class: ");
        int selectTeacher = validateAndAssignInteger();
        for (Teacher teacher : teacherList) {
            if (selectTeacher == teacher.getId()) {
                myTeacher = teacher;
            }
        }
        //Indicate the number of Students per class
        System.out.print("Indicate the number of the students for " + nameClass + " class: ");
        int numOfStudents = validateAndAssignInteger();
        int studentCounter = 0;
        //Create an Student Array List, fill it out with indicated students
        ArrayList<Student> myStudentsList = new ArrayList<>();
        while (studentCounter < numOfStudents) {
            System.out.print("Select the " + (studentCounter + 1) + "° student by ID to add him/her to this class: ");
            int selectStudent = validateAndAssignInteger();
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

    /***
     * Print succeed message
     */
    private static void printEnterDataSucceed(){
        System.out.println("\n*******************************************************************");
        System.out.println("*                 DATA HAS BEEN CORRECTLY ENTERED                 *");
        System.out.println("*******************************************************************\n");
    }

    /***
     *
     * @return assignValue
     */
    private static int validateAndAssignInteger(){
        int assignValue = 0;
        boolean Run = true;
        while (Run)
        {
            Scanner input = new Scanner (System.in);
            try
            {
                assignValue = input.nextInt();
                Run = false;
            }
            catch(InputMismatchException ime)
            {
                System.out.println(message);
                System.out.print("Integer format is expected: ");
            }
        }
        return assignValue;
    }

    /***
     *
     * @return assignValue
     */
    private static String validateAndAssignString(){
        String assignValue = "";
        boolean Run = true;
        while (Run)
        {
            Scanner input = new Scanner (System.in);
            try
            {
                assignValue = input.next();
                Run = false;
            }
            catch(InputMismatchException ime)
            {
                System.out.println(message);
                System.out.print("String format is expected: ");
            }
        }
        return assignValue;
    }

    /***
     *
     * @return assignValue
     */
    private static double validateAndAssignDouble(){
        double assignValue = 0;
        boolean Run = true;
        while (Run)
        {
            Scanner input = new Scanner (System.in);
            try
            {
                assignValue = input.nextDouble();
                Run = false;
            }
            catch(InputMismatchException ime)
            {
                System.out.println(message);
                System.out.print("String format is expected: ");
            }
        }
        return assignValue;
    }

    /***
     *
     * @return assignValue
     */
    private static float validateAndAssignFloat(){
        float assignValue = 0;
        boolean Run = true;
        while (Run)
        {
            Scanner input = new Scanner (System.in);
            try
            {
                assignValue = input.nextFloat();
                Run = false;
            }
            catch(InputMismatchException ime)
            {
                System.out.println(message);
                System.out.print("Float format is expected: ");
            }
        }
        return assignValue;
    }

}
