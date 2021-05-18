package Data;


public abstract class Classroom {

    protected int idClass;
    protected String name;

    public Classroom(int idClass, String name){
        this.idClass = idClass;
        this.name = name;
    }


    public abstract int getIdClass();

    public abstract String getName();
}
