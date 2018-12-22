package Items;

import java.time.Year;

public class Movies extends Items{

    private String Genre, Format, Year, Director, Writers, Stars;

    public Movies(String name, String format, int year, String genre, String format1, String year1, String director, String writers, String stars) {
        super(name, format, year);
        Genre = genre;
        Format = format1;
        Year = year1;
        Director = director;
        Writers = writers;
        Stars = stars;
    }
}
