package za.ac.cput.aphiwe;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Actors;
import za.ac.cput.aphiwe.factories.Role;
import za.ac.cput.aphiwe.factories.impl.ActorsFactory;


/**
 * Created by Aphish on 2016/04/03.
 */
public class ActorsTest {
    private Role factory;
    @Before
    public void setUp() throws Exception {
        factory = ActorsFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        Actors act = factory.createRole("MainActor","leading character");
        Assert.assertEquals(act.getRole(),"leading character");
        Assert.assertEquals(act.getActorsName(),"Main");
        Assert.assertNotNull(act.getActorsSurname());
    }

    @After
    public void tearDown() throws Exception {

    }
}
