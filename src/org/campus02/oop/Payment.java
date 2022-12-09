package org.campus02.oop;

public abstract class Payment {
    private double amount;
    private String currency;

    public abstract double calcTransactionCosts();

    public Payment(double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public double exchangeToEUR() {
        switch (currency) {
            case "USD":
                amount = amount * (1 / 1.1);
            case "GBP":
                amount = amount * (1 / 0.85);
            case "SEK":
                amount = amount * (1 / 9.5);
            case "HUF":
                amount = amount * (1 / 310);
            case "EUR":
                amount = amount;
            default:
                amount = amount * (1 / 2);

        }
        return amount;

    }


    public String getCurrency() {
        return currency;
    }


}

