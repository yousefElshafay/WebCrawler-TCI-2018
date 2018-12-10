import javafx.scene.input.DataFormat;
import org.junit.Assert;
import org.junit.Test;
import sun.util.calendar.LocalGregorianCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.*;

public class SchoolTest {


    // parse date to avoid deprecation erro

    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
    // create school class
    Date newdate = parseDate("1993-09-01");
    School fontys = new School("fontys", newdate);
    @Test
    public void addCourse() throws DuplicateCourseException {

        // create course
        Date coursestartdate = parseDate("2018-09-01");
        Date courseenddate = parseDate("2018-011-16");


        Course TCI = new Course("TCI",coursestartdate,courseenddate);
        Assert.assertEquals(true, fontys.AddCourse(TCI));
    }
}