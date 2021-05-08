package co.com.javacourse.university.model;

public abstract class Teacher{

    private double basicSalary;
    private String name;
    private String typeOfContract;

    public Teacher(double basicSalary, String name, String typeOfContract) {
        this.basicSalary = basicSalary;
        this.name = name;
        this.typeOfContract = typeOfContract;
    }

    abstract double getSalary();

    protected double getBasicSalary() {
        return basicSalary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "Name=" + name + '\'' +
                ", Contract info='" + typeOfContract + '\'' +
                ", Salary=" + getSalary() +
                '}';
    }
}
