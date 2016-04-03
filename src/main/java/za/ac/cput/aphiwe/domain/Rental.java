package za.ac.cput.aphiwe.domain;

import za.ac.cput.aphiwe.factories.Payments;

import java.util.Date;

/**
 * Created by Aphish on 2016/04/02.
 */
public class Rental {
    private int rentalNumber;
    private Date rentalDate;
    private Movie rentedMovie;
    private Payments renatalPayment;

    public Rental(int rentalNumber, Date rentalDate, Movie rentedMovie, Payments renatalPayment) {
        this.rentalNumber = rentalNumber;
        this.rentalDate = rentalDate;
        this.rentedMovie = rentedMovie;
        this.renatalPayment = renatalPayment;
    }

    public int getRentalNumber() {
        return rentalNumber;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Movie getRentedMovie() {
        return rentedMovie;
    }

    public Payments getRenatalPayment() {
        return renatalPayment;
    }

    @Override
    public String toString() {
        return "Rental{" +
                "rentalNumber=" + rentalNumber +
                ", rentalDate=" + rentalDate +
                ", rentedMovie=" + rentedMovie +
                ", renatalPayment=" + renatalPayment +
                '}';
    }
}
