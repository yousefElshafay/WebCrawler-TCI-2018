import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MoviesTest {

    Movies testMovie ;
    /*setup method will be executed first before test */
    @Before
    public void setUp(){

        List<Integer> stars = new ArrayList<>();
        stars.add(2);
        List<String> writers = new ArrayList<>();
        writers.add("joe ");
        testMovie =  new Movies("testmovie","testformat", 2018,"steven Spielberg",stars,writers);

    }

    // check the director of the movie
    @Test
    public void MovieObjectIsNotNull(){

        // validating object exist
        Assert.assertNotNull(testMovie);
}

    // movie should has a director

    @Test
    public void MovieHasDirector() {
        Assert.assertEquals("steven Spielberg", testMovie.getDirctor());
    }

// check the year of the movie
    @Test
    public void shouldHaveYear (){
        Assert.assertEquals(2018, testMovie.getYear());

    }
    // check the writer of the movie

    @Test
    public void shouldHaveWriter (){

        List<String> ListOfWriterForTest = new ArrayList<>();
        ListOfWriterForTest.add("joe ");
        Assert.assertEquals(ListOfWriterForTest, testMovie.getWirters());

    }


}
