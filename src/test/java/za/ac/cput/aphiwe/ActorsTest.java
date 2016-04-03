package za.ac.cput.aphiwe;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Actors;
import za.ac.cput.aphiwe.domain.MainActor;
import za.ac.cput.aphiwe.domain.Movie;
import za.ac.cput.aphiwe.factories.impl.ActorsFactory;


/**
 * Created by Aphish on 2016/04/03.
 */
public class ActorsTest {
    private Actors factory;
    @Before
    public void setUp() throws Exception {
        factory = ActorsFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        //Actors act = factor
    }

    @After
    public void tearDown() throws Exception {

    }
}
