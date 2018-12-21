

import com.sun.tools.javac.jvm.Items;


public class Books extends Media {


    private String author;
    private String publisher;
    private String isbn;


    public Books(String format,String genre,int year, String author, String publisher, String isbn) {
        super(format,genre,year);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

}
