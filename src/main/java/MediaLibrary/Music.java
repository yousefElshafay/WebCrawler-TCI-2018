
package MediaLibrary;

import MediaLibrary.Media;

public class Music extends Media {

    private String artist;

    public Music(String genre, String format, int year, String artist) {
        super(genre, format, year);
        this.artist = artist;
    }



    public  String getArtist()
    {
        return  artist;
    }
}