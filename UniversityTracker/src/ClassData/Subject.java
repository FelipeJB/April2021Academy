package ClassData;

import java.util.ArrayList;

import PersonData.Student;
import PersonData.Teacher;

public class Subject extends Classroom {
	
	private String name;
	private int hour;
	private Teacher teacher;
	private ArrayList<Student> student;
	
	public Subject (int roomNumber, int hour, String name, Teacher teacher) {
		
		super(roomNumber);
		this.name = name;
		this.hour = hour;
		this.teacher = teacher;
		this.student = new ArrayList<Student>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public ArrayList<Student> getStudent() {
		return student;
	}

	public void setStudent(ArrayList<Student> student) {
		this.student = student;
	}

	public void addStudent(Student student) {
		this.student.add(student);
	}
	
	public String listStudentSubject(){
		
		String listName = "";
		
		for (int i = 0; i < student.size(); i++) {
			
			String fullName = student.get(i).toString();
			listName = listName + ", " + fullName;
		}
		return listName;
	}

}
