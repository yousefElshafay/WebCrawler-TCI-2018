import java.util.List;

public interface ICrawler {

 List<String> GetAllContents();
 String SpecifytTheItemsSearched(String Item);
 MediaData GetItemData();
}
