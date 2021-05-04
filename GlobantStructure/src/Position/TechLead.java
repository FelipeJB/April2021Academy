package Position;

import Assignment.Assignation;

public class TechLead extends Rol implements Assignation {

    private String name;

    public TechLead(String name, float salary, boolean onProject){
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
        System.out.println("Report to a Project Manager, monitor compliance, perform quality control");
    }

    @Override
    public void role() {
        System.out.println("Tech Lead");
    }
}
