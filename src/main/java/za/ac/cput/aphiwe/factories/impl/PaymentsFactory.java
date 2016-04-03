package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.Cash;
import za.ac.cput.aphiwe.domain.Credit;
import za.ac.cput.aphiwe.domain.Rental;
import za.ac.cput.aphiwe.factories.Payments;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Aphish on 2016/04/02.
 */
public class PaymentsFactory implements Payments{
        private static PaymentsFactory paymentsFactory = null;

    private PaymentsFactory(){
    }

    public static PaymentsFactory getInstance(){
        if (paymentsFactory==null){
            paymentsFactory = new PaymentsFactory();
        }
        return paymentsFactory;
    }

    public Payments getPayment(String name){
        if ("Cash".equalsIgnoreCase(name)){
            return new Cash();
        }else {
            return new Credit();
        }
    }

    public Rental createPayment(Date date) {
        Rental rent = new Rental
                .Builder()
                .rentalNumber(UUID.randomUUID().clockSequence())
                .rentalDate(date)
                .build();
        return rent;
    }

}
