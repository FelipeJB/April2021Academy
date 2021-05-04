package Data;

//Subclass Qc that extends from Role(Super class)
public class Qc extends Role {
    //Own attribute
    private String bugReportingTool;

    // QC constructor method
    public Qc(float salary, String project, String seniority,String roleName,String bugReportingTool) {
        super(salary, project, seniority, roleName);
        this.bugReportingTool=bugReportingTool;
    }
    //Method inherited from Role class
    public String getResponsibilities(){
        return "Create test designs, execute test cases, report and track bugs in "+bugReportingTool+", create QC reports";
    }
}
