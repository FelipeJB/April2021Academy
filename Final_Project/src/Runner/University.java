package Runner;

import ClassRoom.CourseRoom;
import Person.Student;
import Person.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class University {

    private Scanner scan = new Scanner(System.in);

    public static void main(String args[]){

        University main = new University();
        ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<CourseRoom> classList = new ArrayList<>();

        int numTeacher = main.scan.nextInt();
        int numStudent = main.scan.nextInt();
        int numClass = main.scan.nextInt();

        //Add teacher to List
        for (int i = 0; i < numTeacher; i++){
            System.out.println("Please insert the data of " + (i + 1) + "° teacher: ");
            int id = main.scan.nextInt();
            String name = main.scan.next();
            double salary = main.scan.nextDouble();
            int experienceYear = main.scan.nextInt();
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
            String name = main.scan.next();

            CourseRoom courseRoom = new CourseRoom(id, name);
            classList.add(courseRoom);

        }

        //Print the teacher(s) added
        for (int i = 0; i < teacherList.size(); i++){
            System.out.println((teacherList.get(i).getId()) + " " + (teacherList.get(i).getName()) + " " + (teacherList.get(i).getSalary()) + " " + (teacherList.get(i).getExperienceYear()) + " " + (teacherList.get(i).getTimeLabor()));

        }

        //Print the student(s) added
        for (int i = 0; i < studentList.size(); i++){
            System.out.println((studentList.get(i).getId()) + " " + (studentList.get(i).getName()) + " " + (studentList.get(i).getAge()));

        }

        //Print the class(es) added
        for (int i = 0; i < classList.size(); i++){
            System.out.println((classList.get(i).getIdClass()) + " " + (classList.get(i).getName()));

        }




    }

}
