package data;

public class Senior extends Glober{

    private String nameTraining;

    public String getNameTraining() {
        return nameTraining;
    }

    public void setNameTraining(String nameTraining) {
        this.nameTraining = nameTraining;
    }

    public Senior(double salary, boolean isInAProject, String name, String nameTraining){
        super(salary, isInAProject, name);
        this.nameTraining = nameTraining;

    }

    public double setSalary(){
        return this.salary;
    }

    public boolean setProject() {
        return this.isInAProject;
    }
}
