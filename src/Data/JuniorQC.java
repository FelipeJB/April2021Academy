package Data;



public class JuniorQC extends Glober implements QualityResponsibilities {


    //constructor
    public JuniorQC(String name, int salary, String project, String role) {
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
        return "El Junior QC Debe tener como mínimo nivel B1 de Inglés";
    }

    @Override
    public String getTrained() {
        return "El Junior QC Debe formarse en cursos básicos e intermedios de Testing";

    }

    //methods from "Quality Responsibilities" interface
    @Override
    public String runTests() {
        return "El Junior QC Diseña y ejecuta casos de prueba manual";

    }

    @Override
    public String reportBugs() {
        return "El Junior QC Reporta los errores y les asigna una prioridad y una severidad";

    }
}
