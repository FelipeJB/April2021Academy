

public class SeniorEngineer extends role {

    public SeniorEngineer() {
        super("Senior engineer","Level 2 of engineer");
        setResponsibilities();
    }

    @Override
    public void setResponsibilities() {
        addRoleResponsibility("Knowledge in xxxxxx");
        addRoleResponsibility("Knowledge in Senior skills");
        addRoleResponsibility("knowledge in these... soft skills");

    }
}
