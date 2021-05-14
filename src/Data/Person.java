package Data;

public class Person {
	private String Name;
	private int id;
	private static int count = 0;

	

	public String getName() {
		return Name;
	}

	/**
	 * @return the id
	 */
	protected int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	protected void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		Name = name;
	}

	/**
	 * @param name
	 * @param id
	 */
	public Person(String name) {
	
		Name = name;
		this.id = Person.count++;
	}

	

}
