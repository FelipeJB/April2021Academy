import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person implements PersonHabilities {

    protected double salaryBase;
    protected int hours;
    protected int experienceYears;
    protected double totalSalary;
    protected int contractType;

    public Teacher(int id, String firstName, String lastName, int age, double salaryBase, int contractType, int hours, int experienceYears){
        super(id,firstName,lastName,age);
        this.salaryBase = salaryBase;
        this.contractType = contractType;
        this.hours = hours;
        this.experienceYears = experienceYears;
    }

    @Override
    public void teach(){
        System.out.println("I teach");
    }

    @Override
    public void learn(){
        System.out.println(" I did not learn");
    }

    public double calculateSalary() {
        if (contractType == 1) {
            totalSalary = salaryBase * (1.10 * experienceYears);
        }
        else if (contractType == 2){
            totalSalary = salaryBase * hours;
        }
        else {
            return 0;
        }
        return this.totalSalary;
    }


}