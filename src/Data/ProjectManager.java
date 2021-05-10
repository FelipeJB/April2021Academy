package Data;

public class ProjectManager extends Glober implements LeadResponsibilities {

    //constructor
    public ProjectManager(String name, int salary, String project, String role) {
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
    public String  speakEnglish() {
        return "El PM debe tener como mínimo nivel C1 de Inglés";

    }

    @Override
    public String getTrained() {
        return "El PM debe formarse en cursos de Liderazgo, habilidades blandas, trabajo en equipo y metodologías Ágiles";

    }

    //methods from abstract class "Lead Responsibilities"
    @Override
    public String leadPeople() {
        return "El PM lidera y gestiona proyectos con equipos de más de 5 personas de diferentes roles";

    }

    @Override
    public String assessResults() {
        return "El PM evalúa el desempeño y los resultados de cada uno de los integrantes del equipo";

    }


}
