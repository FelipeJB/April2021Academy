package Test;

import Data.Course;
import Data.Student;
import Data.Teacher;
import Data.*;

import java.util.ArrayList;
import java.util.List;


public class Runner {

    public static void main(String[] args) {

        List studentList = new ArrayList<Student>();
        List teacherList = new ArrayList<Teacher>();
        List courseList = new ArrayList<Course>();


        Teacher teacher1 = new Teacher(1,40,"Mariana Velez",5,6);
        Teacher teacher2 = new Teacher(2,36,"Javier Ramirez",10, 8);
        Teacher teacher3 = new Teacher(3,42,"Camila Suarez",7, 40);
        Teacher teacher4 = new Teacher(4,50,"Ismael Osorio",2, 20);
        Teacher teacher5 = new Teacher(5,42,"Isabelle Saenz",9, 40);
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);
        teacherList.add(teacher5);



        Student student1 = new Student(1,20,"Mario Pombo");
        Student student2 = new Student(2,50,"Eduardo Macías");
        Student student3 = new Student(3,30, "Luisa Calle");
        Student student4 = new Student(4,50, "Mariana Pajón");
        Student student5 = new Student(5,40, "Maria Rosales");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);

        System.out.println("List of teachers");
        for (int i = 0; i < teacherList.size(); i++){
        System.out.println(i + "- "+teacherList.get(i)+"\n");
        }

        System.out.println("List of students");
        for (int i = 0; i < studentList.size(); i++){
            System.out.println(i + "- "+studentList.get(i)+"\n");
        }

        System.out.println("The following are the teacher's salaries");
        System.out.println(teacher1.getSalary(teacher1.getActiveHoursWeek(),teacher1.getExperienceYears()));
        System.out.println(teacher2.getSalary(teacher2.getActiveHoursWeek(),teacher2.getExperienceYears()));
        System.out.println(teacher3.getSalary(teacher3.getActiveHoursWeek(),teacher3.getExperienceYears()));
        System.out.println(teacher4.getSalary(teacher4.getActiveHoursWeek(),teacher4.getExperienceYears()));
        System.out.println(teacher5.getSalary(teacher5.getActiveHoursWeek(),teacher5.getExperienceYears()));
        System.out.println(teacher1.getExperienceYears());

           //System.out.println("Teacher's name: " + teacherList.get(i) + " " + "Teacher's salary: " + teacherList.get(0) + "\n");



    }


}
