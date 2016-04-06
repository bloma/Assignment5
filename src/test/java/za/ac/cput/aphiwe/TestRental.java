package za.ac.cput.aphiwe;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Rental;
import za.ac.cput.aphiwe.factories.impl.RentalFactory;

/**
 * Created by Aphish on 2016/04/06.
 */
public class TestRental {

    private Rental factory;

    @Before
    public void setUp() throws Exception {
        factory = new RentalFactory.getInstance();
    }

    @Test
    public void testRentalCreation() throws Exception {
        Rental rental = factory.
    }
}
