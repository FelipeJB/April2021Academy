package Data;

public class DisneyProject extends Project{

    public DisneyProject() {
        setClientName("Disney");
        setName("Plus");
        setDescription("This is the Disney plus Project");
    }

    @Override
    public void printProjectMembers(){
        for (Glober glober:getGlobers()){
            System.out.println(glober.getName()+"  "+glober.getRole().getRoleName());
        }
    }

    @Override
    public String getDescription(){
        return "This is the Disney plus Project";
    }

    @Override
    public String toString() {
        return "DisneyProject{" +
                "name='" + name + '\'' +
                ", globers=" + globers +
                ", clientName='" + clientName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
