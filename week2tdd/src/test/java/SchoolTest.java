import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
//import java.util.Calender;
import static junit.framework.TestCase.assertEquals;


public class SchoolTest {
    public static final String name="Fontys";

  //  private final Calendar cal = Calendar.getInstance();

    //public Calendar getCal() {
//        cal.set(Calendar.YEAR, 1988);
//        cal.set(Calendar.MONTH, Calendar.JANUARY);
//        cal.set(Calendar.DAY_OF_MONTH, 1);
//        Date dateRepresentation = cal.getTime();
     //   return cal;

   // }
//    private int Y = 2015; // Year 2015
//    private int M = 11;   // 0..11 -- December
//    private int D = 15;   // 15th
//    private int H = 16;   // 4:00 PM
//    private int MN = 28;  // 4:28 PM
//    private int S = 41;   // 4:28:41
//    private Date d = new Date(Y-1900,M,D,H,MN,S);
//
//    private Calendar c = Calendar.getInstance();
   // c.Set(Y, M, D, H, MN, S);




    @Test

    public void SchoolConstructerTest(){

//        c.set(Y, M, D, H, MN, S);
//        d=c.getTime();
        School mySchool=new School(name,new Date(1997,01,01,00,00));

        //mySchool.getName();


        String ExpectedName="Fontys";
        Date Expecteddate=new Date(1997,01,01,00,01);
        //Date actualDate=d.setTime(10);

        assertEquals(Expecteddate,mySchool.getOpeningDate());
        assertEquals(ExpectedName,mySchool.getName());

    }
}
