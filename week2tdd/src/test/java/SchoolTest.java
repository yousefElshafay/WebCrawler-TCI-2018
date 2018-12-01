import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;


public class SchoolTest {
    public static final String name="Fontys";
    @Test

    public void SchoolConstructerTest(){

        School mySchool=new School(name,new Date());

        //mySchool.getName();
        String ExpectedName="Fontys";

        assertEquals(ExpectedName,mySchool.getName());

    }
}
