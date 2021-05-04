package Runner;

import Position.JuniorEngineer;
import Position.Rol;
import Position.SeniorEngineer;
import Position.TechLead;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String args[]){

        List<Rol> roles = new ArrayList<>();
        JuniorEngineer juniorEngineer = new JuniorEngineer("Name1", 12.5f, true);
        SeniorEngineer seniorEngineer = new SeniorEngineer("Name2", 20.7f, false);
        TechLead techLead = new TechLead("Name3", 36.1f, true);

        roles.add(juniorEngineer);
        roles.add(seniorEngineer);
        roles.add(techLead);


        for (int i = 0; i < roles.size(); i++){
            roles.get(i).role();
            System.out.println("The employee " + roles.get(i).getName() + " has a salary of " + roles.get(i).getSalary() + " and, currently does he/she have project?: " + roles.get(i).getOnProject());
            roles.get(i).duty();
            System.out.println("\n");
        }

    }

}
