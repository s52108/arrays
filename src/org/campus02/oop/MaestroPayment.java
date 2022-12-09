package org.campus02.oop;

public class MaestroPayment extends Payment {

    private String cardNumber;

    public MaestroPayment(double amount, String currency, String cardNumber) {
        super(amount, currency);
        this.cardNumber = cardNumber;
    }


    @Override
    public double calcTransactionCosts() {
        if (exchangeToEUR() * 0.0075 <= 0.95) {
            return 0.95;
        }
        return exchangeToEUR() * 0.0075;
    }

    @Override
    public String toString() {
        return "MaestroPayment{" +
                "cardNumber='" + cardNumber + '\'' +
                ", Amount='" + exchangeToEUR() + '\'' +
                ", Currency='" + getCurrency() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}

