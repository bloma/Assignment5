package za.ac.cput.aphiwe;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Cash;
import za.ac.cput.aphiwe.domain.Rental;
import za.ac.cput.aphiwe.factories.impl.RentalFactory;


/**
 * Created by Aphish on 2016/04/03.
 */
public class PaymentTest {
private RentalFactory rentalFactory;
    @Before
    public void setUp() throws Exception {
        rentalFactory = RentalFactory.getInstance();
    }

    @Test
    public void testCashCreation() throws Exception {
        Cash cash = new Cash.Builder().PayID("Cash").build();
        Rental rental = rentalFactory.createRental(cash.paymentType());
        Assert.assertEquals("Credit",rental.getRentalPaymentId());
        Assert.assertNotNull(rental.getRentedMovie());
    }

    @Test
    public void testCashUpdation() throws Exception {

    }
}
