package Data;

public class Subject {
    private String name;
    private String classroom;
    private int teacherId;
    private int studentId1;
    private int studentId2;

    public Subject(String name, String classroom, int teacherId, int studentId1, int studentId2) {
        this.name=name;
        this.classroom=classroom;
        this.teacherId=teacherId;
        this.studentId1=studentId1;
        this.studentId2=studentId2;
    }

    public String getName() { return name; }

    public String getClassroom() { return classroom; }

    public int getTeacherId() { return teacherId; }

    public int getStudentId1() { return studentId1; }

    public int getStudentId2() { return studentId2; }


}
