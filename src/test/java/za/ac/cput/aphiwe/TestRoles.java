package za.ac.cput.aphiwe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Actors;
import za.ac.cput.aphiwe.factories.Role;
import za.ac.cput.aphiwe.factories.impl.RoleFactory;

/**
 * Created by Aphish on 2016/04/04.
 */
public class TestRoles {
private Role roles;
    @Before
    public void setUp() throws Exception {
        roles = RoleFactory.getInstance();
    }

    @Test
    public void testRoleCreation() throws Exception {
        Actors role = roles.createRole("","");
        Assert.assertEquals(role.getActorsName(),"");
        Assert.assertEquals(role.getActorsName(),"");
        Assert.assertNotNull(role.getRole());
    }

    @Test
    public void testRoleUpdate() throws Exception {
        Actors role = roles.createRole("","");
        Assert.assertEquals(role.getActorsName(),"");
        Assert.assertEquals(role.getActorsSurname(),"");
        Assert.assertNotNull(role.getRole());

        Actors updateRole = new Actors.Builder()
                .copy(role)
                .actorsName("Aphiwe")
                .build();

        Assert.assertEquals(updateRole.getActorsName(),"Aphiwe");
        Assert.assertEquals(role.getActorsName(),updateRole.getActorsName());
        Assert.assertEquals(role.getRole(),updateRole.getRole());

    }
}
