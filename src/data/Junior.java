package data;

public class Junior extends Glober {

    private String nameAcademy;

    public String getNameAcademy() {
        return nameAcademy;
    }

    public void setNameAcademy(String nameAcademy) {
        this.nameAcademy = nameAcademy;
    }

    public Junior(double salary, boolean isInAProject, String name, String nameAcademy) {
        super(salary, isInAProject, name);
        this.nameAcademy = nameAcademy;
    }

    @Override
    public double setSalary() {
        return this.salary;
    }

    @Override
    public boolean setProject() {
        return this.isInAProject;
    }
}
