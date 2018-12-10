import javafx.scene.input.DataFormat;
import org.junit.Assert;
import org.junit.Test;
import sun.util.calendar.LocalGregorianCalendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class SchoolTest {


    Course TCI;
    // parse date to avoid deprecation erro
    Date coursestartdate = parseDate("2018-09-01");
    Date courseenddate = parseDate("2018-011-16");


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
    public void addCourse() throws DuplicateCourseException, CourseDateIsinvalidException {

        // throw date exp  course date

        // create course
         TCI = new Course("TCI",coursestartdate,courseenddate);
        Assert.assertEquals(true, fontys.AddCourse(TCI));
    }

    @Test
    public void getOpeningDate() {
        Assert.assertEquals(parseDate("1993-09-01"),fontys.getOpeningDate());
    }

    @Test
    public void CheckSchoolNameNotnull()
    {
        Assert.assertNotNull(fontys.getSchoolname());
    }

    @Test
    public void CheckSchoolOpeningDateNotnull()
    {
        Assert.assertNotNull(fontys.getOpeningDate());
    }

    @Test
    public void setCourses() {
        List<Course> emptlist = new ArrayList<>();
        // check if assert false works with empty list
        Assert.assertFalse(fontys.setCourses(emptlist));
    }

    @Test
    public void getSchoolname() {
    }

    @Test
    public void getCourses() {
         List<String> mocklist = new ArrayList<>();
        Assert.assertEquals(mocklist,fontys.getCourses());
    }


    @Test
    public void getCourseByname() throws nocoursefoundException {
        //Assert.assertNull(fontys.GetCourseByname("TCI"));
        Assert.assertEquals(TCI,fontys.GetCourseByname("TCI"));
    }



}