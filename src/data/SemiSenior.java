package data;

public class SemiSenior extends Glober {

    private String nameMentee;

    public String getNameMentee() {
        return nameMentee;
    }

    public void setNameMentee(String nameMentee) {
        this.nameMentee = nameMentee;
    }

    public SemiSenior(double salary, boolean isInAProject, String name, String nameMentee) {
        super(salary, isInAProject, name);
        this.nameMentee = nameMentee;
    }

    public double setSalary(){
        return this.salary;
    }

    public boolean setProject() {
        return this.isInAProject;
    }
}
