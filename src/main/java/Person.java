public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected int id;
    protected int age;

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person(int id, String firstName, String lastName, int age){
        this.id = getId();
        this.firstName = getFirstName();
        this.lastName = getLastName();
        this.age = getAge();
    }
}
