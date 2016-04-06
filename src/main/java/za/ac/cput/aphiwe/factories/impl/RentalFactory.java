package za.ac.cput.aphiwe.factories.impl;

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

   /* public Rental createRental(int rentNumber, Date date, String descript, Payments pay){

        Rental rent = new Rental
                .Builder()
                .rentalNumber(UUID.randomUUID().toString())
                .rentalDate(date)
                .rentalPayment(pay)
                .description(descript)
                .build();
        return rent;
    }*/
}
