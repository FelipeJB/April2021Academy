package Homework.Globant;

public abstract class Role {

    private int idRole;
    protected String roleName;
    protected double salary;

    public Role (int idRole, String roleName, double salary){
        this.idRole = idRole;
        this.roleName = roleName;
        this.salary = salary;
    }

    public int getIdRole() {
        return idRole;
    }

    public abstract void assignation();
}
