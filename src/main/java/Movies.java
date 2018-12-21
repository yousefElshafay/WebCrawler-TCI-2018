

import com.sun.tools.javac.jvm.Items;

import java.time.Year;
import java.util.List;

public class Movies extends Media {

 String dirctor;
 List<Integer> stars;
 List<String> wirters;

    public Movies(String name, String format, int year, String dirctor, List<Integer> stars, List<String> wirters) {
        super(name, format, year);
        this.dirctor = dirctor;
        this.stars = stars;
        this.wirters = wirters;
    }
}
