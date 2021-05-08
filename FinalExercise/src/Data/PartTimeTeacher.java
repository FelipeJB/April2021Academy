package Data;

import java.util.Scanner;

public class PartTimeTeacher extends Teacher {

    private double baseSalary;
    private int hoursWeek;
    Scanner scan = new Scanner(System.in);

    public PartTimeTeacher(String name, int age, double baseSalary, int hoursWeek) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.hoursWeek = hoursWeek;
    }

    public double calculateSalary() {
        System.out.println("Digite la base salarial");
        baseSalary = scan.nextDouble();
        System.out.println("Digite las horas por semana");
        hoursWeek = scan.nextInt();
        return salary = baseSalary * hoursWeek;
    }

}
