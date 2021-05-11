package Data;

public class Student {
    private static int idConsecutive = 1;
    private int studentId;
    private String studentName;
    private int studentAge;

    public Student (String istudentName, int istudentAge){
        studentName = istudentName;
        studentAge = istudentAge;
        studentId = idConsecutive;
        idConsecutive += 1;

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }




}
