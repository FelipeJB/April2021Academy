package PersonData;

public class Teacher extends Person{
	
	private double baseSalary;
	private double fullSalary; 
	private double partSalary;
	private int experiencedYears;
	private int teacherType;
		
	
	public Teacher (String name, String lastName, int age, int id,  double baseSalary, double fullSalary, double partSalary, int experiencedYears, int teacherType) {
		super(name, lastName, age, id);
		this.baseSalary = baseSalary;
		this.fullSalary = fullSalary;
		this.partSalary = partSalary;
		this.experiencedYears = experiencedYears;
		this.teacherType = teacherType;
	}


	public double getBaseSalary() {
		return baseSalary;
	}


	public void setBaseSalary(double baseSalary) {
		this.baseSalary = 1000000;
	}


	public double getFullSalary() {
		return fullSalary = (baseSalary * (experiencedYears*1.1));
	}


	public void setFullSalary(double fullSalary) {
		this.fullSalary = fullSalary;
	}


	public double getPartSalary() {
		return partSalary  = (baseSalary * 5);
	}


	public void setPartSalary(double partSalary) {
		this.partSalary = partSalary;
	}


	public int getExperiencedYears() {
		return experiencedYears;
	}


	public void setExperiencedYears(int experiencedYears) {
		this.experiencedYears = experiencedYears;
	}


	public int getTeacherType() {
		return teacherType;
	}


	public void setTeacherType(int teacherType) {
		this.teacherType = teacherType;
	}


	@Override
	public String toString() {
		return this.getName() + " " + this.getLastName();
	}
	
	

}
