package globant.university;


import java.util.ArrayList;

public class Teacher extends Person {
    private boolean fullTime;
    private boolean partTime;


    public Teacher() {
    }

    public Teacher(boolean fullTime, boolean partTime) {
        this.fullTime = fullTime;
        this.partTime = partTime;

    }

    public Teacher(int id, String firstName, String middleName, String lastName, String email, String address, String gender, int phonenumber, boolean fullTime, boolean partTime) {
        super( id, firstName, middleName, lastName, email, address, gender, phonenumber);
        this.fullTime = fullTime;
        this.partTime = partTime;

    }
    //Teacher initialize constructor
    public Teacher(int z, String Karla, String Daniela, String Gil, String s, String s1, String f, int i, boolean b, boolean b1, Object o) {
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }

    public boolean isPartTime() {
        return partTime;
    }

    public void setPartTime(boolean partTime) {
        this.partTime = partTime;
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
                +  ", fullTime" + fullTime
                + ", PartTime" + partTime

                + ' ';
    }


}

