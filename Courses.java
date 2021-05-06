package GlobantStructure;

public class Courses extends Role{

    boolean courses = true;
    String oferedCourses;

    public Courses(boolean courses, String role, String oferedCourses){
        super(role);
        this.courses = courses;
        this.oferedCourses = oferedCourses;
    }

    public void myOffer(){
        if(courses) {
            System.out.println("I have offered the course related to " + oferedCourses);
        } else {
            System.out.println("I haven't programme any course");
        }
    }
}
