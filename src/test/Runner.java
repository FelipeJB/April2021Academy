package test;

import data.FulltimeTeacher;
import data.Student;

public class Runner {

    public static void main(String[] args) {
        Student student = new Student("Sebas", 22, 01);
        FulltimeTeacher fulltimeTeacher = new FulltimeTeacher("Pipe", 30, 850000, 10);

        System.out.println(fulltimeTeacher.calculateSalary());
    }
}
