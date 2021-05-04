
public class TechLeadEngineer extends role {

    public TechLeadEngineer(){
        super("Tech Lead engineer", "Level 3 of engineer");
        setResponsibilities();
    }

    @Override
    public void setResponsibilities() {
        addRoleResponsibility("Advanced Knowledge in xxxxxx");
        addRoleResponsibility("Advanced Knowledge in Senior skills");
        addRoleResponsibility("knowledge in these... soft skills");

    }
}
