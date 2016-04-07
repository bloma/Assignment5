package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.Rental;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Aphish on 2016/04/02.
 */
public class PaymentsFactory {
        private static PaymentsFactory paymentsFactory = null;

    private PaymentsFactory(){
    }

    public static PaymentsFactory getInstance(){
        if (paymentsFactory==null){
            paymentsFactory = new PaymentsFactory();
        }
        return paymentsFactory;
    }

    public Rental createPayment() {
        Rental rent = new Rental
                .Builder()
                .rentalNumber(UUID.randomUUID().toString())
                .rentalDate(new Date())
                .build();
        return rent;
    }

}
