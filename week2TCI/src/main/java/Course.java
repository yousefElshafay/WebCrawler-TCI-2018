import java.util.Date;
import java.util.GregorianCalendar;

public class Course {
    private String name;
    private Date begin_date, end_date;

    public Course(String name, GregorianCalendar start_date, GregorianCalendar end_date) throws CourseDataException {
        this.name = name;
        if(!start_date.equals(null) || !end_date.equals(null)){
            if(end_date.after(start_date)){
                this.begin_date = start_date.getTime();
                this.end_date = end_date.getTime();
            } else {
                throw new CourseDataException("The end date should be after the begin date!");
            }
        }
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