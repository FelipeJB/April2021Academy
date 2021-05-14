package Data;

public class Student extends Person{

    private int id;
    private static int contId = 1;
    private int semester;
    private String career;
    private int age;

    public Student(String pName,  int pSemester, String pCareer, int pAge){
        super(pName);
        this.id = contId++;
        this.semester = pSemester;
        this.career = pCareer;
        this.age = pAge;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getContId() {
        return contId;
    }

    public static void setContId(int contId) {
        Student.contId = contId;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}