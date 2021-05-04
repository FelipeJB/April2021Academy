package Data;

public class Senior extends Position {

    private String seniorType;

    public Senior(String pName, String pStudioName, int pSalary, String pIsInAProject, String senior) {
        super(pName, pStudioName, pSalary, pIsInAProject);
        this.seniorType = senior;
    }

    public String getSeniorType() {
        return seniorType;
    }

    public void setSeniorType(String seniorType) {
        this.seniorType = seniorType;
    }

    @Override
    public void getResponsabilities(String pStudioName) {
        if (pStudioName.equals("Scalable Platforms")) {
            System.out.println("Desarrollar features");
        } else if (pStudioName.equals("Product Studio")) {
            System.out.println("Crear Backlog");
        } else if (pStudioName.equals("UI Engineering")) {
            System.out.println("Crear UI");
        } else if (pStudioName.equals("Quality Engineering")) {
            System.out.println("DIseñar plan de pruebas y ejecutar");
        }
    }

    public void beMentor(){
        System.out.println("Tareas de mentor completadas");
    }

}
