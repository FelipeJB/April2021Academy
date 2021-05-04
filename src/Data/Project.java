package Data;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public abstract class Project {
    protected String name;
    protected List<Glober> globers;
    protected String clientName;
    protected String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGlobers(List<Glober> globers) {
        this.globers = globers;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Glober> getGlobers() {
        return globers;
    }

    public String getClientName() {
        return clientName;
    }


    public void printProjectMembers(){
        for (Glober glober:globers){
            System.out.println(glober.toString());
        }
    }

    public void newMembers(List <Glober> globerList){
        globers = globerList;
    }

    public void newMembers(Glober glober){
        if (globers == null){
            this. globers = new ArrayList<>();
        }
        globers.add(glober);
    }

    public abstract String getDescription();

}
