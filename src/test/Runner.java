package test;

import data.FulltimeTeacher;
import data.ParttimeTeacher;
import data.Student;

public class Runner {

    public static void main(String[] args) {
        Student student = new Student("Sebas", 22, 01);
        FulltimeTeacher fulltimeTeacher = new FulltimeTeacher("Pipe", 30, 850000, 10);
        ParttimeTeacher parttimeTeacher = new ParttimeTeacher("Carol", 27, 200000, 30);

        System.out.println(fulltimeTeacher.calculateSalary());
        System.out.println(parttimeTeacher.calculateSalary());
        System.out.println(student.getName());
        System.out.println(fulltimeTeacher.getBaseSalary());
    }
}
