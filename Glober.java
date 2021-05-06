package GlobantStructure;

public abstract class Glober {

    protected String name;
    protected String email;

    public Glober(String name, String email){
        this.name = name;
        this.email = email;
    }

    public abstract String Globername();

    public abstract String Globeremail();

    public abstract double Globeryear();

    public abstract int GloberpersonalId();

    public abstract int Globerphone();

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
