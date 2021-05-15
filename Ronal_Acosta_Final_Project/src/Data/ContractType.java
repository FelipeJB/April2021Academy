package Data;

public class ContractType implements TeacherType{

    private static final String fulltime ="Full-time contract";
    private static final String parttime ="Part-time contract";

    @Override
    public double getSalary(int activeHoursWeek, int experienceYears) {
        if(activeHoursWeek>=35) {
            return (baseSalary * (1.10 * experienceYears));
        }
        if(activeHoursWeek >0 && activeHoursWeek <=35) {
            return (baseSalary * activeHoursWeek);
        }
        return 0;
    }

    public static String getFulltime() {
        return fulltime;
    }

    public static String getParttime() {
        return parttime;
    }

    public String getTypeOfContract(int activeHoursWeek, int experienceYears) {
        if(activeHoursWeek>=35) {
            return fulltime;
        }
        if(activeHoursWeek >0 && activeHoursWeek <=35) {
            return parttime;
        }
        return null;
    }



}
