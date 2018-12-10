import java.util.*;

public class School {

    //
    private String name;
    private Date openingDate;
    private ArrayList<Course> courses;



    public School(String name, GregorianCalendar openingDate) throws CourseDataException {

        if(!name.isEmpty() && openingDate != null) {
            this.name = name;
            this.openingDate = openingDate.getTime();

        }
        this.courses = new ArrayList<>();

        courses.add(new Course("TCI",
                new GregorianCalendar(2018, Calendar.NOVEMBER, 15),
                new GregorianCalendar(2019, Calendar.JANUARY, 10))
        );
    }

    public String getName() {
        return name;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public ArrayList<Course> addCourse(Course course) throws CourseDataException, DuplicateCourseException {
        if(course != null){
            if(course.getBegin_date().after(this.getOpeningDate())){
                if(isCourseNameUnique(course)){
                    this.courses.add(course);
                    return this.courses;
                } else {
                    throw new DuplicateCourseException("Course name already exist!");
                }
            } else {
                throw new CourseDataException("Course begin dates are after the school begin date!");
            }
        } else {
            return this.courses;
        }
    }
    private boolean isCourseNameUnique(Course course){

        for(Course c: courses){
            if(course.getName().equals(c.getName())){
                return false;
            }
        }
        return true;
    }

    public ArrayList<String> getAllCourseNames(){
        ArrayList<String> course_names = new ArrayList<>();
        for (Course c: this.courses){
            course_names.add(c.getName());
        }
        return course_names;
    }
}
