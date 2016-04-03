package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.*;
import za.ac.cput.aphiwe.factories.Genre;

import java.util.UUID;

/**
 * Created by Aphish on 2016/04/02.
 */
public class GenreFactory {

    private static GenreFactory genreFactory = null;

    private GenreFactory(){
    }

    public static GenreFactory getInstance(){
        if (genreFactory==null){
            genreFactory = new GenreFactory();
        }
        return genreFactory;
    }

    public static String getGenre(String name){
        Genre chain = setUpChain();
        return  chain.handleMovieRequest(name);
    }

    public static Genre setUpChain(){
        Genre horror = new HorrorMovie();
        Genre action = new ActionMovie();
        Genre animation = new Animation();
        Genre adventure = new AdventureMovie();
        Genre romance = new RomanceMovie();
        horror.setNextGenre(action);
        action.setNextGenre(animation);
        animation.setNextGenre(adventure);
        adventure.setNextGenre(romance);
        return horror;
    }

    public static Genre createGenre(Genre name){
        Genre genre = new Genre
                .Builder()
                .genreName(UUID.randomUUID().toString())
                .nextGenre(name)
                .build();
            return genre;
        }
    }

