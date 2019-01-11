package Scrapper;

import Handler.MediaData;
import Interface.ICrawler;
import MediaLibrary.Media;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Crawler implements ICrawler {

    public String BaseURL;
    public int Id;
    public int Depth = 0;
    public int pages = 0;
    public long execDuration;
    public PagesScrapper pagesScrapper;
    public PageScrapper pageScrapper;
    private List<String> allMedia;

    private List<MediaData> ListOfDetails;



    public Crawler(String URL){

        this.BaseURL=URL;
        this.pageScrapper=new PageScrapper();
        this.pagesScrapper=new PagesScrapper();
        ListOfDetails=new ArrayList<>();
    }

    public boolean Connection()throws IOException{

        try {
            URL url = new URL(this.BaseURL);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.connect();
            return connection.getResponseCode() == HttpURLConnection.HTTP_OK;
        } catch (IOException e) {
            System.err.println("Error in HTTP connection");
            e.printStackTrace();
            throw e;
        }
    }
    private void Details(int id, long duration, int pages, int Depth) {
        MediaData details = new MediaData(id, duration, pages, Depth);
        ListOfDetails.add(details);
    }



    @Override
    public List<String> GetAllContents() throws IOException {

        // increment id
        this.Id++;

        // Time start
        long startTime = System.currentTimeMillis();

        // Get categories links
        List<String> types = pagesScrapper.getLinksOfCategory(this.BaseURL);

        // Loop through categories
        for(String categoryUrl : types) {
            // Get category items urls
            List<String> categoryItems = pagesScrapper.getLinksOfCategory(categoryUrl);
            // Loop through category items urls
            for (String categoryItemUrl : categoryItems) {
                // Add category item to list
                allMedia.add(pageScrapper.getItemsData(categoryItemUrl));
            }
        }

        // Set searchDepth
        Depth = allMedia.size();

        // Time end
        long endTime = System.currentTimeMillis();

        // Calculate execution time
        execDuration = (endTime - startTime);

        Details(this.Id, execDuration, this.pages, this.Depth);

        return allMedia;
    }

    @Override
    public String getSepcificItems(String Item) throws IOException {
        this.Id++;

        // Time start
        long startTimer = System.currentTimeMillis();

        String results = pagesScrapper.getSpecificItems(BaseURL,Item);

        // Time end
        long endTime = System.currentTimeMillis();

        // Calculate execution time
        execDuration = (endTime - startTimer);

        Details(this.Id, execDuration, this.pages, this.Depth);

        return results;

    }




    @Override
    public MediaData GetItemData(int id) {
        return ListOfDetails.get(Id);
    }

    public void setPagesScrapper(PagesScrapper pagesScrapper){
        this.pagesScrapper=pagesScrapper;

    }
    public void setPageScrapper(PageScrapper pageScrapper){
        this.pageScrapper=pageScrapper;

    }
}
