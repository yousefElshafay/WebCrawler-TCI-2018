package ScrappingService;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.*;
import java.io.IOException;

import Interface.ICrawler;
import Interface.ISerializer;


@Path("rest")
public class Service {
    private ICrawler crawler;
    private ISerializer serializer;

    public Service(ICrawler crawler, ISerializer serializer) {
        this.crawler = crawler;
        this.serializer = serializer;
    }

    @GET
    @Path("all")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getAll() throws IOException {

        String allmedia = serializer.ListOfMediaToJson(crawler.GetAllContents());

        if ( allmedia == null|| allmedia.equals("")) {
            throw new InternalServerErrorException();
        } else {
            return Response.ok(allmedia).build();
        }


    }
    @GET
    @Path("specific")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getItem(@QueryParam("keyword") String keyword) throws IOException {
        if ( keyword == null|| keyword.equals("")) {
            throw new InternalServerErrorException();
        }

        String specificMedia = serializer.MediaToJson(crawler.getSepcificItems(keyword));

        if ( specificMedia == null|| specificMedia.equals("")) {
            throw new InternalServerErrorException();
        } else {
            return Response.ok(specificMedia).build();
        }
        }
    @GET
    @Path("mediainfo")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getDataItemService(@QueryParam("id") int id){
        if ( id <= 0  ) {
            throw new IllegalArgumentException();
        }

        String mediaData = serializer.MediaDataToJSON(crawler.GetItemData(id));

        if ( mediaData == null|| mediaData.equals("")) {
            throw new InternalServerErrorException();
        } else {
            return Response.ok(mediaData).build();
        }

    }



}
