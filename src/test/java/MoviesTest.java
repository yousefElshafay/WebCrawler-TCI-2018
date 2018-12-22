import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoviesTest {


    /*setup method will be executed first before test */
    @Before
    public void setUp(){

    }

    // check the director of the movie
    @Test
    public void shouldHaveDirector (){
        Movies testMovie = new Movies("testmovie","testformat", 2018,"steven Spielberg",null,null);

        // validating object exist
        Assert.assertNotNull(testMovie);

}
// check the year of the movie
    @Test
    public void shouldHaveYear (){
// check the writer of the movie
    }
    @Test
    public void shouldHaveWriter (){

    }


}
