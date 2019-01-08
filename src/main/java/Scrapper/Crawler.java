package Scrapper;

import Handler.MediaData;
import Interface.ICrawler;

import java.io.IOException;
import java.util.List;

public class Crawler implements ICrawler {

    public String BaseURL;
    public PagesScrapper pagesScrapper;
    public PageScrapper pageScrapper;

    public Crawler(String URL){
        this.BaseURL=URL;
    }

    public boolean Connection()throws IOException{

        return true;
    }

    List<MediaData> mediaDataList;

    @Override
    public List<String> GetAllContents() {
        return null;
    }

    @Override
    public String getSepcificItems(String Item) {
        return null;
    }




    @Override
    public MediaData GetItemData(int id) {
        return null;
    }

    public void setPagesScrapper(PagesScrapper pagesScrapper){
        this.pagesScrapper=pagesScrapper;

    }
    public void setPageScrapper(PageScrapper pageScrapper){
        this.pageScrapper=pageScrapper;

    }
}
