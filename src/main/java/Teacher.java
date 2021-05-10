public class Teacher extends Person implements Role{

    private double salaryBase;
    private int hours;
    private int experienceYears;
    private double totalSalary;
    private int contractType;

    public Teacher(int id, String firstName, String lastName, int age, double salaryBase, int contractType, int hours){
        super(id,firstName,lastName,age);
        this.salaryBase = salaryBase;
        this.contractType = contractType;
        this.hours = hours;
    }

    public void teach(){
        System.out.println("I teach");
    }

    public void learn(){
        System.out.println(" I did not learn");
    }

    public double calculateSalary() {
        if (contractType == 1) {
            totalSalary = salaryBase * 1.10;
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
