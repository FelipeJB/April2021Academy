package Data;

public abstract class Position extends Globant {

    private String name;
    private String studioName;
    private int salary;
    private String isInAProject;

    public Position(String pName, String pStudioName, int pSalary, String pIsInAProject){
        this.name = pName;
        this.studioName = pStudioName;
        this.salary = pSalary;
        this.isInAProject = pIsInAProject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String isInAProject() {
        return isInAProject;
    }

    public void setInAProject(String inAProject) {
        isInAProject = inAProject;
    }

    public abstract void getResponsabilities(String studioName);

}
