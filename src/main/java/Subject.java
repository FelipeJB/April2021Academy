import java.util.ArrayList;
import java.util.List;

public class Subject {

    protected static int roomNumber;
    protected static String subjectName;

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

    public static void setRoomNumber(int roomNumber) {
        Subject.roomNumber = roomNumber;
    }

    public static void setSubjectName(String subjectName) {
        Subject.subjectName = subjectName;
    }
}