package Homework.Globant;

public class JuniorEngineer extends Role{

    public JuniorEngineer(int idRole, String roleName, double salary){
        super(idRole, roleName, salary);
    }

    public void assignation(){

        System.out.println(getIdRole() + " - " + roleName + " No lidera personas");
        System.out.println(getIdRole() + " - " + roleName + " Diseña casos de prueba");
        System.out.println(getIdRole() + " - " + roleName + " No maneja GIT \n");
    }

}
