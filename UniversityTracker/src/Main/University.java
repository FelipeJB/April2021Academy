package Main;

import java.util.ArrayList;
import java.util.Scanner;

import ClassData.Classroom;
import ClassData.Subject;
import PersonData.Student;
import PersonData.Teacher;

public class University implements Ufunctions {
	
	private ArrayList<Teacher> teacher;
	private ArrayList<Student> student;
	private ArrayList<Classroom> classRoom;
	private ArrayList<Subject> subject;
	private int studentId;
	
	public University () {
		teacher = new ArrayList<Teacher>();
		student = new ArrayList<Student>();
		classRoom = new ArrayList<Classroom>();
		subject = new ArrayList<Subject>();
		studentId = 1000;
		
		for (int i = 0; i < 10; i++) {
			Classroom c = new Classroom(i+1);
			classRoom.add(c);
		}
		
		Teacher t = new Teacher("Fabian", "Martinez", 38, 12, 1000000, 0, 0, 10, 1);
		teacher.add(t);
		Teacher t2 = new Teacher("Carolina", "Perez", 28, 34, 1000000, 0, 0, 3, 1);
		teacher.add(t2);
		Teacher t3 = new Teacher("Humberto", "Castro", 60, 56, 1000000, 0, 0, 30, 2);
		teacher.add(t3);
		Teacher t4 = new Teacher("Maria", "Gomez", 43, 78, 1000000, 0, 0, 15, 2);
		teacher.add(t4);
		
		Student s = new Student("Ronald", "Camargo", 20, 1234, studentId);
		student.add(s);
		studentId++;
		Student s2 = new Student("Marcela", "Reinoso", 18, 4567, studentId);
		student.add(s2);
		studentId++;
		Student s3 = new Student("Mariajose", "Cardona", 19, 5673, studentId);
		student.add(s3);
		studentId++;
		Student s4 = new Student("Gabriela", "Oviedo", 18, 6712, studentId);
		student.add(s4);
		studentId++;
		Student s5 = new Student("Victor", "Alvarez", 22, 1473, studentId);
		student.add(s5);
		studentId++;
		Student s6 = new Student("Camilo", "Gonzales", 25, 1243, studentId);
		student.add(s6);
		
		Subject sub = new Subject(1, 1, "Etica", t);
		sub.addStudent(s);		
		subject.add(sub);
		
		Subject sub1 = new Subject(2, 2, "Calculo", t2);
		sub1.addStudent(s2);
		sub1.addStudent(s3);
		subject.add(sub1);
		
		Subject sub2 = new Subject(3, 2, "Algebra", t3);
		sub2.addStudent(s4);
		sub2.addStudent(s);
		sub2.addStudent(s6);
		subject.add(sub2);
		
		Subject sub3 = new Subject(4, 1, "Comunicacion", t4);
		sub3.addStudent(s5);
		sub3.addStudent(s4);
		sub3.addStudent(s2);
		subject.add(sub3);
	}

	public ArrayList<Teacher> getTeacher() {
		return teacher;
	}

	public void setTeacher(ArrayList<Teacher> teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudent() {
		return student;
	}

	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}

	public ArrayList<Classroom> getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(ArrayList<Classroom> classRoom) {
		this.classRoom = classRoom;
	}

	public ArrayList<Subject> getSubject() {
		return subject;
	}

	public void setSubject(ArrayList<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public void listTeacher() {
		
		String contract;
		double salary;
		
		System.out.println("-------------------LISTADO PROFESORES-----------------------------");
		
		for (int i = 0; i < teacher.size(); i++) {
						
			if (teacher.get(i).getTeacherType() == 1) {
				
				contract = "Tiempo Completo";
				salary = teacher.get(i).getFullSalary();
			}
			else
			{
				contract = "Medio tiempo";
				salary = teacher.get(i).getPartSalary();
			}
			
			System.out.println((i + 1) + ": " + "Num identificación: " + (teacher.get(i).getId()) + ", Nombres: " + (teacher.get(i).getName()) + " " + (teacher.get(i).getLastName()) + ", Edad: " + (teacher.get(i).getAge()) + ", Años Experiencia: " + (teacher.get(i).getExperiencedYears()) +  ", Tipo de contrato: " + (teacher.get(i).getTeacherType()) + " " + contract + ", Salario mensual:  " + salary );
			
		}
		System.out.println("");
	}
	
	@Override
	public void listClass() {
		
		System.out.println("---------------------LISTA DE CLASES-------------------------");
		System.out.println("Las clases actuales son: ");
		for (int i = 0; i < subject.size(); i++) {
			
			System.out.println((i+1) +" " + "Materia: " + (subject.get(i).getName()) + ", horas presenciales: " + (subject.get(i).getHour()) + ", Salon asignado: " + (subject.get(i).getRoomNumber()));	
		}
		classSubMenu();
	}

	@Override
	public void classSubMenu() {
		 
		System.out.println("Digita el nombre de una materia para ver mas informacion: ");
		Scanner scan = new Scanner(System.in);
		String option = scan.next();
		boolean status = true;
				
		for (int i = 0; i < subject.size(); i++) {
			if (subject.get(i).getName().toUpperCase().equals(option.toUpperCase())) {
				
				System.out.println((i+1) + " Materia: " + (subject.get(i).getName()) + ", horas presenciales: " + (subject.get(i).getHour()) + ", Salon asignado: " + (subject.get(i).getRoomNumber()) + ", Profesor: " + (subject.get(i).getTeacher().toString()) + " Estudiantes: " + (subject.get(i).listStudentSubject()));
				status = false;
				break;
			}
		}
		if (status == true) {
			System.out.println("El nombre de la materia digitada no existe");
		}
		
	}

	@Override
	public void createStudent() {
	
		boolean add = true;
		
		while (add == true) {
			System.out.println("---------------------------CREACION ESTUDIANTE------------------------");
			System.out.println("Por favor digita el primer nombre del estudiante: ");
			Scanner scan = new Scanner(System.in);
			String name = scan.next();

			System.out.println("Por favor digita el primer apellido del estudiante: ");
			String lastName = scan.next();
			
			System.out.println("Por favor digita su edad: ");
			int age = scan.nextInt();
			
			System.out.println("Por favor digita sus 4 primeros digitos de identificacion: ");
			int id = scan.nextInt();
			
			System.out.println("Por favor digita el nombre de la clase a la que se registra: ");
			for (int i = 0; i < subject.size(); i++) {
				
				System.out.println(subject.get(i).getName());
			}
			
			String subjName = scan.next();
			studentId++;
			Student s = new Student(name, lastName, age, id, studentId);
			student.add(s);
		
			for (int i = 0; i < subject.size(); i++) {
				
				if (subject.get(i).getName().toUpperCase().equals(subjName.toUpperCase())) {
					subject.get(i).addStudent(s);			
					break;
				}
			}
			
			System.out.println("El ID creado para el estudiante " + s.toString() + " es: " + studentId);
			System.out.println("Deseas ingresar otro estudiante Y/N: ");
			String addInfo = scan.next();
			
			if (addInfo.toUpperCase().equals("Y")) {
				add = true;
				}
			else {
				add = false;
				}
			}
		}

	@Override
	public void createNewSubject() {
		
		boolean add = true;
		boolean addStudent = true;
		
		while (add == true) {
			
			System.out.println("Por favor digita el nombre de la clase: ");
			Scanner scan = new Scanner(System.in);
			String name = scan.next();

			System.out.println("Por favor digita el numero del salon asignado a la clase: ");
			int roomNumber = scan.nextInt();
			
			System.out.println("Por favor digita el numero de horas de duracion de la clase: ");
			int hour = scan.nextInt();
			
			System.out.println("La lista actual de profesores es: ");
			for (int i = 0; i < teacher.size(); i++) {
				
				System.out.println("ID: "+ teacher.get(i).getId() + " Nombre: " + teacher.get(i).toString());				
			}
			
			System.out.println("Digita el ID del profesor que deseas agregar a la clase: ");
			int idTeacher = scan.nextInt();
			
			Teacher t = null;
			for (int i = 0; i < teacher.size(); i++) {
				
				if (teacher.get(i).getId() == idTeacher) {
					t = teacher.get(i);
					break;
				}
					
			}
			
			Subject sub = new Subject(roomNumber, hour, name, t);
			
			do {
				
				System.out.println("La lista actual de estudiantes es: ");
				for (int i = 0; i < student.size(); i++) {
					
					System.out.println("ID: "+ student.get(i).getStudentId() + " Nombre: " + student.get(i).toString());				
				}
				
				System.out.println("Digita el ID del estudiante que deseas agregar a la clase: ");
				int idStudent = scan.nextInt();
				
				Student s = null;
				for (int i = 0; i < student.size(); i++) {
					
					if (student.get(i).getStudentId() == idStudent) {
						s = student.get(i);
						break;
					}
						
				}
				sub.addStudent(s);
				System.out.println("Deseas agregar otro estudiante Y/N: ");
				String addSt = scan.next();
				
				if (addSt.toUpperCase().equals("Y")) {
					addStudent = true;
					}
				else {
					addStudent = false;
					}
				
			} while (addStudent == true);
			
			
			subject.add(sub);
			
			System.out.println("Deseas ingresar otra clase Y/N: ");
			String addInfo = scan.next();
			
			if (addInfo.toUpperCase().equals("Y")) {
				add = true;
				}
			else {
				add = false;
				}
			}
	}

	@Override
	public void searchStudentClass() {
		
		System.out.println("Para saber que clases tiene registradas un estudiante, por favor digita el ID del estudiante: ");
		Scanner scan = new Scanner(System.in);
		int idStudent = scan.nextInt();
		
		for (int i = 0; i < student.size(); i++) {
			if (student.get(i).getStudentId() == idStudent) {
				System.out.println("El estudiante: " + student.get(i).toString());
				break;
			}
		}
		
		System.out.println("Las materias inscritas para este estudiante son: ");
		
		for (int i = 0; i < subject.size(); i++) {
			Subject sub = this.subject.get(i);
			for (int j = 0; j < sub.getStudent().size(); j++) {
				if (sub.getStudent().get(j).getStudentId() == idStudent) {
					System.out.println((i+1) + " Clase: " + sub.getName());
				}
			}
			
		}
	}
}


