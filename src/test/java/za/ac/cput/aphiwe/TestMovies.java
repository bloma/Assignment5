package za.ac.cput.aphiwe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Movie;
import za.ac.cput.aphiwe.factories.impl.MovieFactory;

import java.util.Date;

/**
 * Created by Aphish on 2016/04/06.
 */
public class TestMovies {
    private MovieFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = MovieFactory.getInstance();
    }

    @Test
    public void testMovieCreation() throws Exception {
        Movie movie = factory.createMovie();
        Assert.assertEquals();
    }
}
