package org.campus02.oop;

public class CreditCardPayment extends Payment {

    private String cardNumber;
    private String securityCode;

    public CreditCardPayment(double amount, String currency, String cardNumber, String securityCode) {
        super(amount, currency);
        this.cardNumber = cardNumber;
        this.securityCode = securityCode;
    }

    public CreditCardPayment(double amount, String currency) {
        super(amount, currency);
    }

    @Override
    public double calcTransactionCosts() {
        double amount = 0.0;
        if (getCurrency() != "EUR") {
            amount = 1.5 + (exchangeToEUR() * 0.0275);
        } else amount = 0.5 + (exchangeToEUR() * 0.011);
        return amount;
    }


    @Override
    public String toString() {
        return "CreditCardPayment{" +
                "CardNumber='" + cardNumber + '\'' +
                ", SecurityCode='" + securityCode + '\'' +
                ", Amount='" + exchangeToEUR() + '\'' +
                ", Currency='" + getCurrency() + '\'' +
                ", TransactionCosts='" + calcTransactionCosts() + '\'' +
                '}';
    }
}
