package Test;

import Data.University;
import Data.Course;
import Data.Student;
import Data.Teacher;
import Data.*;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Runner {

    public static void main(String[] args) {

        ArrayList persons = new ArrayList<Person>();

        University uni = new University();

        Scanner scan = new Scanner(System.in);


        uni.initialiteTeachers();
        uni.initialiteStudents();
        uni.initialiteCourses();


        boolean exit = false;
        do {
            System.out.println(" Please select one option:");
            System.out.println("1 - Print all the professors with its data ");
            System.out.println("2 - Print all the courses and select a specific course");
            System.out.println("3 - Create a new student and add it to an existing class");
            System.out.println("4 - Create a new class and add a teacher, students and its relevant data");
            System.out.println("5 - List all the classes in which a given student is included");
            System.out.println("6 - exit");
            int opt = scan.nextInt();

            switch (opt) {
                case 1:

                System.out.println("--List of teachers--");
                for (int i = 0; i < uni.getTeacherList().size(); i++) {
                    System.out.println(i+1 + "- " + uni.getTeacherList().get(i));
                }
                    System.out.print("\n");

                break;




                case 2:


                    System.out.println("--List of Courses--");
                    for(int i = 0; i < uni.getCourseList().size(); i++) {
                        System.out.println(i+1 + "- " + uni.getCourseList().get(i));
                    }
                    System.out.println("Please select the course you want to see the complete details: from Courses 1 to "+ uni.getCourseList().size());
                    int option = scan.nextInt();
                    if ((option-1)>=uni.getCourseList().size()) {
                        System.out.println("Error, this option doesn't exist");
                    }
                    else {
                        System.out.println(uni.getCourseList().get(option - 1).printCourse());
                    }
                    break;


                case 3:
                    System.out.println("Please enter the name of the Student: ");
                    scan.nextLine();
                    String name2 = scan.nextLine();

                    System.out.println("Please enter the age of the Student: ");
                    int age2 = scan.nextBigInteger().intValueExact();
                    scan.nextLine();

                    System.out.println("The following are the available courses: ");
                    for (int i=0;i<uni.getCourseList().size();i++) {
                    System.out.println(i+1+" "+uni.getCourseList().get(i).getCourseName());
                    }

                    System.out.println("Please select one of the courses");
                    int option2 = scan.nextInt();
                    scan.nextLine();


                    for (int i =0; i<uni.getCourseList().size();i++) {
                        if (option2 == i + 1) {
                            Student newStudent = new Student(age2, name2);
                            uni.getCourseStudentList().add(newStudent);
                            uni.getCourseList().get(option2 - 1).addStudent(newStudent);
                        } else {
                        }
                    }
                        break;

                case 4:

                    System.out.println("Next you must enter all the information of the new course \n");
                    System.out.println("Please enter the name of the course: ");
                    scan.nextLine();
                    String courseName1 = scan.nextLine();

                    System.out.println("Please enter the classroom of the course: ");
                    //scan.nextLine();
                    String classroomCourse1 = scan.nextLine();

                    System.out.println("Please enter the maximun number of students of the course: ");
                    int courseNoOfStudents = scan.nextBigInteger().intValueExact();
                    scan.nextLine();

                    System.out.println("Now please enter the information of the teacher of the course \n");

                    System.out.println("Please enter the age of the Teacher: ");
                    int teacherAge = scan.nextBigInteger().intValueExact();
                    scan.nextLine();

                    System.out.println("Please enter the name of the Teacher: ");
                    String teacherName = scan.nextLine();

                    System.out.println("Please enter the years of experience of the teacher: ");
                    int teacherExperienceYears = scan.nextBigInteger().intValueExact();
                    scan.nextLine();

                    System.out.println("Please enter the active hours per week: ");
                    int teacherActiveHoursWeek = scan.nextBigInteger().intValueExact();
                    scan.nextLine();

                    System.out.println("Now please enter the information of the students \n");

                    System.out.println("How many students do you want to add to the course: ");
                    int numberOfStudents = scan.nextBigInteger().intValueExact();
                    scan.nextLine();


                    Teacher t = uni.createTeacher(teacherAge,teacherName,teacherExperienceYears,teacherActiveHoursWeek);
                    Course ch = uni.createCourse(courseName1,classroomCourse1,courseNoOfStudents,t);

                    uni.addStudentsToACourse(numberOfStudents,ch);


                    break;


                case 5:

                    System.out.println("Please enter the id of the Student");
                    int id4 = scan.nextInt();
                    scan.nextLine();
                    System.out.println("--Courses in which the student is included--");
                    for (int i =0;i<uni.getCourseList().size();i++) {
                        if (uni.getCourseList().get(i).getStudentFromCourse(id4)==true) {
                            System.out.println("The student is enrolled in: "+ uni.getCourseList().get(i).getCourseName());
                        } else {
                            System.out.println("The student is NOT enrolled in: "+ uni.getCourseList().get(i).getCourseName());
                        }
                    }

                    break;
                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Error, this option doesn't exist");
                    break;
            }

        } while (exit == false);

    }


}
