package Test;

import Data.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        List globerList = new ArrayList<Glober>();
        List projectList = new ArrayList<Project>();


        Glober glober1 = new Glober("Carlos dev",5000000,100,new DevJavaJunior());
        Glober glober2 = new Glober("Felipe dev",5000000,150,new DevJavaSenior());
        Glober glober3 = new Glober("Yefry qa",4500000,200,new QualityControlSenior());
        Glober glober4 = new Glober("Ronal qa",4500000,300,new QualityControlJunior());
        Glober glober5 = new Glober("Pedro pm",4500000,400,new ProjectManagement());
        globerList.add(glober1);
        globerList.add(glober2);
        globerList.add(glober3);
        globerList.add(glober4);
        globerList.add(glober5);

        Project wmProject = new WarnerMediaProject();
        Project disneyProject = new DisneyProject();
        projectList.add(wmProject);
        projectList.add(disneyProject);


        /*System.out.println(a);


    Project b = new WarnerMediaProject();
    b.newMembers(a);
        System.out.println(b.getDescription());
    b.printProjectMembers();*/



        boolean exit = false;
        boolean exit2 = false;
        String reader;

        do{
            System.out.println("Bienvenido Glober!!. que vamos a hacer hoy");
            System.out.println("1. Adicionar Nuevo Glober");
            System.out.println("2. Consultar Globers");
            System.out.println("3. Consultar Proyectos");
            System.out.println("4. Adicionar Glober a Poryecto" );
            System.out.println("5. Salir");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();
            //Product newP;

            switch (option){
                case 1:
                    System.out.println("============Nuevo Glober============");
                    System.out.println("Nombre del Glober:");
                    String name = scan.next();
                    System.out.println("Salario del Glober:");
                    int salary = scan.nextInt();
                    int id = globerList.size();
                    System.out.println("Rol a desempeñar: ");
                    do {
                        System.out.println("1. Project Management");
                        System.out.println("2. Developer Java - Junior");
                        System.out.println("3. Developer Java - Senior");
                        System.out.println("4. Quality Control - Junior");
                        System.out.println("5. Quality Control - Senior");
                        option = scan.nextInt();
                        switch (option){
                            case 1:
                                Glober newgloberPM = new Glober(name,salary,id,new ProjectManagement());
                                globerList.add(newgloberPM);
                                System.out.println("Nuevo Ingreso: "+newgloberPM);
                                exit2 = true;
                                break;
                            case 2:
                                Glober newgloberDJ = new Glober(name,salary,id,new DevJavaJunior());
                                globerList.add(newgloberDJ);
                                System.out.println("Nuevo Ingreso: "+newgloberDJ);
                                exit2 = true;
                                break;
                            case 3:
                                Glober newgloberDS = new Glober(name,salary,id,new DevJavaSenior());
                                globerList.add(newgloberDS);
                                System.out.println("Nuevo Ingreso: "+newgloberDS);
                                exit2 = true;
                                break;
                            case 4:
                                Glober newgloberQJ = new Glober(name,salary,id,new QualityControlJunior());
                                globerList.add(newgloberQJ);
                                System.out.println("Nuevo Ingreso: "+newgloberQJ);
                                exit2 = true;
                                break;
                            case 5:
                                Glober newgloberQS = new Glober(name,salary,id,new QualityControlSenior());
                                globerList.add(newgloberQS);
                                System.out.println("Nuevo Ingreso: "+newgloberQS);
                                exit2 = true;
                                break;
                        }
                    } while (exit2 == false);
                    break;
                case 2:
                    System.out.println("===========Lista Globers============");
                    printList(globerList);
                    break;

                case 3:
                    System.out.println("===========Lista de Proyectos============");
                    printList(projectList);
                    break;

                case 4:
                    System.out.println("===========Adicionar Glober al proyecto==============");
                    System.out.println("Que proyecto vamos a usar?");
                    printList(projectList);
                    int projectSelected = scan.nextInt();
                    System.out.println("Que glober adicionamos?");
                    printList(globerList);
                    int gSelected = scan.nextInt();
                    Project a = (Project) projectList.get(projectSelected);
                    Glober b = (Glober) globerList.get(gSelected);
                    a.newMembers(b);
                    System.out.println("Glober adicionado!!");
                    System.out.println(projectList.get(projectSelected));
                    break;
                case 5:
                    exit = true;
                    break;

                default:
                    exit = true;
                    break;
            }

        } while (exit == false);

    }

    public static void printList(List list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(i + "- "+list.get(i));
        }
    }


}
