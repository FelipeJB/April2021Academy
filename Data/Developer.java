package Data;

//Subclass Developer that extends from Role(Super class)
public class Developer extends Role {
    //Own attribute
    private String programmingLanguage;

    // Developer constructor method
    public Developer(float salary, String project, String seniority,String roleName,String programmingLanguage) {
        super(salary, project, seniority, roleName);
        this.programmingLanguage=programmingLanguage;
    }
    //Method inherited from Role class
    public String getResponsibilities(){
        return "Design, implement and support solutions for application development, fix bugs,"+" Programming in "+programmingLanguage;
    }
}
