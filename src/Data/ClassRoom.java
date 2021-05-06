package Data;

import java.util.List;

public class ClassRoom {
    public String name;
    public int hoursWeek;
    public String room;
    public List<Student> students;
    public Teacher teacher;

    public ClassRoom(String name, int hoursWeek, String room, List<Student> students, Teacher teacher) {
        this.name = name;
        this.hoursWeek = hoursWeek;
        this.room = room;
        this.students = students;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursWeek() {
        return hoursWeek;
    }

    public void setHoursWeek(int hoursWeek) {
        this.hoursWeek = hoursWeek;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "name='" + name + '\'' +
                ", hoursWeek=" + hoursWeek +
                ", room='" + room + '\'' +
                ", students=" + students +
                ", teacher=" + teacher +
                '}';
    }
}
