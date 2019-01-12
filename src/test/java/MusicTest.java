import MediaLibrary.Music;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MusicTest {

    Music testmusic ;
    /*setup method will be executed first before test */
    @Before
    public void setUp(){
        testmusic = new Music("rock","format",1997,"metallica");
    }

    // this mathod will check that music should have Artist
    @Test
    public  void musicShouldHaveArtist(){
        Assert.assertNotNull(testmusic.getArtist());

        Assert.assertEquals(testmusic.getArtist(),"metallica");
    }



    @Test
    public void getGenre() {
        Assert.assertNotNull(testmusic.getGenre());

        Assert.assertEquals(testmusic.getGenre(),"rock");
    }

    @Test
    public void getFormat() {
        Assert.assertNotNull(testmusic.getFormat());

        Assert.assertEquals(testmusic.getFormat(),"format");
    }

    @Test
    public void getYear() {
        Assert.assertNotNull(testmusic.getYear());
        Assert.assertEquals(testmusic.getYear(),1997);

    }
}