package Data;

// Super class
public abstract class Role {

    //Generic attributes
    private float salary;
    private String project;
    private String seniority;
    private String roleName;

    // Role constructor method
    public Role (float salary,String project,String seniority,String roleName){
        this.salary = salary;
        this.project = project;
        this.seniority = seniority;
        this.roleName = roleName;
    }

    // Abstract method
    public abstract String getResponsibilities();

    //Get methods
    public float getSalary() {
        return salary;
    }
    public String getProject() {
        return project;
    }
    public String getSeniority() {
        return seniority;
    }
    public String getRoleName() {
        return roleName;
    }
}
