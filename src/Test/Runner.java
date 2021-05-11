package Test;

import Data.FullTimeTeacher;
import Data.PartTimeTeacher;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List<Teacher> teachers = new ArrayList<>();

        //Initialize minimum 2 different teachers of each type (full time, part time).
        FullTimeTeacher fullTimeTeacherJose = new FullTimeTeacher("Jose",2000000, 4);
        FullTimeTeacher fullTimeTeacherCristina = new FullTimeTeacher("Cristina",1500000, 2);
        PartTimeTeacher partTimeTeacherPedro = new PartTimeTeacher("Pedro", 3000000, 20);
        PartTimeTeacher partTimeTeacherMaria = new PartTimeTeacher("Maria", 4500000, 15);

        teachers.add(fullTimeTeacherJose);
        teachers.add(fullTimeTeacherCristina);
        teachers.add(partTimeTeacherPedro);
        teachers.add(partTimeTeacherMaria);

        for (Teacher teacher : teachers) {
            System.out.println(teacher.getName() + " se gana: $" + teacher.calculateSalary());

        }


    }
}
