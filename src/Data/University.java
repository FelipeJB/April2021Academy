package Data;

import java.util.ArrayList;

public class University {
	private ArrayList<Student> uStudent = new ArrayList<>();
	private ArrayList<Teacher> uTeacher = new ArrayList<>();
	private ArrayList<Subject> uSubject = new ArrayList<>();
	/**
	 * @return the uStudent
	 */
	public ArrayList<Student> getuStudent() {
		return uStudent;
	}
	/**
	 * @param uStudent the uStudent to set
	 */
	public void setuStudent(ArrayList<Student> uStudent) {
		this.uStudent = uStudent;
	}
	/**
	 * @return the uTeacher
	 */
	public ArrayList<Teacher> getuTeacher() {
		return uTeacher;
	}
	/**
	 * @param uTeacher the uTeacher to set
	 */
	public void setuTeacher(ArrayList<Teacher> uTeacher) {
		this.uTeacher = uTeacher;
	}
	/**
	 * @return the uSubject
	 */
	public ArrayList<Subject> getuSubject() {
		return uSubject;
	}
	/**
	 * @param uSubject the uSubject to set
	 */
	public void setuSubject(ArrayList<Subject> uSubject) {
		this.uSubject = uSubject;
	}
	
	


	

}
