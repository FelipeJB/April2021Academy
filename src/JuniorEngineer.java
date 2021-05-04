

public class JuniorEngineer extends role {

    public JuniorEngineer(){
        super("Junior engineer", "Level 1 of engineer");
        setResponsibilities();
    }

    @Override
    public void setResponsibilities() {

        addRoleResponsibility("Basic knowledge in any programming language");
        addRoleResponsibility("Knowledge in specific tools for each speciality");
        addRoleResponsibility("Basic knowledge in any programming language");

    }


}
