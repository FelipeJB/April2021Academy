package EmployeeData;

import PersonalData.Glober;

public class Employee extends Glober{
	
	private String functions;
	private double salary;
	private double netSalary; 
	
	public Employee (String name, String lastName, int age, String location, int catOption, String functions, double salary, double netSalary) {
		super(name, lastName, age, location, catOption);
		this.functions = functions;
		this.salary = salary;
		this.netSalary = netSalary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public double getNetSalary() {
		return netSalary;
	}
	
	public void setNetSalary() {
		netSalary = (salary-(salary * 0.10));
	}
	
	public String getFunctions() {
		return functions;
	}
		
	public void setSalaryFunctionsGlober(int catOption) {
			
			switch (catOption){
			
			case(1):
				functions = "Trabaja como Junior";
				salary = 2000000;
				setNetSalary();
			break;
			
			case(2):
				functions = "Trabaja como Semi Senior";
				salary = 4000000;
				setNetSalary();
			break;
			
			case(3):
				functions = "Trabaja como Semi Senior Advance";
				salary = 6000000;
				setNetSalary();
			break;
			
			case(4):
				functions = "Trabaja como Senior";
				salary = 8000000;
				setNetSalary();
				break;
			
			case(5):
				functions = "Trabaja como Senior Level I";
				salary = 10000000;
				setNetSalary();
			break;
			}
	}
}
