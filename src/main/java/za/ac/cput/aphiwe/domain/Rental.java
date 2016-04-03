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

    private Rental(Builder builder) {
        this.rentalNumber = builder.rentalNumber;
        this.rentalDate = builder.rentalDate;
        this.rentedMovie = builder.rentedMovie;
        this.renatalPayment = builder.renatalPayment;
    }

    public static class Builder{
        private int rentalNumber;
        private Date rentalDate;
        private Movie rentedMovie;
        private Payments renatalPayment;

        public Builder rentalNumber(int value){
            this.rentalNumber = value;
            return this;
        }
        public Builder rentalDate(Date value){
            this.rentalDate = value;
            return this;
        }
        public Builder description(Movie value){
            this.rentedMovie = value;
            return this;
        }
        public Builder rentalPayment(Payments value){
           this.renatalPayment=value;
            return this;
        }

        public Builder copy(Rental value) {
            this.rentalNumber = value.rentalNumber;
            this.rentalDate = value.rentalDate;
            this.renatalPayment = value.renatalPayment;
            this.rentedMovie = value.rentedMovie;
            return this;
        }

        public Rental build() {
            return new Rental(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rental rental = (Rental) o;

        if (rentalNumber != rental.rentalNumber) return false;
        if (!rentalDate.equals(rental.rentalDate)) return false;
        if (!rentedMovie.equals(rental.rentedMovie)) return false;
        return renatalPayment.equals(rental.renatalPayment);

    }

    @Override
    public int hashCode() {
        int result = rentalNumber;
        result = 31 * result + rentalDate.hashCode();
        result = 31 * result + rentedMovie.hashCode();
        result = 31 * result + renatalPayment.hashCode();
        return result;
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
