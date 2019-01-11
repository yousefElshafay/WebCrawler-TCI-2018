package Scrapper;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class PageScrapper {

    public String getItemsData(String URL)  throws IOException{

        Document document = Jsoup.connect(URL).get();
        StringBuilder Results = new StringBuilder();

        String title = document.select(".media-details h1").text();
        String mediaId = URL.substring(URL.length() - 3);
        String categoryId = mediaId.substring(0, 1);

        // Add title to toBeSerialized
        Results.append(String.format("itemId: %s, categoryID: %s, title: %s, ", mediaId, categoryId, title));

        Elements elements =  document.select("table tbody > tr");

        for (Element element: elements) {
            String key = elements.select("th").text();
            String value = elements.select("td").text();

            Results.append(String.format("%s: %s, ", key, value));
        }

        return Results.toString();
    }
}
