package za.ac.cput.aphiwe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Genre;
import za.ac.cput.aphiwe.domain.Movie;
import za.ac.cput.aphiwe.factories.impl.MovieFactory;

/**
 * Created by Aphish on 2016/04/06.
 */
public class TestMovies {
    private MovieFactory factory;
    Genre genre =null;
    @Before
    public void setUp() throws Exception {
        factory = MovieFactory.getInstance();
    }

    @Test
    public void testMovieCreation() throws Exception {
            Movie movie = factory.createMovie("1:30:20","terain",genre);
        Assert.assertEquals("terain",movie.getMovieDescription());

    }

    @Test
    public void testMovieUpdate() throws Exception {
        Movie movie = factory.createMovie("1:30:20","terain",genre);
        Movie newMovie = new Movie.Builder().movieName("The one").copy(movie).movieDescription("shooting")
                .movieDuration("1:30:22").genre(genre).build();
        Assert.assertEquals("terain",movie.getMovieDescription());
        Assert.assertEquals("shooting",newMovie.getMovieDescription());

    }
}
