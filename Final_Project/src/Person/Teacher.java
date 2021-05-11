package Person;

public class Teacher extends Person{

    private double baseSalary;
    private int experienceYear;
    private String timeLabor;
    private double salary;
    private int workingHour;
    private double salaryFullTime = 0;
    private double salaryPartTime = 0;

    public Teacher(int id, String name, double baseSalary, int experienceYear, String timeLabor){
        super(id, name);
        this.baseSalary = baseSalary;
        this.experienceYear = experienceYear;
        this.timeLabor = timeLabor;
    }

    public Teacher() {
        super();
    }

    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public String getName(){ return this.name; }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int getExperienceYear() {
        return experienceYear;
    }

    public void setExperienceYear(int experienceYear) {
        this.experienceYear = experienceYear;
    }

    public String getTimeLabor() { return timeLabor; }

    public void setTimeLabor(String timeLabor) {
        this.timeLabor = timeLabor;
    }

    public int getWorkingHour() { return workingHour; }

    public void setWorkingHour(int workingHour) {
        this.workingHour = workingHour;
    }

    public double getSalary(String timeLabor){
        if(timeLabor == "Yes"){
            salary = calculateFullTimeLabor(this.baseSalary, this.experienceYear);
        }else{
            salary = calculatePartTimeLabor(this.baseSalary, this.workingHour);
        }
        return salary;
    }

    public double calculateFullTimeLabor(double baseSalary, int experienceYear){

        for(int i = 1; i <= experienceYear; i++){
            salaryFullTime = salaryFullTime + (baseSalary * 0.1);
        }
        return salaryFullTime = baseSalary + salaryFullTime;
    }

    public double calculatePartTimeLabor(double baseSalary, int workingHour){
        return salaryPartTime = (baseSalary/240) * workingHour;
    }
}
