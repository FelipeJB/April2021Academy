package GLB_Structure;

public abstract  class Professional{

        protected String name;
        protected int experienceYears;
        protected double salary;

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    public abstract String getName();

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getSalary();

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

