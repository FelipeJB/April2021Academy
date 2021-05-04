package com.Runner;

import Data.*;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Globant globant = new Globant();
        initializeGlobant(globant);
        System.out.println("**********************GLOBANT*************************");
        boolean exit = false;

        do {
            System.out.println("Ingrese el número de la opcion que quiere realizar");
            System.out.println("1. Agregar una persona a una nueva Posicion");
            System.out.println("2. Listar las Empleados");
            System.out.println("3. Salir");
            System.out.println("**************************************************");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            scan = new Scanner(System.in);
            System.out.println("**************************************************");

            switch (option) {
                case 1:
                        System.out.println("Por favor digite el Nombre de la nueva persona ");
                        String name = scan.nextLine();
                        scan = new Scanner(System.in);
                        System.out.println("Por favor digite el Nombre del estudio al que pertenece: " +
                                "Quality Engineering/UI Engineering/Product Studio/Scalable Platforms ");
                        String studioName = scan.nextLine();
                        scan = new Scanner(System.in);
                        System.out.println("Por favor digite el salario ");
                        int salary = Integer.parseInt(scan.nextLine());
                        scan = new Scanner(System.in);
                        System.out.println("Esta en un proyecto?: Por favor digite Si/No");
                        String isInAProject = scan.nextLine();
                        scan = new Scanner(System.in);
                        System.out.println("Por favor digite el Tipo de Posicion ");
                        String type = scan.nextLine();
                            if (type.equals("Junior")) {
                                Junior j = new Junior(name, studioName, salary, isInAProject, type);
                                globant.addPosition(j);
                            } else if (type.equals("SemiSenior")) {
                                SemiSenior s = new SemiSenior(name, studioName, salary, isInAProject, type);
                                globant.addPosition(s);
                            } else if (type.equals("Senior")) {
                                Senior se = new Senior(name, studioName, salary, isInAProject, type);
                                globant.addPosition(se);
                            } else if (type.equals("TechnicalLeader")) {
                                TechnicalLeader tl = new TechnicalLeader(name, studioName, salary, isInAProject);
                                globant.addPosition(tl);
                            }
                            break;
                case 2:
                    globant.displayPosition();

                    break;
                default:
                    exit = true;
                    break;
            }
        } while (exit == false);
    }

    public static void initializeGlobant(Globant globant){
        Junior j = new Junior("Maria", "Quality Engineering", 20000, "Si", "Junior Advanced");
        SemiSenior s = new SemiSenior("Carlos", "UI Engineering", 10000, "No", "Semi Senior");
        Senior se = new Senior("Jose", "Product Studio", 30000, "No", "Senior Level 1");
        TechnicalLeader tl = new TechnicalLeader("Martin", "Scalable Platforms", 50000, "Si");

        globant.addPosition(j);
        globant.addPosition(s);
        globant.addPosition(se);
        globant.addPosition(tl);
    }
}
