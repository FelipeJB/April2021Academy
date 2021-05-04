package src.Runner;
import src.Data.JuniorE;
import src.Data.SeniorE;
import src.Data.TechL;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        JuniorE juniore = new JuniorE();
        SeniorE seniorE = new SeniorE();
        TechL techL = new TechL();


        Scanner scan = new Scanner(System.in);
        boolean exit = false;


        do {
            System.out.println(" What list do you want to see:");
            System.out.println("1 - Responsibilities for JuniorEngineer");
            System.out.println("2 - Responsibilities for SeniorEngineer");
            System.out.println("3 - Responsibilities for TechLead");
            System.out.println("4 - exit");
            int opt = scan.nextInt();




            switch (opt) {
                    case 1:
                        juniore.manualTesting();
                        juniore.setTestingGoals();
                        juniore.coding();
                        juniore.regressionTesting();
                        juniore.establishAClearWorkflow();
                        juniore.debugging();
                        break;
                    case 2:
                        seniorE.manualTesting();
                        seniorE.setTestingGoals();
                        seniorE.coding();
                        seniorE.regressionTesting();
                        seniorE.establishAClearWorkflow();
                        seniorE.debugging();
                        break;
                    case 3:
                        techL.manualTesting();
                        techL.setTestingGoals();
                        techL.coding();
                        techL.regressionTesting();
                        techL.establishAClearWorkflow();
                        techL.debugging();
                        break;
                     case 4:
                         exit = true;
                         break;

                    default:
                        System.out.println("Invalid option");
                        break;
                }




        } while (exit == false);


    }
}









