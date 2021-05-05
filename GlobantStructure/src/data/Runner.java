package data;
import java.util.ArrayList;


public class Runner {
    public static void main (String[] args){
        //Create a glober instance and send the salary, if has a project and the role
        Glober glober1= new Glober(Double.parseDouble("5000"), true, "Senior");
        Glober glober2= new Glober(Double.parseDouble("8000"), true, "Tech Lead");
        Glober glober3= new Glober(Double.parseDouble("4000"), true, "Junior Engineer");

        //I create a list for the glober responsibilities
        ArrayList<String> responsibilitiesGlober= glober1.getResponsibilities();

        for (int i=0; i <= responsibilitiesGlober.size()-1; i++){
            System.out.println(responsibilitiesGlober.get(i));
        }


    }
}
