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
    private int Y = 1997; // Year 1997
    private int M = 02;   // 0..11 --jan
    private int D = 02;   // 1st
//    private int H = 00;   //
//    private int MN = 00;  //
//   private int S = 00;   //
//    private Date d = new Date(1997,M,D,H,MN,S);
//
    private Calendar c = Calendar.getInstance();





    @Test

    public void SchoolConstructerTest(){

        c.set(Y, M, D);
         //d=c.getTime();
//        c.set(Y, M, D, H, MN, S);
//        d=c.getTime();
        School mySchool=new School(name,new Date(Y-1997,M,D));

        //mySchool.getName();


        String ExpectedName="Fontys";
        Date Expecteddate=new Date(Y-1997,02,02);

        //Date actualDate=d.setTime(10);

        assertEquals(Expecteddate,mySchool.getOpeningDate());
        assertEquals(ExpectedName,mySchool.getName());

    }
}
