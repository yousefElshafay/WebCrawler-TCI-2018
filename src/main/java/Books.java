

import com.sun.tools.javac.jvm.Items;


public class Books extends Media {


    private String  author;
    private String publisher;
    private String isbn;


    public Books(String format,String genre,int year, String author, String publisher, String isbn) {
        super(format,genre,year);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    // get author string
    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
