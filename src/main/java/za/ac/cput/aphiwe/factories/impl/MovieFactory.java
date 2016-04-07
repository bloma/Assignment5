package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.Genre;
import za.ac.cput.aphiwe.domain.Movie;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Aphish on 2016/04/05.
 */
public class MovieFactory {
    private static MovieFactory factory = null;

    private MovieFactory(){}

    public static MovieFactory getInstance(){
        if (factory==null)
            factory=new MovieFactory();
        return factory;
    }

    public Movie createMovie(String time, String description, Genre genre){
        Movie movie = new Movie
                .Builder()
                .movieName(UUID.randomUUID().toString())
                .movieDuration(time)
                .movieDescription(description)
                .realesDate(new Date())
                .genre(genre)
                .build();
        return movie;
    }
}
