package Runner;
import Data.Course;
import Data.Student;
import Data.Teacher;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args){
        ArrayList <Course> courses= new ArrayList<>();
        ArrayList <Student> students= new ArrayList<>();
        ArrayList <Student> students2= new ArrayList<>();
        ArrayList <Teacher> teachers= new ArrayList<>();
        int option;
        boolean keep=true;
        Teacher auxTeach= new Teacher("Pablo", 35, 100,5 ,10, false);
        teachers.add(auxTeach);
        auxTeach= new Teacher("Pedro", 40,  200,12, 63, true);
        teachers.add(auxTeach);
        auxTeach= new Teacher("Pilar", 23,  300,1, 6, false);
        teachers.add(auxTeach);
        auxTeach= new Teacher("Marina", 65, 400,35, 50, true);
        teachers.add(auxTeach);
        Student auxStudent= new Student("Juan",23);
        students.add(auxStudent);
        auxStudent= new Student("Alejo",18);
        students.add(auxStudent);
        auxStudent= new Student("Andrea",20);
        students.add(auxStudent);
        auxStudent= new Student("Camilo",22);
        students.add(auxStudent);
        auxStudent= new Student("Camila",22);
        students.add(auxStudent);
        auxStudent= new Student("Ivana",18);
        students.add(auxStudent);
        auxStudent= new Student("Daniela",21);
        students.add(auxStudent);
        auxStudent= new Student("Rodrigo",40);
        students2.add(auxStudent);
        auxStudent= new Student("Juliana",15);
        students2.add(auxStudent);
        auxStudent= new Student("Marcela",20);
        students2.add(auxStudent);
        auxStudent= new Student("Felipe",23);
        students2.add(auxStudent);
        auxStudent= new Student("Chumi",19);
        students2.add(auxStudent);
        auxStudent= new Student("Margarita",25);
        students2.add(auxStudent);
        auxStudent= new Student("Ana",17);
        students2.add(auxStudent);
        auxTeach=getOne(teachers);
        Course auxCourse=new Course("Mates", 305, auxTeach, students);
        courses.add(auxCourse);
        auxTeach=getOne(teachers);
        auxCourse=new Course("Fisica", 310, auxTeach, students2);
        courses.add(auxCourse);
        auxTeach=getOne(teachers);
        auxCourse=new Course("Quimica", 318, auxTeach, students);
        courses.add(auxCourse);
        do {
            option = menu();
            keep = action(option, teachers, students, students2, courses, keep);
        }while(keep);
    }

    public static Teacher getOne(ArrayList teachers){
        int number=teachers.size();
        Random r=new Random();
        int i=r.nextInt(number);
        return (Teacher) teachers.get(i);
    }


    public static int menu(){
            boolean keep;
            int option=0;
            do {
                try {
                        keep=false;
                        Scanner reader = new Scanner(System.in);
                        System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                        System.out.println("Bienvenido al Menu de Gestión de la U");
                        System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                        System.out.println("Ingrese la Opción a Realizar ");
                        System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                        System.out.printf("1. Imprimir Lista de Profesores\n");
                        System.out.printf("2. Gestión de Clases\n");
                        System.out.printf("3. Matricular Estudiante a clase\n");
                        System.out.printf("4. Crear Clase\n");
                        System.out.printf("5. Listar todas las Clases de un Estudiante\n");
                        System.out.printf("6. Salir\n");
                        System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                        option = reader.nextInt();
                        return option;
                     } catch (InputMismatchException e) {
                        System.out.printf("Debe ingresar una de las opciones del Menu");
                        keep=true;
                    }
            }while(keep);
            return option;
    }

    public static void printStudents(ArrayList <Student> students){
        for (int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName() + "         " + students.get(i).getId() + "           " + students.get(i).getAge()+ "             ");
        }
    }

    public static boolean action(int option, ArrayList <Teacher> teachers, ArrayList <Student> students, ArrayList <Student> students2, ArrayList <Course> courses, boolean keep){
        Scanner reader = new Scanner(System.in);
        ArrayList <Student> auxStudents;
        Teacher auxteacher;
        Course auxCourse;
        switch (option) {
            case 1:
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.println("lista de Profesores");
                System.out.println("NOMBRE      ID          EDAD        EXPERIENCIA         HORAS TRABAJADAS            TIEMPO COMPLETO           SALARIO");
                for (int i = 0; i < teachers.size(); i++){
                    System.out.println(teachers.get(i).getName() + "       " + teachers.get(i).getId() + "           " + teachers.get(i).getAge()+ "             "+ teachers.get(i).getExperience() + "                  " + teachers.get(i).getWorkHours() + "                           " +teachers.get(i).getIsfulltime() + "                 " + teachers.get(i).getSalary(teachers.get(i).getIsfulltime(),teachers.get(i).getExperience(), teachers.get(i).getWorkHours() ));
                }
                return keep=true;
            case 2:
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.println("lista de Clases");
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.println("Nombre      Room          Nombre Profesor            IDProfesor");
                for (int i = 0; i < courses.size(); i++){
                    System.out.println(courses.get(i).getName() + "       " + courses.get(i).getRoom() + "           " + courses.get(i).getTeacher().getName()+ "                   "+ courses.get(i).getTeacher().getId() );
                }
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.println("Bienvenido al Menu de Gestión de las Clases");
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.println("Ingrese el nombre de la Clase que desea Seleccionar ");
                System.out.println("Ingrese X para Salir");
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                String courseName=reader.next();
                while (!courseName.equals("X")){
                    int i = 0, cont = 0, index = 0;
                    String auxName;
                    do {
                        auxName = courses.get(i).getName();
                        if (auxName.equals(courseName)) {
                            index = i;
                            cont = courses.size();
                        } else {
                            cont++;
                            i++;
                        }
                    } while (cont < courses.size());
                    System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                    System.out.printf("La Clase seleccionada es\n");
                    System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                    System.out.println("Nombre de clase: " + courses.get(index).getName() + "   Se dicta en el Salon: " + courses.get(index).getRoom() + "    El Profe es: " + courses.get(index).getTeacher().getName() + " con Id: " + courses.get(index).getTeacher().getId());
                    System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                    System.out.printf("Los estudiantes Matriculados son: \n");
                    System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                    System.out.println("NOMBRE      ID          EDAD");
                    auxStudents = courses.get(i).getStudents();
                    printStudents(auxStudents);
                    System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                    System.out.println("Ingrese el Nombre de otra clase X para salir  ");
                    courseName=reader.next();
                }
                return keep= true;
            case 3:
                String name;
                int age, room, idTeacher;
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.println("Bienvenido al Menu de Creación de Estudiante");
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                do {
                    System.out.println("Ingrese el Nombre del Estudiante");
                    name = reader.next();
                    System.out.println("Ingrese la Edad del Estudiante");
                    age = reader.nextInt();
                    Student auxStudent = new Student(name, age);
                    System.out.println("Ingrese el nombre de la clase a la cual quiere Inscribir al Estudiante");
                    courseName = reader.next();
                    int i = 0, cont = 0, index = 0;
                    do {
                        name = courses.get(i).getName();
                        if (courseName.equals(name)) {
                            index = i;
                            cont = courses.size();
                        } else {
                            cont++;
                            i++;
                        }
                    } while (cont < courses.size());
                    courses.get(index).setStudent(auxStudent);
                    System.out.println("El Estudiante " + auxStudent.getName() + " Se ha inscrito a la Clase " + courses.get(index).getName() + " Exitosamente");
                    System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                    System.out.println("La clase quedo con la siguiente Lista de estudiantes");
                    System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                    System.out.println("NOMBRE         ID            EDAD");
                    auxStudents = courses.get(index).getStudents();
                    printStudents(auxStudents);
                    System.out.println("Ingrese X para Salir o cualquier letra para Crear Otro Estudiante");
                    courseName = reader.next();
                }while(!courseName.equals("X"));
                return keep=true;
            case 4:
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.println("Bienvenido al Menu de Creación de Clase");
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.println("Ingrese el Nombre de la Clase a Crear");
                name = reader.next();
                System.out.println("Ingrese el Salon que corresponde a la Clase");
                room=reader.nextInt();
                System.out.println("Ingrese el Id del Profesor que corresponde a la Clase");
                idTeacher=reader.nextInt();
                int i = 0, cont = 0, index = 0, auxId;
                do {
                    auxId = teachers.get(i).getId();
                    if (auxId==idTeacher) {
                        index = i;
                        cont = teachers.size();
                    } else {
                        cont++;
                        i++;
                    }
                } while (cont < teachers.size());
                auxteacher=teachers.get(index);
                System.out.println("Ingrese 1 (Primer Grupo Estudiantes) o 2 (Segundo Grupo Estudiantes) ");
                i=reader.nextInt();
                if (i==1){
                    auxStudents=students;
                }else{
                    auxStudents=students2;
                }
                auxCourse= new Course(name, room,auxteacher, auxStudents);
                courses.add(auxCourse);
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                System.out.printf("Se ha Creado la Clase correctamente\n");
                System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                return keep;
            case 5:
               do {
                   System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                   System.out.printf("Menu Buscar Estudiante\n");
                   System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                   System.out.printf("Ingrese el Id del Estudiante que desea Buscar 0 para Salir\n");
                   System.out.println("+++++++++++++++++++++++++++++++++++++\n");
                   auxId = reader.nextInt();
                   i = 0;
                   cont = 0;
                   int j = 0, cont2 = 0;
                   String courseNames = "", studentName = "";
                   do {
                       auxStudents = courses.get(i).getStudents();
                       do {
                           int auxId2 = auxStudents.get(j).getId();
                           if (auxId == auxId2) {
                               studentName = auxStudents.get(j).getName();
                               cont2 = auxStudents.size();
                               courseNames = courseNames.concat("  " + courses.get(i).getName());
                           } else {
                               cont2++;
                               j++;
                           }
                       } while (cont2 < auxStudents.size());
                       cont++;
                       i++;
                       j = 0;
                       cont2 = 0;
                   } while (cont < courses.size());
                   if (!courseNames.equals("")) {
                       System.out.printf("El Estudiante con Nombre " + studentName + " y ID " + auxId + " Se encuentra Insrito en las siguientes Clases: \n");
                       System.out.printf(courseNames);
                   } else if (!(auxId==0)){
                       System.out.printf("No se Encontró Estudiante en ninguna Clase\n");
                   }
               }while(auxId!=0);
                return keep;
            case 6:
                return keep=false;
            default :
                return keep;
        }
    }
}

