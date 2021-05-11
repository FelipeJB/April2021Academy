package Data;

public class TeacherPartialTime  extends Teacher {

    private int activeHoursPerWeek;

    public TeacherPartialTime(String pName, float pBaseSalary, int pActiveHours){
        super(pName, pBaseSalary);
        this.activeHoursPerWeek = pActiveHours;
    }

    public int getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(int activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }

    @Override
    public double calculateSalary() {
        double totalSalaryP = 0.0;
        totalSalaryP = getBaseSalary() * activeHoursPerWeek;
        return totalSalaryP;
    }

    @Override
    public void getInfo() {
        System.out.println("Nombre del Profesor: " + getName());
        System.out.println("Años de experiencia: " + getActiveHoursPerWeek());
        System.out.println("Salario: " + calculateSalary());
        System.out.println("Tipo de Profesor: " + getClass().getSimpleName());
    }
    //For part time teachers: base salary multiplied for its active hours per week.
}
