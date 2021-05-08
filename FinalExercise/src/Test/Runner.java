package Test;

import Data.FullTimeTeacher;
import Data.PartTimeTeacher;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

    }

    public static void initializeFullTimeTeacher(ArrayList<FullTimeTeacher> fullTimeTeachers){

        FullTimeTeacher fullTimeTeacher1 = new FullTimeTeacher("Juan", 35, 3000000, 10);
        FullTimeTeacher fullTimeTeacher2 = new FullTimeTeacher("Pedro", 27, 2500000, 5);

        fullTimeTeachers.add(fullTimeTeacher1);
        fullTimeTeachers.add(fullTimeTeacher2);
    }

    public static void initializePartTimeTeacher(ArrayList<PartTimeTeacher> partTimeTeachers){

        PartTimeTeacher partTimeTeacher1 = new PartTimeTeacher("Carlos", 36, 2000000, 20);
        PartTimeTeacher partTimeTeacher2 = new PartTimeTeacher("Javier", 30, 1500000, 15);

        partTimeTeachers.add(partTimeTeacher1);
        partTimeTeachers.add(partTimeTeacher2);
    }

}
