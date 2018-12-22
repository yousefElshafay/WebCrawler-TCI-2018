public class MediaData {

    // add properites
    private int iD;
    private long time;
    private  int pages;


    private int searchDepth;


    public MediaData(int iD, long time, int pages, int searchDepth) {
        this.iD = iD;
        this.time = time;
        this.pages = pages;
        this.searchDepth = searchDepth;
    }



    // return media unique id
    public int getiD() {
        return iD;
    }

    //return the time of the media content
    public long getTime() {
        return time;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSearchDepth() {
        return searchDepth;
    }

    public void setSearchDepth(int searchDepth) {
        this.searchDepth = searchDepth;
    }
}
