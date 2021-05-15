package globant.university;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    private static List<Teacher> teachers = new ArrayList<>();

    private static List<Student> students = new ArrayList<>();

    private static List<Subject> subjects = new ArrayList<Subject>();


    public static void main(String[] args) {

        initializeTeacher();
        initializeStudent();
        initializeSubject();


        Operaciones();
    }

    public static void initializeTeacher() {
        Teacher teacher = new Teacher(10,"Jose", "Daniel", "Gomez", "jose@gmail.com", "Carrera 29", "M", 22000,
                true, false);
        teachers.add(teacher);

        teacher = new Teacher(11,"Andre", "Felipe", "Prieto", "andres@gmail.com", "Calle 9", "M", 225555,
                true, false);
        teachers.add(teacher);

        teacher = new Teacher(12,"Ana", "Maria", "Suarez", "ana@gmail.com", "Carrera 91", "F", 2255522,
                true, false);
        teachers.add(teacher);

        teacher = new Teacher(13,"Karla", "Daniela", "Gil", "Karla@gmail.com", "Calle 79", "F", 2244422,
                true, false);
        teachers.add(teacher);

    }

    public static void initializeStudent () {
        Student student = new Student(20, "Ana", "Sofia", "Tamayo", "ana@gmail.com", "Carrera 29", "F", 22000,
                7);
        students.add(student);

        student = new Student(21,"Sara", "Lucia", "Yepez", "sara@gmail.com", "Carrera 12", "F", 75000,
                8);
        students.add(student);

        student = new Student(22, "Sandra", "Maria", "Cortes", "sandra@gmail.com", "Carrera 29", "F", 22000,
                10);
        students.add(student);

        student = new Student(23,"Sara", "Lucia", "Yepez", "sara@gmail.com", "Carrera 12", "F", 75000,
                8);
        students.add(student);

        student = new Student(24,"Ana", "Sofia", "Tamayo", "ana@gmail.com", "Carrera 29", "F", 22000,
                7);
        students.add(student);

        student = new Student(25,"Sara", "Lucia", "Yepez", "sara@gmail.com", "Carrera 12", "F", 75000,
                8);
        students.add(student);
    }

    public static void initializeSubject() {
        Subject subject = new Subject(30, "Math", "Monday", "10:00 AM", "12:00 M", "2 hours", "Raul", null);
        subjects.add(subject);

       subject = new Subject(31, "Computer Science", "Tuesday", "1:0 PM", "3:00PM", "2 hours", "Raul", null);
       subjects.add(subject);

        subject = new Subject(32, "Diferential calculus", "Wednesday", "3:0 PM", "4:00PM", "2 hours", "Raul", null);
        subjects.add(subject);

        subject = new Subject(33, "Integral calculus", "Wednesday", "7:0 PM", "9:00PM", "2 hours", "Raul", null);
        subjects.add(subject);

        subject = new Subject(33, "Integral calculus", "Wednesday", "7:0 PM", "9:00PM", "2 hours", "Raul", null);
        subjects.add(subject);

    }

        public static void Operaciones() {
            int bandera = 0;
            int seleccion = 0;
            Scanner entrada = new Scanner(System.in);
            //Se creamos un bucle para que el programa no deje de ejecutarse y siempre muestre el menu de opciones
            do {
                //Se crean las opciones y se valida que el usuario solo pueda validar las opciones disponibles del menú.
                do {
                    System.out.println("Por favor seleccione una opción:");
                    System.out.println("    1. Print all the professors with its data");
                    System.out.println("    2. Print the list of classes");
                    System.out.println("    3. Print the list of Students");
                    System.out.println("    4. Create a new student in a class");
                    System.out.println("    5. Create a new Class with teacher, Student and relevant data ");
                    System.out.println("    6. List all the Classes in which one student is included");
                    System.out.println("    7. Exit");
                    seleccion = entrada.nextInt();

                    //para que salga del ciclo
                    if (seleccion >= 1 && seleccion <= 6) {
                        bandera = 1;
                    } else {
                        System.out.println("------------------------------------------------------------");
                        System.out.println("La opción no está disponible. Por favor vuelva a intentar:");
                        System.out.println("------------------------------------------------------------");
                    }

                    //Se crean las estructuras condicionales que le van a indicar al programa que hacer dependiendo de la selección.
                } while (bandera == 0);

                if (seleccion == 1) {
                    System.out.println("  Opcion 1. Print all the professors with its data");
                    for (Teacher item : teachers) {
                        System.out.println(" Teacher: " + item);
                    }
                } else if (seleccion == 2) {
                    System.out.println(" Opcion 2.");

                } else if (seleccion == 3) {
                    System.out.println(" Opcion 2.1. Print the list of Students");
                    for (Student item : students) {
                        System.out.println(" Student: " + item);
                    }
                } else if (seleccion == 4) {
                    System.out.println(" Opcion 4. Print the list of classes");
                    for (Subject item : subjects) {
                        System.out.println(" subjects: " + item);
                    }

                } else if (seleccion == 5) {
                    System.out.println(" Opcion 3.");

                } else if (seleccion == 6) {

                    System.out.println(" Opcion 5.");


                } else if (seleccion == 6) {
                    System.out.println("-------------------------");
                    System.out.println("Gracias!, vuelva pronto.");
                    System.out.println("-------------------------");
                    bandera = 2;
                }

            } while (bandera != 2);
        }

  }
