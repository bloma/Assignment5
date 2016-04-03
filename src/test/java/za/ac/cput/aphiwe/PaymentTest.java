package za.ac.cput.aphiwe;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.aphiwe.domain.Rental;
import za.ac.cput.aphiwe.factories.Payments;
import za.ac.cput.aphiwe.factories.impl.PaymentsFactory;

import java.util.Calendar;
import java.util.GregorianCalendar;


/**
 * Created by Aphish on 2016/04/03.
 */
public class PaymentTest {
private Payments factory;
    @Before
    public void setUp() throws Exception {
    factory = PaymentsFactory.getInstance();

    }

    @Test
    public void testCashCreation() throws Exception {
        Calendar today = new GregorianCalendar();

        Rental rental = factory.createPayment(today.getTime());
        //Assert.assertEquals();

    }
}
