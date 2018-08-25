package com.example.addidi.eventsapp;

import com.example.addidi.eventsapp.Models.User;

import org.json.JSONException;
import org.json.JSONObject;

public class Events {
    // JSON base source
    public static final String eventSource = "https://hteventsdata.000webhostapp.com/events.php";

    public int evID;
    public String image_url;
    public String status;
    public String category;
    public double price;
    public String start_date;
    public String end_date;
    public String location_name;
    public String location_gps;
    public String organizer;
    public String description;

    public static Events fromJson(JSONObject jsonObject) throws JSONException {
        Events events = new Events();

        // extract values
        events.evID = jsonObject.getInt("id_event");
        events.image_url = jsonObject.getString("image_url");
        events.status = jsonObject.getString("status");
        events.category = jsonObject.getString("category");
        events.price = jsonObject.getDouble("price");
        events.start_date = jsonObject.getString("start_date");
        events.end_date = jsonObject.getString("end_date");
        events.location_name = jsonObject.getString("location_name");
        events.location_gps = jsonObject.getString("location_gps");
        events.organizer = jsonObject.getString("organizer");
        events.description = jsonObject.getString("description");

        return events;

    }

}

