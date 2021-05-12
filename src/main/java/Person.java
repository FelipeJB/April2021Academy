public abstract class Person {
    protected String firstName;
    protected String lastName;
    protected String fullName;
    protected int id;
    protected int age;

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.fullName = firstName + " " + lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(int id, String firstName, String lastName, int age){
        this.id = getId();
        this.firstName = getName();
        //this.lastName = getLastName();
        this.age = getAge();
    }
}