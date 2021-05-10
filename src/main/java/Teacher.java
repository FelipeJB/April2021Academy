public abstract class Teacher extends Person implements Role{

    private int salaryBase;
    private int hours;
    private int experienceYears;
    private int totalSalary;
    private int

    public Teacher(int id, String firstName, String lastName, int age, int salaryBase, int hours, int experienceYears){
        super(id,firstName,lastName,age);
        this.salaryBase = salaryBase;
        this.experienceYears = experienceYears;
    }

    public void teach(){
        System.out.println("I teach");
    }

    public int calculateSalary(){

    }
}
