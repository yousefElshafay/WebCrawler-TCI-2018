package Items;

public abstract class Items {
    private String name;
    private String format;
    private int year;

    public Items(String name, String format, int year) {
        this.name = name;
        this.format = format;
        this.year = year;
    }
}
