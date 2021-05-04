import java.util.ArrayList;

public class glober {
    private boolean hasProject;
    private Double salary;
    private String strRole;
    private role objRole;

    public  glober (Double isalary, boolean ihasProject, String istrRole){
        this.salary = isalary;
        this.hasProject = ihasProject;
        this.strRole = istrRole;
        switch (strRole) {
            case "Junior":
                JuniorEngineer objJuniorEngineer = new JuniorEngineer();
                objRole = objJuniorEngineer;
                break;
            case "Senior":
                SeniorEngineer objSeniorEngineer = new SeniorEngineer();
                objRole = objSeniorEngineer;
                break;
            case "Lead":
                TechLeadEngineer objLeadEngineer = new TechLeadEngineer();
                objRole = objLeadEngineer;
                break;
            default:

        }

    }
    public ArrayList<String> getResponsibilities(){
        return this.objRole.getRoleResponsibilities();
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
