import org.junit.Assert;
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
    SimpleDateFormat DateFormat = new SimpleDateFormat("MM-dd-yyyy");
    String Date = DateFormat.format( new Date()   );


    List<Course> courseList=new ArrayList<>();



    public SchoolTest() throws ParseException {
    }

    @Test

    public void SchoolConstructerTest() throws ParseException {

        Date SchoolOpeningDate       = DateFormat.parse ( "01-01-1997" );
        Date CourseStartDate       = DateFormat.parse ( "01-01-2018" );
        Date CourseEndDate       = DateFormat.parse ( "01-01-2019" );
        String CourseName;

     //   List<Course> list=new ArrayList<>();
        Course myCourses=new Course("JUNIT",CourseStartDate,CourseEndDate);
        courseList.add(myCourses);
        School mySchool=new School("Fontys",SchoolOpeningDate,courseList);

        String ExpectedName="Fontys";
        assertEquals(SchoolOpeningDate,mySchool.getOpeningDate());
        assertEquals(ExpectedName,mySchool.getName());
        assertEquals("testing list values",courseList,mySchool.getListCourses());

    }
    @Test
    public void GetCourseByName(){


        
    }
    @Test
            (expected = SchoolException.class)
    public void SchoolNameAndDateException() throws ParseException,SchoolException {

        Date SchoolOpeningDate       = DateFormat.parse ( "01-01-1997" );
        Date newDate=SchoolOpeningDate;
        School mySchool=new School("",newDate,courseList);

       // System.out.println(mySchool.getName());
        Assert.assertEquals("Expected School Exception",mySchool.CheckNullValues(mySchool));


    }
    @Test
    public void getCourseByNameTest() throws ParseException {
        Date SchoolOpeningDate       = DateFormat.parse ( "01-01-1997" );
        Date CourseStartDate       = DateFormat.parse ( "01-01-2018" );
        Date CourseEndDate       = DateFormat.parse ( "01-01-2019" );
     //   String CourseName;

        String ExpectedName="JUNIT";
        //   List<Course> list=new ArrayList<>();
        Course myCourses=new Course("JUNIT",CourseStartDate,CourseEndDate);
        courseList.add(myCourses);
        School mySchool=new School("Fontys",SchoolOpeningDate,courseList);
        String CourseName=mySchool.getCourseByName(myCourses.getName());
        Assert.assertEquals("Expected JUNIT","JUNIT",CourseName);


    }



}
