package Data;

public class FullTimeTeacher extends Teacher {

    private Double yearsOfExperience;

    public FullTimeTeacher(String iteacherName,Double iyearsOfExperience){
        super.setTeacherName(iteacherName);
        yearsOfExperience = iyearsOfExperience;
        calculateSalary();
    }

    public void calculateSalary(){
        super.setTeacherSalary(super.getBaseSalary() * (this.yearsOfExperience * 0.110));
    }


    public Double getYearsOfExperience() {
        return yearsOfExperience;
    }


    public void setYearsOfExperience(Double yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }



}
