import Scrapper.Crawler;
import Scrapper.PageScrapper;
import Scrapper.PagesScrapper;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
/*import javax.ws.rs.InternalServerErrorException;*/
import org.mockito.Mock;


import java.io.IOException;
import java.util.List;

public class CrawlerTest {


    private static final List<String> NullValue=null;
    private Crawler crawler;
    @Mock  private PageScrapper pageScrapper;
    @Mock private PagesScrapper pagesScrapper;
    /*this method will be executed first before test*/
    @Before
    public  void setUp(){
        pageScrapper = mock(PageScrapper.class);
        pagesScrapper = mock(PagesScrapper.class);
        crawler = new Crawler("http://localhost:8888");
        crawler.setPageScrapper(pageScrapper);
        crawler.setPagesScrapper(pagesScrapper);

    }
    /*this method should throws  exception when id is wrong*/

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void throwsExceptionWhenIDIsInvalid() throws IOException {

        crawler.GetItemData(0);

    }


    /*this method is to test connection*/
    @Test
    public void ConnectionTest()throws IOException{
        assertTrue(crawler.Connection());
    }
    /*Check if the URL is the same*/
    @Test
    public void URL()throws IOException{
        assertEquals(crawler.BaseURL,"http://localhost:8888");


    }

    @Test(expected = NullPointerException.class)
    public void getAllUsesPagesCrawlerGetCategoryLinks() throws IOException {

        when(pagesScrapper.getLinksOfCategory("http://localhost:8888")).thenReturn(NullValue);

        crawler.GetAllContents();
        verify(pagesScrapper).getLinksOfCategory("http://localhost:8888");

    }

    @Test
    public void getSpecificItemCallsPagesCrawler() throws IOException {

        when(pagesScrapper.getSpecificItems("http://localhost:8888","Name")).thenReturn("{name=Name}");

        crawler.getSepcificItems("Name");
        verify(pagesScrapper).getSpecificItems("http://localhost:8888","Name");

    }
//    @Test
//    @Parameters(method = "getSpecific")
//    public void getSpecificItemWithParams(String url , String name, String response) throws IOException {
//
//    }
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
//    @Test(expected =InternalServerErrorException.class )
//    public void CrawlerServiceThrowsExceptionWhenResultIsNull() throws IOException{
//
//    }
//
//
//    /* this method is to test whether a exception is thrown or not when the results are empty are null*/
//    @Test(expected =InternalServerErrorException.class )
//    public void CrawlerServiceThrowsExceptionWhenResultsAreEmptyString() throws IOException{
//
//    }
    /* this method will test the final proper results of this method*/
    @Test
    public void GetAllItemsShouldReturnProperResults() throws IOException{

    }

    /*in this method parameters will be passed to the test method*/
//    @Test
//    @Parameters(method="getAllItems")
//    public void GetAllItemsShouldReturnProperResultsWithParameters(String expectedResult) throws IOException{
//
//    }



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
//    @Test(expected =InternalServerErrorException.class )
//    public void CrawlerServiceGetSpecificThrowsExceptionWhenResultsAreNull() throws IOException{
//
//    }
//    /* this method is to test whether a exception is thrown or not when the results are empty strings*/
//    @Test(expected =InternalServerErrorException.class )
//    public void CrawlerServiceGetSpecificThrowsExceptionWhenResultsAreEmptyString() throws IOException{
//
//    }

    /* this method will test the final proper results of this method*/
    @Test
    public void GetSpecificItemsShouldReturnProperResults() throws IOException{

    }

//    @Test
//    @Parameters(method="getSpecificItems")
//    public void GetAllItemsShouldReturnProperResultsWithParameters(String input,String outPut) throws IOException{
//
//    }

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
//    @Test(expected =InternalServerErrorException.class )
//    public void CrawlerServiceGetItemsDataThrowsExceptionWhenResultsAreNull() throws IOException{
//
//    }

    /* this method will test the final proper results of getItemsData*/
    @Test
    public void GetItemsDataShouldReturnProperResults() throws IOException{

    }




}
