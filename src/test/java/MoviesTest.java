import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MoviesTest {


    /*setup method will be executed first before test */
    @Before
    public void setUp(){

    }

    // check the director of the movie
    @Test
    public void shouldHaveDirector (){
        List<Integer> stars = new ArrayList<>();
        stars.add(2);
        List<String> writers = new ArrayList<>();
        writers.add("joe ");

        Movies testMovie = new Movies("testmovie","testformat", 2018,"steven Spielberg",stars,writers);

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
