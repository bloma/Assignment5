package za.ac.cput.aphiwe.factories.impl;

import za.ac.cput.aphiwe.domain.Cash;
import za.ac.cput.aphiwe.domain.Credit;
import za.ac.cput.aphiwe.factories.Payments;

/**
 * Created by Aphish on 2016/04/02.
 */
public class PaymentsFactory{
        private PaymentsFactory paymentsFactory = null;

    private PaymentsFactory(){
    }

    public PaymentsFactory getInstance(){
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

}
