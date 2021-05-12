package Test;


import Data.*;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();

        //Initialize minimum 2 different teachers of each type (full time, part time).
        FullTimeTeacher fullTimeTeacherJose = new FullTimeTeacher("Jose", 2000000, 4);
        FullTimeTeacher fullTimeTeacherCristina = new FullTimeTeacher("Cristina", 1500000, 2);
        PartTimeTeacher partTimeTeacherPedro = new PartTimeTeacher("Pedro", 3000000, 20);
        PartTimeTeacher partTimeTeacherMaria = new PartTimeTeacher("Maria", 4500000, 15);

        teachers.add(fullTimeTeacherJose);
        teachers.add(fullTimeTeacherCristina);
        teachers.add(partTimeTeacherPedro);
        teachers.add(partTimeTeacherMaria);

        for (Teacher teacher : teachers){
            System.out.println(teacher.getName() + " se gana $" + teacher.calculateSalary());
        }


        //Initialize minimum 6 different students
        List<Student> students = new ArrayList<>();

        Student studentMiguel = new Student("Miguel", 1001, 20);
        Student studentAna = new Student("Ana", 1002, 17);
        Student studentOscar = new Student("Oscar", 1003, 24);
        Student studentJuan = new Student("Juan", 1004, 21);
        Student studentDora = new Student("Dora", 1005, 30);
        Student studentNatalia = new Student("Natalia", 1006, 24);
        students.add(studentMiguel);
        students.add(studentAna);
        students.add(studentOscar);
        students.add(studentJuan);
        students.add(studentDora);
        students.add(studentNatalia);
        for (Student student : students){
            System.out.println(student.getName() + "........" + student.getId() + "........" + student.getAge());
        }


        //Initialize minimum 4 different courses including its teacher, students, and other relevant data




    }
}
