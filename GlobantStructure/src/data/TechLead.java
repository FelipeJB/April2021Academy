package data;

public class TechLead extends Role{
    public TechLead(){
        super("Tech Lead", "Advanced Level developing Software");
        setResponsibilities();
    }

    @Override
    public void setResponsibilities() {
        System.out.println(" ");
        addRoleResponsibility("Good knowledge defining Projects Architecture");
        addRoleResponsibility("Advanced Knowledge in PHP and Java programing");
        addRoleResponsibility("Good knowledge in Jira ");
        addRoleResponsibility("Good experience Solving problems");

    }

}
