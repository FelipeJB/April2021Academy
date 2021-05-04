package Data;

public class WarnerMediaProject extends Project{

    public WarnerMediaProject() {
        setClientName("Warner Media");
        setName("Analytics");
        setDescription("This is the Warner Media project");
    }

    @Override
    public void printProjectMembers(){
        for (Glober glober:getGlobers()){
            System.out.println(glober.getName()+"  "+glober.getRole().getRoleName());
        }
    }

    @Override
    public String getDescription(){
        return "This is the Warner Media project";
    }

    @Override
    public String toString() {
        return "WarnerMediaProject{" +
                "name='" + name + '\'' +
                ", globers=" + globers +
                ", clientName='" + clientName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
