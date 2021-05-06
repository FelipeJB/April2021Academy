package Test;

import Data.Person;
import Data.Student;
import Data.Teacher;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        List studentList = new ArrayList<Student>();
        List teacherList = new ArrayList<Person>();

        Student student1 = new Student("Yefry","11101", 15, "Ing Sistemas");
        Student student2 = new Student("Lina","11102", 15, "Ing Sistemas");
        Student student3 = new Student("Pedro","11103", 15, "Ing Sistemas");
        Student student4 = new Student("Claudia","11104", 15, "Ing Sistemas");
        Student student5 = new Student("Felipe","Ex9999", 15, "Ing Sistemas");
        Student student6 = new Student("Jessica","11105", 15, "Ing Sistemas");
        Student student7 = new Student("Liliana","11106", 15, "Ing Sistemas");
        Student student8 = new Student("Ronal","11107", 15, "Ing Sistemas");
        Teacher teacher1 = new Teacher("Felipe","99901",40,true,10);
        Teacher teacher2 = new Teacher("Jimenez","99902",40,true,5);
        Teacher teacher3 = new Teacher("Carol","99903",40,false,5);
        Teacher teacher4 = new Teacher("Bohorquez","99904",40,false,10);
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

        getList(studentList);
        getList(teacherList);


    }
    public static void getList(List list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(i + ".) "+list.get(i));
        }
    }

}
