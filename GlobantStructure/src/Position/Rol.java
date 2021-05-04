package Position;

import Assignment.Assignation;

public abstract class Rol implements Assignation {

    protected float salary;
    protected boolean onProject;

    public Rol (float salary, boolean onProject){
        this.salary = salary;
        this.onProject = onProject;
    }

    public abstract String getName();

    public float getSalary(){
        return this.salary;
    }
    public boolean getOnProject(){
        return this.onProject;
    }

}
