package za.ac.cput.aphiwe.domain;

import za.ac.cput.aphiwe.factories.Genre;

/**
 * Created by Aphish on 2016/04/02.
 */
public class HorrorMovie extends Genre {
    private Genre nextGenre;
    public String handleMovieRequest(String name) {
        if (name.equalsIgnoreCase("")){

        }else {
            if (name.equalsIgnoreCase(null)){
                return nextGenre.handleMovieRequest(name);
            }
        }
        return "No movie";
    }

}
