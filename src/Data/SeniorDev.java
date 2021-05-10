package Data;

public class SeniorDev extends Glober implements LeadResponsibilities{


    //constructor
    public SeniorDev(String name, int salary, String project, String role) {
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
        return "El Senior Dev debe tener como mínimo nivel B2 de Inglés";

    }

    @Override
    public String getTrained() {
        return "El Senior Dev debe formarse en cursos avanzado de Desarrollo y fortalecer habilidades blandas, como liderazgo, trabajo en equipo y metodologías Ágiles";

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
        return "El Senior Dev lidera el equipo de desarrollo y está en capacidad de ser líder técnico del proyecto";

    }

    @Override
    public String assessResults(){
        return "El Senior Dev evalúa los resultados del equipo de desarrollo y levanta los informes de avance con el PM para presentarlos al cliente";

    }

}
