package Data;

public class Teacher extends Person{
    private double initialSalary;
    private int experience;
    private String timeWorking;
    private int hours;
    private double salaryFull = 0;

    public Teacher(int id, String name, double baseSalary, int experienceYear, String timeLabor){
        super(id, name);
        this.initialSalary = baseSalary;
        this.experience = experienceYear;
        this.timeWorking = timeLabor;
    }

    public Teacher() {
        super();
    }

    @Override
    public int getID(){
        return this.ID;
    }
    @Override
    public String getName(){ return this.name; }

    public double getInitialSalary() {
        return initialSalary;
    }

    public void setInitialSalary(double initialSalary) {
        this.initialSalary = initialSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getTime() {
        if(timeWorking.equals("Yes")){
            timeWorking = "Full-Time Labor";
        } else{
            timeWorking = "Part-Time Labor";
        }
        return timeWorking;
    }

    public void setTime(String timeLabor) {
        this.timeWorking = timeLabor;
    }

    public int getHour() { return hours; }

    public void setHour(int workingHour) {
        this.hours = workingHour;
    }

    public double calculateFull(double baseSalary, int experienceYear){
        return  salaryFull = baseSalary + (baseSalary * 0.2 * experienceYear);
    }

    public double calculatePart(double baseSalary, int workingHour){
        return (baseSalary/30) * (workingHour * 4); }

}
