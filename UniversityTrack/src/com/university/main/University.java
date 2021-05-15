package com.university.main;
import com.university.course.Course;
import com.university.individual.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class University {

    static Scanner scan = new Scanner(System.in);
    static int option1,option2;
    static String option3;
    static List<Person> teacherList = new ArrayList<>();
    static List<Course> course = new ArrayList<>();
    static List<Student> student = new ArrayList<>();

    public static void main(String[] args) {

       do{ getMainMenu();
        option1 = scan.nextInt();

        switch(option1)
        {
          case 1:
              do
              {
                  readTeachersValues();
                  System.out.println("**********************************");
                  System.out.println("*     THIS ARE OUR PROFESSORS!   *");
                  System.out.println("**********************************");
                  for (Person person : teacherList) {
                      System.out.println(person);
                  }
                  System.out.println("------------------------------------");
                  System.out.println(" ");
                  System.out.println("Press 0 to go back to the Main menu.");
                  System.out.println(" ");
                  option2= scan.nextInt();
              }
              while(option2!=0);
              break;
            case 2:
                readTeachersValues();
                readStudentsValues();
                readCoursesValues();
                do
                {
                    System.out.println("**********************************");
                    System.out.println("*    THIS ARE OUR CLASSES!       *");
                    System.out.println("**********************************");
                    System.out.println("* Enter The course name: ");
                    System.out.println("* Enter 'exit' to go back to the Main menu.");
                    System.out.println("------------------------------------");
                    for (Course value : course) {
                        System.out.println(value.getCourse());
                    }
                    System.out.println(" ");
                  option3= scan.next();
                    for (int i = 0; i < course.size(); i++) {
                        if (course.get(i).getCourse().equals(option3)) {
                            System.out.println("Teacher: " + course.get(i).getPerson().getName());
                            System.out.println("Student(s): ");
                            for (int j = 0; j < student.size(); j++) {
                                if (student.get(j).getCourse().equals(option3)) {
                                    System.out.println(student.get(j).getName());
                                }
                            }

                        }
                    }
                    System.out.println(" ");
                }
                while(!option3.equals("exit"));
                break;
            case 3:
                System.out.println("*************************************************");
                System.out.println("* CREATE A NEW STUDENT INTO AN EXISTENT COURSE! *");
                System.out.println("*************************************************");
                System.out.println("Enter a new student data: ");
                System.out.println("ID number: ");
                int id= scan.nextInt();
                System.out.println("Name: ");
                String name= scan.next();
                System.out.println("Lastname: ");
                String lastname = scan.next();
                System.out.println("Age: ");
                int age = scan.nextInt();
                System.out.println("Semester: ");
                int semester = scan.nextInt();
                System.out.println("Course to be assign: ");
                String courses = scan.next();
                scan.nextLine();

                student = new ArrayList<>();
                student.add(new Student(id,name,lastname,age,semester,courses));

                System.out.println("A new student has been created!!!" );
                System.out.println("Go to Main menu option 1, to verify the professor");

                break;
            case 4:
                System.out.println("************************");
                System.out.println("* CREATE A NEW COURSE! *");
                System.out.println("************************");
                System.out.println("Enter the data for a new course: ");
                System.out.println("Course name_Id: ");
                String crs= scan.next();
                System.out.println("***************************************************");
                System.out.println("Teacher's name: ");
                String tName= scan.next();
                System.out.println("Teacher's lastname: ");
                String tLastName= scan.next();
                System.out.println("Teacher's Age: ");
                int tAge= scan.nextInt();
                System.out.println("Teacher's type of contract: (f)'Full', (p)'Part'  ");
                String type= scan.next();
                int tExperienceYears = 0;
                int tHours=0;
                if(type.equals("Full")){
                    System.out.println("Teacher's experience years: ");
                    tExperienceYears = scan.nextInt();
                }else{
                    System.out.println("Teacher's hours: ");
                    tHours = scan.nextInt();
                }
               System.out.println("***************************************************");
               System.out.println("Enter a new student data: ");
               System.out.println("ID number: ");
               int sId= scan.nextInt();
               System.out.println("Name: ");
               String sName= scan.next();
               System.out.println("Lastname: ");
               String sLastname = scan.next();
               System.out.println("Age: ");
               int sAge = scan.nextInt();
               System.out.println("Semester: ");
               int sSemester = scan.nextInt();
               scan.nextLine();

               course = new ArrayList<>();
               teacherList = new ArrayList<>();
               student = new ArrayList<>();


                if(tExperienceYears!=0){
                    teacherList.add(new FullTimeTeacher(tName, tLastName, tAge, tExperienceYears));
                }else{
                    teacherList.add(new PartTimeTeacher(tName,tLastName,tAge,tHours));
                }
                student.add(new Student(sId,sName,sLastname,sAge,sSemester,crs));
                course.add(new Course(crs,teacherList.get(teacherList.size()-1),6,student));

                System.out.println("A new course has been created!!!" );
                System.out.println("Go to Main menu option 1, to verify the professor");
                System.out.println("Go to Main menu option 2, to verify the course");
                 break;
            case 5:
                readTeachersValues();
                readStudentsValues();
                readCoursesValues();
                do {
                    System.out.println("****************************");
                    System.out.println("* SEARCH AN STUDENT BY ID! *");
                    System.out.println("****************************");
                    System.out.println("* Enter the student ID: ");
                    System.out.println("* Press 0 to go back to the Main menu.");
                    System.out.println("--------------------------------------");
                    System.out.println(" ");

                int studentId = scan.nextInt();
                for(int i=0;i< course.size();i++){
                    String a = course.get(i).getStudentFromCourseByID(studentId).getCourse();
                    if(a.equals(student.get(i).getCourse())) {
                        System.out.println(a);
                    }
                    }
                }while(option1!=0);
                break;
            }
       }while(option1!=6);

    }

    public static void readTeachersValues() {

        teacherList.add(new FullTimeTeacher("Martha", "Rojas", 63, 5));
        teacherList.add(new FullTimeTeacher("Alberto", "Restrepo", 63, 12));
        teacherList.add(new PartTimeTeacher("katherine", "Sanchez", 34, 21));
        teacherList.add(new PartTimeTeacher("David", "Goez", 46, 32));
    }

    public static void readCoursesValues() {
            course.add(new Course("Mathematics", teacherList.get(0), 1, student));
            course.add(new Course("Logic", teacherList.get(1), 3, student));
            course.add(new Course("Architecture", teacherList.get(2), 4, student));
            course.add(new Course("English", teacherList.get(3), 5, student));

    }

    public static void readStudentsValues() {

        student.add(new Student(1,"Eduardo", "Montoya", 28, 2, "Mathematics"));
        student.add(new Student(2, "Silvana", "Jaramillo", 32, 8, "English"));
        student.add(new Student(3,"Karol", "Suarez", 31, 5, "Mathematics"));
        student.add(new Student(4, "Leo", "Gomez", 25, 4, "Logic"));
        student.add(new Student(5,"Benito", "Lopez", 21, 10, "Architecture"));
        student.add(new Student(6, "Lupita", "Herrera", 19, 3, "English"));

    }

    public static void getMainMenu(){
        System.out.println("**********************************");
        System.out.println("*  WELCOME!! TO JAVA UNIVERSITY! *");
        System.out.println("**********************************");
        System.out.println(" ");
        System.out.println("Please enter an option for more details:");
        System.out.println(" ");
        System.out.println("1. Professors");
        System.out.println("2. Courses");
        System.out.println("3. Create a new Student");
        System.out.println("4. Create a new Course");
        System.out.println("5. Search the Courses of an Student");
        System.out.println("6. Finalized");
        System.out.println(" ");
    }


    public static void getCoursesOfAnStudentMenu(){
        System.out.println("**********************************");
        System.out.println("*      SEARCH YOUR CLASSES!      *");
        System.out.println("**********************************");
        System.out.println("- Enter Student's Id: ");
        System.out.println("- Press 0 to go back to the Main menu.");
        System.out.println(" ");
        System.out.println("------------------------------------");

    }

}



