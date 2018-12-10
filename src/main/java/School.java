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

    public List<String> getCourses() {
        List<String> courselist = new ArrayList<>();
        for (Course existingcourse: courses)
        {
            courselist.add(existingcourse.getCoursename());
        }
        return courselist;
    }

    public boolean AddCourse(Course newcourse) throws DuplicateCourseException,CourseDateIsinvalidException
    {
        for (Course existingcourse: courses)
        {
            // check if newcoursename  is already present

            if (existingcourse.getCoursename() == newcourse.getCoursename())
                {
                    throw  new DuplicateCourseException();
                }
        }

        // checks for course date
        if ((openingDate).after(newcourse.getCoursestartDate()))
        {
            throw new CourseDateIsinvalidException();
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
