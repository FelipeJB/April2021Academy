package Main;

import java.util.Scanner;

public class Main {
	
	static boolean exit = true;
	University u = new University();
	
	public static void main(String [] arg) {
		
		Main main = new Main();
		
		while (exit != false) {
			int option = displayClientOptions();
			main.validateClientOption(option);

		}

		System.out.println("Gracias por utilizar nuestros servicios");
	}
	
	public static int displayClientOptions() {
		System.out.println("-----------------------MENU PRINCIPAL---------------------");
		System.out.println("Bienvenido a la Universidad por favor escoge una de las siguientes opciones:");
		System.out.println("1 Mostrar el listado de profesores");
		System.out.println("2 Imprimir el listado de clases");
		System.out.println("3 Crear un nuevo estudiante");
		System.out.println("4 Crear una nueva clase");
		System.out.println("5 Buscar el listado de clases de un estudiante");
		System.out.println("6 Salir de forma segura");
		System.out.println("");

		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();

		return option;
	}
	
	public void validateClientOption(int option) {
		
		switch (option) {
		case 1:
			
			u.listTeacher();
			break;
			
		case 2:
			
			u.listClass();
			break;
			
		case 3:
			
			u.createStudent();
			break;
			
		case 4:
			
			u.createNewSubject();
			break;
			
		case 5:
			u.searchStudentClass();
			break;
			
		case 6:
			exit = false;
			break;
			
		default:
			break;
		}
	}

}
