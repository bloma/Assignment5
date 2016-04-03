package za.ac.cput.aphiwe.domain;

import za.ac.cput.aphiwe.factories.Genre;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aphish on 2016/04/02.
 */
public class AdventureMovie extends Genre {
    private Genre nextGenre;
    public String handleMovieRequest(String name) {
        if (name.equalsIgnoreCase("")){

        }else{
            if (name.equalsIgnoreCase(null)){
                return nextGenre.handleMovieRequest(name);
            }
        }
        return "No movie";
    }

    public List<String> getMovieList (){
        List<String> adventureMovies = new ArrayList<String>();
        adventureMovies.add("Spectre");
        adventureMovies.add("Mechanic");
        adventureMovies.add("JohnWick");

        return adventureMovies;
    }
}
