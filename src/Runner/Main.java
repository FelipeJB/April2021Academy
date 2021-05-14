package Runner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import Data.*;

public class Main {



	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		University uni = new University();
		
		initializeUniversity(uni);

		Scanner scan = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("//////////////////////////////////////////////");
		System.out.println("/                                            /");
		System.out.println("/    Bienvenido al portal de la Universidad  /");
		System.out.println("/                                            /");
		System.out.println("//////////////////////////////////////////////");
		System.out.println("");
		
		
		boolean exit = false;

        do{
            System.out.println("Ingrese el n�mero de la opci�n que desea realizar");
            System.out.println("1. Mostrar a todos los profesores con sus datos");
            System.out.println("2. Mostrar todas las clases");
            System.out.println("3. Crear un nuevo estudiante");
            System.out.println("4. Crear una nueva clase");
            System.out.println("5. Mostrar clases de un estudiante");
    		System.out.println("6. Salir");
            
            int option = scan.nextInt();
            
            switch (option){
            case 1:
            	System.out.println("Lista de profesores: \n");
            	System.out.println("Nombre      Horas Semanales       Experiencia          Salario");
            	for (int i=0; i < uni.getuTeacher().size();i++) {
        			System.out.println(uni.getuTeacher().get(i).getName()+"       "+uni.getuTeacher().get(i).getHoursPerWeek()+"             "+uni.getuTeacher().get(i).getExperienceYears()+" a�os            $"+uni.getuTeacher().get(i).getSalary()+"\n");
        		}
            	
                
                break;
            case 2:
            	System.out.println("Lista de clases disponibles: \n");
            	for (int i=0; i < uni.getuSubject().size();i++) {
        			System.out.println(i+1+". "+uni.getuSubject().get(i).getClassName());
        		}
            	System.out.println("Ingrese la clase que desea ver: \n");
            	int iSub = scan.nextInt();
            	System.out.println("Nombre       Salon       Profesor \n");
            	System.out.println(uni.getuSubject().get(iSub-1).getClassName()+"   "+uni.getuSubject().get(iSub-1).getClassRoom()+"   "+uni.getuSubject().get(iSub-1).getTeacherClass().getName());
            	System.out.println("Los estudiantes son: \n");
            	for (int i=0; i < uni.getuSubject().get(iSub-1).getClassStudent().size();i++) {
        			System.out.println(uni.getuSubject().get(iSub-1).getClassStudent().get(i).getName());
        		}
            

            	break;
            case 3:
            	System.out.print("Ingrese el nombre del nuevo estudiante: \n");
            	String sName = br.readLine();
            	
            	System.out.print("Ingrese la edad del estudiante: \n");
            	int sAge = scan.nextInt();
            	
            	Student st = new Student(sName, sAge);
            	
            	uni.getuStudent().add(st);
            	
            	System.out.println("De la siguiente lista de clases, seleccione a cual clase quiere inscribir a "+st.getName()+" \n");
            	for (int i=0; i < uni.getuSubject().size();i++) {
        			System.out.println(i+1+". "+uni.getuSubject().get(i).getClassName());
        		}
            	int iClass = scan.nextInt();
            	
            	uni.getuSubject().get(iClass-1).getClassStudent().add(st);
            	
            	System.out.println("El estudiante: "+st.getName()+" fue agregado exitosamente a la clase: "+uni.getuSubject().get(iClass-1).getClassName());
            	
            	
               
                break;
            case 4:
            	
            	System.out.print("Ingrese el nombre de la clase que desea abrir: \n");
            	String nClass = br.readLine();
            	
            	System.out.print("Ingrese el salon de clase a asignar: \n");
            	String nClassRoom = br.readLine();
            	
            	System.out.print("De la siguiente lista de docentes elija el que va a dirigir la clase: \n");
            	for (int i=0; i < uni.getuTeacher().size();i++) {
        			System.out.println(i+1+". "+uni.getuTeacher().get(i).getName());
        		}
            	int iTeacher = scan.nextInt();
            	Subject sub = new Subject(nClass, nClassRoom, uni.getuTeacher().get(iTeacher-1));
            	
            	System.out.print("Cuantos estudiantes desea inscribir en la clase: \n");
            	int iSt = scan.nextInt();
            	
            	System.out.print("De la siguiente lista de estudiantes disponibles seleccione los que desea asignar a la clase: \n");
            	
            	for (int i=0; i < uni.getuStudent().size();i++) {
        			System.out.println(i+1+".  "+uni.getuStudent().get(i).getName());
        		}
            	for (int j=0; j < iSt; j++) {
            		System.out.print("Ingrese el numeral del estudiante que desea inscribir en la clase \n");
            		int sNum = scan.nextInt();
            		sub.getClassStudent().add(uni.getuStudent().get(sNum-1));
            				
            	}
            	uni.getuSubject().add(sub);
            	System.out.print("La clase fue inscrita correctamente \n");
            	
            	
            	break;
            case 5:
            	System.out.print("De la siguiente lista de estudiantes indique cual quiere consultar: (id) \n");
            	for (int i=0; i < uni.getuStudent().size();i++) {
        			System.out.println(i+1+".  "+uni.getuStudent().get(i).getId()+"    "+uni.getuStudent().get(i).getName());
        		}
            	int sId = scan.nextInt();
            	
            	System.out.println("El estudiante se encuentra en las siguientes clases: \n");
            	
            	for (int i=0; i < uni.getuSubject().size();i++) {
            		for (int j=0; j < uni.getuSubject().get(i).getClassStudent().size(); j++) {
            			if(uni.getuSubject().get(i).getClassStudent().get(j).getId() == sId) {
            				System.out.println(uni.getuSubject().get(i).getClassName());
            			}
                			
            		}
            		
        		}
            	
            	break;
            default:
                exit = true;
                System.out.print("Gracias por utilizar nuestro portal! Vuelva pronto \n");
                break;
            }

        } while (exit == false);

	}
	public static void initializeUniversity(University u) {
		Teacher t1 = new Teacher("Carlos Ortiz",1000000,20,20,true);
		Teacher t2 = new Teacher("Jorge Ramirez",1000000,20,10,true);
		Teacher t3 = new Teacher("Daniel Guevara",4000000,20,5,false);
		Teacher t4 = new Teacher("Ximena Alvarez",5000000,20,24,false);
		
		u.getuTeacher().add(t1);
		u.getuTeacher().add(t2);
		u.getuTeacher().add(t3);
		u.getuTeacher().add(t4);
		
		
		Student st1 = new Student("Juan Ortiz",20);
		Student st2 = new Student("Laura Gonzalez",18);
		Student st3 = new Student("Fabian Lopez",35);
		Student st4 = new Student("Alejandra Ramirez",20);
		Student st5 = new Student("Juan Echeverry",20);
		Student st6 = new Student("Arturo Alvarez",17);
		
		u.getuStudent().add(st1);
		u.getuStudent().add(st2);
		u.getuStudent().add(st3);
		u.getuStudent().add(st4);
		u.getuStudent().add(st5);
		u.getuStudent().add(st6);
		
		Subject sub1 = new Subject("Calculo 1", "101", u.getuTeacher().get(0));
		sub1.getClassStudent().add(u.getuStudent().get(0));
		sub1.getClassStudent().add(u.getuStudent().get(2));
		sub1.getClassStudent().add(u.getuStudent().get(4));
		
		Subject sub2 = new Subject("Practica Investigativa", "303", u.getuTeacher().get(3));
		sub2.getClassStudent().add(u.getuStudent().get(1));
		sub2.getClassStudent().add(u.getuStudent().get(2));
		sub2.getClassStudent().add(u.getuStudent().get(3));
		
		Subject sub3 = new Subject("Formacion Empresarial I", "408", u.getuTeacher().get(1));
		sub3.getClassStudent().add(u.getuStudent().get(0));
		sub3.getClassStudent().add(u.getuStudent().get(1));
		sub3.getClassStudent().add(u.getuStudent().get(5));
		
		Subject sub4 = new Subject("Programacion III", "212", u.getuTeacher().get(2));
		sub4.getClassStudent().add(u.getuStudent().get(0));
		sub4.getClassStudent().add(u.getuStudent().get(2));
		sub4.getClassStudent().add(u.getuStudent().get(4));
		
		u.getuSubject().add(sub1);
		u.getuSubject().add(sub2);
		u.getuSubject().add(sub3);
		u.getuSubject().add(sub4);
	}
	


}
