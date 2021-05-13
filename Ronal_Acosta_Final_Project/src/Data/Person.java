package Data;

public class Person {
    private static int count = 0;
    private int id = 0;
    private int age;
    private String name;


    public Person(int age,String name)
    {
        this.age=age;
        this.name=name;
        id=count++;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
