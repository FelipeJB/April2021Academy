package Data;

import java.util.ArrayList;
import java.util.List;

public class Junior  extends Position{

    private String juniorType;

    public Junior(String pName, String pStudioName, int pSalary, String pIsInAProject, String type) {
        super(pName, pStudioName, pSalary, pIsInAProject);
        this.juniorType = type;
    }

    public String getJuniorType() {
        return juniorType;
    }

    public void setJuniorType(String juniorType) {
        this.juniorType = juniorType;
    }

    public void executeTask(){
        System.out.println("Tarea Ejecutada");
    }

    @Override
    public void getResponsabilities(String pStudioName) {
        if (pStudioName.equals("Scalable Platforms")){
            System.out.println( "Revisar PR");
        } else if (pStudioName.equals("Product Studio")){
            System.out.println( "Revisar User Stories");
        } else if (pStudioName.equals("UI Engineering")){
        System.out.println( "Diseño de la UI");
        }else if (pStudioName.equals("Quality Engineering")) {
            System.out.println("Diseñar test cases");
        }
    }
}
