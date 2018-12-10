import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
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
        // Arrange
        School school;

        // Act
        school = new School("Fontys University of Applied Science",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 3));

        String name = school.getName();
        Date opening_date = school.getOpeningDate();

        //Assert
        Assert.assertTrue(name != null && opening_date != null);
    }

    @Test
    public void AddCourse_school() throws CourseDataException, DuplicateCourseException {
            // Arrange
        School school;
        int expected_size = 2;

            //Act
        school = new School("Fontys University of Applied Science",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 3));

        ArrayList<Course> courses = school.addCourse(new Course("Math",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 4),
                new GregorianCalendar(2019, Calendar.JANUARY, 10))
        );

        int actual_size = courses.size();
        //assert
        Assert.assertEquals(expected_size, actual_size);
    }


    @Test
    public void CourseDate_After_SchoolDate(){
        //Arrange
        School school = null;
        Course course = null;

        try {
            school = new School("Fontys University of Applied Science",
                    new GregorianCalendar(2018, Calendar.SEPTEMBER, 3));

            //Act
            course = new Course("math",
                    new GregorianCalendar(2018, Calendar.SEPTEMBER, 4),
                    new GregorianCalendar(2019, Calendar.JANUARY, 10));

            school.addCourse(course);
        } catch (Exception exc){

        }

        //Asset
        Assert.assertTrue(course.getBegin_date().after(school.getOpeningDate()));
    }

    @Test //(expected = DuplicateCourseException.class)
    public void uniquCourseName() throws  CourseDataException, DuplicateCourseException {
        //
        School school = null;
        Course course = null;
        ArrayList<Course> courses = null;

        // Act
        school = new School("Fontys University of Applied Science",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 3));

        course = new Course("IPV",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 4),
                new GregorianCalendar(2019, Calendar.JANUARY, 10));

        // Assert
        courses = school.addCourse(course);
    }


    @Test
    public void GetAllCourses() throws CourseDataException, DuplicateCourseException {
        // Arrange
        School school = null;
        Course course = null;
        ArrayList<String> expected_course_names = new ArrayList<>();
        ArrayList<String> actual_course_names = new ArrayList<>();

        // Act
        school = new School("Fontys University of Applied Science",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 3));

        school.addCourse(new Course("Math",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 4),
                new GregorianCalendar(2019, Calendar.JANUARY, 10)
        ));

        expected_course_names.add("TCI");
        expected_course_names.add("Math");

        actual_course_names = school.getAllCourseNames();

        // Assert
        Assert.assertArrayEquals(expected_course_names.toArray(), actual_course_names.toArray());
    }

    @Test
    public void CopiesAllCourses() throws CourseDataException, DuplicateCourseException {
        // Arrange
        School school = null;
        Course course = null;
        ArrayList<Course> courses = null;

        // Act
        school = new School("Fontys University of Applied Science",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 3));

        courses = school.addCourse(new Course("PROEP",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 4),
                new GregorianCalendar(2019, Calendar.JANUARY, 10)
        ));

        // Assert
    }

    @Test
    public void courseName() throws CourseDataException, DuplicateCourseException {
        // Arrange
        School school = null;
        Course course = null;
        ArrayList<Course> courses = null;
        Course expected_course, actual_course;
        expected_course = actual_course = new Course("Math",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 4),
                new GregorianCalendar(2019, Calendar.JANUARY, 10)
        );

        // Act
        school = new School("Fontys University of Applied Science",
                new GregorianCalendar(2018, Calendar.SEPTEMBER, 3));

        school.addCourse(expected_course);
        actual_course = school.getCourseBy("Math");

        // Assert
        Assert.assertEquals("Course not found by the supplied name!", expected_course, actual_course);
    }
}
