package za.ac.cput.aphiwe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.VilanActor;
import za.ac.cput.aphiwe.factories.impl.VilanActorFactory;


/**
 * Created by Aphish on 2016/04/03.
 */
public class ActorsTest {
    private VilanActorFactory factory;
    @Before
    public void setUp() throws Exception {
        factory = VilanActorFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        VilanActor act = factory.createActor("Vilan");
        Assert.assertEquals("Vilan",act.getName());
        Assert.assertNotNull(act.getName());
    }

    @Test
    public void testRoleUpdate() throws Exception {
        VilanActor movie = factory.createActor("Vilan");
        VilanActor newMovie = new VilanActor.Builder().Name("The one").copy(movie)
                .build();
        Assert.assertEquals("Vilan",movie.getName());

    }
}
