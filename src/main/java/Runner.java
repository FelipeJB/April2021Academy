import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static void main (String[] args){

        Assignation assignation = new Assignation();
        Scanner data = new Scanner(System.in);
        int option = 0;
        String firstName;
        String lastName;
        String fullName;
        int id;
        int age;

        System.out.println("Menu de administración universitaria");
        do{
            System.out.println("1. Listado de profesores\n");
            System.out.println("2. Listado de Materias\n");
            System.out.println("3. Agregar nuevo estudiante\n");
            System.out.println("4. Agregar nueva materia\n");
            System.out.println("5. Lista de materias por estudiante\n");
            System.out.println("0. Salir\n");
                switch (option){
                    case 1:
                        System.out.println(assignation.teacherListAssignation());
                        break;
                    case 2:
                        System.out.println(assignation.subjectListAssignation());
                        break;
                    case 3:
                        System.out.println("Ingrese el nombre del estudiante: ");
                        firstName = data.next();
                        System.out.println("Ingrese el apellido del estudiante: ");
                        lastName = data.next();
                        System.out.println("Ingrese el ID del estudiante");
                        id = data.nextInt();
                        System.out.println("Ingrese la edad del estudiante");
                        age = data.nextInt();
                        Student student = new Student(id,firstName,lastName,age);
                        assignation.addStudentToList(student);
                    case 4:
                        break;
                    case 5:
                        System.out.println("Ingrese el ID del estudiante a buscar: ");
                        id = data.nextInt();

                        break;
                    case 0:
                        option = 0;
                    default:
                        option = 0;
                }
        }
        while (option != 0);


        System.out.println(assignation.teacherListAssignation());

    }
}
