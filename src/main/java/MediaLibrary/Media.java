package MediaLibrary;

public abstract class Media {
    private String genre;
    private String format;

    private int year;

    public Media(String genre, String format, int year) {
        this.genre = genre;
        this.format = format;
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
