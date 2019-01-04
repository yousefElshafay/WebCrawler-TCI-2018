import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import org.junit.runners.Parameterized;
import javax.ws.rs.InternalServerErrorException;

import java.io.IOException;

public class CrawlerTest {

    /*this method will be executed first before test*/
    @Before
    public  void setUp(){


    }
    /*this method is to test connection*/
    @Test
    public void ConnectionTest()throws IOException{

    }
    /*Check if the URL is the same*/
    @Test
    public void URL()throws IOException{

    }


    /*crawlerMethodForAllIsCalledOnlyOnce*/
    @Test
    public void getAllItemsTest() throws IOException{

        //arrange

        //act

        //assert

    }
    /*this is to verify serializerListOfJson is called only once*/
    @Test

    public void SerlizerListToJsonTest() throws IOException{

        //arrange

        //act

        //assert

    }


    /* this method is to test whether a exception is thrown or not when the results are null*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceThrowsExceptionWhenResultIsNull() throws IOException{

    }


    /* this method is to test whether a exception is thrown or not when the results are empty are null*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceThrowsExceptionWhenResultsAreEmptyString() throws IOException{

    }
    /*
      Tests for GetSpecific Item
     */


    /*this is to test that getStatics is called only once*/
    @Test

    public void CalledOnlyOnce() throws IOException{

        //arrange

        //act

        //assert

    }


}
