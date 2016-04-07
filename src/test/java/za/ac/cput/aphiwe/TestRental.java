package za.ac.cput.aphiwe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Rental;
import za.ac.cput.aphiwe.factories.impl.RentalFactory;

import java.util.Date;

/**
 * Created by Aphish on 2016/04/06.
 */
public class TestRental {

    private RentalFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = RentalFactory.getInstance();
    }

    @Test
    public void testRentalCreation() throws Exception {
        Rental rent = factory.createRental("Credit");
        Assert.assertEquals("Credit",rent.getRentalPaymentId());

    }

    @Test
    public void testRentalUpdation() throws Exception {
        Rental movie = factory.createRental("2000");
        Rental newMovie = new Rental.Builder().rentalNumber("Terrain").rentalPayment("3000").rentalDate(new Date())
                .build();
        Assert.assertEquals("terain",movie.getRentalNumber());
        Assert.assertEquals("terain",newMovie.getRentalPaymentId());
    }
}
