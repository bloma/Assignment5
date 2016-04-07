package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.Rental;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Aphish on 2016/04/06.
 */
public class RentalFactory {
    private static RentalFactory factory = null;

    private RentalFactory(){}

    public static RentalFactory getInstance(){
        if (factory == null)
            factory=new RentalFactory();
        return factory;
    }

   public Rental createRental( String pay){
        Rental rent = new Rental
                .Builder()
                .rentalNumber(UUID.randomUUID().toString())
                .rentalDate(new Date())
                .rentalPayment(pay)
                .build();
        return rent;
    }
}
