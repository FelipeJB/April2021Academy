package Runner;


import java.util.ArrayList;
import java.util.Scanner;

import Data.*;

public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Glober> globers = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        boolean exit = false;
        
        do {
        	System.out.println("Welcome to Globant!!!");
        	System.out.println("---------------------");
        	System.out.println("Select one of the options below:");
        	System.out.println("1. Add a glober");
        	System.out.println("2. Show the globers' assignments");
        	System.out.println("3. Show the globers' salary");
        	System.out.println("4. Show glober information");
        	System.out.println("6. Exit");
        	int option=scan.nextInt();
        	switch (option) {
			case 1: {
				System.out.println("Enter the glober's name: ");
				String name1 =scan.next();
				
				System.out.println("Enter the globers salary");
				float salary1=scan.nextFloat();
				
				System.out.println("Enter glober's position: Select an option");
				System.out.println("1. Junior");
				System.out.println("2. Senior");
				System.out.println("3. Techlead");
				int position =scan.nextInt();
				if(position > 3) {
					System.out.println("Ingrese una opcion valida");
					break;
				}else {
					if(position == 1) {
						Glober junior = new Junior(salary1, name1);
						System.out.println("Does the new glober have an assignment? (Y/N)");
						String assing =scan.next();
						junior.setProject(assing);
						globers.add(junior);
					}else if (position == 2) {
						Glober senior = new Senior(salary1, name1);
						System.out.println("Does the new glober have an assignment? (Y/N)");
						String assing =scan.next();
						senior.setProject(assing);
						globers.add(senior);
					}
					else if (position == 3) {
						Glober techlead = new TechLead(salary1, name1);
						System.out.println("Does the new glober have an assignment? (Y/N)");
						String assing =scan.next();
						techlead.setProject(assing);
						globers.add(techlead);
					}
					
				}
				
				
				
				break;
			}
			case 2: {
				for (int i = 0; i < globers.size(); i++) {
					System.out.println(globers.get(i).getFullName()+"     "+globers.get(i).getAssignment());					
				}
				break;
			}
			case 3: {
				for (int i = 0; i < globers.size(); i++) {
					System.out.println(globers.get(i).getFullName()+"     $"+globers.get(i).getSalary());					
				}
				break;
			}
			case 4: {
				System.out.println("Name               Job description");
				System.out.println("Select the glober");
				for (int i = 0; i < globers.size(); i++) {
					System.out.println(i+1+". "+globers.get(i).getFullName());					
				}
				int j =scan.nextInt();
				System.out.println("Name: "+globers.get(j-1).getFullName());
				globers.get(j-1).setResponsabilities();					
				
				break;
			}
			 default:
	                exit = true;
	                System.out.println("Gracias por utilizar nuestro portal! Vuelva pronto\n");
	                break;
	         }	
        	
        	
        	
        }while (exit == false);
	}

}
