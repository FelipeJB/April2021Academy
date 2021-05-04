package GLB_Structure;

import java.util.ArrayList;

public class Glober extends Professional {

    private String globerRole;

    public int getExperienceYears() {
        return experienceYears;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        if (globerRole.equals("Junior")) {
            salary = 1000000;
            return salary;
        }
        if (globerRole.equals("SemiSenior")) {
            salary = 3000000;
            return salary;
        }
        if (globerRole.equals("SemiSeniorAdc")) {
            salary = 5000000;
            return salary;
        }
        if (globerRole.equals("Senior")) {
            salary = 7000000;
            return salary;
        }
        if (globerRole.equals("SeniorLevel2")) {
            salary = 9000000;
            return salary;
        }
        if (globerRole.equals("SeniorLevel3")) {
            salary = 11000000;
            return salary;
        }
        return getSalary();

}

    public String getGloberRole() {
        return globerRole;
    }

    public void setGloberRole(String globerRole) {
        this.globerRole = globerRole;
    }

    public ArrayList<String> getResponsibilities() {
        if (globerRole.equals("Junior")) {
            ArrayList<String> resp = new ArrayList<>();
            resp.add("Ownership");
            resp.add("Proactivity");

            for (int i = 0; i < resp.size(); i++) {
                resp.get(i);
            }
            return resp;
        }
        if (globerRole.equals("SemiSenior")) {
            ArrayList<String> resp = new ArrayList<>();
            resp.add("Ownership");
            resp.add("Proactivity");
            resp.add("Handle Metrics");
            resp.add("Team leading");
            resp.add("Task Management");
            resp.add("Conflict Resolution");
            resp.add("Handle status report");

            for (int i = 0; i < resp.size(); i++) {
                        resp.get(i);
            }
            return resp;
        }
        if (globerRole.equals("SemiSeniorAdvc")) {
            ArrayList<String> resp = new ArrayList<>();
            resp.add("Ownership");
            resp.add("Proactivity");
            resp.add("Coaching");
            resp.add("Handle Metrics");
            resp.add("Team leading");
            resp.add("Task Management");
            resp.add("Conflict Resolution");
            resp.add("Handle status report");
            resp.add("Client Orientation");
            resp.add("Sense of urgency");
            resp.add("Goal oriented");

            for (int i = 0; i < resp.size(); i++) {
                resp.get(i);
            }
            return resp;
        }
        if (globerRole.equals("Senior")) {
            ArrayList<String> resp = new ArrayList<>();
            resp.add("Ownership");
            resp.add("Proactivity");
            resp.add("Coaching");
            resp.add("Delegation");
            resp.add("Handle Metrics");
            resp.add("Team leading");
            resp.add("Task Management");
            resp.add("Conflict Resolution");
            resp.add("Handle status report");
            resp.add("Client Orientation");
            resp.add("Sense of urgency");
            resp.add("Goal oriented");
            resp.add("Multiple teams leads");
            resp.add("Give feedback");
            resp.add("Lead teams in different geographical locations");

            for (int i = 0; i < resp.size(); i++) {
                resp.get(i);
            }
            return resp;
        }
        if (globerRole.equals("SeniorLevel2")) {
            ArrayList<String> resp = new ArrayList<>();
            resp.add("Ownership");
            resp.add("Proactivity");
            resp.add("Coaching");
            resp.add("Delegation");
            resp.add("Communicator");
            resp.add("Handle Metrics");
            resp.add("Team leading");
            resp.add("Task Management");
            resp.add("Conflict Resolution");
            resp.add("Handle status report");
            resp.add("Client Orientation");
            resp.add("Sense of urgency");
            resp.add("Goal oriented");
            resp.add("Multiple teams leads");
            resp.add("Give feedback");
            resp.add("Handle Status Report");
            resp.add("Risk Management");
            resp.add("Promote best practices");
            resp.add("Lead teams in different geographical locations");

            for (int i = 0; i < resp.size(); i++) {
                resp.get(i);
            }
            return resp;
        }
        if (globerRole.equals("SeniorLevel3")) {
            ArrayList<String> resp = new ArrayList<>();
            resp.add("Ownership");
            resp.add("Proactivity");
            resp.add("Coaching");
            resp.add("Delegation");
            resp.add("Mentoring");
            resp.add("Communicator");
            resp.add("Handle Metrics");
            resp.add("Team leading");
            resp.add("Task Management");
            resp.add("Conflict Resolution");
            resp.add("Handle status report");
            resp.add("Client Orientation");
            resp.add("Sense of urgency");
            resp.add("Goal oriented");
            resp.add("Multiple teams leads");
            resp.add("Give feedback");
            resp.add("Handle Status Report");
            resp.add("Risk Management");
            resp.add("Promote best practices");
            resp.add("Champion/Site Collaborator");
            resp.add("Staffing Collaborator");
            resp.add("Recruiting Collaborator");
            resp.add("Lead teams in different geographical locations");

            for (int i = 0; i < resp.size(); i++) {
                resp.get(i);
            }
            return resp;
        }
        return getResponsibilities();
    }
}


