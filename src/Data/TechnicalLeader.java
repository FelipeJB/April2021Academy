package Data;

public class TechnicalLeader extends Position {

    public TechnicalLeader(String pName, String pStudioName, int pSalary, String pIsInAProject) {
        super(pName, pStudioName, pSalary, pIsInAProject);
    }

    @Override
    public void getResponsabilities(String pStudioName) {
            if (pStudioName.equals("Scalable Platforms")) {
                System.out.println("Diseñar arquitectura proyecto");
            } else if (pStudioName.equals("Product Studio")) {
                System.out.println("Administrar Backlog y US");
            } else if (pStudioName.equals("UI Engineering")) {
                System.out.println("Diseñar UI y organizar equipo");
            } else if (pStudioName.equals("Quality Engineering")) {
                System.out.println("Determinar cobertura de pruebas");
            }
        }


    public void delegateTask(){
        System.out.println("Proyecto Organizado y Tareas Delegadas");
    }
}
