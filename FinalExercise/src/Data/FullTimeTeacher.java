package Data;

import java.util.Scanner;

public class FullTimeTeacher extends Teacher {

    private double baseSalary;
    private int yearsExp;
    Scanner scan = new Scanner(System.in);

    public FullTimeTeacher(String name, int age, double baseSalary, int yearsExp) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.yearsExp = yearsExp;
    }

    public double calculateSalary() {
        System.out.println("Digite la base salarial");
        baseSalary = scan.nextDouble();
        System.out.println("Digite los años de experiencia");
        yearsExp = scan.nextInt();
        return salary = baseSalary * ((110 * yearsExp)/100);
    }

}
