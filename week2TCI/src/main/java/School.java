import java.util.*;

public class School {

    //
    private String name;
    private Date openingDate;
    private ArrayList<Course> courses;



    public School(String name, GregorianCalendar openingDate) throws CourseDataException {

        if(!name.isEmpty() && openingDate != null) {
            this.name = name;
            this.openingDate = openingDate.getTime();

        }
    }

    public String getName() {
        return name;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public ArrayList<Course> addCourse(Course course)  {
       return null;
    }


    public ArrayList<String> getAllCourseNames(){

        return null;
    }
}
