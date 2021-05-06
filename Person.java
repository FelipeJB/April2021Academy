package GlobantStructure;


public class Person extends Glober {


    protected double year;
    protected int personalId;
    protected int phone;


    public Person(String name, String email, int personalId, double year, int phone){
        super(name, email);
        this.year = year;
        this.personalId = personalId;
        this.phone = phone;
        }

        public String Globername(){
        return name;
        }

    public String Globeremail(){
        return email;
    }

    public double Globeryear(){
        return year;
    }

    public int GloberpersonalId(){
        return personalId;
    }

    public int Globerphone(){
        return phone;
    }
}
