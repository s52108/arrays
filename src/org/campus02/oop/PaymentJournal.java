package org.campus02.oop;

import java.util.ArrayList;
import java.util.HashMap;

public class PaymentJournal {
    private ArrayList<Payment> payments = new ArrayList<Payment>();

    public void add(Payment p) {
        payments.add(p);

    }

    public double totalTransactionCosts() {

        double sum = 0.0;
        //iter + enter
        for (Payment p : payments) {
            sum = sum + p.calcTransactionCosts();
        }
        return sum;
    }

    public HashMap<String, Double> getPaymentsPerCurrency() {

        HashMap<String, Double> totalCosts = new HashMap();
        for (Payment p : payments) {
            if (totalCosts.containsKey(p.getCurrency())) {
                totalCosts.put(p.getCurrency(), totalCosts.get(p.getCurrency()) + 1);
            } else totalCosts.put(p.getCurrency(), 1.0);

        }
        return totalCosts;
    }

}
