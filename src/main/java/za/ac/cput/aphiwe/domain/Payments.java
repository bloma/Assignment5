package za.ac.cput.aphiwe.domain;

import java.util.Date;

/**
 * Created by Aphish on 2016/04/02.
 */
public interface Payments {

    Date createPayment(Date date);
    String paymentType();

}
