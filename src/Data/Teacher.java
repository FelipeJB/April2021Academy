package Data;

import java.util.ArrayList;
import java.util.List;

public abstract class Teacher {
    protected String name;
    protected int baseSalary;


    public Teacher(String name, int baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public abstract int calculateSalary();


}
