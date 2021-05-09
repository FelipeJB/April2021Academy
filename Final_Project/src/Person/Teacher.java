package Person;

public class Teacher extends Person{

    private double salary;
    private int experienceYear;
    private String timeLabor;

    public Teacher(int id, String name, double salary, int experienceYear, String timeLabor){
        super(id, name);
        this.salary = salary;
        this.experienceYear = experienceYear;
        this.timeLabor = timeLabor;
    }
    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public String getName(){ return this.name; }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
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
}
