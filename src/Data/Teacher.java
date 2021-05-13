package Data;

public class Teacher {
	protected String teacherName;
	protected double baseSalary;
	protected int experienceYears;
	protected int hoursPerWeek;
	protected boolean fullTime;
	
	

	protected Teacher(String teacherName, double baseSalary, int experienceYears, int hoursPerWeek, boolean fullTime) {
		super();
		this.teacherName = teacherName;
		this.baseSalary = baseSalary;
		this.experienceYears = experienceYears;
		this.hoursPerWeek = hoursPerWeek;
		this.fullTime = fullTime;
	}
	
	protected double getSalary() {
		if(this.fullTime == true) {
			return this.baseSalary*this.experienceYears*1.1;
		}else {
			return this.baseSalary*this.hoursPerWeek;
		}

	}

}
