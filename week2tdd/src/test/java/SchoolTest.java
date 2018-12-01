import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;


public class SchoolTest {
    @Test
    public void SchoolConstructerTest(){
        School mySchool=new School("Fontys",new Date());

        //mySchool.getName();
        String ExpectedName="Fontys";

        assertEquals(ExpectedName,mySchool.getName());

    }
}
