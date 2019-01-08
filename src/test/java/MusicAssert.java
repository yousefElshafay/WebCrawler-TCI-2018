import MediaLibrary.Music;
import org.fest.assertions.api.AbstractAssert;

public class MusicAssert extends AbstractAssert<MusicAssert, Music> {

    public MusicAssert(Music actual ) {
        super(actual,BookAssert.class );
    }

}
