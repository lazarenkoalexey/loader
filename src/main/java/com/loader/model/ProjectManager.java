package com.loader.model;

import java.sql.Connection;
import java.util.ArrayList;

import com.loader.dao.Database;
import com.loader.dao.Project;
import com.loader.dto.FeedObjects;

public class ProjectManager {

    public ArrayList<feedobjects> GetFeeds()throws Exception {
        ArrayList<feedobjects> feeds = null;
        try {
            Database database= new Database();
            Connection connection = database.Get_Connection();
            Project project= new Project();
            feeds=project.GetFeeds(connection);
        }
        catch (Exception e) {
            throw e;
        }
        return feeds;
    }

}