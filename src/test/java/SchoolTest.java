import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class SchoolTest {

    // create school class

    School fontys = new School("fontys", new Date("01-09-2018"));
    @Test
    public void addCourse() {
        Course TCI = new Course();
        Assert.assertTrue(fontys.AddCourse(TCI));
    }
}