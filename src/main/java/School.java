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
        courses = new ArrayList<>();

    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public boolean setCourses(List<Course> courses) {
       this.courses = courses;
       if (courses.size()>0)
       {
           return true;
       }
       else
       {
           return false;
       }
    }

    public String getSchoolname() {
        return Schoolname;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public boolean AddCourse(Course newcourse) throws DuplicateCourseException
    {
        // check if newcoursename  is already present
        for (Course existingcourse: courses)
        {
                if (existingcourse.getCoursename() == newcourse.getCoursename())
                {
                    throw  new DuplicateCourseException();
                }
        }


        if (courses.add(newcourse)){
          return true;
         }
         else
        {
            return false;
        }
    }

    public Course GetCourseByname(String coursename) throws nocoursefoundException
    {
        for (Course existingcourse: courses)
        {
            if (existingcourse.getCoursename()==coursename)
            {
                return existingcourse;
            }
            else
                throw new nocoursefoundException();

        }
        return null;
    }

}
