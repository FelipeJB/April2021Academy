package Runner;

import Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class University {
    public static void main(String[] args) {
        int option=0;
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Adriana Garcia", 22, 1);
        Student student2 = new Student("Cristal Rubio", 17, 2);
        Student student3 = new Student("Jaime Perez", 16, 3);
        Student student4 = new Student("Laura Parra", 20, 4);
        Student student5 = new Student("Mateo Velez", 22, 5);
        Student student6 = new Student("Raul Restrepo", 24, 6);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);

        List<Teacher> teachers = new ArrayList<>();
        Teacher teacher1 = new Teacher("Alejandro Gonzales",33,2021301,200,8,"Full time",35);
        Teacher teacher2 = new Teacher("Vanessa Milan",22,2021203,50,2,"Partial time",40);
        Teacher teacher3 = new Teacher("Jorge Valdez",40,2021807,200,13,"Full time",35);
        teachers.add(teacher1);
        teachers.add(teacher2);
        teachers.add(teacher3);

        List<Subject> subjects = new ArrayList<>();
        Subject subject1 = new Subject("Economy","B12",2021301,5,1);
        Subject subject2 = new Subject("Chemistry","F02",2021807,3,1);
        Subject subject3 = new Subject("Math","C10",2021203,2,4);
        Subject subject4 = new Subject("POO","B08",2021301,2,6);
        subjects.add(subject1);
        subjects.add(subject2);
        subjects.add(subject3);
        subjects.add(subject4);

//----------------------------------------------------------------------------------------------
        while (option <= 5) {
            option= getOption();
            switch (option) {
                case 1:
                    for (int i=0; i<teachers.size(); i++){
                        System.out.println("Name: "+teachers.get(i).getName()+"\n"+"Age: "+teachers.get(i).getAge()+"\n"+"Id: "+
                                teachers.get(i).getId()+"\n"+"Base salary: "+teachers.get(i).getBaseSalary()+"\n"+"Experience years: "+
                                teachers.get(i).getExperienceYears()+"\n"+"Contract type: "+teachers.get(i).getTypeContract()+"\n"+"Hours per week: "+
                                teachers.get(i).getHoursPerWeek()+"\n"+"Salary : "+teachers.get(i).salaryCalculated()+"\n");
                    }
                    break;
                case 2:
                    Scanner scan = new Scanner(System.in);
                    int j=0;
                    for (int i=0; i<subjects.size(); i++){
                        j++;
                        System.out.println(j+") Class: "+subjects.get(i).getName());
                    }
                    System.out.println("Please enter the number of the class for more details");
                    int optionClass=scan.nextInt();
                    for (int i=0; i<subjects.size(); i++) {
                        if (optionClass == (i + 1)) {
                            System.out.println("Class: " + subjects.get(i).getName() + "\n" + "Classroom: " + subjects.get(i).getClassroom());

                            for (int l = 0; l < teachers.size(); l++) {
                                if (subjects.get(i).getTeacherId() == teachers.get(l).getId()) {
                                    System.out.println("Teacher: " + teachers.get(l).getName());
                                }
                            }

                            for (int f = 0; f < students.size(); f++) {
                                if (subjects.get(i).getStudentId1() == students.get(f).getId()) {
                                    System.out.println("Student: " + students.get(f).getName());
                                }
                                if (subjects.get(i).getStudentId2() == students.get(f).getId()) {
                                    System.out.println("Student: " + students.get(f).getName());
                                }
                            }
                        }
                    }
                    break;
                case 3:
                    Scanner scan1 = new Scanner(System.in);
                    System.out.println("Please enter the name and last name of the new student");
                    String nameStudent=scan1.nextLine();
                    System.out.println("Please enter the age of the new student");
                    int ageStudent=scan1.nextInt();
                    students.add(new Student(nameStudent, ageStudent,students.size()+1));

                    for (int i=0; i<students.size(); i++) {
                        System.out.println("Student name: "+students.get(i).getName()+"\n"+"Student age: "+students.get(i).getAge() +"\n"+"Student Id: "+students.get(i).getId()+"\n");
                    }
                    break;
                case 4:
                    Scanner scan2 = new Scanner(System.in);
                    System.out.println("Please enter the name of the new subject");
                    String nameSubject=scan2.nextLine();
                    System.out.println("Please assign a classroom ");
                    String classroomSubject=scan2.nextLine();
                    subjects.add(new Subject(nameSubject,classroomSubject,2021203,3,6));

                    for (int i=0; i<subjects.size(); i++) {
                        System.out.println("\n"+"Subject name: "+subjects.get(i).getName()+"\n"+"Subject classroom: "+subjects.get(i).getClassroom() +"\n"+"Teacher Id: "+subjects.get(i).getTeacherId());
                        for (int l = 0; l < teachers.size(); l++) {
                            if (subjects.get(i).getTeacherId() == teachers.get(l).getId()) {
                                System.out.println("Teacher: " + teachers.get(l).getName());
                            }
                        }

                        for (int f = 0; f < students.size(); f++) {
                            if (subjects.get(i).getStudentId1() == students.get(f).getId()) {
                                System.out.println("Student: " + students.get(f).getName());
                            }
                            if (subjects.get(i).getStudentId2() == students.get(f).getId()) {
                                System.out.println("Student: " + students.get(f).getName());
                            }
                        }
                    }
                    break;
                case 5:
                    Scanner scan3 = new Scanner(System.in);
                    for (int i=0; i<students.size(); i++) {
                        System.out.println("Id: "+students.get(i).getId()+" - "+students.get(i).getName());
                    }
                    System.out.println("Please enter id of the student that you want to find");
                    int idStudent=scan3.nextInt();
                    for (int i=0; i<subjects.size(); i++) {
                        if (idStudent == subjects.get(i).getStudentId1() || idStudent == subjects.get(i).getStudentId2()) {
                            System.out.println("Class: " + subjects.get(i).getName() + "\n" + "Classroom: " + subjects.get(i).getClassroom() + "\n" + "Teacher Id: " + subjects.get(i).getTeacherId() + "\n");
                        }
                    }
                    break;
                case 6:
                    break;
            }
        }
    }


    public static int getOption(){
        Scanner scan = new Scanner(System.in);
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("1) Print all the professors with its data ");
        System.out.println("2) Print all the classes and a submenu to select a class in order to print the class data including its teacher and students ");
        System.out.println("3) Create a new student ");
        System.out.println("4) Create a new class and add a teacher, students and its relevant data ");
        System.out.println("5) List all the classes in which a given student is included ");
        System.out.println("6) Exit ");

        return scan.nextInt();
    }
}