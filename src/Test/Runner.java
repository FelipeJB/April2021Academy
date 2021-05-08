package Test;

import co.com.javacourse.university.admin.UniversityProcess;
import co.com.javacourse.university.model.*;
import co.com.javacourse.university.utils.Constans;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        boolean exit = false;
        List<Student> studentList = new ArrayList<>();
        List<Teacher> teacherList = new ArrayList<>();
        List<ClassRoom> classList = new ArrayList<>();

        Student student1 = new Student("yefry",15);
        Student student2 = new Student("Lina", 15);
        Student student3 = new Student("Pedro",15);
        Student student4 = new Student("Claudia", 15);
        Student student5 = new Student("Felipe", 15);
        Student student6 = new Student("Jessica", 15);
        Student student7 = new Student("Liliana",15);
        Student student8 = new Student("Ronal", 15);
        PartTimeTeacher teacher1 = new PartTimeTeacher("Jimenez", 10);
        PartTimeTeacher teacher2 = new PartTimeTeacher("Bohorquez", 20);
        FullTimeTeacher teacher3 = new FullTimeTeacher("Jesus", 20);
        FullTimeTeacher teacher4 = new FullTimeTeacher("Margarita", 10);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        studentList.add(student7);
        studentList.add(student8);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        ClassRoom room1 = new ClassRoom("Math",8,"F1R101",teacher1);
        ClassRoom room2 = new ClassRoom("Java",8,"F1R102",teacher2);
        room1.setStudents(student1);
        room1.setStudents(student2);
        room2.setStudents(student1);
        room2.setStudents(student2);
        room2.setStudents(student3);
        room2.setStudents(student4);
        room2.setStudents(student5);
        classList.add(room1);
        classList.add(room2);


        do{
            System.out.println("\n ----------------------------------------- ");
            System.out.println(" ---------- " + Constans.UNIVERSITY_NAME + " ----------");
            System.out.println(" ----------------------------------------- ");
            System.out.println("1. Print the professors list");
            System.out.println("2. Print all the classes " );
            System.out.println("3. Consultar inventario Disponible");
            System.out.println("4. Realizar venta");
            System.out.println("5. Salir");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            switch (option){
                case 1:
                    System.out.println(" ---------- " + "Professor List" + " ----------");
                    getPrintList(teacherList);
                    break;
                case 2:
                    System.out.println(" ---------- " + "Classes List" + " ----------");
                    getPrintList(classList);
                    break;
                case 3:
                    System.out.println(" ---------- " + "Classes List" + " ----------");
                    break;

                case 4:
                    break;
                case 5:
                    exit = true;
                    break;

                default:
                    exit = true;
                    break;
            }

        } while (exit == false);





    }
    public static void getPrintList(List list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(i + ".) "+list.get(i));
        }
    }

    public static List<Student> getStudentsOutOfCouRse(List<Student> list, List<Student> course){
        List<Student> ls = new ArrayList<>();
        for (Student i:list){
            boolean found = false;
            for(Student j: course){
                if (j.getId() == i.getId()){
                    found = true;
                }
            }
            if (found = false){
                ls.add(i);
            }
        }
        return ls;
    }


}
