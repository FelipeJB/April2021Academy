package Data;

public class TeacherFullTime extends Teacher {

    private int yearsExperience;

    public TeacherFullTime(String pName, float pBaseSalary, int pYearsExperience){
        super(pName, pBaseSalary);
        this.yearsExperience = pYearsExperience;

    }

    public int getYearsExperience() {
        return yearsExperience;
    }

    public void setYearsExperience(int yearsExperience) {
        this.yearsExperience = yearsExperience;
    }

    @Override
    public double calculateSalary() {
        double totalSalary = 0.0;
        totalSalary = getBaseSalary() * ((110 * yearsExperience) / 100);
        return totalSalary;
    }

    @Override
    public void getInfo() {
        System.out.println("Nombre del Profesor: " + getName());
        System.out.println("Años de experiencia: " + getYearsExperience());
        System.out.println("Salario: " + calculateSalary());
        System.out.println("Tipo de Profesor: " + getClass().getSimpleName());
    }
    //For the full time teachers: base salary (attribute) multiplied by 110% of its experience years.

}
