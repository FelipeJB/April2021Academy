package GlobantStructure;

import java.util.Scanner;

public class main {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Person person = new Person("Fabio", "fabio.alarcon", 10324342, 0.5, 312234123);
        String nameG = person.Globername();
        String emailG = person.Globeremail();
        int IdG = person.GloberpersonalId();
        double yearG = person.Globeryear();
        int phoneG = person.Globerphone();

        System.out.println("This is the basic glober information: \nThe name of the glober is " + nameG +
                "\nhis/her email is " + emailG + "\nhis/her ID is " + IdG + "\nhis/her working years in Globant is " +
                yearG + "\nhis/her phone number is " + phoneG);


        Responsabilities performance = new Responsabilities(true,"Teach lead");
        performance.RoleOptiones();
        performance.Duties();
        performance.Role();
        salary(performance);

        Courses freeTime = new Courses(true,"Teach Lead","QC Foundamentals");
        freeTime.myOffer();
        salary(freeTime);


    }

    public static void salary(Role role){
        if(role instanceof Responsabilities){
            System.out.println("Your salary is the standard");
        }
        else if(role instanceof Courses){
            System.out.println("Your salary increase in 5% by course given");
        }
    }
    }

