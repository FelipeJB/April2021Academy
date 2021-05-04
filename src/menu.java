import java.util.ArrayList;

public class menu {


    public static void main (String[] args){
        //I create an instance of a glober sending the salary, if has or not a project and the role
        glober glober1= new glober(Double.parseDouble("3000"), true, "Junior");

        //I create a list for the glober responsibilities
        ArrayList<String> responsibilitiesGlober= glober1.getResponsibilities();

        for (int i=0; i <= responsibilitiesGlober.size()-1; i++){
            System.out.println(responsibilitiesGlober.get(i));
        }


    }

}
