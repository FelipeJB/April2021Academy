package Data;

import java.util.ArrayList;
import java.util.List;

public class University {
    private ArrayList <Teacher> teacherList = new ArrayList<>();
    private ArrayList <Student> studentList = new ArrayList<>();
    private ArrayList <Course> courseList = new ArrayList<>();

    private ArrayList <Person> persons = new ArrayList<>();


    public void anyMethod(){
        Student s = new Student(1, 20, "Mario Pombo");
        Teacher t = new Teacher(1, 40, "Mariana Velez", 5, 6);

        persons.add(s);
        persons.add(t);

    }


    /**
    @Override
    public String toString() {
        return "Teacher{" +
                "name ='" + University.this.getPersons() + '\'' +
                "name ='" + University.this.persons.get(0).getName() + '\'' +
                '}';
    }**/



    public ArrayList <Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList <Person> persons) {
        this.persons = persons;
    }

    public University(){
        this.courseList= new ArrayList<>();
        this.studentList= new ArrayList<>();
        this.teacherList= new ArrayList<>();
    }


    //public abstract double getBaseSalary();







}
