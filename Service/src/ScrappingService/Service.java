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

        return null;


    }
    @GET
    @Path("item")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getItem(@QueryParam("keyword") String keyword) throws IOException {
       return null;
        }
    @GET
    @Path("stats")
    @Produces({MediaType.APPLICATION_JSON})
    public Response getDataItemService(@QueryParam("id") int id){
        return null;
    }



}
