package Data;


public class PartTimeTeacher extends Teacher {

    private int hoursWeek;

    public PartTimeTeacher(String name, int ID, int age, double baseSalary, int hoursWeek) {
        super(name, ID, age, baseSalary);
        this.hoursWeek = hoursWeek;
    }

    public double calculateSalary() {
        return baseSalary * hoursWeek;
    }

}
