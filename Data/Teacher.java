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

    public int getId() { return id; }

    public int getBaseSalary() { return baseSalary; }

    public int getExperienceYears() { return experienceYears; }

    public String getTypeContract() { return typeContract; }

    public int getHoursPerWeek() { return hoursPerWeek; }

    public double salaryCalculated (){
        double fullSalary;

        if(this.typeContract=="Full time"){
             fullSalary=baseSalary*experienceYears;
        }
        else{
             fullSalary=baseSalary*hoursPerWeek;
        }
        return fullSalary;
    }
}
