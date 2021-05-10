package ClassRoom;

public abstract class ClassRoom {

    protected int idClass;
    protected String name;

    public ClassRoom(int idClass, String name){
        this.idClass = idClass;
        this.name = name;
    }


    public abstract int getIdClass();

    public abstract String getName();
}
