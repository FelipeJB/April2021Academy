package Main;

import Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class University {

    public static void main (String[] args){

        List<Teacher> teachers= new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Course> courses = new ArrayList<>();

        int option;
        boolean close = false;

        Scanner scan = new Scanner(System.in);
        System.out.println("University ");

        //Initialize the data
        //I create 2 teacher for each type of teacher
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

        //I add the students to the course1
        List<Student> course1Students = new ArrayList<>();
        course1Students.add(student1);
        course1Students.add(student2);
        //I create the course1
        Course course1 = new Course("Maths","H1", teacher1, course1Students);

        //I add the students to the course2
        List<Student> course2Students = new ArrayList<>();
        course2Students.add(student1);
        course2Students.add(student3);
        //I create the course2
        Course course2 = new Course("Science","H2", teacher2, course2Students);

        //I add the students to the course3
        List<Student> course3Students = new ArrayList<>();
        course3Students.add(student2);
        course3Students.add(student3);
        //I create the course3 sending the teacher and student list
        Course course3 = new Course("French","H3", teacher3, course3Students);

        //I add the students to the course4
        List<Student> course4Students = new ArrayList<>();
        course4Students.add(student4);
        course4Students.add(student5);
        course4Students.add(student6);
        //I create the course4
        Course course4 = new Course("English","H4", teacher4, course4Students);

        //I add finally the courses created to the courses list
        courses.add(course1);
        courses.add(course2);
        courses.add(course3);
        courses.add(course4);

        //MENU
        while(close==false){

            System.out.println("\n**********************************************************************************");
            System.out.println("University Data Menu ");
            System.out.println("What do you want to do: ");
            System.out.println("1. See Teachers list");
            System.out.println("2. See Courses list with each course details");
            System.out.println("3. Create a student and enroll it to a course");
            System.out.println("4. Create a new course with teacher, students and its data");
            System.out.println("5. See Courses of an student");
            System.out.println("6. Exit");
            System.out.println("**********************************************************************************");
            System.out.println("Enter the code: ");


            option = parseInt(scan.next());

            switch (option) {
                case 1:
                    //I search the list of teacher verifying if it is an instance of full or part time to know what to print
                    System.out.println("\nTeachers List:");
                    //(Class Type,object to iterate: lista a recorrer)
                    for(Teacher objteacher: teachers) {
                        if (objteacher instanceof PartTimeTeacher) {
                            PartTimeTeacher partTimeTeacherToPrint = (PartTimeTeacher) objteacher;
                            System.out.println("Name: "+partTimeTeacherToPrint.getTeacherName() + "---    Salary(USD): "+ partTimeTeacherToPrint.getTeacherSalary() + "---   Active hours per Week: "+ partTimeTeacherToPrint.getActiveHoursPerWeek());
                        } else if (objteacher instanceof FullTimeTeacher) {
                            FullTimeTeacher fullTimeTeacherToPrint = (FullTimeTeacher) objteacher;
                            System.out.println("Name: " + fullTimeTeacherToPrint.getTeacherName() + "---    Salary(USD): "+ fullTimeTeacherToPrint.getTeacherSalary()+ "---    Years of experience: "+ fullTimeTeacherToPrint.getYearsOfExperience());
                        }
                    }//end for
                    break;
                case 2:
                    //Print all the courses
                    System.out.println("\nCourses List: ");
                    int indexCourse = 0;
                    for(Course objcourse: courses) {
                        System.out.println("Course code: " + indexCourse + "---   Course Name: " + objcourse.getCourseName() + "---    Classroom: " + objcourse.getClassroom());
                        indexCourse++;
                    }
                    //Ask for the Course Code to see its details
                    System.out.println("\nEnter the course code to see details or write 'back' ");
                    String codeCourse=scan.next();
                    if(codeCourse.equals("back")){
                        break;
                    }else{
                        indexCourse = parseInt(codeCourse);
                        Course courseDetails = courses.get(indexCourse);
                        //get the teacher of the course
                        Teacher courseTeacher = courseDetails.getTeacher();
                        System.out.println("\nCourse: " + courseDetails.getCourseName() ) ;
                        System.out.println("Course's Teacher Name: " + courseTeacher.getTeacherName());
                        //get the students of the course
                        List<Student> courseStudentsDetails = courseDetails.getCourseStudents();
                        System.out.println("\nStudents enrolled: ") ;
                       //I loop into the course student details list to print them
                        for(Student StudentsOfTheCourse : courseStudentsDetails){
                            System.out.println("Student Name: " +StudentsOfTheCourse.getStudentName() + "---   Age: " + StudentsOfTheCourse.getStudentAge());
                        }
                    }
                    break;
                case 3: //Create a new student and add it to an existing course
                    System.out.println("\nEnter the complete student Name: ");
                    String newStudentName = scan.next();
                    System.out.println("\nEnter the student Age: ");
                    int newStudentAge = scan.nextInt();
                    //create a new student
                    Student newStudent = new Student(newStudentName, newStudentAge);
                    System.out.println("\nIn which course do you want to enroll the new student ");
                    //List all courses and its codes
                    int indexNewCourse = 0;
                    for(Course objNewCourse: courses) {
                        System.out.println("Course code: " + indexNewCourse + ". Course Name: " + objNewCourse.getCourseName() + ". Classroom: " + objNewCourse.getClassroom());
                        indexNewCourse++;
                    }
                    System.out.println("\nEnter the course code(showed up) to enroll the student: ");
                    int newStudentCourseCode = scan.nextInt();
                    //Add the new student to the indicated course
                    Course addStudentToCourse = courses.get(newStudentCourseCode);
                    addStudentToCourse.set1NewStudentoCourse(newStudent);
                    System.out.println("\nThe student was added with success ");

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
                    boolean enrollStudentStatus= true;
                    List<Student> newStudentsListCourse = new ArrayList<>();
                    while(enrollStudentStatus == true){
                            System.out.println("\nEnter the student code to enroll(showed up): ");
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
                    break;
                case 5://List all courses where an student is included
                    //list of students
                    System.out.println("\nStudents in the University:");
                    int indexStudentToSearch = 0;
                    for(Student objStudentToSearch: students) {
                        System.out.println("Student code: " + indexStudentToSearch + ".  Student Name: " + objStudentToSearch.getStudentName());
                        indexStudentToSearch++;
                    }
                    System.out.println("\nEnter the Student code (showed up), to search all its courses: ");
                    int studentNameCodeToSearch = scan.nextInt();
                    for(Course coursesForAnStudent: courses){
                        boolean isStudentInCourse = coursesForAnStudent.isStudentInTheCourse(studentNameCodeToSearch);
                        if(isStudentInCourse == true){
                            System.out.println("The Student is in "+ coursesForAnStudent.getCourseName() + " course");
                        }
                    }
                    break;
                case 6:
                    close = true;
                    break;
            }//end switch

        }//end while
    }



}
