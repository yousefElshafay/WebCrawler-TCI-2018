import java.util.List;

public interface ICrawler {

public List<String> GetAllContents();
public  String SpecifytTheItemsSearched(String Item);
public MediaData GetItemData();
}
