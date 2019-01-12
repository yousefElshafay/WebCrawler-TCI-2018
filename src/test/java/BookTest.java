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

        //test the actual value of return string

        Assert.assertEquals(testbook.getAuthor(),"bill heffnton");
    }
    /*this method will test if the book has a publisher*/
    @Test
    public void bookShouldHavePublisher(){
        Assert.assertNotNull(testbook.getPublisher());

        Assert.assertEquals(testbook.getPublisher(),"sun");

    }
    /*this method will test if the book has an ISBN*/
    @Test
    public void bookShouldHaveISBN(){
        Assert.assertNotNull(testbook.getIsbn());

        Assert.assertEquals(testbook.getIsbn(),"27642");
    }

    @Test
    public void getGenre() {
        Assert.assertNotNull(testbook.getGenre());
        Assert.assertEquals(testbook.getGenre(),"testformat");
    }

    @Test
    public void getFormat() {
        Assert.assertNotNull(testbook.getFormat());
        Assert.assertEquals(testbook.getFormat(),"science fiction");
    }

    @Test
    public void getYear() {
        Assert.assertNotNull(testbook.getYear());
        Assert.assertEquals(testbook.getYear(),1993);
    }
}
