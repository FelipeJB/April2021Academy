package globant.university;


import java.util.ArrayList;

public class Student extends Person{
    private int qualification;

    public Student() {
    }

    public Student(int id, String firstName, String middleName, String lastName, String email,
                   String address, String gender, int phonenumber, int qualification) {
        super(id, firstName, middleName, lastName, email, address, gender, phonenumber);
        this.qualification= qualification;
    }

    //Student initialize constructor
    public Student(int y, String Karla, String Daniela, String Gil, String s, String s1, String f, int i, int x, Object o) {
    }

    // This method avoid that Java print the memory references and print the value in each position.

    @Override
    public String toString() {
        return " " +
                "Id: " + getId()
                + ", First Name: " + getFirstName()
                + ", Middle Name: " + getMiddleName()
                + ", Last Name: " + getLastName()
                + ", Email= " + getEmail()
                + ", Address: " + getAddress()
                + ", Gender" + getGender()
                + ", Phone Number: " + getPhoneNumber()
                + ", Qualification: " + qualification

                + ' ';
    }


}


