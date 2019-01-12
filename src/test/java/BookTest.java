import MediaLibrary.Books;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BookTest {
    Books testbook;
    /*setup method will be executed first before tests */
    @Before
    public void setUp(){

        //test
        testbook = new Books("testformat","science fiction",1993,"bill heffnton","sun","27642");
    }
    /*this method will check if the book has a author or not*/
    @Test
    public void bookShoulHaveAuthor(){
        Assert.assertNotNull(testbook.getAuthor());
    }
    /*this method will test if the book has a publisher*/
    @Test
    public void bookShouldHavePublisher(){
        Assert.assertNotNull(testbook.getPublisher());

    }
    /*this method will test if the book has an ISBN*/
    @Test
    public void bookShouldHaveISBN(){
        Assert.assertNotNull(testbook.getIsbn());
    }
}
