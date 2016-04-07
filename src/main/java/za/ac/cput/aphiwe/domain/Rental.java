package za.ac.cput.aphiwe.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Aphish on 2016/04/02.
 */
public class Rental implements Serializable{
    private String rentalNumber;
    private Date rentalDate;
    private Movie rentedMovie;
    private String rentalPaymentId;

   private Rental(){}

    public String getRentalNumber() {
        return rentalNumber;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Movie getRentedMovie() {
        return rentedMovie;
    }

    public String getRentalPaymentId() {
        return rentalPaymentId;
    }

    public Rental(Builder builder) {
        this.rentalNumber = builder.rentalNumber;
        this.rentalDate = builder.rentalDate;
        this.rentedMovie = builder.rentedMovie;
        this.rentalPaymentId = builder.rentalPaymentId;
    }

    public static class Builder{
        private String rentalNumber;
        private Date rentalDate;
        private Movie rentedMovie;
        private String rentalPaymentId;

        public Builder rentalNumber(String value){
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
        public Builder rentalPayment(String value){
           this.rentalPaymentId =value;
            return this;
        }

        public Builder copy(Rental value) {
            this.rentalNumber = value.rentalNumber;
            this.rentalDate = value.rentalDate;
            this.rentalPaymentId = value.rentalPaymentId;
            this.rentedMovie = value.rentedMovie;
            return this;
        }

        public Rental build() {
            return new Rental(this);
        }
    }
     public static Builder builder(){return new Builder();
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rental rental = (Rental) o;

        return rentalNumber != null ? rentalNumber.equals(rental.rentalNumber) : rental.rentalNumber == null;

    }

    @Override
    public int hashCode() {
        return rentalNumber != null ? rentalNumber.hashCode() : 0;
    }
}
