package Test;

import Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        boolean exit = false;

        JuniorDev juniorDev = new JuniorDev("Juan", 4000000, "NO", "Junior Developer");
        JuniorQC juniorQC = new JuniorQC("Andrea Salazar", 3500000, "SÍ", "Junior QC");
        SeniorDev seniorDev = new SeniorDev("Pepito Pérez", 8500000, "SÍ", "Senior Dev");
        SeniorQC seniorQC = new SeniorQC("Pedro Navaja", 6500000, "NO", "Senior QC");
        ProjectManager projectManager = new ProjectManager("Michael Jackson", 12000000, "SÍ", "Project Manager");
        TAE tae = new TAE("Juan Camilo", 7000000, "SÍ", "TAE");

        while (!exit) {
        System.out.println("########## -Hola, Bienvenido a Globant- ##########" + "\n" + "#### -Este es el listado de Globers activos- #####");

        List<Glober> globers = new ArrayList<>();
        globers.add(juniorDev);
        globers.add(juniorQC);
        globers.add(seniorDev);
        globers.add(seniorQC);
        globers.add(projectManager);
        globers.add(tae);
        for (int i = 0; i < globers.size(); i++){
            System.out.println(i+1 + ". " + globers.get(i).printName());
        }
        System.out.println("7. Salir");

        System.out.println("\n Selecciona un Glober para consultar su información en detalle");



            Scanner scan = new Scanner(System.in);
            int op = scan.nextInt();

            switch (op) {
                case 1:

                    System.out.println(juniorDev.printFullName());
                    //Funciones de un Developer
                    System.out.println("Funciones de un Junior Developer: \n");
                    List<Glober> devs = new ArrayList<>();
                    devs.add(juniorDev);
                    //devs.add(seniorDev);
                    for (Glober dev : devs) {

                        System.out.println(" - " + dev.speakEnglish());
                        System.out.println(" - " + dev.getTrained());
                        System.out.println(" - " + dev.debugCode());
                        System.out.println(" - " + dev.generateScripts() + "\n");
                    }
                    break;

                case 2:

                    System.out.println(juniorQC.printFullName());
                    //Funciones de un Junior Engineer (Dev or QC)
                    System.out.println("Funciones de un QC Analyst / TAE : \n");
                    List<QualityResponsibilities> qcs = new ArrayList<>();

                    qcs.add(juniorQC);
                    qcs.add(seniorQC);
                    qcs.add(tae);


                    for (QualityResponsibilities qc : qcs) {

                        System.out.println(" - " + qc.reportBugs());
                        System.out.println(" - " + qc.runTests());
                        System.out.println("\n");
                    }

                    System.out.println("\nFunciones de un Junior QC Analyst: \n");
                    List<Glober> juniors = new ArrayList<>();
                    juniors.add(juniorQC);
                    //juniors.add(juniorDev);

                    for (Glober junior : juniors) {
                        System.out.println(" - " + junior.speakEnglish());
                        System.out.println(" - " + junior.getTrained() + "\n");
                    }
                    break;

                case 3:

                    System.out.println(seniorDev.printFullName());

                    System.out.println("Funciones de un Senior Developer or Tech Lead: \n");
                    List<LeadResponsibilities> leads = new ArrayList<>();

                    leads.add(seniorDev);
                    //leads.add(seniorQC);
                    //leads.add(projectManager);
                    //leads.add(tae);

                    for (LeadResponsibilities lead : leads) {
                        System.out.println(" - " + lead.leadPeople());
                        System.out.println(" - " + lead.assessResults() + "\n");
                    }
                    break;

                case 4:

                    System.out.println(seniorQC.printFullName());

                    System.out.println("Funciones de un Senior QC Analyst: \n");
                    List<Glober> seniors = new ArrayList<>();
                    //seniors.add(seniorDev);
                    seniors.add(seniorQC);
                    //seniors.add(projectManager);
                    //seniors.add(tae);

                    for (Glober senior : seniors) {
                        System.out.println(" - " + senior.speakEnglish());
                        System.out.println(" - " + senior.getTrained());
                        System.out.println("\n");
                    }
                    System.out.println(" - " + seniorQC.reportBugs());
                    System.out.println(" - " + seniorQC.runTests() + "\n");
                    break;

                case 5:
                    System.out.println(projectManager.printFullName());

                    System.out.println("Funciones de un Project Manager: \n");
                    List<Glober> pms = new ArrayList<>();
                    pms.add(projectManager);

                    for (Glober pm : pms) {
                        System.out.println(" - " + pm.speakEnglish());
                        System.out.println(" - " + pm.getTrained());
                        System.out.println("\n");
                    }

                    List<LeadResponsibilities> leaders = new ArrayList<>();
                    leaders.add(projectManager);

                    for (int i = 0; i < pms.size(); i++) {
                        System.out.println(" - " + leaders.get(i).leadPeople());
                        System.out.println(" - " + leaders.get(i).assessResults() + "\n");
                    }
                    break;

                case 6:
                    System.out.println(tae.printFullName());

                    System.out.println("Funciones de un TAE: \n");
                    List<Glober> automation = new ArrayList<>();
                    //seniors.add(seniorDev);
                    //seniors.add(seniorQC);
                    //seniors.add(projectManager);
                    automation.add(tae);

                    for (Glober glober : automation) {
                        System.out.println(" - " + glober.speakEnglish());
                        System.out.println(" - " + glober.getTrained());
                    }
                    List<LeadResponsibilities> taes = new ArrayList<>();

                    //leads.add(seniorDev);
                    //leads.add(seniorQC);
                    //leads.add(projectManager);
                    taes.add(tae);

                    for (LeadResponsibilities leadResponsibilities : taes) {
                        System.out.println(" - " + leadResponsibilities.leadPeople());
                        System.out.println(" - " + leadResponsibilities.assessResults());
                    }
                    System.out.println("\n Adicional, un TAE está en capacidad de: ");
                    System.out.println(" - " + tae.debugCode());
                    System.out.println(" - " + tae.generateScripts() + "\n");

                    break;

                case 7:
                    exit = true;
                    break;
            }
        }







/*

*/
    }

}
