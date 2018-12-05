import java.util.Date;
import java.util.List;

public class School {
  private   String Name;
   private Date OpeningDate;

   public List<Course> listCourses;


    public School(String name, Date openingDate, List<Course> courseList) {
        Name = name;
        OpeningDate = openingDate;
        this.listCourses=courseList;

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

    public List<Course> getListCourses() {


        return listCourses;
    }

    public String CheckNullValues(School mySchool) throws SchoolException {
        if (mySchool.getName()==""||mySchool.getOpeningDate()==null){
            throw  new SchoolException("School name or date is null");
        }
        return "";

    }

    public String getCourseByName(String name) {
        for (Course c:listCourses)
        {
            if (c.getName()==name){
                return c.getName();
            }
        }
        return  null;
    }
}

