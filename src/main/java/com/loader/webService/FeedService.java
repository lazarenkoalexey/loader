package com.loader.webService;

import java.util.ArrayList;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.loader.model.ProjectManager;
import com.google.gson.Gson;
import com.loader.dto.FeedObjects;

@Path("/WebService")
public class FeedService {

    @GET
    @Path("/GetFeeds")
    @Produces("application/json")
    public String feed()
    {
        String feeds = null;
        try
        {
            ArrayList<feedobjects> feedData = null;
            ProjectManager projectManager= new ProjectManager();
            feedData = projectManager.GetFeeds();
            Gson gson = new Gson();
            System.out.println(gson.toJson(feedData));
            feeds = gson.toJson(feedData);
        }

        catch (Exception e)
        {
            System.out.println("Exception Error"); //Console
        }
        return feeds;
    }

}