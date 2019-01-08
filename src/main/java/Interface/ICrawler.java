package Interface;

import Handler.MediaData;

import java.util.List;

public interface ICrawler {

public List<String> GetAllContents();
public  String getSepcificItems(String Item);
public MediaData GetItemData(int id);
}
