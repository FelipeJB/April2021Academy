package Person;

public class Student extends Person{

    private int age;
    private float score;

    //Defined Constructor
    public Student (int id, String name, int age, float score){
        super(id, name);
        this.age = age;
        this.score = score;
    }

    //Getters and Setters section
    @Override
    public int getId(){
        return this.id;
    }
    @Override
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }
}
