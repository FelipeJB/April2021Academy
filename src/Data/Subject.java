package Data;

import java.util.ArrayList;

public class Subject {
	protected String className;
	protected String classRoom;
	protected Teacher teacherClass;
	ArrayList<Student> classStudent = new ArrayList<>();

	/**
	 * @param className
	 * @param classRoom
	 * @param teacherClass
	 * @param classStudent
	 */
	protected Subject(String className, String classRoom, Teacher teacherClass) {
		super();
		this.className = className;
		this.classRoom = classRoom;
		this.teacherClass = teacherClass;
		
	}

	public Subject() {
		// TODO Auto-generated constructor stub
	}

}
