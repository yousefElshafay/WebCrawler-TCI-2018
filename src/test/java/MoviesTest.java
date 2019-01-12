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

        Assert.assertEquals(testmovie.getDirctor(),"whoknows");

    }
    // check the year of the movie
    @Test
    public void shouldHaveYear (){
// check the writer of the movie

        Assert.assertNotNull(testmovie.getYear());
        Assert.assertEquals(testmovie.getYear(),2005);

    }
    @Test
    public void shouldHaveWriter (){
        List<Integer> testfakelistofstars  = new ArrayList<>();
        List<String> testfakelistofWriters = new ArrayList<>();

        testfakelistofstars.add(9);
        testfakelistofWriters.add("marvin edwin");
        Assert.assertNotNull(testmovie.getWirters());
        Assert.assertEquals(testmovie.getWirters(),"whoknows");

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