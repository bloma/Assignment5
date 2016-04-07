package za.ac.cput.aphiwe.domain;

import java.util.Date;

/**
 * Created by Aphish on 2016/04/02.
 */
public class Cash implements Payments {
    private String payId;

    private Cash(Builder builder) {
        this.payId = builder.payID;
    }

    public String getPayId() {
        return payId;
    }

    public Date createPayment(Date date) {
        return new Date();
    }

    public String paymentType() {
        return "Cash";
    }

    public static class Builder{
        private String payID;

        public Builder PayID(String payID) {
            this.payID = payID;
            return this;
        }
        public Builder Copy(Cash cash){
            this.payID = cash.payId;
            return this;
        }
        public Cash build(){
            return new Cash(this);
        }
    }
    public Builder builder(){
        return new Builder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cash cash = (Cash) o;

        return payId != null ? payId.equals(cash.payId) : cash.payId == null;

    }

    @Override
    public int hashCode() {
        return payId != null ? payId.hashCode() : 0;
    }
}
