



import com.sun.tools.javac.code.Symtab;

import java.time.Year;

public class Music extends Media {

    private String artist;

    public Music(String genre, String format, int year, String artist) {
        super(genre, format, year);
        this.artist = artist;
    }
}
