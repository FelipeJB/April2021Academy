package co.com.javacourse.university.admin;

import co.com.javacourse.university.model.*;
import co.com.javacourse.university.utils.Constans;

public final class UniversityProcess {

    public static String getUniversityName (){
        return "My university";
    }

    public static Teacher createPartTimeTeacher (String name, int activeHours){
        return createTeacher (name,activeHours,null, Constans.PART_TIME_TEACHER);
    }

    public static Teacher createFullTimeTeacher (String name, int experienceYears){
        return createTeacher (name,null,experienceYears, Constans.FULL_TIME_TEACHER);
    }

    static Teacher createTeacher (String name, Integer numberHours, Integer experienceyears, String type){
        switch (type){
            case Constans.PART_TIME_TEACHER:return new PartTimeTeacher(name, numberHours);

            case Constans.FULL_TIME_TEACHER:return new FullTimeTeacher(name, experienceyears);

            default:return null;

        }
    }
}
