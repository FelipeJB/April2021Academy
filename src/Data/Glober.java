package Data;

public abstract class Glober {
	
	protected float salary;
	protected String fullName;
	protected String assignment;
	

	public Glober(float newSalary, String newFullName) {
		
		this.fullName = newFullName;
		this.salary = newSalary;
		// TODO Auto-generated constructor stub
	}


	public float getSalary() {
		return salary;
	}


	public String getFullName() {
		return fullName;
	}
	
	public String getAssignment() {
		return assignment;
	}
	
	public abstract void setResponsabilities();
	
	
	public void setProject(String option) {
		// TODO Auto-generated method stub
		if(option.equals("Y")) {
			this.assignment ="The glober has assigned a project";
		}
		else {
			this.assignment ="The glober doesn't have assigned a project yet";
		}
	}




	
	

}
