package Data;

public class Student extends Person {
	
	
	private int studentAge;



	
	public int getStudentAge() {
		return studentAge;
	}


	/**
	 * @param name
	 * @param id
	 * @param studentAge
	 */
	public Student(String name,  int studentAge) {
		super(name);
		this.studentAge = studentAge;
	}


	/**
	 * @param studentAge the studentAge to set
	 */
	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}
	
	


	/**
	 * @param name
	 * @param id
	 */
	

	



}

	

