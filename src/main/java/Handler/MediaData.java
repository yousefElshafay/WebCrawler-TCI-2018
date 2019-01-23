package Handler;

public class MediaData {

    private int iD;
    private long time;
    private  int pages;
//

    private int Depth;


    public MediaData(int iD, long time, int pages, int searchDepth) {
        this.iD = iD;
        this.time = time;
        this.pages = pages;
        this.Depth = searchDepth;
    }



    public int getiD() {
        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getSearchDepth() {
        return Depth;
    }

    public void setSearchDepth(int searchDepth) {
        this.Depth = searchDepth;
    }
}
