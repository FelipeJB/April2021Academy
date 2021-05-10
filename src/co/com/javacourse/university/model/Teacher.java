package co.com.javacourse.university.model;

public abstract class Teacher extends Person{

    private double basicSalary;
    private String typeOfContract;

    public Teacher(double basicSalary, String name, String typeOfContract) {
        super(name);
        this.basicSalary = basicSalary;
        this.typeOfContract = typeOfContract;
    }

    abstract double getSalary();

    protected double getBasicSalary() {
        return basicSalary;
    }

    @Override
    public String toString() {
        return "Teacher {" +
                "Id=" + super.getId() +
                ", Name=" + super.getName() + '\'' +
                ", Contract info='" + typeOfContract + '\'' +
                ", Salary=" + getSalary() +
                '}';
    }

}
