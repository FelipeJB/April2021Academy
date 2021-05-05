package data;

public class SeniorEngineer extends Role{
    public SeniorEngineer() {
        super("Senior engineer","Level 2 of engineer");
        setResponsibilities();
    }

    @Override
    public void setResponsibilities() {
        addRoleResponsibility("Knowledge in Java and PHP");
        addRoleResponsibility("Expert defining Projects Architecture");
        addRoleResponsibility("Expert Programing in Java and PHP");

    }
}
