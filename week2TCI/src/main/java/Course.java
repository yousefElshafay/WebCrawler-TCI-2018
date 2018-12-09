import java.util.Date;
import java.util.GregorianCalendar;

public class Course {
    private String name;
    private Date begin_date, end_date;

    public Course(String name, GregorianCalendar start_date, GregorianCalendar end_date) throws CourseDataException {

    }

    public String getName() {
        return name;
    }

    public Date getBegin_date() {
        return begin_date;
    }

    public Date getEnd_date() {
        return end_date;
    }
}