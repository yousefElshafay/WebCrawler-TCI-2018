import java.util.Date;

public class Course {


    private  String  Coursename;
    private Date CoursestartDate;
    private  Date CourseEndDate;


    public Course(String name, Date startD, Date EndD)
    {
        this.Coursename = name ;
        this.CoursestartDate = startD;
        this.CourseEndDate = EndD;
    }

    public void setCoursename(String coursename) {
        Coursename = coursename;
    }
    public String getCoursename() {
        return Coursename;
    }

    public void setCoursestartDate(Date coursestartDate) {
        CoursestartDate = coursestartDate;
    }

    public Date getCoursestartDate() {
        return CoursestartDate;
    }

    public void setCourseEndDate(Date courseEndDate) {
        CourseEndDate = courseEndDate;
    }

    public Date getCourseEndDate() {
        return CourseEndDate;
    }

}
