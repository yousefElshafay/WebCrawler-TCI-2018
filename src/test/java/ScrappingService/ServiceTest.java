package ScrappingService;

import Interface.ICrawler;
import Interface.ISerializer;
import Scrapper.Crawler;
import Scrapper.PageScrapper;
import Scrapper.PagesScrapper;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.ws.rs.core.Response;
import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class ServiceTest {

    private static final String Correct_Value="{ id = 1 }";
    private static final int Correct_ID=1;
    private static final int Incorrect_ID=-16;
    private static final String MediaDataOutPut="{ time = 333 }";

    private Crawler crawler;
    private PagesScrapper pagesScrapper;
    private PageScrapper pageScrapper;
    private ICrawler iCrawler;
    private ISerializer iSerializer;
    private Service service;



    //initialzie the seervice dependencies

    @Before
    public  void setUp(){
        pagesScrapper = mock(PagesScrapper.class);
        pageScrapper = mock(PageScrapper.class);
        crawler = new Crawler("http://localhost:88");
        crawler.setPagesScrapper(pagesScrapper);
        iCrawler=mock(ICrawler.class);
        iSerializer=mock(ISerializer.class);
        service=new Service(iCrawler,iSerializer);

    }

    // test the service class functionality
    @Test
    public void getAllTest() throws IOException {

        //arrange
        when(iSerializer.ListOfMediaToJson(iCrawler.GetAllContents())).thenReturn(Correct_Value);
        //act
        service.getAll();
        //assert
        verify(iCrawler,times(2)).GetAllContents();

    }

    @Test(expected = NullPointerException.class)
    public void getAllTestException() throws IOException {

        //arrange
        when(iSerializer.ListOfMediaToJson(iCrawler.GetAllContents())).thenThrow(new NullPointerException());
        //act
        service.getAll();
        //assert
        verify(iCrawler,times(2)).GetAllContents();
    }




    @Test
    public void getItem() throws IOException{

        //arrange
        when(iSerializer.MediaDataToJSON(iCrawler.GetItemData(Correct_ID))).thenReturn(MediaDataOutPut);
        Response response;
        //act
        response = service.getDataItemService(Correct_ID);
        //assert
        Assert.assertEquals("The expected result is:" + MediaDataOutPut + " was: " + response.toString(), MediaDataOutPut, response.getEntity() );
    }

    @Test(expected = NullPointerException.class)
    public void getItemException() throws IOException{
        //arrange
        when(iSerializer.MediaDataToJSON(iCrawler.GetItemData(Correct_ID))).thenThrow(new NullPointerException());
    }

}