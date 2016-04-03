package za.ac.cput.aphiwe.domain;

import za.ac.cput.aphiwe.factories.Genre;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aphish on 2016/04/02.
 */
public class ActionMovie extends Genre {
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

    public List<String> getMovieList (){
        List<String> actionMovies = new ArrayList<String>();
        actionMovies.add("Spectre");
        actionMovies.add("Mechanic");
        actionMovies.add("JohnWick");

        return actionMovies;
    }

}
