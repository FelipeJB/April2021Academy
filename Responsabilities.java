package GlobantStructure;

public class Responsabilities extends Role{

    boolean project = true;

    public Responsabilities(boolean project, String role) {
        super(role);
        this.project = project;
    }

    public void Role() {
        System.out.println("Each role has specific activities within the POD");
    }

    public void Duties() {
        if (project) {
            System.out.println("The person is in a project, therefore, he/she has specific duties");
        } else {
            System.out.println("The person is in Globant pool");
        }
    }


           //System.out.println("Specific tasks are directly related to project assignation");
}