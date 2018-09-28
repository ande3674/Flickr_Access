package com.alexis.flickr;

/**
 * Created by ce6915gp on 9/27/2018.
 */
public class Main {

    public static String URL = "https://api.flickr.com/services/rest/?method=flickr.photos.getRecent&api_key=41014e55b2a616bc84ba31aa9c8966cb&per_page=10&format=json&nojsoncallback=1";

    public static void main(String[] args) {

        Flickr f = new Flickr();
        System.out.println(Flickr.get(URL));
    }
}
