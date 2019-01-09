package MediaLibrary;


import MediaLibrary.Media;

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

    public String getDirctor() {
        return dirctor;
    }

    public void setDirctor(String dirctor) {
        this.dirctor = dirctor;
    }

    public List<Integer> getStars() {
        return stars;
    }

    public void setStars(List<Integer> stars) {
        this.stars = stars;
    }

    public List<String> getWirters() {
        return wirters;
    }

    public void setWirters(List<String> wirters) {
        this.wirters = wirters;
    }
}
