import javafx.scene.input.DataFormat;
import org.junit.Assert;
import org.junit.Test;

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
    Date newdate = parseDate("2018-09-01");
    School fontys = new School("fontys", newdate);
    @Test
    public void addCourse() {
        Course TCI = new Course();
        Assert.assertTrue(fontys.AddCourse(TCI));
    }
}