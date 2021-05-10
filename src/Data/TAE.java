package Data;



public class TAE extends Glober implements LeadResponsibilities, QualityResponsibilities {

    //constructor
    public TAE(String name, int salary, String project, String role) {
        super(name, salary, project);
        this.role = role;
    }

    //methods from abstract class "Glober"
    @Override
    public String printName() {
        return this.name;
    }

    @Override
    public String printFullName() {
        return "El Glober " + this.name + " tiene un salario asignado de $ " + this.salary + " y " + this.project + " tiene proyecto asignado \n" + "Su cargo es: " + this.role;
    }

    @Override
    public String speakEnglish() {
        return "El TAE debe tener como mínimo nivel B2 de Inglés";
    }

    @Override
    public String getTrained() {
        return "El TAE debe formarse en cursos avanzados de Automatización de Pruebas";

    }

    @Override
    public String debugCode() {
        return super.debugCode();
    }

    @Override
    public String generateScripts() {
        return super.generateScripts();
    }

//methods from "Lead Responsibilities" interface
    @Override
    public String leadPeople() {
        return "El TAE lidera el equipo de automatización de pruebas y puede ayudar a optimizar pruebas manuales y de performance";

    }

    @Override
    public String assessResults() {
        return "El TAE evalúa los resultados de las pruebas automatizadas y genera informes";

    }

    //methods from "Quality Responsibilities" interface
    @Override
    public String runTests() {
        return "El TAE diseña y ejecuta las pruebas automatizadas, sube las evidencias y genera informes";

    }

    @Override
    public String reportBugs() {
        return "El TAE reporta los errores encontrados en las pruebas automatizadas";

    }
}
