import MediaLibrary.Books;
import org.fest.assertions.api.AbstractAssert;
import org.junit.Test;


public class BookAssert extends AbstractAssert<BookAssert, Books> {

    public BookAssert(Books actual) {
        super(actual,BookAssert.class);
    }
    public static BookAssert assertThat(Books actual) {
        return new BookAssert(actual);
    }


    /* check that actual Book we want to make assertions on is not null and
     use of existing Fest assertions but replacing the error message*/

    @Test
    public void bookShoulHaveAuthor(String name){

    }
    /*check that actual Book we want to make assertions on is not null Override the default error message*/
    @Test
    public void bookShouldHavePublisher(String publisher){

    }
    /*check that actual Book we want to make assertions on is not null Override the default error message*/
    @Test
    public void bookShouldHaveISBN(String ISBN){

    }

}
