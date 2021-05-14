package Data;

public class Teacher extends Person{
    private int id ;
    private int baseSalary ;
    private int experienceYears;
    private String typeContract;
    private int hoursPerWeek ;

    public Teacher(String name, int age, int id,int baseSalary,int experienceYears,String typeContract, int hoursPerWeek) {
        super(name, age);
        this.id=id;
        this.baseSalary=baseSalary;
        this.experienceYears=experienceYears;
        this.typeContract=typeContract;
        this.hoursPerWeek=hoursPerWeek;
    }

}
