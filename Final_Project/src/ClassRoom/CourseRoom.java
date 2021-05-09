package ClassRoom;

public class CourseRoom extends ClassRoom{

    public CourseRoom(int idClass, String name){
        super(idClass, name);
    }

    @Override
    public int getIdClass() {
        return this.idClass;
    }

    @Override
    public String getName() {
        return this.name;
    }

    //Two Lists of Teachers and Students

}
