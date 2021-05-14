package Data;

import java.util.ArrayList;

public class Subject {
	private String className;
	private String classRoom;
	private Teacher teacherClass;
	private ArrayList<Student> classStudent = new ArrayList<>();

	/**
	 * @param className
	 * @param classRoom
	 * @param teacherClass
	 * @param classStudent
	 */
	public Subject(String className, String classRoom, Teacher teacherClass) {
		super();
		this.className = className;
		this.classRoom = classRoom;
		this.teacherClass = teacherClass;
		
	}

	/**
	 * @return the className
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * @param className the className to set
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @return the classRoom
	 */
	public String getClassRoom() {
		return classRoom;
	}

	/**
	 * @param classRoom the classRoom to set
	 */
	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	/**
	 * @return the teacherClass
	 */
	public Teacher getTeacherClass() {
		return teacherClass;
	}

	/**
	 * @param teacherClass the teacherClass to set
	 */
	public void setTeacherClass(Teacher teacherClass) {
		this.teacherClass = teacherClass;
	}

	/**
	 * @return the classStudent
	 */
	public ArrayList<Student> getClassStudent() {
		return classStudent;
	}

	/**
	 * @param classStudent the classStudent to set
	 */
	public void setClassStudent(ArrayList<Student> classStudent) {
		this.classStudent = classStudent;
	}

	
}
