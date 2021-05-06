package data;

public class TeachLead extends Glober{

    private String teamName;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public TeachLead(double salary, boolean isInAProject, String name, String teamName) {
        super(salary, isInAProject, name);
        this.teamName = teamName;
    }

    public double setSalary(){
        return this.salary;
    }

    public boolean setProject() {
        return this.isInAProject;
    }

}
