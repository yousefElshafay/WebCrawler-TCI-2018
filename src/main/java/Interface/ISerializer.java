package Interface;

import Handler.MediaData;

import java.util.List;

public interface ISerializer {

     String ListOfMediaToJson(List<String> mediaItem);
     String MediaToJson( String media);
     String MediaDataToJSON(MediaData dataItem);

}
