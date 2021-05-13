package Data;


public class FullTimeTeacher extends Teacher {

    private int yearsExp;

    public FullTimeTeacher(String name, int ID, int age, double baseSalary, int yearsExp) {
        super(name, ID, age, baseSalary);
        this.yearsExp = yearsExp;
    }

    public double calculateSalary() {
        return baseSalary * ((110 * yearsExp)/100);

    }

}
