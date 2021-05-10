package Data;

public class JuniorDev extends Glober{


    //constructor
    public JuniorDev(String name, int salary, String project, String role) {
        super(name, salary, project);
        this.role = role;
        //this.responsibility = responsibility;

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
        return"El Junior Dev Debe tener como mínimo nivel B1 de Inglés";

    }

    @Override
    public String getTrained() {
        return "El Junior Dev Debe formarse en cursos básicos e intermedios de Desarrollo";
    }

    @Override
    public String debugCode() {
        return super.debugCode();
    }


}
