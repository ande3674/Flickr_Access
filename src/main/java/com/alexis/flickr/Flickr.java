package com.alexis.flickr;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Created by ce6915gp on 9/27/2018.
 */
public class Flickr {

    String URL = "https://api.flickr.com/services/rest/?method=flickr.photos.getRecent&api_key=41014e55b2a616bc84ba31aa9c8966cb&per_page=10&format=json&nojsoncallback=1";
    String secret = "ec70c827417a7332";
    String key = "41014e55b2a616bc84ba31aa9c8966cb";

    public Flickr(){}

    public static String get(String URL){

        try {

            HttpResponse<JsonNode> response = Unirest.get(URL).header("accept", "application/json").asJson();
            JSONObject jsonObject = response.getBody().getObject();

            /* JSON stuff from my old project
            JSONArray items = jsonObject.getJSONArray("items");
            JSONObject itemsObj = items.getJSONObject(0);
            JSONObject volInfoObj = itemsObj.getJSONObject("volumeInfo");
            */

            return  jsonObject.toString();

        }
        catch (UnirestException ue){
            System.out.println(ue);
            return "ERROR!";

        }

    }

}
