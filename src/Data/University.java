package Data;

import java.util.ArrayList;
import java.util.List;

public class University {

    //The university includes a list of teachers, a list of students and a list of courses

    //protected List<Teacher> teachersList;
    private List<Student> studentsList;
    //private List<Course> coursesList;


    public University() {
        //this.teachersList = new ArrayList<>();
        this.studentsList = new ArrayList<>();
        //this.coursesList = new ArrayList<>();
    }

    public List<Student> getStudentsList() {
        return studentsList;
    }

    /*public List<Teacher> getTeachersList() {
        FullTimeTeacher fullTimeTeacherJose = new FullTimeTeacher("Jose", 3500000, 4,40);
        FullTimeTeacher fullTimeTeacherCristina = new FullTimeTeacher("Cristina",1500000, 2,45);
        PartTimeTeacher partTimeTeacherPedro = new PartTimeTeacher("Pedro", 3000000, 20,20);
        PartTimeTeacher partTimeTeacherMaria = new PartTimeTeacher("Maria", 4500000, 15,25);

        teachersList.add(fullTimeTeacherJose);
        teachersList.add(fullTimeTeacherCristina);
        teachersList.add(partTimeTeacherPedro);
        teachersList.add(partTimeTeacherMaria);
        return teachersList;
    }



    public List<Course> getCoursesList() {
        return coursesList;
    }

*/


}
