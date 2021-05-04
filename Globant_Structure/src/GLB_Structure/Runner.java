package GLB_Structure;

public class Runner {

        public static void main(String[] args) {

            Glober glb = new Glober();
            glb.setName("John");
            System.out.println(glb.getName());
            glb.setExperienceYears(7);
            System.out.println(glb.getExperienceYears());
            glb.setGloberRole("Senior");
            System.out.println(glb.getGloberRole());
            glb.getResponsibilities();
            System.out.println(glb.getResponsibilities());
            glb.getSalary();
            System.out.println(glb.getSalary());





    }
}
