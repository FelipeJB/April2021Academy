public class Student extends Person implements Role{

    public Student(int id, String firstName, String lastName, int age){
        super(id,firstName,lastName,age);
    }

    @Override
    public void learn() {
        System.out.println("I learn");
    }

    @Override
    public void teach() {
        System.out.println("I did not teach");
    }
}
