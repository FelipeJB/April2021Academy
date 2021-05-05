package data;
import java.util.ArrayList;

public abstract class Role {
    private String roleDescription;
    private String roleName;
    private ArrayList<String> roleResponsibilities = new ArrayList();


    public Role (String aRoleName, String aRoleDescription){
        this.roleDescription = aRoleDescription;
        this.roleName = aRoleName;
        System.out.println("-----------------------------");
        System.out.println("THESE ARE THE ROLE LIST");
        System.out.println("-----------------------------");
        roleResponsibilities.add("Lead of Projects");
        roleResponsibilities.add("PHP Developer");
        roleResponsibilities.add("Project Manager");
        roleResponsibilities.add("Tech Lead");
        System.out.println("-----------------------------");
    }

    public void setRoleResponsibilities(ArrayList<String> roleResponsibilities) {
        this.roleResponsibilities = roleResponsibilities;
    }


    public void role (){
        this.roleDescription="";
        this.roleName="";
    }

    public void setRoleDescription(String inroleDescription){
        this.roleDescription = inroleDescription;
    }
    public String getRoleDescription(){
        return this.roleDescription;
    }
    public String getRoleName(){
        return roleName;
    }
    public void setRolName(String iroleName){
        this.roleName=iroleName;
    }

    public abstract void setResponsibilities ();

    public void addRoleResponsibility(String iResponsibility){
        this.roleResponsibilities.add(iResponsibility);
    }
    public ArrayList<String> getRoleResponsibilities(){
        return this.roleResponsibilities;
    }

}
