package za.ac.cput.aphiwe.factories;

import za.ac.cput.aphiwe.domain.Rental;

import java.util.Date;

/**
 * Created by Aphish on 2016/04/02.
 */
public interface Payments {

    Rental createPayment(Date date);
}
