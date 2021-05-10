package Data;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class SeniorQC extends Glober implements LeadResponsibilities, QualityResponsibilities {
    //private String name = "Pedro";
    //private int salary;
    //private String project;
    //private String role = "Senior QC Analyst";
    //private String responsibility;

    public SeniorQC(String name, int salary, String project, String role) {
        super(name, salary, project);
        this.role = role;
    }

    //abstract methods from Glober class
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
        return "El Senior QC debe tener como mínimo nivel B2 de Inglés";
    }

    @Override
    public String getTrained() {
        return "El Senior QC Debe formarse en cursos avanzados de Testing";
    }

    //methods from "Quality Responsibilities" interface
    @Override
    public String runTests() {
        return "El Senior QC Diseña, aprueba y ejecuta casos de prueba manual y genera informes y métricas";

    }

    @Override
    public String reportBugs() {
        return "El Senior QC Reporta los errores, les hace seguimiento y realiza informes de seguimiento";
    }

    //methods from "Lead Responsibilities" interface
    @Override
    public String leadPeople() {
        return "El Senior QC Lidera al equipo de Pruebas";
    }

    @Override
    public String assessResults() {
        return "El Senior QC Evalúa el desempeño y los resultados del equipo de QA";
    }


}
