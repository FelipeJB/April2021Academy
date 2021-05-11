package Person;

public class Teacher extends Person{

    private double baseSalary;
    private int experienceYear;
    private String timeLabor;
    private int workingHour;
    private double salaryFullTime = 0;

    //Defined Constructor
    public Teacher(int id, String name, double baseSalary, int experienceYear, String timeLabor){
        super(id, name);
        this.baseSalary = baseSalary;
        this.experienceYear = experienceYear;
        this.timeLabor = timeLabor;
    }
    //Declared Constructor
    public Teacher() {
        super();
    }

    //Getters and Setters section
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

    /***
     *
     * @param baseSalary
     * @param experienceYear
     * @return salaryFullTime
     */
    //Method to calculate salary when the teacher work full time
    public double calculateFullTimeLabor(double baseSalary, int experienceYear){
        for(int i = 1; i <= experienceYear; i++){
            salaryFullTime = salaryFullTime + (baseSalary * 0.1);
        }
        return salaryFullTime = baseSalary + salaryFullTime;
    }

    /***
     *
     * @param baseSalary
     * @param workingHour
     * @return salaryPartTime
     */
    //Method to calculate salary when the teacher work part time
    public double calculatePartTimeLabor(double baseSalary, int workingHour){
        return (baseSalary/240) * workingHour;
    }
}
