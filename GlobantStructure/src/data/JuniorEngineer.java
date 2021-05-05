package data;

public class JuniorEngineer extends Role{
    public JuniorEngineer(){
        super("Junior engineer", "Level 1 of engineer");
        setResponsibilities();
    }

    @Override
    public void setResponsibilities() {

        addRoleResponsibility("Execute Test Cases");
        addRoleResponsibility("Define Test cases for unit test");
        addRoleResponsibility("Advanced knowledge in Java Programing");

    }

}
