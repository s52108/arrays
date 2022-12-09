package org.campus02.oop;

public class CashPayment extends Payment {

    private String name;

    public CashPayment(double amount, String currency, String name) {
        super(amount, currency);
        this.name = name;
    }

    public CashPayment(double amount, String currency) {
        super(amount, currency);
    }


    @Override
    public double calcTransactionCosts() {
        double amount = 0.0;
        if (name == null) {
            amount = 2.0;
        }

        return amount;
    }

    @Override
    public String toString() {
        return "CashPayment{" +
                "name='" + name + '\'' +
                ", Amount='" + exchangeToEUR() + '\'' +
                ", Currency='" + getCurrency() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
