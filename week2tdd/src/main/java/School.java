import java.util.Date;

public class School {
    String Name;
    Date OpeningDate;

    public School(String name, Date openingDate) {
        Name = name;
        OpeningDate = openingDate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getOpeningDate() {
        return OpeningDate;
    }

    public void setOpeningDate(Date openingDate) {
        OpeningDate = openingDate;
    }
}

