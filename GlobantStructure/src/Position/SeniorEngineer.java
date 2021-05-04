package Position;

import Assignment.Assignation;

public class SeniorEngineer extends Rol implements Assignation {

    private String name;

    public SeniorEngineer(String name, float salary, boolean onProject){
        super(salary, onProject);
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public float getSalary(){
        return salary;
    }

    public boolean getOnProject(){
        return onProject;
    }

    @Override
    public void duty() {
        System.out.println("Report to a Tech Leader, Coordinate team members, Assign responsibilities");
    }

    @Override
    public void role() {
        System.out.println("Senior Engineer");
    }
}
