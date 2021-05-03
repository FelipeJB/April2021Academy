import java.util.ArrayList;
import java.util.Scanner;
import EmployeeData.Employee;

public class Main {
	
	ArrayList<Employee> addEmployee = new ArrayList<Employee>();
	static boolean exit = true;
	
		public static void main(String [] arg) {
		
		Main main = new Main();

		while (exit != false) {
			int option = main.displayClientOptions();
			main.validateClientOption(option);

		}

		System.out.println("Gracias por utilizar nuestros servicios");
	}
	
	public int displayClientOptions() {

		System.out.println("Bienvenido a GLobant por favor escoge una de las siguientes opciones:");
		System.out.println("1 Adicionar nuevos Globers");
		System.out.println("2 Imprimir los globers y sus salarios");
		System.out.println("3 Imprimir toda la informacion de Globers");
		System.out.println("4 Salir de forma segura");

		Scanner scan = new Scanner(System.in);
		int option = scan.nextInt();

		return option;
	}
	
	public void validateClientOption(int option) {
		
		switch (option) {
		
		case(1):				
				addInformation();
		break;
		
		case (2):
			System.out.println("Los salarios de los globers actuales son: ");

			for (int i = 0; i < addEmployee.size(); i++) {
				System.out.println((i + 1) + ":" + "Nombres: "+ (addEmployee.get(i).getName()) + " " + (addEmployee.get(i).getLastName()) + " Sede laboral: " + (addEmployee.get(i).getLocation()) + " Salario completo: " + (addEmployee.get(i).getSalary()) + " salario Neto: " + (addEmployee.get(i).getNetSalary()));
			}
		break;
			
		case (3):
			System.out.println("La información actual de los globers actuales es: ");

			for (int i = 0; i < addEmployee.size(); i++) {
				System.out.println((i + 1) + ":" + (addEmployee.get(i).getName()) + " " + (addEmployee.get(i).getLastName()) + " Sede laboral: " + (addEmployee.get(i).getLocation()) + " Salario completo: " + (addEmployee.get(i).getSalary()) + " salario Neto: " + (addEmployee.get(i).getNetSalary())+ " sus funciones son: " +  (addEmployee.get(i).getFunctions()));
			}
		break;
		
		case(4):
			exit = false;
		break;
				
		}
	}
	
	public void addInformation() {
		
		boolean add = true;
		
		while (add == true) {
			
			System.out.println("Por favor digita el primer nombre del glober: ");
			Scanner scan = new Scanner(System.in);
			String name = scan.next();

			System.out.println("Por favor digita el primer apellido del glober: ");
			String lastName = scan.next();
			
			System.out.println("Por favor digita su edad: ");
			int age = scan.nextInt();
			
			System.out.println("Por favor digita la ciudad de residencia del glober: ");
			String location = scan.next();
			
			System.out.println("Por favor digita el número que representa el senority del glober: ");
			System.out.println("1. Junior");
			System.out.println("2. Semi-senior");
			System.out.println("3. Semi-Senior Advance");
			System.out.println("4. Senior");
			System.out.println("5. Senior Level I");
			int catOption = scan.nextInt();

			Employee employee = new Employee(name, lastName, age, location, catOption, null, 0, 0);
			employee.setSalaryFunctionsGlober(catOption);
			addEmployee.add(employee);
			
			System.out.println("Deseas ingresar otro glober Y/N: ");
			String addInfo = scan.next();
			
			if (addInfo.toUpperCase().equals("Y")) {
				add = true;
				}
			else {
				add = false;
				}
							
			}
			
		}

}
