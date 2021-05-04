package Position;

import Assignment.Assignation;

public class JuniorEngineer extends Rol implements Assignation {

    private String name;

    public JuniorEngineer(String name, float salary, boolean onProject){
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
        System.out.println("Report to a Senior Engineer, Provide Engineer Support, technical and creative solutions");
    }

    @Override
    public void role() {
        System.out.println("Junior Engineer");
    }
}
