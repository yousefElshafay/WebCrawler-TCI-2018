import MediaLibrary.Movies;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MoviesTest {

    Movies testmovie;
    /*setup method will be executed first before test */
    List<Integer> fakeListOfStars = new ArrayList<>();
    List<String> fakeListOfwriter = new ArrayList<>();

    @Before
    public void setUp(){

        fakeListOfStars.add(4);
        fakeListOfwriter.add("marvin edwin");
        testmovie = new Movies("fight club","comedy",2005,"whoknows",fakeListOfStars,fakeListOfwriter);
    }

    // check the director of the movie
    @Test
    public void shouldHaveDirector (){
        Assert.assertNotNull(testmovie.getDirctor());

        Assert.assertEquals(testmovie.getDirctor(),"whoknow");

    }
    // check the year of the movie
    @Test
    public void shouldHaveYear (){
// check the writer of the movie

        Assert.assertNotNull(testmovie.getYear());
    }
    @Test
    public void shouldHaveWriter (){
        Assert.assertNotNull(testmovie.getWirters());

    }

    @Test
    public void getGenre() {
        Assert.assertNotNull(testmovie.getGenre());

    }

    @Test
    public void getFormat() {
        Assert.assertNotNull(testmovie.getFormat());

    }

    @Test
    public void getYear() {
        Assert.assertNotNull(testmovie.getYear());
    }


}