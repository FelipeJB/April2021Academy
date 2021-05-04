package Data;

public class SemiSenior extends Position {

    private String semiSeniorType;

    public SemiSenior(String pName, String pStudioName, int pSalary, String pIsInAProject, String type){
        super(pName, pStudioName, pSalary, pIsInAProject);
        this.semiSeniorType = type;
    }

    @Override
    public void getResponsabilities(String pStudioName) {
        if (pStudioName.equals("Scalable Platforms")){
            System.out.println( "Solucionar Bugs");
        } else if (pStudioName.equals("Product Studio")){
            System.out.println( "Crear US");
        } else if (pStudioName.equals("UI Engineering")){
            System.out.println( "Crear componentes");
        }else if (pStudioName.equals("Quality Engineering")) {
            System.out.println("Ejecutar test cases");
        }
    }

    public void learnFromSenior(){
        System.out.println("Leccion Aprendida");
    }
}
