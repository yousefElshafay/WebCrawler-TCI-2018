package Items;

public class Books extends Items{


    private String author;
    private String publisher;
    private String isbn;
    private  String genre;


    public Books(String name, String format, int year,String genre,String publisher,String isbn,String author) {

        super(name, format, year);
        this.author=author;
        this.publisher=publisher;
        this.isbn=isbn;
        this.genre=genre;
    }
}
