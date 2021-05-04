package Data;

//Subclass ProjectManager that extends from Role(Super class)
public class ProjectManager extends Role {

    // ProjectManager constructor method
    public ProjectManager(float salary, String project, String seniority,String roleName) {
        super(salary, project, seniority, roleName);
    }
    //Method inherited from Role class
    public String getResponsibilities(){
        return "Implement methodologies, lead people, solve blockers, lead the daily meetings";
    }
    //getProject method
    @Override
    public String getProject() {
        return "Has many projects in Disney";
    }
}
