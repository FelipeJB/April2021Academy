package data;

public abstract class Glober {
    protected double salary;
    protected boolean isInAProject;
    protected String name;

    public Glober() {
    }

    public Glober(double salary, boolean isInAProject, String name) {
        this.salary = salary;
        this.isInAProject = isInAProject;
        this.name = name;
    }

    public abstract double setSalary();

    public abstract boolean setProject();
}
