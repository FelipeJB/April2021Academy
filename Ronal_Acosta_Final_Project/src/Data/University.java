package Data;

import java.util.ArrayList;
import java.util.List;

public abstract class University {
    private List <Teacher> teacherList;
    private List <Student> studentList;
    private List <Course> courseList;

    public University(){
        this.courseList= new ArrayList<>();
        this.studentList= new ArrayList<>();
        this.teacherList= new ArrayList<>();
    }


    //public abstract double getBaseSalary();







}
