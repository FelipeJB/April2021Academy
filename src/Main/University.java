package Main;

import Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class University {
    /*

    e. List all the classes in which a given student is included (hint: search by id)
    f. Exit
    */
    public static void main (String[] args){

        List<Teacher> teachers= new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        int option;
        boolean close = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("University ");

        //Initialize the data
        //I create 2 teacher for each type
        PartTimeTeacher teacher1 = new PartTimeTeacher("Manuel Gallego", 20.5);
        PartTimeTeacher teacher2 = new PartTimeTeacher("Maria Cardona", 30.0);
        FullTimeTeacher teacher3 = new FullTimeTeacher("John Cuervo ", 15.0);
        FullTimeTeacher teacher4 = new FullTimeTeacher("Marcela Cuervo ", 10.5);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);
        teachers.add(teacher4);

        //I create 6 students
        Student student1= new Student("Luz Ramirez", 25);
        Student student2= new Student("Jaime Garzon", 30);
        Student student3= new Student("Juan Camilo Cardona", 18);
        Student student4= new Student("Oscar Garcia", 28);
        Student student5= new Student("Lucia Marin", 16);
        Student student6= new Student("Alejandro Montoya", 33);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        //I assign the students for the course1
        List<Student> course1Students = new ArrayList<>();
        course1Students.add(student1);
        course1Students.add(student2);
        //I create the course1
        Course course1 = new Course("Maths","Classroom 1", teacher1, course1Students);

        //I assign the students for the course2
        List<Student> course2Students = new ArrayList<>();
        course2Students.add(student1);
        course2Students.add(student3);
        //I create the course2
        Course course2 = new Course("Science","Classroom 2", teacher2, course2Students);

        //I assign the students for the course3
        List<Student> course3Students = new ArrayList<>();
        course3Students.add(student2);
        course3Students.add(student3);
        //I create the course3
        Course course3 = new Course("French","Classroom 3", teacher3, course3Students);

        //I assign the students for the course4
        List<Student> course4Students = new ArrayList<>();
        course4Students.add(student4);
        course4Students.add(student5);
        course4Students.add(student6);
        //I create the course4
        Course course4 = new Course("English","Classroom 4", teacher4, course4Students);

        //I add finally the courses created to the courses list
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        while(close==false){
            System.out.println("\nWhat do you want to see: ");
            System.out.println("1. Teachers list");
            System.out.println("2. Courses list and course details");
            System.out.println("3. Create a student and add it to a course");
            System.out.println("4. Create a new course and add a teacher, students and its relevant data");
            System.out.println("5. List all the courses in which a given student is included");
            System.out.println("6. Exit");

            option = parseInt(scan.next());

            switch (option) {
                case 1:
                    //I search the list of teacher verifying if it is an instance of full or part time to know what to print
                    //(Class Type,object to iterate: lista a recorrer)
                    for(Teacher objteacher: teachers) {
                        if (objteacher instanceof PartTimeTeacher) {
                            PartTimeTeacher partTimeTeacherToPrint = (PartTimeTeacher) objteacher;
                            System.out.println("Name: "+partTimeTeacherToPrint.getTeacherName() + " Salary "+ partTimeTeacherToPrint.getTeacherSalary() + ". Active hours per Week "+ partTimeTeacherToPrint.getActiveHoursPerWeek());
                        } else if (objteacher instanceof FullTimeTeacher) {
                            FullTimeTeacher fullTimeTeacherToPrint = (FullTimeTeacher) objteacher;
                            System.out.println("Name: " + fullTimeTeacherToPrint.getTeacherName() + " Salary "+ fullTimeTeacherToPrint.getTeacherSalary()+ ". Years of experience "+ fullTimeTeacherToPrint.getYearsOfExperience());
                        }
                    }//end for
                    break;
                case 2:
                    //Print all the courses
                    int indexCourse = 0;
                    for(Course objcourse: courses) {
                        System.out.println("Course code: " + indexCourse + ". Course Name: " + objcourse.getCourseName() + ". Classroom:" + objcourse.getClassroom());
                        indexCourse++;
                    }
                    //Ask for the Course Code to see its details
                    System.out.println("\nEnter the course code to see details or EXIT to continue");
                    String codeCourse=scan.next();
                    if(codeCourse.equals("EXIT")){
                        break;
                    }else{
                        indexCourse = parseInt(codeCourse);
                        Course courseDetails = courses.get(indexCourse);
                        //get the teacher of the course
                        Teacher courseTeacher = courseDetails.getTeacher();
                        System.out.println("Course's Teacher Name " + courseTeacher.getTeacherName());
                        //get the students of the course
                        List<Student> courseStudentsDetails = courseDetails.getCourseStudents();
                        for(Student StudentsOfTheCourse : courseStudentsDetails){
                            System.out.println(" " +StudentsOfTheCourse.getStudentName() + " " + StudentsOfTheCourse.getStudentId());
                        }
                    }
                    break;




                case 4: //Create a new course and add a teacher, students and its relevant data
                    System.out.println("\nEnter the new Course Name: ");
                    String newCourseName = scan.next();
                    System.out.println("\nEnter the Course Classroom: ");
                    String newCourseClassroom = scan.next();
                    System.out.println("\nEnter the Teacher Name: ");
                    String newTeacherName = scan.next();
                    System.out.println("\nIs the Teacher Full Time? Y / N: ");
                    String teacherTypeStatus = scan.next();
                    Teacher teacherOfCourse;
                    if(teacherTypeStatus.equals("Y")){
                        System.out.println("\nEnter the years of experience: ");
                        Double newYearsOfExperience = scan.nextDouble();
                        teacherOfCourse= new FullTimeTeacher(newTeacherName, newYearsOfExperience); //POLIMORFISMO

                    }else{
                        System.out.println("\nEnter the Active hours per week: ");
                        Double newActiveHoursPerWeek = scan.nextDouble();
                        teacherOfCourse= new PartTimeTeacher(newTeacherName, newActiveHoursPerWeek);//POLIMORFISMO

                    }

                    System.out.println("\nList of students in the University");
                    int indexStudent = 0;
                    for(Student objStudent: students) {
                        System.out.println("Student code: " + indexStudent + ". Student Name: " + objStudent.getStudentName());
                        indexStudent++;
                    }
                    //mientras quiera ingresar mas estudiantes
                    boolean enrollStudentStatus= true;
                    List<Student> newStudentsListCourse = new ArrayList<>();
                    while(enrollStudentStatus == true){
                            System.out.println("\nEnroll the Students to the Course, digit the Student code: ");
                            int newStudentCourse = scan.nextInt();
                            Student NewStudentCourse = students.get(newStudentCourse);
                            newStudentsListCourse.add(NewStudentCourse);
                            System.out.println("\nEnroll other Student to the Course? Y / N ");
                            if(scan.next().equals("N") ){
                                enrollStudentStatus = false;
                            }
                    }

                    Course newCourse = new Course(newCourseName, newCourseClassroom,teacherOfCourse ,newStudentsListCourse);
                    courses.add(newCourse);
                    System.out.println("\nCourse created with Success ");
            }//end switch

        }//end while
    }



}
