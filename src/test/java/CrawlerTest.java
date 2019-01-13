import Interface.ICrawler;
import Interface.ISerializer;
import Scrapper.Crawler;
import Scrapper.PageScrapper;
import Scrapper.PagesScrapper;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import  ScrappingService.Service;
import org.junit.runner.RunWith;
import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;
import javax.ws.rs.InternalServerErrorException;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;
@RunWith(JUnitParamsRunner.class)
public class CrawlerTest {


    private static final List<String> NullValue=null;
    private static final String Correct_Value="{ id = 1 }";

    private Crawler crawler;
    private PageScrapper pageScrapper;
    private PagesScrapper pagesScrapper;
    private ICrawler iCrawler;
    private ISerializer iSerializer;
    private Service service;



    private final Object[] getAllItems() {
        return $($("{ id = 1 }"),
                $("{ id = 2 }")

        );
    }
    private static final Object[] getSpecificResults(){
        return $(
                $("{ id = 1}", "{ name = Books}"),
                $("{ id = 2}","{ name = movie}"),
                $("{ id = 3}","{ name = Music}")
        );
    }

    private static final Object[] getMediaData(){
        return $(
                $(1, "{ time = 123}"),
                $( 2,"{ time = 312}"),
                $(3,"{ time = 231}")
        );
    }


    private final Object[] getSpecific(){
        return  $($("http://localhost:88","Book","{name = Book}"),
                $("http://localhost:88","Music","{name = Music}")

        );


    }

    /*this method will be executed first before test*/
    @Before
    public  void setUp(){
        pageScrapper = mock(PageScrapper.class);
        pagesScrapper = mock(PagesScrapper.class);
        crawler = new Crawler("http://localhost:88");
        crawler.setPageScrapper(pageScrapper);
        crawler.setPagesScrapper(pagesScrapper);
        iCrawler=mock(ICrawler.class);
        iSerializer=mock(ISerializer.class);
        service=new Service(iCrawler,iSerializer);

    }

    /*this method should throws  exception when id is wrong*/

    @Test(expected = IndexOutOfBoundsException.class)
    public void throwsExceptionWhenIDIsInvalid() throws IOException {

        crawler.GetItemData(-69);

    }


    /*this method is to test connection*/
    @Test
    public void ConnectionTest()throws IOException{
        assertTrue(crawler.Connection());
    }
    /*Check if the URL is the same*/
    @Test
    public void URL()throws IOException{
        assertEquals(crawler.BaseURL,"http://localhost:88");
    }

    @Test(expected = NullPointerException.class)
    public void getAllUsesPagesCrawlerGetCategoryLinks() throws IOException {

        when(pagesScrapper.getLinksOfCategory("http://localhost:88")).thenReturn(NullValue);

        crawler.GetAllContents();
        verify(pagesScrapper).getLinksOfCategory("http://localhost:88");

    }

    @Test
    public void getSpecificItemCallsPagesCrawler() throws IOException {

        when(pagesScrapper.getSpecificItems("http://localhost:88","TLOTR")).thenReturn("{name = TLOTR}");

        crawler.getSepcificItems("TLOTR");
        verify(pagesScrapper).getSpecificItems("http://localhost:88","TLOTR");

    }
//    @Test
//    @Parameters(method = "getSpecific")
//    public void getSpecificItemWithParams(String url , String name, String response) throws IOException {
//
//
//    }

    @Test

    @Parameters(method = "getSpecific")
    public void getSpecificItemWithParams(String url , String name, String response) throws IOException {
        when(pagesScrapper.getSpecificItems(url,name)).thenReturn(response);
        crawler.getSepcificItems(name);
        verify(pagesScrapper).getSpecificItems("http://localhost:88",name);
    }
    /*
   Get all items tests (REST)
     */

    @Test
    public void getAllItemsTest() throws IOException{

        //arrange
        when(iSerializer.ListOfMediaToJson(iCrawler.GetAllContents())).thenReturn("{ id = 1}");
        //act
        service.getAll();
        //assert
        verify(iCrawler,times(2)).GetAllContents();

    }
    @Test

    public void SerlizerListToJsonTest() throws IOException{

        //arrange
        when(iSerializer.ListOfMediaToJson(iCrawler.GetAllContents())).thenReturn(Correct_Value);
        //act
        service.getAll();
        //assert
        verify(iSerializer).ListOfMediaToJson(iCrawler.GetAllContents());

    }


    /* this method is to test whether a exception is thrown or not when the results are null*/
    @Test(expected = InternalServerErrorException.class )
    public void CrawlerServiceThrowsExceptionWhenResultIsNull() throws IOException{

        //arrange
        when(iSerializer.ListOfMediaToJson(iCrawler.GetAllContents())).thenReturn(null);
        //act
        service.getAll();
        //verify


    }


    /* this method is to test whether a exception is thrown or not when the results are empty strings are null*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceThrowsExceptionWhenResultsAreEmptyString() throws IOException{

        when(iSerializer.ListOfMediaToJson(iCrawler.GetAllContents())).thenReturn("");
        service.getAll();

    }
    /* this method will test the final proper results of this method*/
    @Test
    public void GetAllItemsResults() throws IOException{

        //arrange
        when(iSerializer.ListOfMediaToJson(iCrawler.GetAllContents())).thenReturn(Correct_Value);
        //act
        Response response;
        response=service.getAll();
        //assert
        assertEquals("the expected result is :"+Correct_Value+ "was :"+response.getEntity(),Correct_Value,response.getEntity());


    }

    /*in this method parameters will be passed to the test method*/
    @Test
    @Parameters(method="getAllItems")
    public void GetAllItemsResultsWithParameters(String expectedResult) throws IOException{
        //arrange
        when(iSerializer.ListOfMediaToJson(iCrawler.GetAllContents())).thenReturn(expectedResult);
        //act
        Response response;
        response=service.getAll();
        Assert.assertEquals("The expected result is:" + expectedResult + " was: " + response.toString(), expectedResult, response.getEntity() );


    }



    /*
      Tests for GetSpecific Item
     */


    @Test

    public void SerializerGetSpecificaCall() throws IOException{

        //arrange

        when(iSerializer.MediaToJson(crawler.getSepcificItems("Books"))).thenReturn("{ name = Books }");
        //act
        service.getItem("Books");
        //assert
        verify(iSerializer).MediaToJson(crawler.getSepcificItems("Books"));

    }

    /* this method is to test whether a exception is thrown or not when the results  are null*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceGetSpecificThrowsExceptionWhenResultsAreNull() throws IOException{

        when(iSerializer.MediaToJson(iCrawler.getSepcificItems("Book"))).thenReturn(null);
        service.getAll();

    }
//    /* this method is to test whether a exception is thrown or not when the results are empty strings*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceGetSpecificThrowsExceptionWhenResultsAreEmptyString() throws IOException{


        service.getItem("");

    }

    /* this method will test the final proper results of this method*/
    @Test
    public void GetSpecificItemsrResults() throws IOException{
        when(iSerializer.MediaToJson(crawler.getSepcificItems("Book"))).thenReturn("{ name=Book }");
        Response resonse;

        //act
        resonse=service.getItem("Book");
        Assert.assertEquals("The expected result is:" + "{ name=Book }" + " was: " + resonse.toString(), "{ name=Book }" , resonse.getEntity() );


    }
    /*in this method parameters will be passed to the test method*/
    @Test
    @Parameters(method="getSpecificResults")
    public void GetSpecificItemsResultsWithParameters(String input,String output) throws IOException{
        //arrange
        when(iSerializer.MediaToJson(iCrawler.getSepcificItems(input))).thenReturn(output);
        //act
        Response response;
        response=service.getItem(input);
        Assert.assertEquals("The expected result is:" + output + " was: " + response.toString(), output, response.getEntity() );


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
        //arrange
        when(iSerializer.MediaDataToJSON(iCrawler.GetItemData(1))).thenReturn("{time=123}");
        //act
        service.getDataItemService(1);
        verify(iCrawler,times(2)).GetItemData(1);

        
    }

    @Test
    public void SerializerGetItemDataIsCalledOnce() throws IOException{


        when(iSerializer.MediaDataToJSON(iCrawler.GetItemData(1))).thenReturn("{ time=123 }");
        service.getDataItemService(1);

        verify(iSerializer).MediaDataToJSON(iCrawler.GetItemData(1));
    }
    /* this method is to test whether a exception is thrown or not when the results  are null*/
    @Test(expected =InternalServerErrorException.class )
    public void CrawlerServiceGetItemsDataThrowsExceptionWhenResultsAreNull() throws IOException{

        //arrange
        when(iSerializer.MediaDataToJSON(iCrawler.GetItemData(1))).thenReturn(null);
        //act
        service.getDataItemService(1);
    }

    //when id is wrong illeagle argument exception is expected
    @Test(expected = IllegalArgumentException.class)
    public void getItemsDataThrowsIllegalArgumentException(){
        //act
        service.getDataItemService(-69);
    }

    /* this method will test the final proper results of getItemsData*/
    @Test
    public void GetItemsDataResults() throws IOException{

        //arrange
        when(iSerializer.MediaDataToJSON(iCrawler.GetItemData(1))).thenReturn("{ time=123 }");
        Response response;
        //act
        response = service.getDataItemService(1);
        //assert
        Assert.assertEquals("The expected result is:" + "{ time=123 }" + " was: " + response.toString(), "{ time=123 }", response.getEntity() );


    }
    @Test
    @Parameters(method = "getMediaData")
    public void getInfoResultWithParams(int input, String Output){
        //arrange
        when(iSerializer.MediaDataToJSON(iCrawler.GetItemData(input))).thenReturn(Output);
        Response response;
        //act
        response = service.getDataItemService(input);
        //assert
        Assert.assertEquals("The expected result is:" + Output + " was: " + response.toString(), Output, response.getEntity() );
    }




}
