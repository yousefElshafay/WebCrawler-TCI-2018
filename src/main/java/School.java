import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class School {

    private String Schoolname ;
    private Date openingDate;
    private List<Course>courses;


    public School(String schoolname, Date openingDate) {
        Schoolname = schoolname;
        this.openingDate = openingDate;
    }

    public boolean AddCourse(Course newcourse)
    {
        courses = new ArrayList<>();
        if (courses.add(newcourse)){
          return true;
         }
         else
        {
            return false;
        }
    }

}
