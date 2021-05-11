package Data;

public abstract class Teacher {
    private String teacherName;
    private Double baseSalary = 7.0;
    private Double teacherSalary;

    public Double getTeacherSalary() {
        return teacherSalary;
    }

    public void setTeacherSalary(Double teacherSalary) {
        this.teacherSalary = teacherSalary;
    }


    public abstract void calculateSalary ();

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }


}
