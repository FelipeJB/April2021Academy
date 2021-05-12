import java.util.ArrayList;
import java.util.List;

public class Subject {

    protected int roomNumber;
    protected String subjectName;

    public Subject (int roomNumber, String subjectName){
        this.roomNumber = roomNumber;
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public  int getRoomNumber(){
        return roomNumber;
    }
}