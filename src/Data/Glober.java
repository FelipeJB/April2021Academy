package Data;

public abstract class Glober {

    protected String name;
    protected int salary;
    protected String project;
    protected String role;
    //protected String responsibility;

    public Glober(String name, int salary, String project){
        this.name = name;
        this.salary = salary;
        this.project = project;
    }

    //Abstract methods (for all roles)
    public abstract String printName();
    public abstract String printFullName();
    public abstract String speakEnglish();
    public abstract String getTrained();



    //Public methods (for specific roles)
    public String debugCode(){
        return "Los Dev y los TAE depuran el código antes de pasarlo a pruebas";
    }

    public String generateScripts() {
        return "Generar scripts con herramientas de desarrollo";
    }


}
