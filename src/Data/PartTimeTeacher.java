package Data;

public class PartTimeTeacher extends Teacher {
    private Double activeHoursPerWeek;

    public PartTimeTeacher(String iteacherName, Double iactiveHoursPerWeek){
        super.setTeacherName(iteacherName);
        activeHoursPerWeek = iactiveHoursPerWeek;
        calculateSalary();
    }

    public void calculateSalary(){
       super.setTeacherSalary(super.getBaseSalary() * this.activeHoursPerWeek);
    }

    public Double getActiveHoursPerWeek() {
        return activeHoursPerWeek;
    }

    public void setActiveHoursPerWeek(Double activeHoursPerWeek) {
        this.activeHoursPerWeek = activeHoursPerWeek;
    }





}
