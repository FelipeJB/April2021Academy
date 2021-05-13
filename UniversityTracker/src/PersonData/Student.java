package PersonData;

public class Student extends Person {
	
	private int studentId;
	
	public Student (String name, String lastName, int age, int id, int studentId) {
		super(name, lastName, age, id);
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		
		return this.getName() + " " + this.getLastName();
	}
	
	
	
	
}
