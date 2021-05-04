package Runner;
import Data.Role;
import Data.Qc;
import Data.Developer;
import Data.ProjectManager;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Create list
        List<Role> roles = new ArrayList<>();

        //Instantiate objects
        Qc qc = new Qc (4, "Calendar - Deloitte", "Senior", "QC", "Jira");
        Developer dev = new Developer (3, "Without project", "Junior", "Developer", "Java");
        ProjectManager pm = new ProjectManager (6, "Yes", "Semi senior advanced", "Project manager");

        //Add objects to the list
        roles.add(qc);
        roles.add(dev);
        roles.add(pm);

        // Cycle to step through and print the list
        for(int i = 0; i < roles.size(); i++){
            System.out.println("- Role: "+roles.get(i).getRoleName()+ ", Salary: "+roles.get(i).getSalary()+", Seniority: "+roles.get(i).getSeniority()+", Project: "+roles.get(i).getProject()+"\n  Basic responsibilities: "+roles.get(i).getResponsibilities()+"\n");
        }

    }
}