package Data;

public class Teacher extends Person{
    private int experienceYears;
    private int activeHoursWeek;


    public Teacher(int age, String name,int experienceYears,int activeHoursWeek) {
        super(age,name);
        this.experienceYears = experienceYears;
        this.activeHoursWeek = activeHoursWeek;
    }


    @Override
public String toString() {
    return "Teacher{" +
            " Teacher id = '" + Teacher.this.getId() + '\'' +
            ", name ='" + Teacher.this.getName() + '\'' +
            ", age ='" + Teacher.this.getAge() + '\'' +
            ", experience years ='" + Teacher.this.getExperienceYears() + '\'' +
            ", active hours per week ='" + Teacher.this.getActiveHoursWeek() + '\'' +
            ", salary = " + String.format("%.0f", Teacher.this.contractTypeSalary(this.activeHoursWeek,this.experienceYears)) +", "+ Teacher.this.messageContractType(this.activeHoursWeek,this.experienceYears) +
            '}';
}


    public double contractTypeSalary(int activeHoursWeek, int experienceYears){
        ContractType contractType = new ContractType();
        return contractType.getSalary(activeHoursWeek,experienceYears);
    }


    public String messageContractType(int activeHoursWeek, int experienceYears){
        ContractType contractType = new ContractType();
        return contractType.getTypeOfContract(activeHoursWeek,experienceYears);
    }



    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public int getActiveHoursWeek() {
        return activeHoursWeek;
    }

    public void setActiveHoursWeek(int activeHoursWeek) {
        this.activeHoursWeek = activeHoursWeek;
    }



}

