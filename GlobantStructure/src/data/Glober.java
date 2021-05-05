package data;

import java.util.ArrayList;

public class Glober {
    private boolean hasProject;
    private Double salary;
    private String Role;
    private Role theRole;

    public  Glober (Double isalary, boolean ihasProject, String istrRole){
        this.salary = isalary;
        this.hasProject = ihasProject;
        this.Role = istrRole;
        switch (Role) {
            case "Junior":
                JuniorEngineer objJuniorEngineer = new JuniorEngineer();
                theRole = objJuniorEngineer;
                break;
            case "Senior":
                SeniorEngineer objSeniorEngineer = new SeniorEngineer();
                theRole = objSeniorEngineer;
                break;
            case "Lead":
                TechLead objLeadEngineer = new TechLead();
                theRole = objLeadEngineer;
                break;
            default:

        }

    }
    public ArrayList<String> getResponsibilities(){
        return this.theRole.getRoleResponsibilities();
    }


    public Double getRoleSalary(){
        return salary;
    }
    public void setRoleSalary(double iSalary){
        this.salary=iSalary;
    }

    public void setHasProject(boolean ihasProject) {
        this.hasProject = ihasProject;
    }


}
