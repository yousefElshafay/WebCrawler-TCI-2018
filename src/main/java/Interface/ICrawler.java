package Interface;

import Handler.MediaData;

import java.io.IOException;
import java.util.List;

public interface ICrawler {

public List<String> GetAllContents() throws IOException;
public  String getSepcificItems(String Item);
public MediaData GetItemData(int id);
}
