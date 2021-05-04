package Homework.Globant;

import Homework.MenuRestaurant.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Role> roles = new ArrayList<Role>();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        initializeRole(roles);

        while (!exit) {
            mainMenu();
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    showRole(roles);
                    break;
                case 2:
                    printAssignation(roles);
                    break;
                default:
                    exit = true;
                    break;

            }
        }
    }


    public static void initializeRole (ArrayList<Role> roles){

        JuniorEngineer j = new JuniorEngineer(0, "Junior Engineer", 1000000);
        SeniorEngineer s = new SeniorEngineer(1, "Senior Engineer", 2000000);
        TechLead t = new TechLead(2, "Teach lead", 3000000);

        roles.add(j);
        roles.add(s);
        roles.add(t);
    }

    public static void showRole(ArrayList<Role> roles){

        for (int i=0; i < roles.size(); i++){
            System.out.println(roles.get(i).getIdRole() + "-" + roles.get(i).roleName + "-" + roles.get(i).salary);
        }
    }

    public static void printAssignation(ArrayList<Role> roles){

        System.out.println("Las asignaciones para los roles son: \n");
        for(int i = 0; i < roles.size(); i++){
            roles.get(i).assignation();
        }
    }

    public static void mainMenu(){
        System.out.println("*****Menu Principal***** \n");
        System.out.println("1. Mostrar roles");
        System.out.println("2. Mostrar asignaciones");
        System.out.println("3. Salir");
    }
}
