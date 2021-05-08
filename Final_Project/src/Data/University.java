package Data;

import java.util.ArrayList;
import java.util.List;

public class University {

    private String universityName;
    private List<Course> course;
    // private List<Teacher> teacher;
    // private List<Student> studentU;
    private List<Person> persons;

    public University(){
        this.universityName = "Universidad Proyecto";
        this.course = new ArrayList<>();
        this.persons = new ArrayList<>();
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    public List<Person> getPersons() {
        return persons;
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }

    public void displayTeachers(){

    }

    public void displayCourses(){

    }
}
