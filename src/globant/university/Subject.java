package globant.university;
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private int id;
    private String nameSubject;
    private String schedule;
    private String timeStartSubject;
    private String timeEndSubject;
    private double duration;
    private Teacher teacher;
    List<Student> students = new ArrayList<Student>();

    public Subject() {
    }

    public Subject(int id, String nameSubject, String schedule, String timeStartSubject, String timeEndSubject, double duration, Teacher teacher, List<Student> students) {
        this.id = id;
        this.nameSubject = nameSubject;
        this.schedule = schedule;
        this.timeStartSubject = timeStartSubject;
        this.timeEndSubject = timeEndSubject;
        this.duration = duration;
        this.teacher = teacher;
        this.students = students;
    }

    //Subject initialize constructor
    public Subject(int z, String nameSubject, String schedule, String timeStartSubject, String timeEndSubject, String duration, String teacher, List<Student> students) {
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getTimeStartSubject() {
        return timeStartSubject;
    }

    public void setTimeStartSubject(String timeStartSubject) {
        this.timeStartSubject = timeStartSubject;
    }

    public String getTimeEndSubject() {
        return timeEndSubject;
    }

    public void setTimeEndSubject(String timeEndSubject) {
        this.timeEndSubject = timeEndSubject;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // This method avoid that Java print the memory references and print the value in each position.
    @Override
    public String toString() {
        return " " +
                "Id: " + id
                + ", Name subject: " + nameSubject
                + ", Schedule: " + schedule
                + ", Time the Subject begin: " + timeStartSubject
                + ", Time the Subject end: " + timeEndSubject
                + ", Duration: " + duration
                + ", Teacher: " + teacher
                +  ", Students: " + students
                + ' ';
    }

}
