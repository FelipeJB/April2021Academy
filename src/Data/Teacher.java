package Data;

import java.math.BigDecimal;

public class Teacher extends Person {
	


	private double baseSalary;
	private int experienceYears;
	private int hoursPerWeek;
	private boolean fullTime;
	
	/**
	 * @param name
	 * @param id
	 * @param baseSalary
	 * @param experienceYears
	 * @param hoursPerWeek
	 * @param fullTime
	 */
	public Teacher(String name, double baseSalary, int experienceYears, int hoursPerWeek, boolean fullTime) {
		super(name);
		this.baseSalary = baseSalary;
		this.experienceYears = experienceYears;
		this.hoursPerWeek = hoursPerWeek;
		this.fullTime = fullTime;
	}

	

	
	/**
	 * @return the baseSalary
	 */
	public double getBaseSalary() {
		return baseSalary;
	}


	/**
	 * @return the experienceYears
	 */
	public int getExperienceYears() {
		return experienceYears;
	}

	/**
	 * @return the hoursPerWeek
	 */
	public int getHoursPerWeek() {
		return hoursPerWeek;
	}


	/**
	 * @return the fullTime
	 */
	public boolean isFullTime() {
		return fullTime;
	}



	/**
	 * @param baseSalary the baseSalary to set
	 */
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}




	/**
	 * @param experienceYears the experienceYears to set
	 */
	public void setExperienceYears(int experienceYears) {
		this.experienceYears = experienceYears;
	}




	/**
	 * @param hoursPerWeek the hoursPerWeek to set
	 */
	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}




	/**
	 * @param fullTime the fullTime to set
	 */
	public void setFullTime(boolean fullTime) {
		this.fullTime = fullTime;
	}




	public String getSalary() {
		if(this.fullTime == true) {
			return String.format("%.0f", (this.baseSalary*this.experienceYears*1.1)) ;
		}else {
			return String.format("%.0f", (this.baseSalary*this.hoursPerWeek));
		}

	}

}
