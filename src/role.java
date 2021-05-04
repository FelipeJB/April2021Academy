import java.util.ArrayList;

public abstract class role {
    private String roleDescription;
    private String roleName;
    private ArrayList<String> roleResponsibilities = new ArrayList();


    public role (String iroleName, String iroleDescription){
        this.roleDescription=iroleDescription;
        this.roleName=iroleName;
        roleResponsibilities.add("To be responsible");
        roleResponsibilities.add("Punctuality");
        roleResponsibilities.add("English skills");
        roleResponsibilities.add("Experienced");
    }

    public void setRoleResponsibilities(ArrayList<String> roleResponsibilities) {
        this.roleResponsibilities = roleResponsibilities;
    }


    public void role (){
        this.roleDescription="";
        this.roleName="";
    }

    public void setRoleDescription(String inroleDescription){
         this.roleDescription=inroleDescription;
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
