package com.alexis.flickr;

/**
 * Created by ce6915gp on 9/27/2018.
 */
public class Main {

    // This URL grabs 10 recent photos (I think)
    public static String URL = "https://api.flickr.com/services/rest/?method=flickr.photos.getRecent&api_key=41014e55b2a616bc84ba31aa9c8966cb&per_page=10&format=json&nojsoncallback=1";

    public static void main(String[] args) {
        // New Flickr object
        Flickr f = new Flickr();

        // Just prints the output as one big JSON blob
        System.out.println(Flickr.get(URL));

    }
}
