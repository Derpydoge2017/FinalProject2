package com.example;

import java.util.Random;

public class Jokes {

    public static final String LOG_TAG = Jokes.class.getSimpleName();

    private static final String JOKES[] = {
            "Why does Peter Pan always fly? Cause he never lands.",
            "How does a train eat? It goes chew chew.",
            "Where does an animal go when it's tail falls off? The retail store."
    };

    public String getJoke() {
        int i = new Random().nextInt(JOKES.length);
        System.out.println(LOG_TAG + ": i = " + Integer.toString(i));
        return JOKES[i];
    }

}
