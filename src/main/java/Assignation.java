import java.util.ArrayList;
import java.util.List;

public class Assignation {

    Teacher teacher1 = new Teacher(1010,"Juan","Perez",30,100000,1,16, 10);
    Teacher teacher2 = new Teacher(2020,"Jesus","Nazareth",33,200000,1,16, 8);
    Teacher teacher3 = new Teacher(3030,"Maria","Magdalena",25,300000,2,12, 5);
    Teacher teacher4 = new Teacher(4040,"Santiago","Zebedeo",50,150000,2,10, 3);
    List<Teacher> teachersList = new ArrayList<>();

    Student student1 = new Student(1111, "Simon", "Bolivar", 18);
    Student student2 = new Student(2222, "Francisco", "Santander", 19);
    Student student3 = new Student(3333, "Jose", "Cordoba", 20);
    Student student4 = new Student(4444, "Francisco", "Caldas", 21);
    Student student5 = new Student(5555, "Atanasio", "Girardot", 22);
    Student student6 = new Student(6666, "Nemesio", "Camacho", 23);
    List<Student> studentList = new ArrayList<>();

    Subject subject1 = new Subject(101, "Cardiovascular Anesthesia");
    Subject subject2 = new Subject(201, "Pure Chemistry");
    Subject subject3 = new Subject(301, "Molecular Biology");
    Subject subject4 = new Subject(401, "Quantum Physics");
    List<Subject> subjectsList = new ArrayList<>();

    List<Integer> course1 = new ArrayList<>();
    public void setCourse1(List<Integer> course1) {
        course1.add(Subject.roomNumber);
        course1.add(Teacher.getId());
        course1.add(Student.getId());
    }

    List<Integer> course2 = new ArrayList<>();
    public void setCourse2(List<Integer> course2) {
        course2.add(Subject.roomNumber);
        course2.add(Teacher.getId());
        course2.add(Student.getId());
    }

    List<Integer> course3 = new ArrayList<>();
    public void setCourse3(List<Integer> course3){
        course3.add(Subject.roomNumber);
        course3.add(Teacher.getId());
        course3.add(Student.getId());
    }

    List<Integer> course4 = new ArrayList<>();
    public void setCourse4(List<Integer> course3){
        course4.add(Subject.roomNumber);
        course4.add(Teacher.getId());
        course4.add(Student.getId());
    }

    List<Integer> courseList = new ArrayList<>();

    public Assignation (){}

    public List<Teacher> teacherListAssignation (){
        teachersList.add(teacher1);
        teachersList.add(teacher2);
        teachersList.add(teacher3);
        teachersList.add(teacher4);
        return teachersList;
    }

    public List<Student> studentListAssignation (){
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        studentList.add(student5);
        studentList.add(student6);
        return studentList;
    }

    public List<Subject> subjectListAssignation (){
        subjectsList.add(subject1);
        subjectsList.add(subject2);
        subjectsList.add(subject3);
        subjectsList.add(subject4);
        return subjectsList;
    }

    public void courseListAssignation(int newCourse){
        courseList.add(newCourse);
    }

    public void addStudentToList(Student newStudent){
        studentList.add(newStudent);
    }

    public void addSubjectToList (Subject newSubject){
        subjectsList.add(newSubject);
    }

    public void createCourse (int newCourse){
        courseList.add(newCourse);
    }

    public void addStudentToCourse (int newStudent){

    }
}