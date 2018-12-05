import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Course {

    private String Name;
    private Date StartDate;
    private  Date EndDate;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getStartDate() {
        return StartDate;
    }

    public void setStartDate(Date startDate) {
        StartDate = startDate;
    }

    public Date getEndDate() {
        return EndDate;
    }

    public void setEndDate(Date endDate) {
        EndDate = endDate;
    }

    public Course(String name, Date startDate, Date endDate) {
        Name = name;
        StartDate = startDate;
        EndDate = endDate;
    }


}
