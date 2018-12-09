import org.junit.Assert;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class SchoolTest {
    /**
     * REQUIREMENTS:
     * - A School has a name, an opening date and a collection of courses.
     * - Name and opening date are not allowed to be null.
     * - You can add a course to the school.
     * - Course begin dates are after the school begin date. Throw a CourseException when it’s wrong.
     * - The name of the course within a school is unique, otherwise a DuplicateCourseException is thrown.
     * - You can get a course by name.
     * - You can get a list of all course names.
     * - You can get a list of copies of all courses.
     */


        @Test
        public void collection_of_courses_with_NameandDate() throws CourseDataException {
            // Arrange
            School school;
            GregorianCalendar opening_date_School = new GregorianCalendar(2018, Calendar.SEPTEMBER, 3);

            // Act
            school = new School("Fontys  of Applied Science", opening_date_School);
            String name = school.getName();
            Date _opening_date = school.getOpeningDate();
//
            Assert.assertTrue(!name.isEmpty() && _opening_date != null
            );
        }
    @Test
    public void Name_date_Null_Allowed() throws CourseDataException {

        School school;
        school = new School("Fontys University of Applied Science",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 3));

        String name = school.getName();
        Date opening_date = school.getOpeningDate();


        Assert.assertTrue(name == null && opening_date == null);
    }







}
