package za.ac.cput.aphiwe.domain;

import java.util.Date;

/**
 * Created by Aphish on 2016/04/02.
 */
public class Credit implements Payments {
     private  String payId;

    private Credit(Builder builder) {
        this.payId = builder.payID;
    }

    public String getPayId() {
        return payId;
    }

    public Date createPayment(Date date) {
        return new Date();
    }

    public String paymentType() {
        return "Credit";
    }

    public static class Builder{
        private String payID;

        public Builder PayID(String payID) {
            this.payID = payID;
            return this;
        }
        public Builder copy(Credit credit){
            this.payID = credit.payId;
            return this;
        }
        public Credit build(){
            return new Credit(this);
        }
    }

    public static Builder builder(){return new Builder();}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Credit credit = (Credit) o;

        return payId != null ? payId.equals(credit.payId) : credit.payId == null;

    }

    @Override
    public int hashCode() {
        return payId != null ? payId.hashCode() : 0;
    }
}
