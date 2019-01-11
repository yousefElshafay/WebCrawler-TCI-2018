package Scrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PagesScrapper {
    private Queue<String> queueItems;
    private Queue<String> queue;

    public PagesScrapper(){
     queue = new LinkedList<String>();
     queueItems = new LinkedList<>();
}




    public List<String> getItemsURL(String baseURL)throws IOException{

        List<String> stringList = new ArrayList<>();

        Document mydoc = Jsoup.connect(baseURL).get();

        Elements itemsUrls = mydoc.select("ul.items li a");
        for(Element urlItem : itemsUrls) {
            // Add item  to the  queue
            stringList.add(urlItem.attr("abs:href"));
        }

        return stringList;



    }
    public  String getSpecificItems(String url,String name) throws IOException{

        StringBuilder toSerialized = new StringBuilder();

        queue.clear();
        queueItems.clear();

        long startTime = System.currentTimeMillis();

        int SearchedPages = 0;


        try {
            Document document = Jsoup.connect(url).get();
            //  to Get  categories
            Elements elements = document.select("ul.nav li a");
            for(Element lnk : elements) {
                // Add links to queue
                queue.add(lnk.attr("abs:href"));
            }

            Result: while(!queue.isEmpty()) {
                String s = queue.remove();
                SearchedPages++;

                document = Jsoup.connect(s).get();

                Elements UrlsOfItems = document.select("ul.items li a");
                for(Element itemUrl : UrlsOfItems) {
                    // Add item links to queue
                    queueItems.add(itemUrl.attr("abs:href"));
                }

                while (!queueItems.isEmpty()) {
                    String s1 = queueItems.remove();


                    String itemId = s1.substring(s1.length() - 3);
                    String categoryId = itemId.substring(0, 1);

                    SearchedPages++;

                    document = Jsoup.connect(s1).get();

                    String title = document.select(".media-details h1").text();

                    if(!title.equals(name)) {
                        continue;
                    }

                    // Add title to for Serialized
                    toSerialized.append(String.format("itemId: %s, categoryID: %s, title: %s, ", itemId, categoryId, title));

                    Elements tableelements =  document.select("table tbody > tr");

                    for (Element tableElement: tableelements) {
                        String keyvalue = tableElement.select("th").text();
                        String value = tableElement.select("td").text();

                        toSerialized.append(String.format("%s: %s, ", keyvalue, value));
                    }

                    break Result;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        long time = System.currentTimeMillis() - startTime;

        return toSerialized.toString();



    }

    public List<String> getLinksOfCategory(String baseURL) throws IOException {

        List<String> list = new ArrayList<>();

        Document mydoc = Jsoup.connect(baseURL).get();
        // Get links of categories
        Elements categoryLinks = mydoc.select("ul.nav li a");
        for(Element a : categoryLinks) {
            // Add links to the queue
            list.add(a.attr("abs:href"));
        }

        return list;
    }


}
