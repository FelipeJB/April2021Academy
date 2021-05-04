package Homework.Globant;

public class TechLead extends Role {

    public TechLead(int idRole, String roleName, double salary){
        super(idRole, roleName, salary);
    }

    public void assignation(){

        System.out.println(getIdRole() + " - " + roleName + " Lidera personas");
        System.out.println(getIdRole() + " - " + roleName + " Diseña casos de prueba");
        System.out.println(getIdRole() + " - " + roleName + " Maneja GIT \n");
    }
}
