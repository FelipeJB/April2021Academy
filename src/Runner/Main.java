package Runner;

import java.util.Scanner;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.println("//////////////////////////////////////////////");
		System.out.println("/                                            /");
		System.out.println("/    Bienvenido al portal de la Universidad  /");
		System.out.println("/                                            /");
		System.out.println("//////////////////////////////////////////////");
		System.out.println("");
		
		
		boolean exit = false;

        do{
            System.out.println("Ingrese el número de la opción que desea realizar");
            System.out.println("1. Mostrar a todos los profesores con sus datos");
            System.out.println("2. Mostrar todas las clases");
            System.out.println("3. Crear un nuevo estudiante");
            System.out.println("4. Crear una nueva clase");
            System.out.println("4. Mostrar clases de un estudiante");
    		System.out.println("4. Salir");
            
            int option = scan.nextInt();
            
            switch (option){
            case 1:
                
                break;
            case 2:
            	
                break;
            case 3:
               
                break;
            default:
                exit = true;
                System.out.println("Gracias por utilizar nuestro portal! Vuelva pronto\n");
                break;
            }

        } while (exit == false);

	}

}
