package Items;

import java.time.Year;

public class Music extends Items {

    private String genre, format, year, artist;

    public Music(String name, String format, int year, String genre, String format1, String year1, String artist) {
        super(name, format, year);
        this.genre = genre;
        this.format = format1;
        this.year = year1;
        this.artist = artist;
    }
}
