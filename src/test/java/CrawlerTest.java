import junitparams.Parameters;
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
    /*this method should throws and exception when id is wrong*/

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void throwsExceptionWhenIDIsInvalid() throws IOException {

    }


    /*this method is to test connection*/
    @Test
    public void ConnectionTest()throws IOException{

    }
    /*Check if the URL is the same*/
    @Test
    public void URL()throws IOException{

    }
    @Test(expected = NullPointerException.class)
    public void getAllUsesPagesCrawlerGetCatLinks() throws IOException {

    }

    @Test
    public void getSpecificItemCallsPagesCrawler() throws IOException {

    }
    @Test
    @Parameters(method = "getSpecific")
    public void getSpecificItemWithParams(String url , String name, String response) throws IOException {

    }
    /*
   Get all items tests
     */

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
    /* this method will test the final proper results of this method*/
    @Test
    public void GetAllItemsShouldReturnProperResults() throws IOException{

    }

    /*in this method parameters will be passed to the test method*/
    @Test
    @Parameters(method="getAllItems")
    public void GetAllItemsShouldReturnProperResultsWithParameters(String expectedResult) throws IOException{

    }



    /*
      Tests for GetSpecific Item
     */


    /*this is to test that getStaticsInformation is called only once*/
    @Test

    public void getMediaDataCalledOnlyOnce() throws IOException{

        //arrange

        //act

        //assert

    }

    /* this method is to test whether a exception is thrown or not when the results  are null*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceGetSpecificThrowsExceptionWhenResultsAreNull() throws IOException{

    }
    /* this method is to test whether a exception is thrown or not when the results are empty strings*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceGetSpecificThrowsExceptionWhenResultsAreEmptyString() throws IOException{

    }

    /* this method will test the final proper results of this method*/
    @Test
    public void GetSpecificItemsShouldReturnProperResults() throws IOException{

    }

    @Test
    @Parameters(method="getSpecificItems")
    public void GetAllItemsShouldReturnProperResultsWithParameters(String input,String outPut) throws IOException{

    }

      /*
   Get all information about mediaDataSearch Tests
     */

    @Test
    public void CrawlerFunctionForSingleItemIsCalledOnce() throws IOException{

    }

    @Test
    public void SerializerIsCalledOnce() throws IOException{

    }
    /* this method is to test whether a exception is thrown or not when the results  are null*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceGetItemsDataThrowsExceptionWhenResultsAreNull() throws IOException{

    }

    /* this method will test the final proper results of getItemsData*/
    @Test
    public void GetItemsDataShouldReturnProperResults() throws IOException{

    }




}
