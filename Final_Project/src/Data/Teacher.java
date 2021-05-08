package Data;

public abstract class Teacher extends Person{

    private float baseSalary;

    public Teacher (String pName, float pBaseSalary){
        super(pName);
        this.baseSalary = pBaseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public abstract float calculateSalary();

    }



