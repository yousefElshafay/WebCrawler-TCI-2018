import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
//import java.util.Calender;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.junit.Assert.assertThat;


public class SchoolTest {
    public static final String name="Fontys";


    List<Course> courseList=new ArrayList<>();



    public SchoolTest() throws ParseException {
    }

    @Test

    public void SchoolConstructerTest() throws ParseException {



        SimpleDateFormat DateFormat = new SimpleDateFormat("MM-dd-yyyy");
        String Date = DateFormat.format( new Date()   );
        Date SchoolOpeningDate       = DateFormat.parse ( "01-01-1997" );
        Date CourseStartDate       = DateFormat.parse ( "01-01-1997" );
        Date CourseEndDate       = DateFormat.parse ( "01-01-1997" );
        String CourseName;
        Course myCourse1=new Course("JUNIT",CourseStartDate,CourseEndDate);

        School mySchool=new School("Fontys",SchoolOpeningDate,courseList);
        String ExpectedName="Fontys";



        assertEquals(SchoolOpeningDate,mySchool.getOpeningDate());
        assertEquals(ExpectedName,mySchool.getName());

    }
    @Test
    public void GetCourseByName(){

        
    }


}
