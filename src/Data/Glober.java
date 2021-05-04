package Data;

public class Glober {
    private String name;
    private int salary;
    private boolean isActive;
    private int id;
    private Role role;

    public Glober(String name, int salary, int id, Role role) {
        this.name = name;
        this.salary = salary;
        this.isActive = true;
        this.id = id;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Glober{" +
                "name='" + name + '\'' +
                //", salary=" + salary +
                //", isActive=" + isActive +
                //", id=" + id +
                ", role=" + role.getRoleName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setDesactive() {
        isActive = false;
    }

    public int getId() {
        return id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public void setId(int id) {
        this.id = id;
    }
}
